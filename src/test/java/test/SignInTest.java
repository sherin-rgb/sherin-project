package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.SignIn;

public class SignInTest {
	WebDriver driver;
	@BeforeTest()
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://fragranceheaven.in/account/login");
	}
	
	@Test
	public void test1()
	{
		driver.manage().window().maximize();
		SignIn s=new SignIn(driver);
		s.setvalues("sherinjoshi7@gmail.com","sherin@1234");
		s.login();
		
	}

}
