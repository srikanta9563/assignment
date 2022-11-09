public class MyThread {
    //using thread class constructor : Thread(String Name)
    public static void main(String[] args) {
        Thread t1=new Thread("good");
        Thread t2=new Thread("good1");
        Thread t3=new Thread("good2");
        //	t1.start();
        String str = t1.getName();
        System.out.println(str);
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        //	System.out.println(t3.getState());
        t1.start();
        t2.start();
        System.out.println(t1.getState());
        System.out.println(t2.getState());
    }

}