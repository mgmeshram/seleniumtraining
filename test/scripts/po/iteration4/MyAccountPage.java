package scripts.po.iteration4;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;

public class MyAccountPage extends LoadableComponent<MyAccountPage>{
	
	@FindBy(xpath="//a[@href='home.html']")
	private WebElement signOut;
	
	@FindBy(xpath="//button[text()='Contact us!']")
	private WebElement contctUs;
	
	private WebDriver driver;
	private String pageTitle="My account";
	
	public MyAccountPage(WebDriver driver) {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
		 get();
	}
	
	public STCTourismHomePage signout() {
		signOut.click();
		return new STCTourismHomePage();
	}
	
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertEquals(driver.getTitle(),pageTitle,"My account page not Loaded!!");
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	public void signOut() {
		// TODO Auto-generated method stub
		
	}

}
