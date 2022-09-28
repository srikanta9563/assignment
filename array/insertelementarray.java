import java.util.Scanner;

public class insertelementarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int a[]=new int[n+1];
        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        System.out.println("enter the insert element");
        int b= sc.nextInt();
        System.out.println("enter the element");
        int c= sc.nextInt();
        for (int i=0;i>=c;i--) {
            a[i] = a[i - 1];
        }
        a[c-1]=b;
        for (int i=0;i<=n;i++){
            System.out.println(" "+a[i]);
        }

    }
}
