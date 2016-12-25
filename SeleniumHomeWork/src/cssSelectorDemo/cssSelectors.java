package cssSelectorDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cssSelectors {
	
	
	public static void main(String[] args) {
		
		WebDriver driver; 
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https:/www.facebook.com/");
		
		//tag.classname (css=input.inputtext)
		driver.findElement(By.cssSelector("input.inputtext")).sendKeys("BPatel@gmail.com");
		
		//tag[attributename='value'] (css= input[tabindex='2'] or input[id='pass'])
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("KumarPatel");
		
		//tag.class[attributename='value'] (css=input[type='submit'])
		driver.findElement(By.cssSelector("input[type='submit']")).click();
			
		driver.close();
			
	}
 
}
