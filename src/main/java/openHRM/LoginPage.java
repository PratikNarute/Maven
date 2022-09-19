package openHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage
{
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	private WebElement Login;
	
	
	public LoginPage(WebDriver driver)
	{
	    wait=new WebDriverWait(driver,Duration.ofSeconds(2000));
		PageFactory.initElements(driver, this);
	}
	
	
	public void username()
	{
	 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		username.sendKeys("Admin");
	}
	
	public void password()
	{
		password.sendKeys("admin123");
	}
	
	public void Login()
	{
		Login.click();	
	}
	

}
