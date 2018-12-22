import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Musa
 * created  on 2018/12/16
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        try {
            new ClientThread("Alice", executorService).start();
            new ClientThread("Bob", executorService).start();
            new ClientThread("Chris", executorService).start();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {
            executorService.shutdown();
        }
    }

}
