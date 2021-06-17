package runningThroughDifferentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInDrivers {
	
	
	public void methodsInWebdriver() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasu\\eclipse-workspace\\mayBatchSelenium_Automation\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
		 
//	    Options opt = driver.manage();
//		Window window = opt.window();
//    	window.maximize();
//		
		System.out.println("title is "+ driver.getTitle());
		System.out.println("current URL is "+ driver.getCurrentUrl());
		//driver.findElement(By.)
		//driver.findElements(null)
		//driver.close();
		//driver.quit();
		System.out.println("my session id is"+driver.getWindowHandle());
		driver.getWindowHandles();	 
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MethodsInDrivers mid=new MethodsInDrivers();
		mid.methodsInWebdriver();
	}

}
