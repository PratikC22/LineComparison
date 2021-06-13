package com.bridgelabz;
import java.util.Scanner;

public class lineComparisonUC3 {
	public static double lineComparison(int num1, int num2, int num3, int num4) {
		double ans = Math.sqrt(Math.pow( (num3-num1),2 ) + Math.pow( (num4-num2),2));
		return ans;
	}
	public static void main(String[] args) {
		// Welcome statement.
		System.out.println("Welcome to the line comparison program");

		// Reading input from the user.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1, for line 1 : ");
		int num1 = sc.nextInt();
		System.out.print("Enter y1, for line 1 : ");
		int num2 = sc.nextInt();
		System.out.print("Enter x2, for line 1 : ");
		int num3 = sc.nextInt();
		System.out.print("Enter y2, for line 1 : ");
		int num4 = sc.nextInt();
		System.out.print("Enter x1, for line 2 : ");
		int num5 = sc.nextInt();
		System.out.print("Enter y1, for line 2 : ");
		int num6 = sc.nextInt();
		System.out.print("Enter x2, for line 2 : ");
		int num7 = sc.nextInt();
		System.out.print("Enter y2, for line 2 : ");
		int num8 = sc.nextInt();
		sc.close();

		double result = lineComparison(num1, num2, num3, num4);
		double result2 = lineComparison(num5, num6, num7, num8);
		String s1 = String.valueOf(result);
		String s2 = String.valueOf(result2);
		int compare = s1.compareTo(s2);

		// Display result
		System.out.println("The length of line 1 is " +result);
		System.out.println("The length of line 2 is " +result2);

		if (compare > 0) {
			System.out.println("line 1 is greater than line 2");
		}
		else if (compare < 0) {
			System.out.println("line 2 is greater than line 1");
		}
		else System.out.println("Both line 1 and line 2 are equal");
	}
}
