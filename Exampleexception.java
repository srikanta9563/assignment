//You will be given two integers x and y as input, you have to compute x/y. If x and y are
//not 32 bit signed integers or if y is zero, exception will occur and you have to report it.

import java.util.*;
public class Exampleexception {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);// object of scanner class
        System.out.println(" Enter the values of x and y : ");
        try { //try block

            int x = scan.nextInt();
            int y = scan.nextInt();
            System.out.println(x / y);
        }
            catch(InputMismatchException e) { //using catch block trying to catch the exception if any InputMismatchException exception occurs
            System.out.println(e.getClass().toString().replaceFirst("class ", "Exception : "));
        } catch (ArithmeticException e) { ///using catch block trying to catch the exception if any ArithmeticException occurs
            // Print exception
            System.out.println(e);
        }
        scan.close();
    }
    }

