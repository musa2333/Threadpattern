package Method;

import ActiveObject.Servant;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class DisplayStringRequest extends MethodReuqest {

    private final String string;
    public DisplayStringRequest(Servant servant, String string) {
        super(servant,null);
        this.string = string;
    }

    public void execute() {
       servant.displayString(string);
    }
}
