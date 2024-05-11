package scripts.po.iteration2;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class STCTourismHomePage {
	@FindBy (name="username")
	@CacheLookup //please cache lookup for re use
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//form[@name='loginform']/button")
	private WebElement submit;
	
	private WebDriver driver;
	private String url="https://nichethyself.com/tourism/home.html";
	private String pageTitle="STC Tourism";
	
	public STCTourismHomePage() {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		assertEquals(driver.getTitle(),pageTitle,"Application not loadede");
		PageFactory.initElements(driver, this);
	}
	
	public void login(String user,String pass) {
		username.sendKeys(user);//here selenium will do findelement first and the type
		username.clear();//selenium will reuse the reference as we mention catchlookup
		username.sendKeys(user);//selenium will reuse the reference as we mention catchlookup
		password.sendKeys(pass);
		submit.click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}

	public String getTitleAfterLogin() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	

}
