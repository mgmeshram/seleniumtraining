package scripts;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class AssignmentWikipedia {
	WebDriver driver;
	  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }
   @Test//test case1
   public void wikipedia() throws InterruptedException {
 	  driver.get("https://www.wikipedia.org/");
 	  WebElement user= driver.findElement(By.xpath("//a[@id='js-link-box-en' and @href]"));
 	  user.click();
 	  Thread.sleep(3000);
 	 WebElement user1= driver.findElement(By.xpath("//input[@class='cdx-text-input__input' and @name='search']"));
 	 user1.sendKeys("Selenium");
 	 Thread.sleep(6000);
 	 WebElement user2= driver.findElement(By.xpath("//*[@id=\"searchform\"]/div/button"));
 	 //WebElement user2= driver.findElement(By.xpath("//*[@id=\"searchform\"]"));
 	 user2.click();
 	 Thread.sleep(6000);
 	

	
 	   }


  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
