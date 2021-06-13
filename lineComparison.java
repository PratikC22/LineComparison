package com.bridgelabz;
import java.util.Scanner;

public class lineComparisonUC2 {
	public static double lineComparison(int num1, int num2, int num3, int num4) {
		double ans = Math.sqrt(Math.pow( (num3-num1),2 ) + Math.pow( (num4-num2),2));
		return ans;
	}
	public static void main(String[] args) {

        // Reading user input
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter X1, for line 1 : ");
        int num1 = scan.nextInt();
        System.out.print("Enter Y1, for line 1 : ");
        int num2 = scan.nextInt();
        System.out.print("Enter X2, for line 1 : ");
        int num3 = scan.nextInt();
        System.out.print("Enter Y2, for line 1 : ");
        int num4 = scan.nextInt();
        System.out.print("Enter X1, for line 2 : ");
        int num5 = scan.nextInt();
        System.out.print("Enter Y1, for line 2 : ");
        int num6 = scan.nextInt();
        System.out.print("Enter X2, for line 2 : ");
        int num7 = scan.nextInt();
        System.out.print("Enter Y2, for line 2 : ");
        int num8 = scan.nextInt();

        scan.close();

        double result = lineComparison(num1, num2, num3, num4);
        double result2 = lineComparison(num5, num6, num7, num8);
        String s1 = String.valueOf(result);
        String s2 = String.valueOf(result2);

        // Displaying distance
        System.out.println("Length of first line is : "+result);
        System.out.println("Length of second line is : "+result2);

        // Equals method
        System.out.println(s1.equals(s2));

	}
}
