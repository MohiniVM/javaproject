package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://courses.letskodeit.com/practice");
	
		WebElement button =	driver.findElement(By.xpath("//input[@id='confirmbtn']"));
		
		button.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	
		Thread.sleep(2000);
		button.click();
		
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		
		button.click();
		
		Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
	
	
	}

}
