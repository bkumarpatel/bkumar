package ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Screenshoot {
 
 
@Test
 public void ScreenShot() throws IOException, InterruptedException
 {
	 // Open Chrome Browser
	 System.setProperty("webdriver.chrome.driver", "D://SeleniumDrivers//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.linkedin.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
 
	 // Take screenshot and store as a file format
	 	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	
	 	try{
	 		// now copy the  screenshot to desired location using copyFile //method
	 		FileUtils.copyFile(src, new File("D:\\Selenium\\Error\\ErrorScreenShot.jpg"));
	 		
	 	}
	 	 
	 	catch (IOException e)
	 	 {
	 	  System.out.println(e.getMessage());
	 	 
	 	 }
	 	
	 	driver.close();
	 	
	 	 }	
}

 		
 