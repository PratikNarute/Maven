package Utility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports 
{
	static ExtentReports extent;
	static ExtentTest create;
	
	public static void report(WebDriver driver, String a)
	{
		ExtentHtmlReporter r=new ExtentHtmlReporter("./test-output/report.html");
		
	    extent=new ExtentReports();
	    extent.attachReporter(r);
	    create=extent.createTest(a);
	}
	
	public static void flush(WebDriver driver)
	{
		extent.flush();
	}

}
