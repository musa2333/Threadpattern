import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @author Musa
 * created  on 2018/12/22
 */
public class MyTask implements Runnable {
    private static final int PHASE = 5;
    private final CyclicBarrier phaseBarrier;
    private final CountDownLatch countDownLatch;
    private final int context;
    public MyTask(CyclicBarrier phaseBarrier,CountDownLatch countDownLatch,int context) {
        this.context=context;
        this.phaseBarrier=phaseBarrier;
        this.countDownLatch=countDownLatch;
    }

    public void run() {
       try{
           for(int phase=0;phase<PHASE;phase++) {
               doPhase(phase);
               phaseBarrier.await();
           }
       } catch (InterruptedException e) {
           e.printStackTrace();
       } catch (BrokenBarrierException e) {
           e.printStackTrace();
       }finally {
           countDownLatch.countDown();
       }
    }

    protected void doPhase(int phase) {
        String name=Thread.currentThread().getName();
        System.out.println(name+" :MyTask:BEGIN:context = "+context+" ,phase = "+phase );
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(name+" :MyTask:END:context = "+context+" ,phase = "+phase);
        }
    }
}
