package waitScenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		//btn
		By startbtn=By.xpath("//button[text()='Start']");
		By text=By.xpath("(//h4)[2]");
		//btn
		driver.findElement(startbtn).click();
		
		//FluentWait
		FluentWait<WebDriver> wait =new FluentWait<>(driver)
		            .withTimeout(Duration.ofSeconds(5))
		            .pollingEvery(Duration.ofMillis(2000))
		            .ignoring(NoSuchElementException.class);

	String te=wait.until(ExpectedConditions.presenceOfElementLocated(text)).getText();
		System.out.println(te);
		

	}

}
