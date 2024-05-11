package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class CookiesManageMethods {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  driver.get("https://nichethyself.com/tourism/home.html");
		//Thread.sleep(3000);
        Cookie cookie = new Cookie("cookieName1", "cookieValue");
         driver.manage().addCookie(cookie);
         driver.manage().getCookies();
         System.out.println("cookie name "+cookie.getName());
         System.out.println("cookie domain "+cookie.getDomain());
         System.out.println("cookie name path "+cookie.getPath());
         System.out.println("cookie value "+cookie.getValue());
         System.out.println("cookie hashcode "+cookie.hashCode());
         System.out.println("cookie string "+cookie.toString());
         System.out.println("cookie Expiry "+cookie.getExpiry());
         System.out.println("cookie class "+cookie.getClass());
         System.out.println("cookie secure "+cookie.isSecure());
         System.out.println("cookie http "+cookie.isHttpOnly());
         System.out.println("cookie samesite"+cookie.getSameSite());
  }
  
 /* @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }*/

  @BeforeClass
  public void beforeClass() {
	  driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
