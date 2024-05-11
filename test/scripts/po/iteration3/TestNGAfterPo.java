package scripts.po.iteration3;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;


public class TestNGAfterPo {
	STCTourismHomePage LoginPage;
	  
   @BeforeClass
  public void beforeClass() {
	   LoginPage= new STCTourismHomePage();
	 	
  }
   @Test//test case1
   public void loginToNicheTourism() throws InterruptedException {
 	LoginPage.login("stc123", "12345");
   }

  
  @AfterClass
  public void afterClass() {
	  LoginPage.closeBrowser();
	
}
  
  
}
