/**
 * @author Musa
 * created  on 2018/12/16
 */
public class RealData implements Data {
    private final String content;

    public RealData(int count,char c) {
         System.out.println(" [ cake num:"+count+" with word "+c+" ] BEGIN");
         char[] buffer=new char[count];
         for(int i=0;i<count;i++) {
           buffer[i]=c;
             try {
                 Thread.sleep(200);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
         System.out.println("[ cake num:"+count+" END");
         this.content=new String(buffer);
    }
    public String getContent() {
        return this.content;
    }
}
