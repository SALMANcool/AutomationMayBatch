import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowsersAutomation {
	


	public static void main(String[] args) {
		
		WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vasu\\eclipse-workspace\\MayBatchAutomation_Selenium\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Vasu\\eclipse-workspace\\MayBatchAutomation_Selenium\\Drivers\\IEDriverServer.exe");
		//driver=new ChromeDriver();
		// driver=new FirefoxDriver();
		 driver =new InternetExplorerDriver();
		driver.get("https://www.google.co.in/");
		driver.getCurrentUrl();
	}

}
