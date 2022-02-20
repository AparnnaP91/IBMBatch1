package SDET.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef_Upskil_Compose {

	WebDriver wd;
	
	@Given("^User logs in with creds \"([^\"]*)\" \"([^\"]*)\" and go to Homepage tab$")
	public void user_logs_in_with_creds_and_go_to_Homepage_tab(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aparnna Panda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("http://elearningm1.upskills.in/");
		wd.findElement(By.name("login")).sendKeys(username);
	    wd.findElement(By.name("password")).sendKeys(password);	    
	    wd.findElement(By.name("submitAuth")).click();
	    	    wd.findElement(By.xpath("//a[@title='Homepage']")).click();
	}

	@When("^User Clicks on My Course page$")
	public void user_Clicks_on_My_Course_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(2000);
		wd.findElement(By.linkText("My courses")).click();
	}

	@When("^User clicks on Compose tab$")
	public void user_clicks_on_Compose_tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.linkText("Compose")).click();
	}

	@When("^User selects mail recepients \"([^\"]*)\"$")
	public void user_selects_mail_recepients(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.xpath("//input[@placeholder='Please select an option']")).sendKeys("as12@gmail.com");
	}

	@When("^User enters mail details \"([^\"]*)\"\"([^\"]*)\"$")
	public void user_enters_mail_details(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.xpath("//input[@name='title']")).sendKeys("Registration is successful");
		Thread.sleep(3000);
		//WebElement browse = wd.findElement(By.cssSelector("input[name='attach_1']"));
	//	Thread.sleep(1000);
		//browse.sendKeys("C:\\Users\\Aparnna Panda\\Desktop\\New folder\\Test.txt");
		Thread.sleep(1000);
	//	System.out.println("File is uploaded successfully");
		wd.findElement(By.xpath("//input[@id='file-descrtiption']")).sendKeys("You're registered, complete your profile");
  
	}

	@Then("^User clicks on Send message button$")
	public void user_clicks_on_Send_message_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.cssSelector("button[name='compose']")).click();
	}

	

	
	
	
}
