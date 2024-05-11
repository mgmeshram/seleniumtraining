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

public class AssignmentCookBook {
	WebDriver driver;
	  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }
   @Test//test case1
   public void cookBook() throws InterruptedException {
 	driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
 	Thread.sleep(3000);
 	WebElement user= driver.findElement(By.xpath("//input[@type='radio' and @value='Diesel']"));
 	user.click();
 	Thread.sleep(3000);
 	WebElement user2= driver.findElement(By.xpath("//input[@type='checkbox' and @value='ABS']"));
 	user2.click();
 	Thread.sleep(3000);
 	WebElement user1= driver.findElement(By.xpath("//input[@type='checkbox' and @value='LEDHeadLamp']"));
 	System.out.println("LED lamp is disabled- "+user1.isDisplayed());
   //String actualPageTitleAfterLogin = driver.getTitle();
    //assertEquals(actualPageTitleAfterLogin,expectedPageTitleAfterLogin);		

   }

   
  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
