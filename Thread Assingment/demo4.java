import java.util.ArrayList;
class SyncThreadNew {
    String str;
    synchronized String method1(String s1) {
        return s1;
    }
    synchronized String method2(String s2) {
        return s2;
    }
    synchronized String method3(String s3) {
        return s3;
    }
    synchronized String method4(String s4) {
        return s4;

    }synchronized String method5(String s5) {
        return s5;
    }

}
class ThreadDemo extends Thread{
    SyncThreadNew s;
    ThreadDemo(SyncThreadNew s){
        this.s=s;
    }
    public void run() {
        System.out.println(s.method1("I ")+ s.method2("Went")+ s.method3(" to ")+s.method4(" lern ")+s.method5("java "));


    }}
class TestSync{
    public static void main(String[] args) {
        SyncThreadNew stn=new SyncThreadNew();
        ThreadDemo td=new ThreadDemo(stn);
        td.start();
    }
}