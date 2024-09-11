package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	By firstname=By.xpath("//*[@id=\"FirstName\"]");
	By lastname=By.xpath("//*[@id=\"LastName\"]");
	By email=By.xpath("//*[@id=\"Email\"]");
	By password=By.xpath("//*[@id=\"CreatePassword\"]");
	By create=By.xpath("//*[@id=\"create_customer\"]/div[1]/button");
	
	public Login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String fname,String lname,String mail,String pswd)
	{
		driver.findElement(firstname).sendKeys(fname);
		driver.findElement(lastname).sendKeys(lname);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void login()
	{
		driver.findElement(create).click();
		
	}
}
