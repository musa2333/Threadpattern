package Channel;


import Method.MethodReuqest;

/**
 * @author Musa
 * Producer and Consumer
 * created  on 2018/12/28
 */
public class SchedulerThread extends Thread {
    private final ActivationQueue queue;

    public SchedulerThread(ActivationQueue queue) {
        this.queue=queue;
    }

    public void invoke (MethodReuqest reuqest) {
        queue.putRequest(reuqest);
    }

    @Override
    public void run() {
       while(true) {
           MethodReuqest request=queue.getRequest();
           request.execute();
       }
    }
}
