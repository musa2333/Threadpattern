import java.io.IOException;
import java.io.PrintWriter;

import static java.rmi.server.RemoteServer.getLog;

/**
 * @author Musa
 * created  on 2018/12/23
 */
public class Log {
   /* private static PrintWriter writer=null;
    static  {
        try{
            writer=new PrintWriter("log.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void println(String s) {
        writer.println(s);
    }

    public static void close() {
        writer.println("====END OF LOG====");
        writer.close();
    }*/
   private static  ThreadLocal<TsLog> logcollection=new ThreadLocal<TsLog>();

   public static void println(String s) {
        getLog().println(s);
   }

   public static void close() {
        getLog().close();
   }

   private static TsLog getLog() {

       TsLog log=logcollection.get();
       if(log==null) {
           log=new TsLog(Thread.currentThread().getName()+"-log.txt");
           logcollection.set(log);
       }
       return log;
   }
}
