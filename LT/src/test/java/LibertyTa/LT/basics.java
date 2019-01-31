package com.valuemomentum.xyz.module1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class basics 
{
	
	@Test
	public  void main() throws Exception
	{
		
		String a = "Ticket TC123rwqrqwrqwtrq successfully booked add adadfa adfafd adfadfaf";
		
		
			System.out.println(a.trim());
			Reporter.log(a.trim());
		String[] abc=a.split(" ");
			
			System.out.println(abc[1]);
			Reporter.log(abc[1]);
				
			String b = "Rajasekhar - Selenium - Hyderabad";
			String[] xyz=b.split(" - ");
			System.out.println(xyz[0]);
			Reporter.log(xyz[0]);
			Reporter.log(xyz[1]);
			Reporter.log(xyz[2]);
			System.out.println(xyz[1]);
			System.out.println(xyz[2]);
			
			
			String c = "https://stackoverflow.com/questions/18123377/";
			String[] n = c.split("/");
		/*	System.out.println(n[0]);
			System.out.println(n[1]);
			System.out.println(n[2]);
			System.out.println(n[3]);
		*/	System.out.println(n[4]);

		
		System.out.println(n[4] + "123456");
		
		
		
		
		
		
		
		
		
		
		
			
	}

}
