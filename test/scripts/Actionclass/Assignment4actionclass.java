package scripts.Actionclass;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

@Test
public class  Assignment4actionclass{
	WebDriver driver;
	WebDriverWait wait;
	  
   @BeforeClass
  public void beforeClass() {
	
	 	driver = new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
  }
   //test case1
   public void SelectingRows() throws InterruptedException {
 	driver.get("http://icefaces-showcase.icesoft.org/showcase.jsf");
 	driver.findElement(By.xpath("//a[@href='#' and @tabindex='-1' and text()='Datatable']")).click();
 	WebElement table=driver.findElement(By.xpath("//*[@id=\"sm:j_idt646\"]/table/tbody"));
 	List<WebElement> row=driver.findElements(By.tagName("tr"));
 	int rowcount=row.size();
 	for(int i=0;i<=rowcount;i++) {
 		List<WebElement> list=driver.findElements(By.tagName("li"));
 		int listcount=list.size();
 		System.out.println("list"+listcount);
 	}
   }

  
  @AfterClass
  public void afterClass() {
	  
	driver.quit();
}
  
  
}
