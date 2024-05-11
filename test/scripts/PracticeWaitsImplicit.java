package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PracticeWaitsImplicit {
	WebDriver driver;
	@BeforeClass
	  public void beforeClass() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
  @Test
  public void WaitPrctice() {
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  WebElement hello =driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	  assertEquals(hello.getText(), "Hello World!");
  }
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
