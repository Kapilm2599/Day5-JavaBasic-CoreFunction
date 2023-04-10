package com.CoreFunction.java;

import java.util.Scanner;

public class LargestAmong3 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("Enter first number : ");
		int number1 = scanner.nextInt(); 
		System.out.println("Enter second number : ");
		int number2 = scanner.nextInt(); 
		System.out.println("Enter third number : ");
		int number3 = scanner.nextInt(); 

		if (number1 > number2 && number1 > number3)
			System.out.println("Largest number is number one i.e :" + number1);
		else if (number2 > number1 && number2 > number3)
			System.out.println("Largest number is number two i.e :" + number2);
		else
			System.out.println("Largest number is number three i.e :" + number3);

	}

}
