package Result;

import Result.Result;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class RealResult<T> extends Result<T> {
    private final T resultValue;

    public RealResult(T resultValue){
        this.resultValue=resultValue;
    }

    public T getResultValue() {
        return this.resultValue;
    }
}
