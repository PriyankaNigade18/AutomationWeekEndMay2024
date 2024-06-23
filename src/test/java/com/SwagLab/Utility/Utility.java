package com.SwagLab.Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{
	
	public static void getScreenshot(WebDriver driver,String filename)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		  
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+filename+System.currentTimeMillis()+".png");
		  
		  try {
			FileHandler.copy(temp, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void scrollToElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	
	
	
	
	
	//alert utilities
	public static void alertWithOK(WebDriver driver)
	{
		//alert window open
	Alert alt1=driver.switchTo().alert();
				
	System.out.println("Alert text: "+alt1.getText());
				//ok
	alt1.accept();
	}
	
	
	public static void alertWithCancel(WebDriver driver)
	{
		//alert window open
	Alert alt1=driver.switchTo().alert();
				
	System.out.println("Alert text: "+alt1.getText());
				//ok
	alt1.dismiss();
	}
	
	public static void alertWithPrompt(WebDriver driver,String msg)
	{
		//alert window open
	Alert alt1=driver.switchTo().alert();
				
	System.out.println("Alert text: "+alt1.getText());
	alt1.sendKeys(msg);
	alt1.accept();
	}
	
	
	
	
	
	
	
	
	//ExplicitWait
	public static WebElement waitForElementToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	public static WebElement waitForElementToPresentToClick(WebDriver driver,By loc)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	public static WebElement waitForElementToVisible(WebDriver driver,By loc)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	
	public static boolean waitForUrl(WebDriver driver,String url)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.urlContains(url));
	}
	
	
	public static boolean waitForTitle(WebDriver driver,String url)
	{
		WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(10));
		return wait3.until(ExpectedConditions.titleContains(url));
	}
	
	//drop down based on select
	public static void selectOption(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		System.out.println("Is Dropdown Support multiple Selection?: "+dd.isMultiple());
		 
		List<WebElement> allOptions=dd.getOptions();
		
		System.out.println("Total Options are: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
			if(i.getText().contains(value))
			{
				i.click();
				break;
			}
			
		}
	}


}