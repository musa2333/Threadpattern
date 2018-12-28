import ActiveObject.ActiveObject;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class Main {
    public static void main(String[] args) {
        //create activeObject
        ActiveObject activeObject= ActiveObject.ActiveObjectFactory.createActiveObject();
        new MakerClientThread("Alice",activeObject).start();
        new MakerClientThread("Bob",activeObject).start();
        //new DisplayClientThread("Chris",activeObject).start();
    }
}
