package home.rainford;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;



public class branches  extends TestBase{
	
	public static WebElement Search_button(WebDriver driver) 
	{
		return driver.findElement(getelement("search"));
		     
	}

	public static WebElement Clear_button(WebDriver driver) 
	{
		return driver.findElement(getelement("clear"));
	}
	
	public static WebElement Newbranch_button(WebDriver driver) 
	{
		return driver.findElement(getelement("newbranch"));
	}
	
}
