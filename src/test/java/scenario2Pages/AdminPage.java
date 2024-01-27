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
	private By lists=By.xpath("//ul[@class='oxd-main-menu']//li//span");
	private By uname=By.xpath("(//input[contains(@class,'oxd-input')])[2]");
	private By search=By.xpath("//button[contains(@class,' orangehrm-left-space')]");
	private By userList=By.xpath("//div[@class='oxd-table-body']"
			+ "//div[@class='oxd-table-card']//div[contains(@class,'oxd-table-row')]");
	private By records=By.xpath("(//span[contains(@class,'oxd-text ')])[13]");
	private By dropDownRoles=By.xpath("(//div[contains(@class,'oxd-select')])[1]");
	private By listRole=By.xpath("//div[@role='listbox']//div//span");
	private By dropDownStatus=By.xpath("(//div[contains(@class,'oxd-select-text--after')])[2]");
	private By listStatus=By.xpath("//div[@role='listbox']//div//span");
	
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
		 for(WebElement i:list)
		 {
			 System.out.println(i.getText());
		 }
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
			 for(WebElement i:list)
			 {System.out.println(i.getText());}
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
			 for(WebElement i:list)
			 {System.out.println(i.getText());}
				return list.size();
		}
	
	
}
