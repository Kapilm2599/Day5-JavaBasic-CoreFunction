package com.CoreFunction.java;

import java.util.Scanner;

public class CheckVowelorConsonant {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character To See Vowel Or Consonent:~ ");
		char character = scanner.next().charAt(0); // storing char value

		switch (character) { 
		case 'A':
			System.out.println("A is Vowel");
			break;
		case 'E':
			System.out.println("E is Vowel");
			break;
		case 'I':
			System.out.println("I is Vowel");
			break;
		case 'O':
			System.out.println("O is Vowel");
			break;
		case 'U':
			System.out.println("U is Vowel");
			break;
		default: 
			System.out.println("This is Consonent: ");
		}
	}

}
