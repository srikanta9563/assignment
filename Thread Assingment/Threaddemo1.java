//1. Write a thread to print the thread name with a 2 sec delay with main thread.
class Thread5 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());//getteing thread name
    }
}
public class Threaddemo1 {
    public static void main(String[] args) {
        Thread5 t1=new Thread5();
        Thread5 t2=new Thread5();
        t1.start();
        try {

            Thread.sleep(2000);// adding 2 sec delay with  sleep mood
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }}
