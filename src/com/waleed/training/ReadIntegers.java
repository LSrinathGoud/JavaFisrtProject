package com.waleed.training;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ReadIntegers {
	public static void main(String args[]) {

   Scanner scr = new Scanner(System.in);
   System.out.println("Enter sequence of integers: ");
                        String digit=scr.nextLine();
                        StringTokenizer token=new StringTokenizer(digit);
                        int dig=0,sum=0;
                        System.out.println("Entered integers are : ");
                        while(token.hasMoreTokens())
                        {
                                    String s=token.nextToken();
                                    dig=Integer.parseInt(s);
                                    System.out.print(dig+" ");
                                    sum=sum+dig;
                        }
                        System.out.println();
                        System.out.println("Sum of entered integers : "+sum);
            }

	
	}
	
	

