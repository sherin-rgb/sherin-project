package test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MiniaturesTest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://fragranceheaven.in/collections/miniatures");
	}
	
	@Test
	public void test1() throws InterruptedException, IOException
	{
		driver.manage().window().maximize();
	    
	    //sort by drop down
	    WebElement drpdown = driver.findElement(By.xpath("//*[@id=\"sort-by\"]"));
	    Select s=new Select(drpdown);
	    s.selectByIndex(3);
	    Thread.sleep(4000);
	    
	    
	    //scroll down
	    /*JavascriptExecutor js = (JavascriptExecutor)driver;	
	    js.executeScript("window.scrollBy(0,200)"); */
	    
	    //logo screenshot
	   WebElement logo = driver.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div/div/div[1]/div[2]/div/a/img"));
	    
		File src1=logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src1, new File("./screenshot//logoscreenshot.png"));  
		
		//full pge screenshot
		File page=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(page,new File("./screenshot//fullpagescreenshot.png"));
	    
	}

}
