package day46;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager implements ITestListener
{
	
	public ExtentSparkReporter sparkReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context) 
	{
		
	    sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "\\reports\\myReport.html");
	    
	    sparkReporter.config().setDocumentTitle("Automation Report"); // Title of report
	    sparkReporter.config().setReportName("Functional Testing"); // name of the report
	    sparkReporter.config().setTheme(Theme.DARK);
	    
	    extent = new ExtentReports();
	    extent.attachReporter(sparkReporter);
	    
	    extent.setSystemInfo("Computer Name", "localhost");
	    extent.setSystemInfo("Environment", "QA");
	    extent.setSystemInfo("Tester Name", "Arif");
	    extent.setSystemInfo("OS", "Windows10");
	    extent.setSystemInfo("Browser Name", "chrome");
	
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		test = extent.createTest(result.getName()); //create a new entry in the report
		test.log(Status.PASS, "Test case PASSED is: " + result.getName());// update status pass/fail/skipped
	}
	
	public void onTestFailure(ITestResult result) 
	{
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case FAILED is: " + result.getName());
		test.log(Status.FAIL, "Test case FAILED cause is: " + result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		test = extent.createTest(result.getName()); 
		test.log(Status.SKIP, "Test case PASSED is: " + result.getName());
	}
	
	public void onFinish(ITestContext context) 
	{
	    extent.flush();
	}
	
	
	
	
	
	
	
	
	
	
	

}
