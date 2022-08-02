package validateparelleltest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import readconfigfile.ReadData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HRMLogintestParallel {
	WebDriver driver;
	
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadData.getUrl());
	}
	
	@Test
	public void login() {	
	
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
	}
	
	@AfterTest
	public void closeApp() throws Exception {
		
		Thread.sleep(4000);
		driver.close();
		
	}
	
	
		
		
		

}
