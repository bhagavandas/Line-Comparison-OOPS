package com.LineComparison;

import java.util.Scanner;

public class lineComparison {
	static int r;
	static int res=0;
	public static void UC1() {
		
		Start obj = new Start();
		obj.UC2();
		obj.UC3();
			Scanner scan =new Scanner(System.in);
			System.out.println("Enter x1 value: ");
			int x1=scan.nextInt();
			System.out.println("Enter x2 value: ");
			int x2=scan.nextInt();
			System.out.println("Enter y1 value: ");
			int y1=scan.nextInt();
			System.out.println("Enter y2 value: ");
			int y2=scan.nextInt();
			int r= ((int)Math.pow((x2-x1), 2)+(int)Math.pow((y2-y1), 2));
			double Length= Math.sqrt(r);
			
}
	
	public static void UC2() {
		lineComparison obj=new lineComparison();
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a1 value: ");
		int a1=scan.nextInt();
		System.out.println("Enter a2 value: ");
		int a2=scan.nextInt();
		System.out.println("Enter b1 value: ");
		int b1=scan.nextInt();
		System.out.println("Enter b2 value: ");
		int b2=scan.nextInt();
		int res= ((int)Math.pow((a2-a1), 2)+(int)Math.pow((b2-b1), 2));
		double Length1= Math.sqrt(res);
		System.out.println("Length of Line2 is: " + res);
		
		if(res==r) {
			System.out.println("Two lines are equal");
		}
		else {
			System.out.println("Two lines are not equal");
		}
	}
	 public static void UC3() {
		 lineComparison obj=new lineComparison();
			
			if(r>res) {
				System.out.println("Line1 is greater than Line2");
			}
			else {
				System.out.println("Line1 is less than Line2");
			}
}
}