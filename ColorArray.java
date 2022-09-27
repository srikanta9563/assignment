// write a java program to create a new array list of elements add some colors array list of elements
import java.util.Scanner;

public class ColorArray {
    static void display(String arr[]){
        System.out.println("The array is : ");
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+", ");
        }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element :");
        int n = sc.nextInt();
        String arr[] = new String[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the color in index of "+i);
            arr[i]=sc.next();
        }
        display(arr);
    }
}
