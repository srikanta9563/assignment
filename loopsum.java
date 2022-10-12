//write a do-while loop that asks the user to enter two numbers. the numbers should be added and the sum displayed.
// the loop should ask the user whether he or she wishes to perform the operation again.
// if so, the loop should repeat; otherwise it should terminate.
import java.util.Scanner;
public class loopsum {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int sum = 0;
            char x;
            do{
                System.out.println("Enter two numbers");
                int num1= in.nextInt();
                int num2 = in.nextInt();
                sum = (sum+(num1+num2));
                System.out.println("The sum is - " +(sum));
                System.out.println("Do you wish to perform another operation, Y/N");
                x=in.next().charAt(0);
            }while(x =='Y'||x=='y');

        }
    }

