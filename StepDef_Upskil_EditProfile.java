package SDET.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;

public class StepDef_Upskil_EditProfile {

	WebDriver wd;
	
	@Then("^User clicks on Edit Profile link$")
	public void user_clicks_on_Edit_Profile_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.linkText("Edit profile")).click();
	}

	@Then("^attaches new image and selects language \"([^\"]*)\"$")
	public void attaches_new_image_and_selects_language(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		WebElement image = wd.findElement(By.id("picture_form"));
		image.sendKeys("C:\\Users\\Aparnna Panda\\Desktop\\Image\\photo.png");
		Thread.sleep(1000);
		System.out.println("Image Uploaded successfully");
		WebElement LangDD = wd.findElement(By.xpath("//option[@value='english']"));
		Select DD = new Select(LangDD);

		DD.selectByValue("Deutsch");
	}

	@Then("^enters \"([^\"]*)\" details$")
	public void enters_details(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.name("extra_skype")).sendKeys("bcd.skpe");
	}

	@Then("^User clicks on Save Settings$")
	public void user_clicks_on_Save_Settings() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		wd.findElement(By.cssSelector("button[name='apply_change']")).click();
	}

	

}
