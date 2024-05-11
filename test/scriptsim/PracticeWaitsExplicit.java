package scriptsim;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class PracticeWaitsExplicit {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	  public void beforeClass() {
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
  @Test
  public void WaitPrctice() {
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  driver.findElement(By.xpath("//button[text()='Start']")).click();
	  //WebElement hello =driver.findElement(By.xpath("//h4[text()='Hello World!']"));
	  WebElement hello = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[text()='Hello World!']")));
	  assertEquals(hello.getText(), "Hello World!");
  }
 
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
