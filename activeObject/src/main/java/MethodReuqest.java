/**
 * @author Musa
 * created  on 2018/12/28
 */
public abstract class MethodReuqest<T> {
    protected final Servant servant;
    protected final FutureResult<T> future;

    protected MethodReuqest(Servant servant,FutureResult<T> future) {
        this.servant=servant;
        this.future=future;
    }
    public abstract void execute();
}
