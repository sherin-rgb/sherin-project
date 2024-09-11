package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Login;

public class LoginTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://fragranceheaven.in/account/register");
	}
	
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		Login l=new Login(driver);
		l.setvalues("Sherin", "Joshi", "sherinjoshi7@gmail.com", "sherin@1234");
		l.login();
	}

}
