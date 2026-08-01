package day43;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertions {
	
//	@Test
	void test_hardassertion()
	{
		System.out.println("tesing...");
		System.out.println("tesing...");
		
		Assert.assertEquals(1, 2); //hard assertion - it will stop the further execution 
		
		System.out.println("tesing...");
		System.out.println("tesing...");

	}
	
	@Test
	void test_softassertion()
	{
		System.out.println("tesing...");
		System.out.println("tesing...");
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(1, 2);  // soft assert - it will continue the execution
		
		System.out.println("tesing...");
		System.out.println("tesing...");
		
		sa.assertAll(); //mandatory

	}
	
	
	

}
