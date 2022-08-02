package basictest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ValidateForgotPassword {
	WebDriver driver;
	
	@Before
	public void setUp() {
		
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");	
		//driver=new ChromeDriver();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		
	}
	
	@After
	public void tearDown() {
		driver.close();
		
	}

	
	
	@Test
	public void forgotPWD() throws InterruptedException {	
	
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Admin123");
	driver.findElement(By.id("btnLogin")).click();	
	Thread.sleep(1000);		
	String Atext= driver.findElement(By.partialLinkText("Welcome")).getText();
	String Etext= "Welcome 456789"; 
	Assert.assertTrue(Atext.contains(Etext));	 
	driver.findElement(By.partialLinkText("Welcome")).click();
	driver.findElement(By.linkText("Logout")).click();	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.partialLinkText("Forgot your")).click();
	String Url="requestPasswordResetCode";
	String Eurl=driver.getCurrentUrl();
	Assert.assertTrue(Eurl.contains(Url));
	driver.findElement(By.id("btnCancel")).click();

	
}

}