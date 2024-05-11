package ddt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class STCTourismHomePage {
	private WebElement username;
	private WebElement password;
	private WebElement submit;
	private WebDriver driver;
	private String url="https://nichethyself.com/tourism/home.html";
	
	
	public STCTourismHomePage() {
		driver = new ChromeDriver();
		driver.get(url);
		username= driver.findElement(By.name("username"));
		password= driver.findElement(By.name("password"));
		submit= driver.findElement(By.xpath("//form[@name='loginform']/button"));
		
	}
	
	public void login(String user,String pass) {
		username.sendKeys(user);
		password.sendKeys(pass);
		submit.click();
		
	}
	
	public void closeBrowser() {
		driver.quit();
	}
	

}
