package ActiveObject;

import Channel.SchedulerThread;
import Method.DisplayStringRequest;
import Method.MakeStringRequest;
import Result.Result;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class Proxy implements ActiveObject {
    private final Servant servant;
    private final SchedulerThread scheduler;
    public Proxy(Servant servant, SchedulerThread scheduler) {
        this.servant=servant;
        this.scheduler=scheduler;
    }

    public Result<String> makingString(int count, char fillchar) {
        Result.FutureResult<String> future=new Result.FutureResult<String>();
        this.scheduler.invoke(new MakeStringRequest(servant,future,count,fillchar));
        return future;
    }

    public void displayString(String string) {
        this.scheduler.invoke(new DisplayStringRequest(servant,string));
    }
}
