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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class MysecondTestNg {
	WebDriver driver;
	//WebDriverWait wait;
	//@Test
	public void googleTest() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("orangeHRM");		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}

   @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	//  System.out.println("I am in before class, I get executed only once before first test");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//wait = new WebDriverWait(driver,Duration.ofSeconds(20));
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }
  @Test
  public void loginToOrangeHRM() throws InterruptedException {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	     Thread.sleep(6000);
	    WebElement user= driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		user.submit();
		pass.submit();
		String expectedPageTitleAfterLogin = "Dashboard";
	
		Thread.sleep(6000);
	  String actualPageTitleAfterLogin = driver.getTitle();
	 // assertEquals(actualPageTitleAfterLogin,expectedPageTitleAfterLogin);
	  assertEquals(actualPageTitleAfterLogin, expectedPageTitleAfterLogin,"Seems the Page title is not Correct. May be login was not successful");


  }

}
