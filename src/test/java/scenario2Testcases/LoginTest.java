package scenario2Testcases;

import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
  @Test(priority=1)
  public void enterCredentials() {
	  lp.toEnterCredentials("Admin", "admin123");
	  
  }
  @Test(priority=2)
  public void loginTest()
  {
	  lp.toLogin();
  }
}
