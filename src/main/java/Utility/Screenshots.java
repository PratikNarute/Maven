package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;


public class Screenshots 
{
	
	public static void TakesScreenshot(WebDriver driver) throws IOException
	{
		
		Date d = new Date();
		String store= d.toString().replace(":","-");
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\prajwal narute\\Pictures\\Selenium\\"+store+".png");
		FileHandler.copy(source, dest);	
	
	}
	

}
