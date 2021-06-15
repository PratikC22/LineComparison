/**
 * line comparison program using oops.
 *
 * @author Pratik Chaudhari
 * @since 14/06/2021
 */
package line;
import java.util.Scanner;

public class line {

        static void greet() { // Welcome statement.
                System.out.println("Welcome to the line comparison program");
        }

        public static int scan() { //Method for multiple user inputs
                Scanner sc = new Scanner(System.in);
                return sc.nextInt();
        }
        public static double read() { //Getting multiple inputs from user
                System.out.println("Enter x1, y1, x2, y2");
                int num1 = scan();
                int num2 = scan();
                int num3 = scan();
                int num4 = scan();
                return length(num1, num2, num3, num4);
        }

        public static double length(int num1, int num2, int num3, int num4) { //Calculating length of line
                return Math.sqrt(Math.pow((num3 - num1), 2) + Math.pow((num4 - num2), 2));
        }

        public static void equality(double length1, double length2) {	//Checking if lines are equal using equality
                String line1 = String.valueOf(length1);
                String line2 = String.valueOf(length2);
                if (line1.equals(line2)) {
                        System.out.println("Line 1 is equal to line 2");
                } else {
                        System.out.println("line 1 is not equal to line 2");
                }
        }

        public static void compare(double length1, double length2) {	//Comparing line using compare.
                String line1 = String.valueOf(length1);
                String line2 = String.valueOf(length2);

                if (line1.compareTo(line2) == 0)
                        System.out.println("Length of Line 1 is equal to Line 2");

                else if (line1.compareTo(line2) < 0)
                        System.out.println("Length of Line 1 is less than Line 2");

                else if (line1.compareTo(line2) > 0)
                        System.out.println("Length of Line 1 is greater than Line 2");

        }

        public static void main(String[] args) {	//Main method
                greet();
                double length1 = read();
                double length2 = read();
                System.out.println("line 1 = "+length1);
                System.out.println("line 2 = "+length2);
                equality(length1,length2);
                compare(length1,length2);

        }
}
