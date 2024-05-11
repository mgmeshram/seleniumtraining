package scripts.alertspopupsandframes;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class AssignmentOnCookbook {
	WebDriver driver;
	//WebDriverWait wait;
	  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }
   @Test//test case1
   public void cookBook() throws InterruptedException {
 	driver.get("http://www.cookbook.seleniumacademy.com/Config.html");
 	driver.findElement(By.cssSelector("button[id='helpbutton']")).click();
 	Thread.sleep(3000);
 	
 	String pWindow=driver.getWindowHandle();
 	Thread.sleep(3000); 
 	try {
// 	driver.findElement(By.cssSelector("button[id='helpbutton']")).click();
// 	Thread.sleep(3000);
 	 driver.switchTo().window("HelpWindow");
 	 //driver.close();
 	WebElement hello = driver.findElement(By.cssSelector("body > div > h3"));
	assertEquals(hello.getText(), "Build my Car - Configuration Help");
	 driver.close();
  

    } 
 	catch( NoAlertPresentException e) {
 		fail("seems devloper forgot to put alert");
 		}
 	driver.switchTo().window(pWindow);
 	driver.findElement(By.cssSelector("button[id='chatbutton']")).click();
 	Thread.sleep(3000);
 	try {
 	 	 driver.switchTo().window("");
// 	 	WebElement hello = driver.findElement(By.cssSelector("body > div > h3"));
// 		assertEquals(hello.getText(), "Build my Car - Configuration - Online Chat");

 	    } 
 	catch( NoAlertPresentException e) {
 		fail("seems devloper forgot to put alert");
 		}
 	driver.switchTo().window(pWindow);
 	driver.findElement(By.cssSelector("button[id='visitbutton']")).click();
 	Thread.sleep(3000);
 	try {
 	 	 driver.switchTo().window("VisitUsWindow");
 	 	WebElement hello = driver.findElement(By.cssSelector("body > div > h3"));
 	 	assertEquals(hello.getText(), "Build my Car - Configuration - Visit Us");


 	    } 
 	catch( NoAlertPresentException e) {
 		fail("seems devloper forgot to put alert");
 		}

 	}

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
