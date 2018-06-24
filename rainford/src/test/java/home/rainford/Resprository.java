package home.rainford;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import testBase.TestBase;

public class Resprository extends TestBase {
	
	WebDriver driver;
	public  void login()
	{
		HomePage.Username_textbox(driver).sendKeys(config("username"));
		
		HomePage.Password_textbox(driver).sendKeys(config("password"));
		driver.findElement(getelement("login")).click();
		Admin.Branches_option(driver).click();
		
	}
	public void launch() throws Exception
	{
		driver=new FirefoxDriver();
		
		driver.get(config("url"));
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}

}
