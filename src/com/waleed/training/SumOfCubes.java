package com.waleed.training;

	import java.util.Scanner;
	
	public class SumOfCubes {
		
	public static void main(String args[]){
		
	    int input=0;
	   
	    System.out.println("Enter a Number");
	    Scanner scr = new Scanner(System.in);
	    input= Integer.parseInt(scr.nextLine());

	    int n = input;
	    int counter = 0;

	    while(n>0){
	    	
	        int t= n%10;
	        System.out.println("Cube of the given Number "+t +" is "+(t*t*t));
	        counter = counter+1;
	        n = n/10;

	    }

	}

}
