package com.CoreFunction.java;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	 public static void main(String[] args)
	    {
	        int x,y;
	        System.out.println("Enter tow number");
	        Scanner r=new Scanner(System.in);
	        x=r.nextInt();
	        y=r.nextInt();
	        System.out.println("Before Swapping "+ x+" "+y);
	        x = x+y;
	        y = x-y;
	        x = x-y;
	        System.out.println("After Swapping "+ x+" "+y);
	    }
	

}
