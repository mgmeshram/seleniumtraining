package scripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyFirstSeleniumTest {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver;
	WebDriverWait wait;
	driver =  new ChromeDriver();
	//driver =new FirefoxDriver();
	wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	//driver =new MicrosoftEdge();
	driver.manage().window().maximize();
	//driver =new WebDriver();
	driver.get("https://nichethyself.com/tourism/home.html");
	WebElement user= driver.findElement(By.name("username"));
	user.sendKeys("stc123");
	WebElement pass= driver.findElement(By.name("password"));
	pass.sendKeys("12345");
	//user.submit();
	pass.submit();
    String expectedPageTitleAfterLogin = "My account";//This information I will get from requirements document, Stories,
	wait.until(ExpectedConditions.titleIs("My account"));
    
    //Thread.sleep(3000);
    String actualPageTitleAfterLogin = driver.getTitle();
			
			if (expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {
				System.out.println("Login Successful !!");
			} else {
				System.out.println("Login Failed!");
			}
			driver.quit();
	}

}
