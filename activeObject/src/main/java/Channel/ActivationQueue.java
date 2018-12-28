package Channel;

import Method.MethodReuqest;

/**
 * @author Musa
 * present to like channel for consumer and producer
 * created  on 2018/12/28
 */
public class ActivationQueue {
    private static final int  MAX_METHOD_REQUEST=100;
    private final  MethodReuqest[] requestQueue;
    private int tail;
    private int head;
    private int count;

    public ActivationQueue() {
        this.requestQueue=new MethodReuqest[MAX_METHOD_REQUEST];
        this.head=0;
        this.tail=0;
        this.count=0;
    }

    public synchronized void putRequest(MethodReuqest reuqest) {
        while (count >= requestQueue.length) {
            try {
                wait();
            } catch (InterruptedException e) {

            }
        }
        requestQueue[tail] = reuqest;
        tail = (tail + 1) % requestQueue.length;
        count++;
        notifyAll();
    }

    public synchronized MethodReuqest getRequest() {
        while(count<=0) {
            try{
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        MethodReuqest reuqest=requestQueue[head];
        head=(head+1)%requestQueue.length;
        count--;
        notifyAll();
        return reuqest;
    }
}
