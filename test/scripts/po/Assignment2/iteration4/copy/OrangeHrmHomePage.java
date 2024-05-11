package scripts.po.Assignment2.iteration4.copy;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrmHomePage extends LoadableComponent<OrangeHrmHomePage> {
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	
	private WebDriver driver;
	private WebDriverWait wait;
	private String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	private String pageTitle="OrangeHRM";
		
	
	public OrangeHrmHomePage()  {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		assertEquals(driver.getTitle(),pageTitle,"Application not loadede");
		PageFactory.initElements(driver, this);
		 	
	}
//	public OrangeHrmHomePage(WebDriver driver) {
//		this.driver =driver;
//		PageFactory.initElements(driver, this);
//		isLoaded();
//	}
	
	public Dashboard login(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		submit.click();
		Dashboard Dashpage  = new Dashboard(driver);
		return Dashpage;
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	public String getTextAfterLogin() {
		// TODO Auto-generated method stub
		WebElement hello =driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		return hello.getText();
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertEquals(driver.getTitle(),pageTitle,"Application not loaded");
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
//		driver.get(url);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		wait = new WebDriverWait(driver,Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//title[text()='OrangeHRM']")));
		
		
	}
	public WebDriver getDriver() {
		return driver;
	}
	

}
