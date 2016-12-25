package XpathAndElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathAndElementsDemo {

				public static void main(String[] args) {
			
			WebDriver driver = new FirefoxDriver ();
			
			//Wait command
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    
			driver.get("https://www.facebook.com/");
			
			//Maximize Windows
			
			driver.manage().window().maximize();
			
			//Path Elements
			driver.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("Bharat");
			driver.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("Patel");
			
			//Radio Button selection
			driver.findElement(By.xpath("//*[@id='u_0_i']")).click();
			
			// Link elements
		    driver.findElement(By.linkText("Sign Up")).click();
		    
		    
			
		    //Close the Application/Browser
			driver.close();
			
			
		}
	}

