public class Threadprpriority extends Thread{
    public void run(){ //override the method
        for (int i=0;i<5;i++){
            try {
                Thread.sleep(800);
            }
            catch (InterruptedException ie){
                System.out.println(ie);
            }
            System.out.println(i);
        }}

    public static void main(String[] args) {
        Threadprpriority a=new Threadprpriority();
        Threadprpriority b=new Threadprpriority();
        Threadprpriority c=new Threadprpriority();
        b.setPriority(MAX_PRIORITY);
        System.out.println(b.getPriority());//10
        System.out.println(Thread.currentThread().getPriority());//5
        a.start();
        b.start();
        c.start();
        a.setName("srikanta");
        System.out.println(Thread.currentThread().getName());
    }
}
