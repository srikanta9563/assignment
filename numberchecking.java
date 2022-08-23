   // WAJP to get a number from the user ans print wheather it is a positive or negative
import java.util.Scanner;
    public class numberchecking {


        public static void main(String[] args)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            int A = in.nextInt();

            if (A> 0)
            {
                System.out.println("Number is positive");
            }
            else if (A < 0)
            {
                System.out.println("Number is negative");
            }
            else
            {
                System.out.println("Number is zero");
            }
        }
    }


