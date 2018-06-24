package home.rainford;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class HomePage  extends TestBase{
	
	public static WebElement Username_textbox(WebDriver driver) 
	{
		return driver.findElement(getelement("username"));
		     
	}
    public static WebElement Password_textbox(WebDriver driver) 
    {
    	return driver.findElement(getelement("password"));
    }
    
    public static WebElement Login_button(WebDriver driver) 
    {
    	
    	return driver.findElement(getelement("login"));
    	
    }
   
    
    
    
    
}
