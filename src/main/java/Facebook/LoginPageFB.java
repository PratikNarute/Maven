package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Wait;

public class LoginPageFB 
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement user;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement pass;
	
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement newaccount;
	
	
	public LoginPageFB (WebDriver driver)
	{
		this.driver=driver;
	    wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	
	public void LOGIN()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='email']")));
		user.sendKeys("80657568");
		pass.sendKeys("86254582");
		newaccount.click();
		
	}
	
	

}
