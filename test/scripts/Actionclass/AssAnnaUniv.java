package scripts.Actionclass;

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

public class AssAnnaUniv {
	WebDriver driver;
	  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }
   @Test//test case1
   public void annaUniver() throws InterruptedException {
 	driver.get("https://www.annauniv.edu");
 	Thread.sleep(3000);
 	driver.findElement(By.linkText("Departments")).click();
 	Thread.sleep(3000);
 	
   }

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
