package scenario2Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {

	private WebDriver driver;
	
	public AdminPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By lists=By.xpath("//ul[@class='oxd-main-menu']//li//span");
	By uname=By.xpath("(//input[contains(@class,'oxd-input')])[2]");
	By search=By.xpath("//button[contains(@class,' orangehrm-left-space')]");
	By userList=By.xpath("//div[contains(@class,'oxd-table-body')]//div[@class='oxd-table-card']");
	By records=By.xpath("(//span[contains(@class,'oxd-text ')])[13]");
	By dropDownRoles=By.xpath("(//div[contains(@class,'oxd-select')])[1]");
	By listRole=By.xpath("//div[@role='listbox']//div//span");
	By dropDownStatus=By.xpath("(//div[contains(@class,'oxd-select-text--after')])[2]");
	By listStatus=By.xpath("//div[@role='listbox']//div//span");
	
	////div[contains(@class,'oxd-table-body')]//div[@class='oxd-table-card']
	public List<WebElement> toGetlistOfOptions()
	{
		List<WebElement> listOptions = driver.findElements(lists);
		
		return listOptions;
	}
	public void toClickAdmin()
	{
		List<WebElement>	list=toGetlistOfOptions();
		for(WebElement i:list)
		{
			if(i.getText().contains("Admin"))
			{
				i.click();
				break;
			}
		}
		}
		public int toSearchByUname(String username)
		
		{
			driver.findElement(uname).sendKeys(username);
			driver.findElement(search).click();
		 List<WebElement> list = driver.findElements(userList);
			return list.size();
		}
		
		public int toSearchByRole(String role)
		{
			driver.findElement(dropDownRoles).click();
			List<WebElement> listRoles = driver.findElements(listRole);
			for(WebElement i:listRoles) 
			{
				if(i.getText().contains(role))
				{
					i.click();
					break;
				}
			}
			driver.findElement(search).click();
			 List<WebElement> list = driver.findElements(userList);
				return list.size();
		}
		
		public int toSearchByStatus(String status)
		{
			driver.findElement(dropDownStatus).click();
			List<WebElement> listStatuses = driver.findElements(listStatus);
			for(WebElement i:listStatuses) 
			{
				if(i.getText().contains(status))
				{
					i.click();
					break;
				}
			}
			driver.findElement(search).click();
			 List<WebElement> list = driver.findElements(userList);
				return list.size();
		}
	
	
}
