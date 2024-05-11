package scripts.alertspopupsandframes;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class AssignmentSecondOnAlert {
	WebDriver driver;
	  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }
   @Test//test case1
   public void cookBook() throws InterruptedException {
 	driver.get("http://www.cookbook.seleniumacademy.com/Alerts.html");
 	Thread.sleep(3000);
 	driver.findElement(By.xpath("//input[@id='simple']")).click();
 	Thread.sleep(3000);
 	
 	
 	try {
 		Alert alert=driver.switchTo().alert();
		assertEquals(alert.getText(),"Hello! I am an alert box!");
		 alert.accept();
 	
   }
 	catch(NoAlertPresentException e) {
 		fail("alert fail");
 		}
 	driver.findElement(By.xpath("//button[@id='confirm']")).click();
 	Thread.sleep(3000);
 	try {
 		Alert alert=driver.switchTo().alert();
		assertEquals(alert.getText(),"Press a button!");
		 alert.accept();
 	
   }
 	catch(NoAlertPresentException e) {
 		fail("alert fail");
 		}
 	driver.findElement(By.xpath("//button[@id='prompt']")).click();
 	Thread.sleep(3000);
 	try {
 		Alert alert=driver.switchTo().alert();
		assertEquals(alert.getText(),"Press a button!");
		 alert.accept();
 	
   }
 	catch(NoAlertPresentException e) {
 		fail("alert fail");
 		}

 	}

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
