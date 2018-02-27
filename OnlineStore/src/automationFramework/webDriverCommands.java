package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverCommands {
	
	public void commands() {
		
	String path="D:\\ToolsQA\\Drivers\\ChromeDrivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	
	driver.get("https:www.google.com");
	
	String title=driver.getTitle();
	
	int titleLength=driver.getTitle().length();
	
	System.out.println("Title is : "+title);
	System.out.println("Title length is :"+titleLength);
	
	String currentUrl=driver.getCurrentUrl();
	
	System.out.println("current url is : "+currentUrl);
	
	String pageSource=driver.getPageSource();
	int pageSourceLenght=pageSource.length();
	
	System.out.println("total length of page source : "+pageSourceLenght);
	
	driver.close();
		
	}
	
	public void RBandCB_Commands()
	{
		
	String path="D:\\ToolsQA\\Drivers\\ChromeDrivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	WebDriver driver=new ChromeDriver();
	
	driver.get("https:www.google.com");
		
	}
	
	
	public static void main(String[] args) {
		
		webDriverCommands wc=new webDriverCommands();
		wc.commands();
	}
	
}
