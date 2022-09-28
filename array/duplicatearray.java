import java.util.Scanner;

public class duplicatearray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        int[]a=new int[size];
        System.out.println("enter the elements");
        for (int i=0;i<size;i++){
            a[i] = sc.nextInt();
        }
        for (int i=0;i<size;i++){
            for (int j=i+1;j<size;j++){
                if(a[i]==a[j]){
                    System.out.println("the duplicate element "+a[j]);
                }
            }
        }

        }
    }


