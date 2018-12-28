package ActiveObject;

import Channel.ActivationQueue;
import Channel.SchedulerThread;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class ActiveObjectFactory {
    public static ActiveObject createActiveObject() {
        ActivationQueue queue=new ActivationQueue();
        SchedulerThread scheduler=new SchedulerThread(queue);
        scheduler.start();
        ActiveObject.Servant servant=new ActiveObject.Servant();
        ActiveObject.Proxy proxy=new ActiveObject.Proxy(servant,scheduler);
        return proxy;
    }
}
