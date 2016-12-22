package AlertBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertBoxDemo1 {
	
	public static void main(String[] args){
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath(".//*[@id='content']/div/ul/li[1]/button")).click();
		
		driver.switchTo().alert().accept();
		
		String expectedText = "You successfuly clicked an alert";
				
		String actualText = driver.findElement(By.xpath(".//*[@id='result']")).getText();
		
		if(expectedText.equals(actualText)){
			
			System.out.println("Pass");
		}
		else{
			System.out.println("Fail");
		}	
		
		
		
	}

}
  