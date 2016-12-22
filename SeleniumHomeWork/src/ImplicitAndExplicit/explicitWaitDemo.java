package ImplicitAndExplicit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWaitDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver ();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//*[@id='start']/button")).click();
		
		//Explicit Wait
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='finish']/h4")));
		
		//FluentWait wait
				
		  /*FluentWait wait1 = new FluentWait(driver).withTimeout(30, TimeUnit.SECONDS).
		pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);*/
				
				
		//Verification of Text
		String expectedtext = driver.findElement(By.xpath("//*[@id='finish']/h4")).getText();
		
		if(expectedtext.equals("Hello World!")){
			
			System.out.println("Test Passed");
			
		}
			else{
				
				System.out.println("Test Failed");
				
			}
				driver.close();
			
		}
	}


