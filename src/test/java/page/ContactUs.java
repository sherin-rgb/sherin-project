package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUs {
	WebDriver driver;
	By contactname=By.xpath("//*[@id=\"ContactFormName\"]");
	By contactemail=By.xpath("//*[@id=\"ContactFormEmail\"]");
	By phonenumber=By.xpath("//*[@id=\"ContactFormPhone\"]");
	
	public  ContactUs(WebDriver driver)
	{
		this.driver=driver;
	}

	public void setvalues(String name,String email,String string)
	{
		driver.findElement(contactname).sendKeys(name);
		driver.findElement(contactemail).sendKeys(email);
		driver.findElement(phonenumber).sendKeys(string);
	}
}
