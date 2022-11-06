//2.now write the same program using Runnable interface
class MyThreadRunnable implements Runnable {

    public void run() {

    }
}

 class ThreadRunnable {
    public static void main(String[] args) {
        MyThreadRunnable obj = new MyThreadRunnable();
        Thread a = new Thread(obj, "Srikanta");
        try {
            a.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Name of thread: " + a.getName());

    }
}
