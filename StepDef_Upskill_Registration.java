package SDET.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_Upskill_Registration {
	
	WebDriver wd;
	
	@Given("^User is on elearning website homepage$")
	public void user_is_on_elearning_website_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aparnna Panda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("http://elearningm1.upskills.in/");
	}

	@When("^User clicks on Sign up button$")
	public void user_clicks_on_Sign_up_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		wd.findElement(By.linkText("Sign up!")).click();
		wd.manage().window().maximize();
	}
	

	@When("^enters details \"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"\"([^\"]*)\"$")
	public void enters_details(String firstname, String lastname, String email, String username, String password, String conf_password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		wd.findElement(By.name("firstname")).sendKeys("firstname");
		wd.findElement(By.name("lastname")).sendKeys("lastname");
		wd.findElement(By.name("email")).sendKeys("email");
		wd.findElement(By.id("username")).sendKeys("username");
		wd.findElement(By.id("pass1")).sendKeys("password");
		wd.findElement(By.name("pass2")).sendKeys("conf_password");
		
		
	}

	@Then("^User clicks on Register button$")
	public void user_clicks_on_Register_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
		wd.findElement(By.name("submit")).click();
		wd.manage().window().maximize();
	}

	@Then("^User verifies successful registration$")
	public void user_verifies_successful_registration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(wd.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > p:nth-child(2) > br:nth-child(2)")).getText());
		 Assert.assertEquals((wd.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > p:nth-child(2) > br:nth-child(2)")).getText()),"Your personal settings have been registered.");
			
	}

	
	
	

}
