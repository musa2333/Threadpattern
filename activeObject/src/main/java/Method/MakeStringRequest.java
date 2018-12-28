package Method;

import ActiveObject.Servant;
import Result.Result;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class MakeStringRequest extends MethodReuqest<String>{
    private final int  count;
    private final char fillchar;
    public MakeStringRequest(Servant servant, Result.FutureResult<String> future, int count, char fillchar) {
        super(servant, future);
        this.count=count;
        this.fillchar=fillchar;
    }

    public void execute() {
        Result<String> result=servant.makingString(count,fillchar);
        future.setResult(result);
    }
}
