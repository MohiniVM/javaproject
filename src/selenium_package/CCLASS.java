package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CCLASS {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		
		WebElement red = driver.findElement(By.xpath("//input[@value='red']")); 
	
		boolean displayresult = red.isDisplayed();
		  
		if(displayresult = true) {
	       System.out.println("Element is displyed");
	     	}
		else {
			System.out.println("Element is not displayed");
		}
		}
		

	}


