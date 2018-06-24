package home.rainford;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testBase.TestBase;

public class Admin extends TestBase{

	 public static WebElement Branches_option(WebDriver driver)
	    {
	    	return driver.findElement(getelement("branches"));
	    	
	    }
	 public static WebElement Roles_option(WebDriver driver)
	    {
	    	return driver.findElement(getelement("roles"));
	    	
	    }
	 
	 public static WebElement Users_option(WebDriver driver)
	    {
	    	return driver.findElement(getelement("users"));
	    	
	    }
	 public static WebElement Employee_option(WebDriver driver)
	    {
	    	return driver.findElement(getelement("employee"));
	    	
	    }
}
