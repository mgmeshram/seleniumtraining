package scripts.po.Assignment.iteration1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;


import org.testng.annotations.AfterClass;

public class TestNgAfterPO {
	OrangeHrmHomePage Loginpage;
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
	  

  }

}
