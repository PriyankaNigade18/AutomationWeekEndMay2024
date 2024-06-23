package dataDrivenTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShotDemo 



{
	
	public void getScreeshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		  
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File(System.getProperty("user.dir")+"//Screenshots//amazon"+System.currentTimeMillis()+".png");
		  
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
  @Test
  public void capture() throws IOException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  
	  File temp=ts.getScreenshotAs(OutputType.FILE);
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//amazon"+System.currentTimeMillis()+".png");
	  
	  FileHandler.copy(temp, dest);
	  
	  System.out.println("Done!");
	  
	  
	  
	  
	  
  }
}