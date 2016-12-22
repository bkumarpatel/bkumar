package FramLinks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ThreeFramesDemo {

public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	
	driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.switchTo().frame("classFrame");
	
	driver.findElement(By.linkText("Index")).click();
	driver.navigate().back();
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("packageListFrame");
	driver.findElement(By.xpath("html/body/div[2]/ul/li[1]/a")).click();
	
	driver.switchTo().defaultContent();
	
	driver.switchTo().frame("packageFrame");
	driver.findElement(By.xpath("html/body/div[1]/ul[1]/li[1]/a/i")).click();
	
	

		
		
	}

}
