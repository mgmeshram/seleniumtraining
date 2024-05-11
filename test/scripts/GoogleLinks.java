package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class GoogleLinks {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test // Test case1
	public void loginToNicheTourism() throws InterruptedException {
		driver.get("http://www.google.com");
		List<WebElement> allGoogleLinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links on Google.com are - " + allGoogleLinks.size());
		
		for (WebElement oneElement: allGoogleLinks) {
			System.out.println(oneElement.getText() + " - " + oneElement.getAttribute("href"));
		}
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
