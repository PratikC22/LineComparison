package com.bridgelabz;
import java.util.Scanner;

public class lineComparisonUC1 {
	public static  double lineComparison(int num1, int num2, int num3, int num4) {
		double ans = Math.sqrt(Math.pow( (num3-num1),2 ) + Math.pow( (num4-num2),2));
		return ans;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the line comparison program");

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter x1 : ");
		int num1 = sc.nextInt();

		System.out.print("Enter y1 : ");
		int num2 = sc.nextInt();

		System.out.print("Enter X2 : ");
		int num3 = sc.nextInt();

		System.out.print("Enter y2 : ");
		int num4 = sc.nextInt();

		sc.close();

		double result = lineComparison(num1, num2, num3, num4);
		System.out.println("The length of the line is " +result);
	}
}
