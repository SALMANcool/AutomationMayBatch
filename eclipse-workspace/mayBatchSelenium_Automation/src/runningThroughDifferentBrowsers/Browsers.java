package runningThroughDifferentBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {
	WebDriver driver;
	public void runningChromeBrowsers() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasu\\eclipse-workspace\\mayBatchSelenium_Automation\\Drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(10000);
		//driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.close();
	}
	
	
	public void runIEBrowsers() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vasu\\eclipse-workspace\\mayBatchSelenium_Automation\\Drivers\\IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.close();
	}
	
	public void runFireFoxBrowsers() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vasu\\eclipse-workspace\\mayBatchSelenium_Automation\\Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//driver.close();
	}
	
	
	public void dynamicbindingApproachForBrowsers() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasu\\eclipse-workspace\\mayBatchSelenium_Automation\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			Thread.sleep(10000);
		 
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Browsers brow=new Browsers();
		//brow.runningChromeBrowsers();
		//brow.runIEBrowsers();
//brow.runFireFoxBrowsers();
		brow.dynamicbindingApproachForBrowsers();
	}

}
