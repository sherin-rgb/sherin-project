package test;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewArrivalsTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://fragranceheaven.in/collections/new-arrivals");
	}
	
	@Test
	public void test1() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		//full page screenshot
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./screenshot/newarrivals,png"));
		
		
		
		//new arrivals link
		driver.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div/div/div[2]/div/div/div/nav/ul/li[1]/a")).click();
		
		//scroll down to the last
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;  
		js.executeScript("window.scrollBy(0,5000)");
		
		//scroll up 
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-1000)"); 
		
		//click on the perfume
		driver.findElement(By.xpath("//*[@id=\"section-template--18979045278014__main\"]/div/div/div[2]/div/div[2]/div[18]/div[1]/div/h6/a")).click();
		
		//scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		
		//add to cart
		driver.findElement(By.xpath("//*[@id=\"AddToCart\"]")).click();
		
	}

	private void FileHandler.c(File screenshot, File file) {
		// TODO Auto-generated method stub
		
	}
	

}
