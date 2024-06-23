package dataDrivenTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMDataProvider 
{
  @Test(dataProvider = "mydata",dataProviderClass = CustomData.class)
  public void hrmLoginTest(String un,String psw)
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	  //validate
	  
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"LoginFail!");
	  System.out.println("LoginPass");
	  
	  
  }
}