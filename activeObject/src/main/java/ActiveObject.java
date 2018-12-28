import java.util.concurrent.Future;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public interface ActiveObject {
    public abstract Result<String>  makingString(int count,char fillchar);
    public abstract void displayString(String string);
}
