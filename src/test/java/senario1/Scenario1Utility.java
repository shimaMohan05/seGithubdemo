package senario1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;

public class Scenario1Utility {
	@DataProvider(name="credentials")
	public static Object[][] toGetExcelData()
	{
		File f=new File("./"+"\\DataFolder\\userdetails.xlsx");
		FileInputStream fi;
		Object data[][]=null;
		XSSFWorkbook wb;
		 try {
			fi=new FileInputStream(f);
			
			 wb=new XSSFWorkbook(fi);
				int raws=	wb.getSheetAt(0).getPhysicalNumberOfRows();
				int cells=wb.getSheetAt(0).getRow(0).getPhysicalNumberOfCells();
				data=new Object[raws-1][cells];
				for(int i=1;i<raws;i++)
				{
					for(int j=0;j<cells;j++)
					{
						data[i-1][j]=wb.getSheetAt(0).getRow(i).getCell(j).getStringCellValue();
						System.out.println(data[i-1][j]);
					}
					
					
					
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	return data;
		
	}	
	public static void getScreenShot(WebDriver driver,String name)	
	{File dest=new File("./"+"\\ScreenShot\\Scenario1. "+name+""+System.currentTimeMillis()+".png");
	
	TakesScreenshot t=(TakesScreenshot)driver;
	File temp=t.getScreenshotAs(OutputType.FILE);
	try {
		FileHandler.copy(temp, dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
		
		

}
