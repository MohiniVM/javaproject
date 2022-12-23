package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Class_action {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
          
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
	WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double Click Me']"));
	
    WebElement rightclick =	 driver.findElement(By.xpath("//button[text()='Right Click Me']"));
   
	WebElement click = driver.findElement(By.xpath("//button[text()='Click Me']"));
	
	Actions act = new Actions(driver);
	
	act.moveToElement(doubleclick).doubleClick().build().perform();
	Thread.sleep(2000);
	act.moveToElement(rightclick).contextClick().build().perform();
	Thread.sleep(2000);
	act.moveToElement(click).click().build().perform();
	
	}
	

}
