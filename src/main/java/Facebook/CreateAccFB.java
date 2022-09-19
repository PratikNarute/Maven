package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utility.Wait;

public class CreateAccFB 
{
	WebDriverWait wait;
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='reg_passwd__']")
	private WebElement pass;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;
	
	
	public CreateAccFB  (WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	
	
	public void Sendkeys()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		
		firstname.sendKeys("pratik");
		lastname.sendKeys("narute");
		email.sendKeys("pratiknarute1997@gmail.com");
	    pass.sendKeys("8065854"); 	
	}
	
	
	public void dropdrown()
	{
		
		Select a=new Select(day);
		a.selectByIndex(0);
		
		Select b=new Select(month);
		b.selectByIndex(0);
		
		Select c=new Select(year);
		c.selectByVisibleText("1997");
	}

}
