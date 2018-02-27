package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBxRadioBtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path="D:\\ToolsQA\\Drivers\\ChromeDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		List<WebElement> rbSex=driver.findElements(By.name("sex"));
		
		Boolean value=rbSex.get(0).isSelected();
		
		if(value==true)
		{
			rbSex.get(1).click();
		}
		else
		{
			rbSex.get(0).click();
		}
		
		
		WebElement rbYear=driver.findElement(By.id("exp-2"));
		
		rbYear.click();
		
		List<WebElement> cbProfession=driver.findElements(By.name("profession"));
		
		int iSize=cbProfession.size();
		
		for(int i=0;i<iSize;i++)
		{
			String sValue=cbProfession.get(i).getAttribute("value");
			
			if(sValue.equalsIgnoreCase("Automation Tester"))
			{
				cbProfession.get(i).click();
				break;
			}
		}
		
		WebElement cbTool=driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		cbTool.click();
		
		WebElement btnSumbit=driver.findElement(By.id("submit"));
		btnSumbit.click();
		
		
		

	}

}
