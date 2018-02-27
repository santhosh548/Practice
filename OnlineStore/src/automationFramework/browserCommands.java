package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="D:\\ToolsQA\\Drivers\\ChromeDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https:\\www.google.com");
		driver.navigate().to("http://www.facebook.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.close();
		
	}

}
