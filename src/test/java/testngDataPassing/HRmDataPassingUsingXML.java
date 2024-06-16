package testngDataPassing;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HRmDataPassingUsingXML 
{
	@Parameters({"un","psw"})
  @Test
  public void hrmLogin(String un,String psw)
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