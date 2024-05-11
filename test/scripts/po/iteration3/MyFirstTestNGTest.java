package scripts.po.iteration3;

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

public class MyFirstTestNGTest {
	WebDriver driver;
	WebDriverWait wait;
	//@Test
	public void googleTest() {
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Selenium Training");		

		}
  
  @BeforeMethod
  public void beforeMethod()//execute before test
  {
	
	  System.out.println("I am in before Method, I get executed before every test");
	  //driver =  new ChromeDriver();
		//driver =new FirefoxDriver();
		//driver.manage().window().maximize();

  }
  @BeforeClass
  public void beforeClass() {
	
	  System.out.println("I am in before class, I get executed only once before first test");
		//driver = new ChromeDriver();
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		wait= new WebDriverWait(driver,Duration.ofSeconds(10));
  }

  
  @AfterClass
  public void afterClass() {
	  System.out.println("I am in after class, I get executed only once after last test is executed.");
		driver.quit();
}
  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am in after Method, I get executed after every test"); 
		
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
  
//This information I will get from requirements document, Stories,
	//Thread.sleep(3000);
  
  String expectedPageTitleAfterLogin="My account";	
  wait.until(ExpectedConditions.titleIs("My account"));
  String actualPageTitleAfterLogin = driver.getTitle();
    if (expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {
				System.out.println("Login Successful !!");
			} else {
				System.out.println("Login Failed!");
			}
 // assertEquals(actualPageTitleAfterLogin,expectedPageTitleAfterLogin);
 // String expectedPageTitleAfterLogin;
//assertEquals(actualPageTitleAfterLogin, expectedPageTitleAfterLogin,"Seems the Page title is not Correct. May be login was not successful");


  }

}
