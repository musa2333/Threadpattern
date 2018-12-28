package ActiveObject;

import Result.Result;

/**
 * @author Musa
 * created  on 2018/12/28
 */
public class Servant implements ActiveObject {
    public Result<String> makingString(int count, char fillchar) {
        char[] buffer=new char[count];
        for(int i=0;i<count;i++) {
            buffer[i]=fillchar;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new Result.RealResult<String>(new String(buffer));
    }

    public void displayString(String string) {
        try {
            System.out.println("displayString:"+string);
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
