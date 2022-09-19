package openHRM_Testing;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import openHRM.HomePage;
import openHRM.LoginPage;
import Utility.ChromeBrowser;
import Utility.Reports;
import Utility.Screenshots;
public class VarifyOrangeHRM_APP 
{
	WebDriver driver;
	
	
	@BeforeTest
	public void browser()
	{
		    driver=ChromeBrowser.Chrome();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			
	}
	
	@BeforeMethod
	public void extentReports()
	{
		Reports.report(driver, "HomePage");
		
	}
	
	
	
	@Test
	public void LoginPage() throws InterruptedException, IOException

	{
		LoginPage a= new LoginPage(driver);
		a.username();
		a.password();
		a.Login();
		
		
		
	}
	
	@Test (priority=1)
	public void HomePage()
	{	
		HomePage b= new HomePage(driver);
		b.EmployeesInformation();
	
	}
	
	@AfterMethod
	public void screenshot(ITestResult result) throws IOException
	{
		if(result.getStatus()==result.FAILURE)
		{
			
			Screenshots.TakesScreenshot(driver);
		}
		
		Reports.flush(driver);
		
	}
	

}

	
	
	

	


