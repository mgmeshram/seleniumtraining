package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TwitterAssignmentDiv {
	WebDriver driver;
  @Test
  public void loginTOTwitter() {
	  driver.get("https://twitter.com");
		List<WebElement> allDivElement = driver.findElements(By.xpath("//div"));
		System.out.println("Total div elements in twitter.com are - " +allDivElement.size());
		for (WebElement oneElement: allDivElement) {
			System.out.println(oneElement.getText() + " - " + oneElement.getAttribute("div"));}

  }
 /* @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }*/

  @BeforeClass
  public void beforeClass() {driver = new ChromeDriver();
	driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
