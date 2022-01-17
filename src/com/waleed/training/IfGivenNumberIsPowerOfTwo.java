package com.waleed.training;
import java.util.Scanner;

public class IfGivenNumberIsPowerOfTwo {

	public static boolean main(String[] args) {
		
		 
			 int n = 0;
			 Scanner scanner = new Scanner(System.in);
		       System.out.println("Enter a number : ");
			
			 
			while(n%2==0)
			 {
			 n=n/2;
			 }
			 if(n==1)
			 {
			 return true;
			 }
			 else
			 {
			 return false;
			 }
			 }
}