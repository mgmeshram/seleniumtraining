package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssignment {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver= new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		
		WebElement user= driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		WebElement pass= driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		user.submit();
		String expectedPageTitleAfterLogin = "OrangeHRM";
		Thread.sleep(6000);
		 String actualPageTitleAfterLogin = driver.getTitle();
			
			if (expectedPageTitleAfterLogin.equals(actualPageTitleAfterLogin)) {
				System.out.println("Login Successfull");
			} else {
				System.out.println("Login Failed");
			}
			//Thread.sleep(6000);
	
		driver.quit();
		
	}

}
