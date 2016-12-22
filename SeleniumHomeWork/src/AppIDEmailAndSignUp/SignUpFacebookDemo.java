package AppIDEmailAndSignUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SignUpFacebookDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);// Implicit wait time 50 Seconds.
		
		driver.findElement(By.id("email")).sendKeys("bkumarpatel@gmail.com");
	  		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id='u_0_1']")).sendKeys("Bharat");
		driver.findElement(By.xpath("//*[@id='u_0_3']")).sendKeys("Patel");
		driver.findElement(By.xpath("//*[@id='u_0_5']")).sendKeys("+91647 911 0911");
		driver.findElement(By.xpath("//*[@id='u_0_8']")).sendKeys("+91647 911 0911");
		driver.findElement(By.xpath("//*[@id='u_0_a']")).sendKeys("BPs@0911");
		
		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		dropdown.selectByVisibleText("Aug");
		
		Select d1 = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		d1.selectByVisibleText("15");;
		
		Select d2 = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		
		d2.selectByVisibleText("1975");
		
		
		driver.findElement(By.xpath("//*[@id='u_0_i']")).click();
		
		//driver.findElement(By.xpath("//*[@id='u_0_e']")).click();
		
		
		driver.close();
		
	}
		
}

