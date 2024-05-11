package scripts.po.Assignment.iteration2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class TestNgAfterPO {
	OrangeHrmHomePage Loginpage;
	String expectedText="Dashboard";
  @BeforeClass
  public void beforeClass()  {
	  
	  Loginpage =new  OrangeHrmHomePage();
	  
  }

  @AfterClass
  public void afterClass() {
	  Loginpage.closeBrowser();
  }
  @Test
  public void loginToOrangeHRM() throws InterruptedException {
	  Loginpage.login("Admin", "admin123");
	  
	assertEquals(Loginpage.getTextAfterLogin(),expectedText,"login succesfull!");
	  

  }

}
