class Thread5 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
public class Threaddemo1 {
    public static void main(String[] args) {
        Thread5 t1=new Thread5();
        Thread5 t2=new Thread5();
        t1.start();
        try {

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }}
