package cn.blingfeng.thread.forcedtostop;

/**
 * @author blingfeng
 * @desc forced to stop
 */
public class ForcedToStop {
    public static void main(String[] args) throws InterruptedException {
        Mythread mythread = new Mythread();
        mythread.start();
        Thread.sleep(8000);
        try {
            mythread.stop();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
class Mythread extends Thread{
    int i = 0;
    @Override
    public void run(){
        try {
        while(true){
            i++;
            System.out.println("i="+i);
            Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
