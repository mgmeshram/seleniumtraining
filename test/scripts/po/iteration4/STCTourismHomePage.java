package scripts.po.iteration4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class STCTourismHomePage extends LoadableComponent<STCTourismHomePage> {
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
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
		get();
	}
	
	public STCTourismHomePage(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		isLoaded();
	}
	
	public void login(String user,String pass) {
		username.sendKeys(user);//here selenium will do findelement first and the type
		username.clear();//selenium will reuse the reference as we mention catchlookup
		username.sendKeys(user);//selenium will reuse the reference as we mention catchlookup
		password.clear();
		password.sendKeys(pass);
		submit.click();
		
	}
	
	public STCTourismHomePage unsuccesfulllogin(String user,String pass) {
		login(user,pass);
		driver.switchTo().alert().accept();
		return this;
	}
	
	public MyAccountPage succesfulllogin(String user,String pass) {
		login(user,pass);
		MyAccountPage myacc=new MyAccountPage(driver);
		return myacc;
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	public WebDriver getDriver()
	{
		return driver;
	}

	public String getTitleAfterLogin() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}
	
	

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertEquals(driver.getTitle(),pageTitle,"Application not loadede");
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		driver.get(url);
	}
	

}
