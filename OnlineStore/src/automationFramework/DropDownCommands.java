package automationFramework;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.portable.ValueBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String path="D:\\ToolsQA\\Drivers\\ChromeDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.wpengine.com/automation-practice-form");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		WebElement continentsList=driver.findElement(By.id("continents"));
		
		Select dContinents=new Select(continentsList);
		
		Thread.sleep(5000);
		dContinents.selectByIndex(1);
		
		Thread.sleep(2000);
		dContinents.selectByVisibleText("Africa");
		
		List<WebElement> iList=dContinents.getOptions();
		
		int size=iList.size();
		
		for(int i=0;i<size;i++)
		{
			String sValue=dContinents.getOptions().get(i).getText();
			
			System.out.println(sValue);
			
			if(sValue.equalsIgnoreCase("North America"))
			{
				dContinents.selectByIndex(i);
				break;
			}
		}
		
		
		WebElement commands=driver.findElement(By.name("selenium_commands"));
		
		Select lCommands=new Select(commands);
		
		lCommands.selectByIndex(0);
		Thread.sleep(2000);
		lCommands.deselectByIndex(0);
		
		
		lCommands.selectByVisibleText("Navigation Commands");
		Thread.sleep(2000);
		lCommands.deselectByVisibleText("Navigation Commands");
		
		
		List<WebElement> listCommands=lCommands.getOptions();
		
		int cSize=listCommands.size();
		
		for(int i=0;i<cSize;i++)
		{
			String sValue=lCommands.getOptions().get(i).getText();
			
			System.out.println(sValue);
			
			lCommands.selectByIndex(i);
			
		}
		
		for(int i=0;i<cSize;i++)
		{
			lCommands.deselectByIndex(i);
			
		}
		
		
				
		driver.quit();
		
				

	}

}
