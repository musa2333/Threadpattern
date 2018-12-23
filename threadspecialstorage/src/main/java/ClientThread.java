/**
 * @author Musa
 * created  on 2018/12/23
 */
public class ClientThread extends Thread {
    public ClientThread(String name) {
        super(name);
    }
    public void run() {
       System.out.println(getName()+" BEGIN");
       for(int i=0;i<10;i++) {
           Log.println(getName()+":"+i);
           try{
               Thread.sleep(200);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
       Log.close();
       System.out.println(getName() +"END");
    }
}
