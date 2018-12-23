import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Musa
 * created  on 2018/12/23
 */
public class TsLog {
    private  PrintWriter writer =null;
    private String name;
    public TsLog(String filename) {
        try {
            writer=new PrintWriter(new FileWriter(filename));
            this.name=filename;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void println(String s) {
        writer.println(s);
    }

    public void close() {
        writer.println("==== End of Log ====");
        writer.close();
    }

    public String toString() {
        return this.name;
    }

}
