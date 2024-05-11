package scripts;

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
import org.testng.annotations.AfterClass;

public class WebEleAssignment {
	WebDriver driver;
	@Test
	public void googleTest() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium Training");		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		
  }

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  @Test//test case1
  public void loginToNicheTourism() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/home.html");
	WebElement user= driver.findElement(By.name("username"));
	user.sendKeys("stc123");
	WebElement pass= driver.findElement(By.name("password"));
	pass.sendKeys("12345");
	//user.submit();
	pass.submit();
 // Thread.sleep(3000);
  //String actualPageTitleAfterLogin = driver.getTitle();
   //assertEquals(actualPageTitleAfterLogin,expectedPageTitleAfterLogin);		

  }

}
