public class Threadjoin extends Thread{
    public void run(){ //override the method
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
            System.out.println(i);

        }}}



