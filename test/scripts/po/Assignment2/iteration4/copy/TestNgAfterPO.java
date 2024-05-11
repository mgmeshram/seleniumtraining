package scripts.po.Assignment2.iteration4.copy;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class TestNgAfterPO {
	OrangeHrmHomePage Loginpage;
	Dashboard  Dashpagepo;
	String expectedText="Dashboard";
  @BeforeClass
  public void beforeClass()  {
	  
	  Loginpage =new  OrangeHrmHomePage();
	  //Dashpage  = new Dashboard(Loginpage.getDriver());
  }

  @AfterClass
  public void afterClass() {
	  Loginpage.closeBrowser();
  }
  
 // @Test
  public void OrangeHrmHomePage() throws InterruptedException {
	  Dashpagepo= Loginpage.login("Admin", "admin123");
	  Thread.sleep(6000);
	  assertEquals(Loginpage.getTextAfterLogin(),expectedText,"login succesfull!");
	  Dashpagepo.logout();
	  Thread.sleep(6000);  
	
	  

  }
  @Test
  public void OrangeHrmHomePagechaining() throws InterruptedException {
	  Loginpage.login("Admin", "admin123").logout();
	  Thread.sleep(6000);
	  
  }



}
