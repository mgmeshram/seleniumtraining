package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class HandlingWaits {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//500 ms, 500, 500
	}

	@Test // Test case1
	public void loginToNicheTourism() throws InterruptedException {
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		driver.findElement(By.xpath("//button[text()='Start']")).click();
	//	Thread.sleep(6000);
		WebElement hello = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
		assertEquals(hello.getText(), "Hello World!");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
