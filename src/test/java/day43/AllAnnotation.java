package day43;

import org.testng.annotations.*;


public class AllAnnotation {

	@BeforeSuite
	void bs()
	{
		System.out.println("This is BeforeSuite method...");
	}
	
	@AfterSuite
	void as()
	{
		System.out.println("This is AfterSuite method...");
	}
	
	@BeforeTest
	void bt()
	{
		System.out.println("This is Before Test method...");
	}
	
	@AfterTest
	void at()
	{
		System.out.println("This is After Test method...");
	}
	
	@BeforeClass	
	void bc()
	{
		System.out.println("This is After Class method...");
	}
	
	@AfterClass
	void ac()
	{
		System.out.println("This is After Class method...");
	}
	
	@BeforeMethod
	void bm()
	{
		System.out.println("This is Before Method...");
	}
	
	@AfterMethod
	void am()
	{
		System.out.println("This is After Method...");
	}
	
	@Test(priority=1)
	void tm1()
	{
		System.out.println("This is Test Method1...");
	}
	
	@Test(priority=2)
	void tm2()
	{
		System.out.println("This is Test Method2...");
	}

}
