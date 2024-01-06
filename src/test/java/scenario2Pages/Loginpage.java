package scenario2Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	private WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	By uname=By.name("username");
	By pword=By.name("password");
	By button=By.xpath("//button[@type='submit']");
	
	public void toEnterCredentials(String username,String password)
	{
		driver.findElement(uname).sendKeys(username);
		driver.findElement(pword).sendKeys(password);
		
	}
public void toLogin()
{driver.findElement(button).click();
	}
}
