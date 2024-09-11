package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn {
	WebDriver driver;
	By email=By.xpath("//*[@id=\"CustomerEmail\"]");
	By password=By.xpath("//*[@id=\"CustomerPassword\"]");
	By enter=By.xpath("//*[@id=\"customer_login\"]/div[1]/div[2]/div/div[1]/button");
	
	public SignIn(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	public void setvalues(String mail,String pswd)
	{
		driver.findElement(email).sendKeys(mail);
		driver.findElement(password).sendKeys(pswd);
	}
	
	public void login()
	{
		driver.findElement(enter).click();
	}

}
