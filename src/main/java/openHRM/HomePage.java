package openHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage      
{
	WebDriverWait wait;
	WebDriver driver;
	
	@FindBy (xpath="(//input[@placeholder='Type for hints...'])[1]")
	private WebElement name;
	
	@FindBy (xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement id;
	
	@FindBy (xpath="//div[text()='-- Select --']")
	private WebElement status;
	
	@FindBy (xpath="//div[text()='Current Employees Only']")
	private WebElement include;
	
	
	
	public HomePage(WebDriver driver)
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	
    public void EmployeesInformation()
    {
    	
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@placeholder='Type for hints...'])[1]")));
    	name.sendKeys("asgddfgdh Collings");
    	id.sendKeys("sgahdd");
    	status.click();
    	include.click();	
    }
	
	
	
	


}
