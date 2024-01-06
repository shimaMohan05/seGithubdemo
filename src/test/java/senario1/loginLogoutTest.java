package senario1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginLogoutTest {
	 WebDriver driver;
	
 @Test(dataProvider="credentials",dataProviderClass=Scenario1Utility.class)
  public void toLogin(String uname,String pword) {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace-staragile\\SeStaragileProj\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  driver.findElement(By.name("username")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pword);
	  Scenario1Utility.getScreenShot(driver,"AfterGivingCredentials");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 Scenario1Utility.getScreenShot(driver,"After login");
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Failed to login");
	  System.out.println("Login Successfully");
	this.toLogout();
	 
  }
 
  @Test(dependsOnMethods="toLogin")
  public void toLogout() {
	  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
	  Scenario1Utility.getScreenShot(driver,"AfterClickingOptions");
	  driver.findElement(By.xpath("(//a[@class='oxd-userdropdown-link'])[4]")).click();
	  Scenario1Utility.getScreenShot(driver,"Afterlogout");
	  Assert.assertTrue(driver.getCurrentUrl().contains("login"), "Fail:  some issues are  in logout process");
	  System.out.println("Successfully logout from the OrangeHrm");
  }
}
