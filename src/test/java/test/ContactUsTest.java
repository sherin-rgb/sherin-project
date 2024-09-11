package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.ContactUs;

public class ContactUsTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://fragranceheaven.in/pages/contact-us");
	}
	
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		ContactUs cu=new ContactUs(driver);
		cu.setvalues("Sherin Joshi", "sherin.joshi0@gmail.com", "123456792");
		
		
		
		
	}

}
