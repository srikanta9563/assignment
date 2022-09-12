// java program to find circle area and circumference
import java.util.*;
import java.util.Scanner;

public class circle { // class
    public float radius;
    public float pi= 3.5f;
    public circle(){ //contractor 1
        this.radius=1.5f;

    }
    public circle(float radius){ //constractor 2
        this.radius=radius;


    }

    public circle(float radius, float pi) {//constractor chaining using constractor 2

    //contractor 3
        this.radius=radius;
        this.pi=3.5f;

    }
  public float calculatecircleArea(float radius){
        return pi*radius*radius;
    }  // method for calculate are
   public float calculatecircumference(float radius){
        return 2*pi*radius;
    } // maethod for calculating circumference

     public static void main(String[] args) {
        circle obj=new circle();
        Scanner sc= new Scanner(System.in); // taking input
        System.out.println("input the redius");
        float a = sc.nextFloat();
        System.out.println(" the area of circle is "+obj.calculatecircleArea(a));
        System.out.println("the circuference of circle is "+obj.calculatecircumference(a));
        sc.close();
    }

}


