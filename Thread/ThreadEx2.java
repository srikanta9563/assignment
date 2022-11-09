//using parametarize constractor
/*public class ThreadEx2 {
    public static void main(String[] args) {
        Thread obj= new Thread("srikanta");//using the constractor thread (using name)
        obj.start();//move to active state
        String a=obj.getName();// thread name by invoking get name method
        System.out.println(a);
    }}*/
// runnable interface
public class ThreadEx2 implements Runnable{
    public void run(){
        System.out.println("thread activated");
    }
    public static void main(String[] args) {
        Thread obj= new Thread("srikanta");//using the constractor thread (using name)
        obj.run();//move to active state
        String a=obj.getName();// thread name by invoking get name method
        System.out.println(a);
    }}

