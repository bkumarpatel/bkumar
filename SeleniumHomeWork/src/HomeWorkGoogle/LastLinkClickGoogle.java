package HomeWorkGoogle;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LastLinkClickGoogle {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.ca/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		WebElement elements = driver.findElement(By.name("q"));
				elements.sendKeys("selenium");
					elements.submit();
					
										
		}}
	
