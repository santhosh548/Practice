package automationFramework;

import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.Verify;

public class firstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String path="D:\\ToolsQA\\Drivers\\ChromeDrivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver d=new ChromeDriver();
		d.get("https:\\www.google.com");
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement e=d.findElement(By.xpath("//a[text()='Gmail']"));
		e.click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//e=d.findElement(By.xpath("//a[text()='Sign In']"));
		//e.click();
		
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		e=d.findElement(By.xpath("//input[@id='identifierId']"));
		e.sendKeys("dasarisanthosh548");
		e=d.findElement(By.xpath("//span[text()='Next']"));
		e.click();
		
		e=d.findElement(By.name("password"));
		e.sendKeys("bychyd@548");
		e=d.findElement(By.xpath("//span[text()='Next']"));
		e.click();
		e=d.findElement(By.xpath("//div[@role='button']//span[text()='Gmail']"));
		String actualValue=e.getText();
		
		
		
		
		
		
	}

}
