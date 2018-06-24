package home.rainford;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;


	

public class Newbranch_creation extends TestBase{
	
	public static WebElement branchname_button(WebDriver driver) 
	{
		return driver.findElement(getelement("txtbName"));
		     
	}
	public static WebElement zipcode_button(WebDriver driver) 
	{
		return driver.findElement(getelement("txtZip"));
		     
	}

}
