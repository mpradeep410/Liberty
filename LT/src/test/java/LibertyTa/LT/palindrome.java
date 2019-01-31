package com.valuemomentum.xyz.module1;

import java.util.Scanner;

public class palindrome 
{
	
	public static void main(String[] args)
	{
		
		
		for(char a = 'A'; a<= 'Z'; a++)
		{
			System.out.print(a);
		}
		 
		for(char a = 'a'; a<= 'z'; a++)
		{
			System.out.print(a);
		}
		System.out.println("******************");
		String b = "Raja";
		System.out.println(b.toUpperCase());
		System.out.println(b.toLowerCase());
		
		
		String xy=b.substring(0, 2);
		 System.out.println(xy);
		 
		 
		 String xyz = "Ticket TC12356765434 successfully booked";
		 System.out.println(xyz.substring(7, 12));
		 
		 
		 
		 int i = 10, begin = 0, second = 1;
		 
		 
		 for(int j = 1; j<= i; j++)
		 {
			 System.out.print(begin + " ");           //   0 1 1 2 3
			 int sum = begin + second;          // sum = 0+1 = 1  2  3 5 8
			 begin = second;                 //begin = 1    1   2  3
			 second = sum;                   //second = 1   2   3  5
		 }
		 
		 
		 
	}

}
