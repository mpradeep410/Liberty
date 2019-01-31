package com.valuemomentum.xyz.module1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data 
{
	
	
	@Test(dataProvider="Authentication")
	public void login(String username, String password)
	{
	
		System.out.println(username + password);
	}

	
		@DataProvider(name="Authentication")
		public static Object[][] credentials()
		{
			return new Object[][]
					{
				{"rajasekhar", "raja_PWD"},
				{"pradeep","Pra_PWD"},
				{"rajasekhar1", "raja_PWD"},
				{"pradeep1","Pra_PWD"},
				{"rajasekhar2", "raja_PWD"},
				{"pradeep3","Pra_PWD"}
					};
			
		}
}
