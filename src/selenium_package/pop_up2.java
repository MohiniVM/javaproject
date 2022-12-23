package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pop_up2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");

	WebElement choosefile =	driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		
	choosefile.sendKeys("C:\\Users\\lilad\\OneDrive\\Documents\\Screenshot\\doc.jpg");
	}

}
