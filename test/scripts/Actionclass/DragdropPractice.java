package scripts.Actionclass;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class DragdropPractice {
	WebDriver driver;
	WebDriverWait wait;
	  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//wait = new WebDriverWait(driver,Duration.ofSeconds(10));
  }
   @Test//test case1
   public void cookBook() throws InterruptedException {
 	driver.get("http://www.cookbook.seleniumacademy.com/DragDropDemo.html");
 	 WebElement source= driver.findElement(By.id("draggable"));
 	 WebElement Target=driver.findElement(By.id("droppable"));
 	 Actions builder= new Actions(driver);
 	 builder.dragAndDrop(source, Target).build();
 	 builder.perform();
 	 Thread.sleep(5000);
 	
   }

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
