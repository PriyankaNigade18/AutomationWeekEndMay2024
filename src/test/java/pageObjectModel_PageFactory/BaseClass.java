package pageObjectModel_PageFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import pageObjectModel.LoginPage;

public class BaseClass 
{
	public WebDriver driver;
	public LoginPage lp;
	
	@BeforeClass
	public void setUp()
	{
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp=PageFactory.initElements(driver,LoginPage.class);
		
		
		
	}

}