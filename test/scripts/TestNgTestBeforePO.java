package scripts;

import org.testng.annotations.Test;
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

public class TestNgTestBeforePO {
	WebDriver driver;
	
	  
   @BeforeClass
  public void beforeClass() {
	
	  System.out.println("I am in before class, I get executed only once before first test");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	  }

  
  @AfterClass
  public void afterClass() {
	  System.out.println("I am in after class, I get executed only once after last test is executed.");
		driver.quit();
}
   @Test//test case1
  public void loginToNicheTourism() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/home.html");
	WebElement user= driver.findElement(By.name("username"));
	user.sendKeys("stc123");
	WebElement pass= driver.findElement(By.name("password"));
	pass.sendKeys("12345");
	pass.submit();
  String expectedPageTitleAfterLogin="My account";	
  String actualPageTitleAfterLogin = driver.getTitle();
    if (expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {
				System.out.println("Login Successful !!");
			} else {
				System.out.println("Login Failed!");
			}


  }

}
