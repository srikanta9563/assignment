
    public class Threaddemo5 implements Runnable{
        public void run() {
            for(int i=0;i<5;i++) {
                System.out.println("Threads running  " +i);
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }}
        public static void main(String [] args) {

           Threaddemo5 t =new Threaddemo5();
            Thread t1 =new Thread(t);
            Thread t2 =new Thread(t);
            Thread t3 =new Thread(t);
            Thread t4 =new Thread(t);


            t1.run();
            t2.run();
            t3.run();
            t4.run();
        }
    }

