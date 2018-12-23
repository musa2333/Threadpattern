/**
 * @author Musa
 * created  on 2018/12/23
 */
public class Main {
    public static void main(String[] args) {
      /*  System.out.println(" BEGIN ");
        for(int i=0;i<10;i++) {
            Log.println("main: i="+i);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Log.close();
        System.out.println(" END ");*/
      new ClientThread("Bob").start();
      new ClientThread("Alice").start();
      new ClientThread("Barrier").start();
      new ClientThread("Tom").start();
    }
}
