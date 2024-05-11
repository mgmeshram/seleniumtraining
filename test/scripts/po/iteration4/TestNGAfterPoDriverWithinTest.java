package scripts.po.iteration4;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;


public class TestNGAfterPoDriverWithinTest {
	STCTourismHomePage LoginPage;
	MyAccountPage accountpage;
	String expectedTitle="My account";
	  
   @BeforeClass
  public void beforeClass() throws InterruptedException {
	   LoginPage= new STCTourismHomePage();
	  
	  
  }
   @Test//test case1
   public void loginToNicheTourism() throws InterruptedException {
 	LoginPage.login("stc123", "12345");
 	 accountpage= new MyAccountPage(LoginPage.getDriver());
 	assertEquals(LoginPage.getTitleAfterLogin(),expectedTitle);
 	 accountpage.signout();
	 Thread.sleep(3000);
   }

  
  @AfterClass
  public void afterClass() {
	  LoginPage.closeBrowser();
	
}
  
  
}
