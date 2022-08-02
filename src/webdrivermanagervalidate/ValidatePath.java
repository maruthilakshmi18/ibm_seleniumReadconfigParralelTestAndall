package webdrivermanagervalidate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ValidatePath {
	WebDriver driver;
	//String browser;
	
	@Parameters("ibm_browser")
	@BeforeTest
	public void setUp(String browser) {
		
		if(browser.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();		
	 	driver=new ChromeDriver();
	 	
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		driver.get("https://paytm.com");
	
	}

	 
		@Test
		public void open() {		
		
		System.out.println("-----------");
		
	}
		
		
		@AfterTest
		public void close() {
			driver.close();
		}
		
}
