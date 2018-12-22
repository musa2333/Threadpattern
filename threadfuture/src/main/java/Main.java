/**
 * @author Musa
 * created  on 2018/12/16
 */
public class Main {
    public static void main(String[] args) {
       System.out.println("main BEGIN");
       Host host=new Host();
       Data data1=host.request(2,'c');
       Data data2=host.request(5,'b');
       Data data3=host.request(8,'f');
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main otherJob End");
        System.out.println("data1="+data1.getContent());
        System.out.println("data2="+data2.getContent());
        System.out.println("data3="+data3.getContent());
        System.out.println("main END");
    }
}
