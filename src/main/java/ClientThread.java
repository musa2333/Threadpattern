import java.util.Random;
import java.util.concurrent.ExecutorService;

/**
 * @author Musa
 * created  on 2018/12/16
 */
public class ClientThread extends Thread{
    private final ExecutorService executorService;
    private static final Random random=new Random();
    public ClientThread(String name,ExecutorService executorService) {
        super(name);
        this.executorService=executorService;
    }

    public void run() {
        int i=0;
        try {
        while(true) {
          Request request=new Request(getName(),i);
          executorService.execute(request);
          i++;
          Thread.sleep(random.nextInt(1000));
        }
        } catch (InterruptedException e) {
            System.out.println(getName() + ":" +e.getMessage());
        }
    }
}
