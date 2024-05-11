package scripts.po.iteration3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class STCTourismHomePage {
	private By username=By.name("username");
	private By password=By.name("password");
	private By submit=By.xpath("//form[@name='loginform']/button");
	private WebDriver driver;
	private String url="https://nichethyself.com/tourism/home.html";
	
	
	public STCTourismHomePage() {
		driver = new ChromeDriver();
		driver.get(url);
		
		}
	
	public void login(String user,String pass) {
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(submit).click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	

}
