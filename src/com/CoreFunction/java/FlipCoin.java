package com.CoreFunction.java;

public class FlipCoin {
	
	public static void main(String[] args) { 
	       
		double num=(Math.random());
        
    	if (Math.random() < 0.5){  
       			System.out.println("Heads");
        }
    	else {
    			System.out.println("Tails");
             }
    	
    	System.out.println("Percentage of turnout Coin is "+ num*100 +"%");
     }


}
