import java.util.Scanner;
public class leepyearcheck {
    public static void main(String[] args) {
        int year;
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter any Year:");
                year = scan.nextInt();

                if (year % 400 == 0)
                    System.out.println (year + " is a Leap Year");

                else if (year % 4 == 0 && year % 100 != 0)
                    System.out.println (year + " is a Leap Year");

                else
                    System.out.println (year + " is not a Leap Year");

            }
        }


