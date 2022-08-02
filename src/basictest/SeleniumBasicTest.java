package basictest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumBasicTest {
	
	@Test
	public void login() {
		
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver;
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.get("https://www.amazon.com");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Jeans");
		driver.close();
	}

}
