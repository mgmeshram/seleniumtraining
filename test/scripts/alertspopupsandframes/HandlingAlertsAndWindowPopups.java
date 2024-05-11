package scripts.alertspopupsandframes;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;

@Test
public class HandlingAlertsAndWindowPopups {
	WebDriver driver;

	  
   @BeforeClass
  public void beforeClass() {
	
	 	//driver = new ChromeDriver();
	 	driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
  }
  // @Test//test case1
   public void alert() throws InterruptedException {
	   driver.get("https://nichethyself.com/tourism/home.html");
		WebElement user= driver.findElement(By.name("username"));
		user.sendKeys("stc123");
		WebElement pass= driver.findElement(By.name("password"));
		user.submit();
		Thread.sleep(3000);
		try {
			 Alert alert=driver.switchTo().alert();
			assertEquals(alert.getText(),"Please enter Password");
			 alert.accept();
			  
		}
		catch(NoAlertPresentException e) {
			fail("seems devloper forgot to put alert");
		}
		
		pass.sendKeys("12345");
		pass.submit();
		
   }
   public void handlingWindowPopups() throws InterruptedException {
	   driver.get("https://nichethyself.com/tourism/home.html");
	   driver.findElement(By.xpath("//button[text()='Contact us!']")).click();
	   String pWindow=driver.getWindowHandle();
	  try {
		  driver.switchTo().window("Contact");
		  driver.findElement(By.cssSelector(".glyphicon-search")).click();
		  Thread.sleep(3000);
		  try {
				 Alert alert=driver.switchTo().alert();
				 alert.sendKeys("London");
				 Thread.sleep(3000);
				 alert.accept();
				 Thread.sleep(3000);
				 driver.close();
			}
			catch(NoAlertPresentException e) {
				fail("seems devloper forgot to put alert");
			}
	  }
	  catch(NoSuchWindowException e) {
		  fail("Expected contact us window but did not find");
	  }
	  	driver.switchTo().window(pWindow);
	   driver.findElement(By.cssSelector("form[name='loginform']>button")).click();
	   
   }

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
