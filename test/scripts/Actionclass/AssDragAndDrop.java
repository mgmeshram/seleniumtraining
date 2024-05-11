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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class AssDragAndDrop {
	WebDriver driver;
	WebDriverWait wait;  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait= new WebDriverWait(driver,Duration.ofSeconds(3));
  }
   @Test//test case1
   public void tripholo() throws InterruptedException {
 	driver.get("https://www.triphobo.com/");
 	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='screen-title']")));
 	driver.findElement(By.id("plan-my-trip")).click();
 	WebElement place=driver.findElement(By.xpath("//input[@class='input-control js_city_search']"));
 	place.click();
 	place.sendKeys("Houston, United States");
 	WebElement date=driver.findElement(By.xpath("//i[@class='c-icon js_calendar_icon']"));
 	date.click();
 	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[4]/td[4]/a")).click();
 	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[5]/a")).click();
 	driver.findElement(By.xpath("//*[@id=\"screen-wrapper\"]/div[3]/div/section/div[3]/div/span")).click();
	 
   }

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
