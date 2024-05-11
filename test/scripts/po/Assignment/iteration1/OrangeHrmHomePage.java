package scripts.po.Assignment.iteration1;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrangeHrmHomePage {
	private WebElement username;
	private WebElement password;
	private WebElement submit;
	private WebDriver driver;
	private String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	
	
	public OrangeHrmHomePage()  {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		username= driver.findElement(By.name("username"));
		password= driver.findElement(By.name("password"));
		submit= driver.findElement(By.xpath("//button[@type='submit']"));
		
		 	
	}
	
	public void login(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		WebElement hello =driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		 assertEquals(hello.getText(), "Dashboard","login succusfull!");
		
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	

}
