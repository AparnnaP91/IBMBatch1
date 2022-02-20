package SDET.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class uskilAssignment {
	
		public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aparnna Panda\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.manage().window().maximize();
		wd.get("http://elearningm1.upskills.in/");
		wd.findElement(By.linkText("Sign up!")).click();
		wd.manage().window().maximize();
		wd.findElement(By.name("firstname")).sendKeys("Ankit");
		wd.findElement(By.name("lastname")).sendKeys("tumar");
		wd.findElement(By.name("email")).sendKeys("aksjds@yahoo.com");
		wd.findElement(By.id("username")).sendKeys("assdfqwxz");
		wd.findElement(By.id("pass1")).sendKeys("Rssd223");
		wd.findElement(By.name("pass2")).sendKeys("Rssd223");
		wd.findElement(By.name("phone")).sendKeys("92933249");
		wd.findElement(By.name("submit")).click();
		wd.manage().window().maximize();
	
	  System.out.println(wd.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > p:nth-child(2) > br:nth-child(2)")).getText());
	 Assert.assertEquals((wd.findElement(By.cssSelector("body > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > p:nth-child(2) > br:nth-child(2)")).getText()),"Your personal settings have been registered.");
		
//		String msg="Your personal settings have been registered.";
//			if(wd.getPageSource().contains("Your personal settin")) {
//				
//				System.out.println("Message: "+ msg+ "  is present. ");
//			}
//			
//			else {
//				System.out.println("Message: "+ msg+ "  is not present. ");
//			}
		Thread.sleep(2000);
		wd.findElement(By.linkText("My courses")).click();
		wd.findElement(By.linkText("Compose")).click();
		wd.findElement(By.xpath("//input[@name='title']")).sendKeys("Registration is successful");
		Thread.sleep(3000);
		WebElement browse = wd.findElement(By.cssSelector("input[name='attach_1']"));
		Thread.sleep(1000);
		browse.sendKeys("C:\\Users\\Aparnna Panda\\Desktop\\New folder\\Test.txt");
		Thread.sleep(1000);
		System.out.println("File is uploaded successfully");
		wd.findElement(By.xpath("//input[@id='file-descrtiption']")).sendKeys("You're registered, complete your profile");
		wd.findElement(By.xpath("//input[@placeholder='Please select an option']")).sendKeys("as12@gmail.com");
		wd.findElement(By.cssSelector("button[name='compose']")).click();
		
		wd.findElement(By.linkText("Edit profile")).click();
		WebElement image = wd.findElement(By.id("picture_form"));
		image.sendKeys("C:\\Users\\Aparnna Panda\\Desktop\\Image\\photo.png");
		Thread.sleep(1000);
		System.out.println("Image Uploaded successfully");
		WebElement LangDD = wd.findElement(By.xpath("//option[@value='english']"));
		Select DD = new Select(LangDD);

		DD.selectByValue("Deutsch");
		wd.findElement(By.name("extra_skype")).sendKeys("bcd.skpe");
	   	wd.findElement(By.cssSelector("button[name='apply_change']")).click();
		
	  
		//wd.close();
	}
}
			

