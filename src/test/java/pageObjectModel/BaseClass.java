package pageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseClass
{
/*
 * Scenario is related to one class
 */
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=new LoginPage(driver);
		
		
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
