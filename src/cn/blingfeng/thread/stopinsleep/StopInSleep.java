package cn.blingfeng.thread.stopinsleep;
//stop in sleep
public class StopInSleep {
    public static void main(String []args){
        Mythread mythread = new Mythread();
        mythread.start();
        try {
            Thread.sleep(500);
            mythread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
class Mythread extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("thread begin");
            Thread.sleep(200000);
            System.out.println("thread end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
