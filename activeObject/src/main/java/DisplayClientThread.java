/**
 * @author Musa
 * created  on 2018/12/28
 */
public class DisplayClientThread extends Thread {

    private final ActiveObject activeObject;
    public DisplayClientThread(String name,ActiveObject activeObject) {
        super(name);
        this.activeObject=activeObject;
    }
    @Override
    public void run() {
        try {
            for(int i=0;true;i++) {
                //System.out.println();
                activeObject.displayString(Thread.currentThread().getName()+": "+i);
                Thread.sleep(20);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
