package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	
	JavascriptExecutor jr = ((JavascriptExecutor)driver);
	jr.executeScript("window.scrollBy(0,800)");
	Thread.sleep(2000);
	jr.executeScript("window.scrollBy(0,-800)");
	
	
	WebElement link = driver.findElement(By.xpath("//a[text()='checkboxes']"));
	link.click();
	jr.executeScript("arguments[0].scrollIntoVeiw();",link);
	}

}
