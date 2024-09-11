package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WomenTest {
  WebDriver driver;
  @BeforeTest
  public void setup()
   {
	driver=new ChromeDriver();
	
   }
  
  @BeforeMethod
  public void urlloading()
  {
	  driver.get("https://fragranceheaven.in/collections/women");
  }
  
  @Test
  public void test1() throws InterruptedException
  {
	  driver.manage().window().maximize();
	  
	  //get women link
	  driver.findElement(By.xpath("//*[@id=\"section-header\"]/div[1]/div/div/div[2]/div/div/div/nav/ul/li[4]/a")).click();
	 
	  
	  //checkbox Instock
	  boolean b=driver.findElement(By.id("Filter-availability-1")).isSelected();
	  if(b==false)
		  driver.findElement(By.id("Filter-availability-1")).click();
	  
	  //scroll
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  Thread.sleep(3000);
	  js.executeScript("window.scrollBy(0,2000)");
	  
	  
	  
  }
}
