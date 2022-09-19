package Facebook;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.ChromeBrowser;
import Utility.ExcelData;
import Utility.Reports;
import Utility.Screenshots;
import Utility.Wait;

public class VerifyFacebookAPP 
{
 WebDriver driver;
	
	@BeforeClass
	public void browser()
	{
	    driver= ChromeBrowser.Chrome();	
	
		driver.get("https://www.facebook.com/");		
	}
	
//	@BeforeMethod
//	public void report()
//	{
//		
//		Reports.report(driver, "VerifyCreateAccPopup");
//		Reports.report(driver, "fetchdata");
//	}
	

	@Test
	public void VerifyLoginPage() throws InterruptedException, IOException
	{
		LoginPageFB a=new LoginPageFB(driver);
		a.LOGIN();
		//Thread.sleep(5000);
		
	}
	
	@Test (priority=1)
	public void VerifyCreateAccPopup() throws InterruptedException
	{	
		CreateAccFB b=new CreateAccFB(driver);
		b.Sendkeys();
		b.dropdrown();
		Assert.fail();					
	}
	
	
//	@Test (priority=2)
//	public void fetchdata() throws EncryptedDocumentException, IOException
//	{
//		ExcelData.excelData();
//		
//	}	
	@AfterMethod()
	public void flush(ITestResult result) throws IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			Screenshots.TakesScreenshot(driver);
			 	
		}
		
		//Reports.flush(driver);
		
	}
	
	

	
}
