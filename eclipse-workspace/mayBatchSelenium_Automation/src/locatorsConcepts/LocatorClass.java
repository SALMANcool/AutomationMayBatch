package locatorsConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClass {

	public void locatorTypes()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasu\\eclipse-workspace\\mayBatchSelenium_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/test/facebook.html");
			driver.manage().window().maximize();
			
			//id tag
			//By byObject = By.id("email");
			driver.findElement(By.id("email")).sendKeys("isalmansal07@gmail.com");
			//emailWebElement.sendKeys("isalmansal07@gmail.com");
			
			//name locator
			
			driver.findElement(By.name("pass")).sendKeys("123894885");
			//linkText
		//driver.findElement(By.linkText("Forgot your password?")).click();
			
			//partial link text
			//driver.findElement(By.partialLinkText("Forgot you")).click();
			
			//tag name
			
			List<WebElement> webElements = driver.findElements(By.tagName("input"));
			System.out.println("input tags count in webpage are"+webElements.size());
			//webElements.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorClass lc=new LocatorClass();
		lc.locatorTypes();
	}

}
