/**
 * @author Musa
 * created  on 2018/12/28
 */
public class ActiveObjectFactory {
    public static ActiveObject createActiveObject() {
        ActivationQueue queue=new ActivationQueue();
        SchedulerThread scheduler=new SchedulerThread(queue);
        scheduler.start();
        Servant servant=new Servant();
        Proxy proxy=new Proxy(servant,scheduler);
        return proxy;
    }
}
