package home.rainford;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testexecution extends Resprository 
{
	@Test(priority=0)
	public void verify_login() throws Exception
	{
		login();
	}
	
	@BeforeTest
	public void verify_launch() throws Exception
	{
		launch();
	}	

}
