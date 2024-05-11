package scripts.po.iteration4;

import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;


public class TestNGAfterPoWithoutDriverTest2 {
	STCTourismHomePage LoginPage;
	MyAccountPage accountpage;
	String expectedTitle="My account";
	  
   @BeforeClass
  public void beforeClass() throws InterruptedException {
	   LoginPage= new STCTourismHomePage();
	  
	  
  }
//   @Test//test case1
//   public void loginToNicheTourism() throws InterruptedException {
//	   accountpage=LoginPage.login("stc123", "12345");
// 	assertEquals(LoginPage.getTitleAfterLogin(),expectedTitle);
// 	 accountpage.signOut();
//	 Thread.sleep(3000);
//   }
   
  /* @Test//test case1
   public void loginToNicheTourism() throws InterruptedException {
	   LoginPage.succesfulllogin("stc123", "12345")
	   .signOut()
	   .login("stc123","12345");
	   Thread.sleep(3000);
   }*/
   @Test//test case1
   public void loginToNicheTourism() throws InterruptedException {
	   LoginPage.unsuccesfulllogin("stc123", "7612345")
	   .succesfulllogin("stc123", "12345");
	   Thread.sleep(3000);
   }

  
  @AfterClass
  public void afterClass() {
	  LoginPage.closeBrowser();
	
}
  
  
}
