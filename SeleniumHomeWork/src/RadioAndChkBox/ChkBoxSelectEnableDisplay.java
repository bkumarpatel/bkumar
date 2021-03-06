package RadioAndChkBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChkBoxSelectEnableDisplay {

public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver();
	//Puts an Implicit wait, Will wait for 10 seconds
	//before throwing exception

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	//Launch website
	driver.navigate().to("http://www.calculator.net/mortgage-calculator.html");
	
	driver.manage().window().maximize();
	//Click on Radio Button
	
			driver.findElement(By.id("caddoptional")).click();
	System.out.println("The Output of the IsSelected " + driver.findElement(By.id("caddoptional")).isSelected());
	System.out.println("The Output of the IsEnabled " + driver.findElement(By.id("caddoptional")).isEnabled());
	System.out.println("The Output of the IsDisplayed " + driver.findElement(By.id("caddoptional")).isDisplayed());
	
	driver.close();
	
}}