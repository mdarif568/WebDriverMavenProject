package day43;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 1) Login  ------- @BeforeMethod
	2) Search ------- @Test
	3) Logout ------- @AfterMethod
	4) Login
	5) Adv Search --- @Test
	6) Logout 
 
 * */

public class AnnotationsDemo2 {
	
	@BeforeClass	
	void login()
	{
		System.out.println("This is login...");
	}
	
	@Test(priority=1)
	void search()
	{
		System.out.println("This is search...");
	}
	
	@Test(priority=2)
	void advancedSearch()
	{
		System.out.println("This is advanced search...");
	}
	
	@AfterClass
	void logout()
	{
		System.out.println("This is logout...");
	}
	
	
	
	

}
