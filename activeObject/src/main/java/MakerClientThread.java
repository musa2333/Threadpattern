import ActiveObject.ActiveObject;
import Result.Result;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class MakerClientThread extends Thread {

    private final ActiveObject activeObject;
    private final char fillchar;
    public MakerClientThread(String name,ActiveObject activeObject) {
        super(name);
        this.activeObject=activeObject;
        this.fillchar=name.charAt(0);
    }

    @Override
    public void run() {
        try {
          for(int i=0;true;i++) {
              Result<String> result=activeObject.makingString(i,fillchar);
              Thread.sleep(10);
              String value=result.getResultValue();
              System.out.println("current thread is: "+Thread.currentThread().getName()+" now value is "+value);
          }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
