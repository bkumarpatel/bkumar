package DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		driver.manage().timeouts().implicitlyWait(50,  TimeUnit.SECONDS);
		
		WebElement country = driver.findElement((By.name("country")));
		
		Select countryselect = new Select(country);
		
		countryselect.selectByVisibleText("INDIA");
		
		
	
	
	}
}
