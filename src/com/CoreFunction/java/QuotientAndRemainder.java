package com.CoreFunction.java;

import java.util.Scanner;

public class QuotientAndRemainder {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("enter divident : ");
		int divident = scanner.nextInt(); 

		System.out.println("enter divisor : ");
		int divisor = scanner.nextInt(); 

		int quotient = divident / divisor; 
		int remainder = divident % divisor; 

		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);

		
	}

}
