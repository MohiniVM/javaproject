package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BCLASS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
	WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
	Select S = new Select(dropdown);
		
		S.selectByIndex(7);
	
		Thread.sleep(2000);
		S.selectByValue("search-alias=nowstore");
		
		S.selectByVisibleText("Apps & Games");
	}

}
