package AppIDEmailAndSignUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppIdEmailDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("bkumarpatel@gmail.com");
		driver.findElement(By.name("email")).sendKeys("bkumarpatel@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("NoWay303");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.xpath(".//*[@id='pageFooter']/div[2]/table/tbody/tr[1]/td[3]/a")).click();
		driver.findElement(By.xpath(".//*[@id='u_0_4']/div[2]/div/div/div[2]/a[2]")).click();;
			
		driver.navigate().to("https://www.facebook.com/");
		
		
		//Will wait for 5 second.
		Thread.sleep(5000);
		
		//driver.quit();
		
	}
}
