public class demonthread extends Thread{
    public void run(){
        if (Thread.currentThread().isDaemon()) {
            System.out.println(Thread.currentThread().getName());
            System.out.println("i am daemon");
        }else {
            System.out.println("i am user");
        }


    }

    public static void main(String[] args) {
        demonthread d=new demonthread();
        demonthread d2=new demonthread();
        demonthread d3=new demonthread();
        d.start();
         //we will throw exception
        d2.setDaemon(true);
        d2.start();
        d3.start();

    }


}
