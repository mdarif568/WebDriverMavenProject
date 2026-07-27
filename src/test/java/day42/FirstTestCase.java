package day42;

import org.testng.annotations.Test;

/*
    Open app
    Login
    Logout
 */

public class FirstTestCase {
	
	
	@Test(priority=2)
	void login()
	{
		System.out.println("login to the application...");
	}
	
	@Test(priority=3)
	void logout()
	{
		System.out.println("logout from the application...");
	}
	
	@Test(priority=-1)
	void openApp()
	{
		System.out.println("opening application...");
	}
	
	

}
