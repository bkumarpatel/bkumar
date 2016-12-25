package ScreenShot;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class Screenshoot1 {
 
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
	 	
		File dest = new File("filpath/screenshot_"+systime()+".png");
	 				
	 		FileUtils.copyFile(src, dest);}
 
	private String systime() {
	// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(Date.valueOf("LocalDate"));
}

}


 		
 