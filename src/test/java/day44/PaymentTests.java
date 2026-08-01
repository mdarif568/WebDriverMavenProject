package day44;

import org.testng.annotations.Test;

public class PaymentTests {
	
	@Test(priority=1, groups= {"sanity", "regression", "functional"})
	void paymentinRupees()
	{
		System.out.println("payment in rupees...");
	}
	
	@Test(priority=1, groups= {"sanity", "regression", "functional"})
	void paymentinDollar()
	{
		System.out.println("payment in dollar...");
	}

}
