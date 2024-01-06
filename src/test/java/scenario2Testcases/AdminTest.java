package scenario2Testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTest extends BaseClass{
  @Test(priority=1)
  public void getOptions()
  {
	 List<WebElement> lists = ap.toGetlistOfOptions();
	 for(WebElement i:lists)
		{
			System.out.println(i.getText());
		}
	 
  }
	 @Test(priority=2)
	  public void adminClickTest() 
	 {BaseClass.getWait();
		 ap.toClickAdmin();
		 Assert.assertTrue(driver.getCurrentUrl().contains("admin"),"Failed to perform admin selection");
		 System.out.println(" select and click the Admin option successfully");
		 
	 }
	 @Test(priority=3)
	  public void searchByUserName()
			   {
		 BaseClass.getWait();
		int num= ap.toSearchByUname("Admin");
		 System.out.println("number of records for user Admin is:: "+num);
		 BaseClass.totakeScreenShot("After selecting uname",driver);
		 driver.navigate().refresh();
		 
			   }
	 @Test(priority=4)
	  public void searchByUserRole()
			   {
		 BaseClass.getWait();
		int num= ap.toSearchByRole("Admin");
		 System.out.println("number of records for userrole Admin are :: "+num);
		 BaseClass.totakeScreenShot("After selecting role",driver);
		 driver.navigate().refresh();
			   }

	 @Test(priority=5)
	  public void searchByUserStatus()
			   {
		 BaseClass.getWait();
		int num= ap.toSearchByStatus("Enabled");
		BaseClass.totakeScreenShot("After selecting status",driver);
		 System.out.println("number of records for status enabled are:: "+num);
		 
			   }

}
