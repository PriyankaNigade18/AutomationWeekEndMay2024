package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		
		
		driver.switchTo().frame(0);
		
		//ele
		WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
		
		//Action
		Actions act=new Actions(driver);
		act.clickAndHold(ele).moveToElement(ele,200,0).build().perform();
		
		
		
		
		
		
		
		

	}

}