package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait
{
	static WebDriver driver=ChromeBrowser.Chrome();
	
	
	public static void explicitWait(WebDriver driver, WebDriverWait wait, String a)
	{
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(a)));
	}
	
	
	public static void implicityWait(WebDriver driver,int a)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}

}
