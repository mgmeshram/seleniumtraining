package scripts.po.Assignment.iteration2;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OrangeHrmHomePage {
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	private WebDriver driver;
	private String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	private String pageTitle="OrangeHRM";
	
	
	public OrangeHrmHomePage()  {
		driver = new ChromeDriver();
		driver.get(url);
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		assertEquals(driver.getTitle(),pageTitle,"Application not loadede");
		PageFactory.initElements(driver, this);
		 	
	}
	
	public void login(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	public String getTextAfterLogin() {
		// TODO Auto-generated method stub
		WebElement hello =driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		return hello.getText();
	}
	
	//public String
}
