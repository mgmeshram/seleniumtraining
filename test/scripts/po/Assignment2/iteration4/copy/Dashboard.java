package scripts.po.Assignment2.iteration4.copy;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.Select;

public class Dashboard extends LoadableComponent<Dashboard>
{
	
//	@FindBy(xpath="//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")	
//	private WebElement mada;
//	
//	@FindBy(xpath="//*[@id=\\'app\\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")	
//	private WebElement logout;
	
	
	//private WebElement logout;
	
	private WebDriver driver;
	private String pageTitle="OrangeHRM";
	
	public Dashboard(WebDriver driver) {
		this.driver=driver;
	    PageFactory.initElements(driver, this);
		get();
		}
	 
	public void logout() {
		
		
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
//		mada.click();
//		logout.click();
		//return new OrangeHrmHomePage();
	
	}
	
	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		assertEquals(driver.getTitle(),pageTitle,"orngehrm page is not loaded");
		
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

}
