package com.CoreFunction.java;

import java.util.Scanner;

public class Quadratic {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value for a: ");
		int a = scanner.nextInt();

		System.out.println("Enter value for b: ");
		int b = scanner.nextInt();

		System.out.println("Enter value for c: ");
		int c = scanner.nextInt();

		int delta = (b * b) - 4 * (a * c); 
		int root1 = (-b + Math.abs(delta)) / (2 * a);
		int root2 = (-b - Math.abs(delta)) / (2 * a); 

		System.out.println("Root 1 of X1: " + root1);
		System.out.println("Root 2 of X2: " + root2);
	}

}
