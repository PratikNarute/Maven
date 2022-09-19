package topics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import openHRM.HomePage;
import openHRM.LoginPage;

public class AssertClass 
{
	WebDriver driver;
	
	@BeforeTest
	public void beforetest()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\prajwal narute\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			
	    driver=new ChromeDriver();
			
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	@Test
	public void VerifyLoginPage()
	{
		LoginPage a= new LoginPage(driver);
		String ActualURL=driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		String ExpectedURL="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		     // Hard Assertion
		
		Assert.assertEquals(ActualURL, ExpectedURL);
//		Assert.assertNotEquals(ActualURL, ExpectedURL);
//		Assert.assertTrue(true);
//		Assert.assertFalse(false);
//		Assert.fail();
		
		
		
		   // Soft Assertion
		
//		SoftAssert b= new SoftAssert();
//		
//		b.assertEquals(ActualURL,ExpectedURL);
//		b.assertNotEquals(ActualURL, ExpectedURL);
//		b.assertTrue(true);
//		b.assertFalse(false);
//		b.assertAll();
		
	
	}
	
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}

		
	

}
