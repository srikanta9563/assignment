
    import java.util.ArrayList;

    class MyThread4 extends Thread {
        public void run() {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("India");
            cars.add("Nepal");
            cars.add("Aus");
            cars.add("NZ");
            System.out.println(cars);
        }
    }

  /*  class MyThread5 extends Thread {
        public void run() {
            ArrayList<String> cars = new ArrayList<String>();
            cars.add("india");
            cars.add("nepal");
            cars.add("Aus");
            cars.add("NZ");
            System.out.println(cars);*/



    public class Demo3 {

        public static void main(String[] args) {
            MyThread4 obj1 = new MyThread4();
         //   MyThread5 obj2 = new MyThread5();
            obj1.start();
            //   obj2.start();
        }

    }

