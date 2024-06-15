package mouseOperation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	public static void main(String[] args)
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_onmouseover");

		driver.switchTo().frame("iframeResult");
		
		//ele
		WebElement ele=driver.findElement(By.xpath("//img[@alt='Smiley']"));
		
		//Action
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}