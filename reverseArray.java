import java.util.Scanner;
public class reverseArray {
    static void display(int arr[]) {
        System.out.println("The array is : ");
        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void ReverseArray(int arr[]){
        System.out.println("The reverse of the Array is :");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element :");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the element in index of "+i);
            arr[i]=sc.nextInt();
        }
        display(arr);
        ReverseArray(arr);
    }}
