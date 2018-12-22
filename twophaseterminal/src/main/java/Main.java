import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Musa
 * created  on 2018/12/22
 */
public class Main {
    public static void main(String[] args) {
       System.out.println("main:BEGIN");
        ExecutorService service= Executors.newFixedThreadPool(3);
        Runnable phaseAction=new Runnable() {
            public void run() {
             System.out.println("BARRIER Action");
            }
        };
        CyclicBarrier cyclicBarrier=new CyclicBarrier(3,phaseAction);
        CountDownLatch countDownLatch=new CountDownLatch(3);
        try{
            for(int i=0;i<3;i++) {
                service.execute(new MyTask(cyclicBarrier,countDownLatch,i));
            }
            System.out.println("HALF");
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            service.shutdown();
            System.out.println("main:END");
        }

    }
}
