     // Take 3 number from the user and print the greatest number
import java.util.Scanner;
public class greatestnumber {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("The 1st number: ");
            int A = in.nextInt();

            System.out.print("The 2nd number: ");
            int b = in.nextInt();

            System.out.print(" The 3rd number: ");
            int c = in.nextInt();


            if (A >b)
                if (A > c)
                    System.out.println("The greatest: " + A);

            if (b > A)
                if (b > c)
                    System.out.println("The greatest: " + b);

            if (c > A)
                if (c > b)
                    System.out.println("The greatest: " + c);
        }
    }

