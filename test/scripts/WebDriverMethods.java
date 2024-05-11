package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class WebDriverMethods {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test // Test case1
	public void loginToNicheTourism() throws InterruptedException {
		driver.get("https://nichethyself.com/tourism/home.html");
		Thread.sleep(3000);
		driver.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		Thread.sleep(3000);
		assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
		//Get the size of your browser window
		//driver.manage().window().
		//Set the size of your browser window
		//driver.manage().
		
		
		
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
