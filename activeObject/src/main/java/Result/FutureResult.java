package Result;

import Result.Result;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class FutureResult<T> extends Result<T> {
    private Result<T> result;
    private boolean ready=false;
    /**
     * set result result
     * @param result
     */
    public  synchronized void setResult(Result<T> result) {
        this.result = result;
        this.ready=true;
        notifyAll();
    }

    public synchronized T getResultValue() {
        while(!ready){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return result.getResultValue();
    }
}
