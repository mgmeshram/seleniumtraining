package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class DemoqaAssignment {
	WebDriver driver;
	WebDriverWait wait;
	@BeforeClass
	  public void beforeClass() {
		  driver = new ChromeDriver();
			driver.manage().window().maximize();
			wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			
	  }

  @Test
  public void loginToNicheTourism() throws InterruptedException{
	  driver.get("https://demoqa.com/automation-practice-form");
	  driver.manage().window().fullscreen();
	  WebElement user = driver.findElement(By.id("firstName"));
	   user.sendKeys("Mrunali");
	   String enteredText=user.getAttribute("value");
	 System.out.println("enter first name is-"+enteredText);
	  //Thread.sleep(3000);
	  System.out.println("First name is visible? - " + user.isDisplayed());
	  WebElement user1 = driver.findElement(By.id("lastName"));
	  user1.sendKeys("Meshram");
	  String enteredText1=user1.getAttribute("value");
	  System.out.println("enter last name is-"+enteredText1);
	  //Thread.sleep(3000);
	  System.out.println("last name is visible? - " + user1.isDisplayed());
	  WebElement user3 = driver.findElement(By.id("userEmail"));
	  user3.sendKeys("mruanli.meshram12@gmail.com");
	  //Thread.sleep(3000);
	 WebElement radio=driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[2]/label"));
	  radio.click();
	  //Thread.sleep(3000);
	  WebElement user4 = driver.findElement(By.xpath("//input[ @id='userNumber']"));
	  user4.sendKeys("8600129107");
	  //Thread.sleep(3000);
	  WebElement user5 = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
	  //Thread.sleep(3000);
	  user5.click();
	  //Thread.sleep(3000);
	  WebElement monthdropdown= driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
	  monthdropdown.click();
	  Select S = new Select(monthdropdown);
	  S.selectByVisibleText("October");
	  //Thread.sleep(3000);
	  
	  WebElement yeardropdown= driver.findElement(By.cssSelector("select.react-datepicker__year-select"));
	  yeardropdown.click();
	  Select S1 = new Select(yeardropdown);
	  S1.selectByVisibleText("1993");
	  //Thread.sleep(3000);
	  WebElement Day13 = driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--013']"));
	  Day13.click();
	  //Thread.sleep(3000);
	  WebElement sub=driver.findElement(By.xpath("//*[@id=\"subjectsInput\" and @type=\"text\"]"));
	  sub.sendKeys("Mathematics and science");
	  //Thread.sleep(6000);
	  WebElement hobbies=driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
	  hobbies.click();
	  //Thread.sleep(6000);
	  WebElement user7 =driver.findElement(By.xpath("//textarea[@placeholder='Current Address']"));
	  user7.sendKeys("Amravati");
	  //Thread.sleep(3000);
	  WebElement citydropdown=driver.findElement(By.xpath("//div[@class=' css-tlfecz-indicatorContainer']"));
	  //Thread.sleep(3000);
	  citydropdown.click();
	  Thread.sleep(3000);
	  WebElement citystate=driver.findElement(By.xpath("//div[text()='NCR']"));
	  citystate.click();
	  //Thread.sleep(3000);
	  WebElement statedropdown=driver.findElement(By.className(" css-1hwfws3"));
	  //Thread.sleep(3000);
	  statedropdown.click();
	  Thread.sleep(3000);
	//  WebElement state=driver.findElement(By.className(" css-1hwfws3"));
	  //state.click();
	  //Thread.sleep(3000);
	  WebElement city=driver.findElement(By.xpath("//div[@class=' css-2b097c-container' and @id='city']"));
	  city.click();
	  
	  //Thread.sleep(3000);
	 
	 
	  
  }
 /* @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }*/

  
  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
