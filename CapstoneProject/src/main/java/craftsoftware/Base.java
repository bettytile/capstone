package craftsoftware;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

	public WebDriver driver;
	
	public WebDriver initializeBrowser() throws IOException {
		
		
		Properties props = new Properties();
		FileInputStream fs =new FileInputStream("C:\\Users\\Betty\\CapstoneProject\\src\\main\\java\\craftsoftware\\base.properties");
		
		props.load(fs);
		String broswserName = props.getProperty("browse");
		
		if (broswserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Betty\\Downloads\\Compressed\\chromedriver_win32_2\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if (broswserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Betty\\Downloads\\Compressed\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		
		return driver;
		
	}
}
