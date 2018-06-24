package ranfordbanks.ranfordbanks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	
	public static WebDriver driver;
	
	@Before
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@After
	public void screenshot(Scenario s)
	{
		if(s.isFailed())
		{
			System.out.println("get the url of page"+driver.getCurrentUrl());
			
			TakesScreenshot screen=(TakesScreenshot)driver;
			
			byte[] bi=screen.getScreenshotAs(OutputType.BYTES);
			s.embed(bi, "image/png");
			
		}
		
	}

}
