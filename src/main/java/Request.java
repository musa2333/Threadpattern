import java.util.Random;

/**
 * @author Musa
 * created  on 2018/12/16
 */
public class Request implements Runnable {
    private final String name;
    private final int num;
    private static Random random=new Random();

    public Request(String name,int num) {
        this.name=name;
        this.num=num;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+" execute "+ this );
        try{
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "[ Request from "+name+" No."+num+" ]";
    }
}
