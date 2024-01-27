package scenario2Testcases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import scenario2Pages.AdminPage;
import scenario2Pages.Loginpage;

public class BaseClass {
	public WebDriver driver;
	public Loginpage lp;
	public  AdminPage ap;
	
	
	@BeforeTest
	public void sessionStart()
	{System.setProperty("webdriver.chrome.driver",
	"C:\\Users\\user\\eclipse-workspace-staragile\\SeStaragileProj\\Driver\\chromedriver.exe");
	 driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  lp=new Loginpage(driver);
	  ap=new  AdminPage(driver);
	  
	}
	@BeforeClass
	public void basicSteps()
	
	{
		lp.toEnterCredentials("Admin", "admin123");
		BaseClass.getWait();
		lp.toLogin();
		BaseClass.totakeScreenShot("loginSuccessfully",driver);
		System.out.println("Login to the OrangeHrm successfully");
		BaseClass.getWait();
		
		
	}
	
	public static void getWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	public static void totakeScreenShot(String name,WebDriver driver) {
		File dest=new File("./"+"//ScreenShot//Scenario2." +name+".png");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(temp,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
