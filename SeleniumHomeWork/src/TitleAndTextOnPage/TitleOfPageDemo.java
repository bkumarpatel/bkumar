package TitleAndTextOnPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleOfPageDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		//Verified the title
		String expectedTitle = "Facebook - Log In or Sign Up";

		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))

		{

		System.out.println("Title is Matched");

		}

		else

		{

		System.out.println("Title is not Matched");

		}
		
		
		driver.close();
		
	}

}