//write a java program to find average of an int array
import java.util.*;

public class avaragearray {
    static void AvarageArray(int a [],int n){
        int sum=0;
        for(int i=0;i<a.length;i++) {

          sum = sum+a[i];
        }
        int avg = sum/n;
        System.out.println("The avarage is : "+avg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of element :");
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("ENTER THE ELEMENT NUMBER "+i);
            a[i]= sc.nextInt();
        }
        AvarageArray(a,n);
    }
}
