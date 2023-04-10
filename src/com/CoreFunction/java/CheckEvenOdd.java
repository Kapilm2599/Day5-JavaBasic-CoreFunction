package com.CoreFunction.java;

import java.util.Scanner;

public class CheckEvenOdd {
	
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int number = scanner.nextInt();
		EvenOdd(number);
	}

	static void EvenOdd(int number) {
		if (number % 2 == 0)
			System.out.println("Even Number: " + number);
		else
			System.out.println("Odd Number: " + number);
	}


}
