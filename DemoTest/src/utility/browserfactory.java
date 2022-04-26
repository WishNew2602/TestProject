package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserfactory {
	
	
	public static WebDriver driver;
	
	
	public static WebDriver startapp(String browser, String url) {
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\VISHNU VARDHAN\\sel_drivers\\chromedriver_win32 (1)\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
			
			
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\VISHNU VARDHAN\\sel_drivers\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
		}
		else if(browser.equalsIgnoreCase("IE")) {
			
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		return driver;
		
	}
	
	public static void quit(WebDriver driver) {
		driver.quit();
	}
	
	

}
