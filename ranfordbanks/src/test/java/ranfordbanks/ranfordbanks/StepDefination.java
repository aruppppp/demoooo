package ranfordbanks.ranfordbanks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class StepDefination {
	
	WebDriver driver;
	public  StepDefination(){
		
		this.driver=Hooks.driver;
	}
	
	@Given("^launch the site$")
	public void launch_the_site() throws Throwable {
		driver.get("http://srssprojects.in/home.aspx");
		
	}

	@When("^check the title with \"([^\"]*)\" data$")
	public void check_the_title_with_data(String arg1) throws Throwable {
	    
String acttittle=driver.getTitle();
		
		if(acttittle.equals(arg1))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
	}

	@Then("^username field should displayed$")
	public void username_field_should_displayed() throws Throwable {
	    
	}

	@Then("^close$")
	public void close() throws Throwable {
		
		driver.close();
	   
	}

	@When("^enter the userid with \"([^\"]*)\" data and enter the password with \"([^\"]*)\" data$")
	public void enter_the_userid_with_data_and_enter_the_password_with_data(String arg1, String arg2) throws Throwable {
	    
		PageFactory.initElements(driver,LoginPage.class);
		Login.loginexe(arg1, arg2);
	}

	@Then("^braches button should displayed$")
	public void braches_button_should_displayed() throws Throwable {
	   
	}

	@Then("^close the site$")
	public void close_the_site() throws Throwable {
		
		
	   
	}

}
