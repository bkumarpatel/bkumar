package AllLinks;


import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetAllLinks {
	
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
	
		driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");
					
		driver.switchTo().frame("classFrame");// Display Frame
		
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
	
		System.out.println("Number of Links in the Page is " + links.size());
	
		for (int i = 1; i<=links.size(); i=i+1){
		
			System.out.print("Name of Link# " + i);
	
			System.out.println(" - " + (links.get(i).getText()));
	
	//Thread.sleep(5000);
	
		}
		
		//driver.close();
	
		}	}
	//***********************************************************
