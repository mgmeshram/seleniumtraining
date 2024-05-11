package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Practice {
	WebDriver driver;
  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }
//  @Test//case 1
  public void LoginToNitchTourism() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/home.html");
	  Thread.sleep(3000);
	  WebElement user = driver.findElement(By.name("username"));
	  System.out.println("username is visible?-"+user.isDisplayed());
	  System.out.println("useername is enabled?-"+user.isEnabled());
	  System.out.println("useername is selected?-"+user.isSelected());
	  user.sendKeys("stc123");
	  Thread.sleep(3000);
	  user.clear();
	  Thread.sleep(3000);
	  user.sendKeys("stc123aswdasd");
	  driver.get("https://nichethyself.com/tourism/customised.html");
	  WebElement swiss=driver.findElement(By.xpath("//label[text()='Switzerland']/input"));
	  System.out.println("swiss checkbox is enabled?-"+swiss.isEnabled());
	  WebElement travel=driver.findElement(By.id("travel"));
	  System.out.println("travel Dropdown is visible?-"+travel.isDisplayed());
	  WebElement USA=driver.findElement(By.xpath("//label[text()='USA']/input"));
	  System.out.println("USA checkbox checked , i have not clicked yet?-"+USA.isSelected());
	  USA.click();
	  System.out.println("is USA checkbox checked?-"+USA.isSelected());
	  //user.sendKeys("stc123");
	  Thread.sleep(3000);
  }
 // @Test//case 2
  public void handlingCheckboxes() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/customised.html");
	  WebElement USA=driver.findElement(By.xpath("//label[text()='USA']/input"));
	  if(!USA.isSelected()) {
		  USA.click();
	  }
	  Thread.sleep(3000);
	  if(USA.isSelected()) {
		  USA.click();
	  }
	  Thread.sleep(3000);
  }
 // @Test
  public void handlingRadioButtons() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/customised.html");
	  WebElement radio=driver.findElement(By.cssSelector("input[type='radio'][name='optradio']"));
	  radio.click();
	  Thread.sleep(3000);
	  WebElement radio1=driver.findElement(By.xpath("//*[@id=\"international\"]/form/label[8]"));
	  radio1.click();
	  Thread.sleep(3000);
	  WebElement radio2=driver.findElement(By.cssSelector("#international > form > label:nth-child(24)"));
	  radio2.click();
	  Thread.sleep(3000);
  }
  @Test
  public void handlingDropdowns() throws InterruptedException {
	  driver.get("\"https://nichethyself.com/tourism/customised.html");
	  WebElement make=driver.findElement(By.name("make"));
	  List<WebElement> allOptions=(List<WebElement>) driver.findElement(By.cssSelector("option[value]"));//9
	  List<WebElement> allOptions1=(List<WebElement>) driver.findElement(By.xpath("//select[@name='make']/option"));//4
	  List<WebElement> allOptions2=(List<WebElement>) driver.findElement(By.name("make")).findElements(By.tagName("option"));
	  Thread.sleep(3000);
  }
	

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
