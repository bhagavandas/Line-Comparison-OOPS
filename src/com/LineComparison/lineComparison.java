package com.LineComparison;

import java.util.Scanner;

public class lineComparison extends Start {
	
	public static void UC1() {
		
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter x1 value: ");
			int x1=scan.nextInt();
			System.out.println("Enter x2 value: ");
			int x2=scan.nextInt();
			System.out.println("Enter y1 value: ");
			int y1=scan.nextInt();
			System.out.println("Enter y2 value: ");
			int y2=scan.nextInt();
			int result1= ((int)Math.pow((x2-x1), 2)+(int)Math.pow((y2-y1), 2));
			Line1= Math.sqrt(result1);
			System.out.println("Length of Line1 is: " + Line1);
}
	
	public static void UC2() {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a1 value: ");
		int a1=scan.nextInt();
		System.out.println("Enter a2 value: ");
		int a2=scan.nextInt();
		System.out.println("Enter b1 value: ");
		int b1=scan.nextInt();
		System.out.println("Enter b2 value: ");
		int b2=scan.nextInt();
		
		int result2= ((int)Math.pow((a2-a1), 2)+(int)Math.pow((b2-b1), 2));
		double Length2= Math.sqrt(result2);
		System.out.println("Length of Line2 is: " + Length2);
		
		if(Line1 == Line2) {
			System.out.println("Two lines are equal");
		}
		else {
			System.out.println("Two lines are not equal");
		}
	}
	 public static void UC3() {
		 lineComparison obj=new lineComparison();
			
			if(Line1>Line2) {
				System.out.println("Line1 is greater than Line2");
			}
			else {
				System.out.println("Line1 is less than Line2");
			}
}
	 
	 public static void UC4(Double Line1, Double Line2) {
		 
		 int result3 = Line1.compareTo(Line2);
		 
		 if(result3 > 0)
	            System.out.println("Line1 is Greater than Line2");
	        else if(result3 < 0)
	            System.out.println("Line1 is Less than Line2");
	        else
	            System.out.println("Both Lines are Equal.");
	   
	 }
}