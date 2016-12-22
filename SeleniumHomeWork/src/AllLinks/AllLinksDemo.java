package AllLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksDemo {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.navigate().to("https://docs.oracle.com/javase/7/docs/api/");

		driver.switchTo().frame("classFrame");// Display Frame

		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		int l = links.size();
		System.out.println("Number of Links in the Page is " + l);

		WebElement element = links.get(l - 1);
		System.out.println("last link  :" + element.getText());

	}
}

