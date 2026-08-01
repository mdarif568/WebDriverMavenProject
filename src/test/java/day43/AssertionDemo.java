package day43;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {

	@Test
	void testTitle()
	{
		String exp_title = "Opencart";
		String act_title = "Openshop";  //Test Failed
										//PASSED: day43.AssertionDemo.testTitle
		/*String act_title = "Opencart";  // it will show like this
		Test Passed
		PASSED: day43.AssertionDemo.testTitle
		*/
		
		/*if(exp_title.equals(act_title))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		} */
		
		Assert.assertEquals(exp_title, act_title);
	}
	
	
	
}
