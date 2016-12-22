package TitleAndTextOnPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextOnPageDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		String expectedText = "See photos and updates";

		String actualText = driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/div[1]/div[1]/div[2]/span[1]")).getText();
		
		if(expectedText.equals(actualText))

		{

		System.out.println("Test is Passed");

		}

		else

		{

		System.out.println("Text is not Matched");

		}
		
		
		driver.close();
		
	}

}