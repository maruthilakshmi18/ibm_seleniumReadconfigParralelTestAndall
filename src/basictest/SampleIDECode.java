package basictest;

	// Generated by Selenium IDE
	import org.junit.Test;
	import org.junit.Before;
	import org.junit.After;
	import static org.junit.Assert.*;
	import static org.hamcrest.CoreMatchers.is;
	import static org.hamcrest.core.IsNot.not;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.Dimension;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.Keys;
	import java.util.*;
	import java.net.MalformedURLException;
	import java.net.URL;
	
	public class SampleIDECode { 
	  private WebDriver driver;
	  private Map<String, Object> vars;
	  JavascriptExecutor js;
	  @Before
	  public void setUp() {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	  }
	  @After
	  public void tearDown() {
	    driver.quit();
	  }
	  @Test
	  public void tc3() throws InterruptedException {
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().setSize(new Dimension(1167, 585));
	    driver.findElement(By.id("txtUsername")).click();
	    driver.findElement(By.id("txtUsername")).sendKeys("admin");
	    driver.findElement(By.id("txtPassword")).click();
	    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	   // assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Dashboard"));
	    driver.findElement(By.id("welcome")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.linkText("Logout")).click();
	    {
	      List<WebElement> elements = driver.findElements(By.linkText("Forgot your password?"));
	      assert(elements.size() > 0);
	    }
	  }
	}


	