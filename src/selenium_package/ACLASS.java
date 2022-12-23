package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACLASS {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
	  
	WebElement email = driver.findElement(By.id("email"));
	  email.sendKeys("MohiniMisar");
	  
   WebElement password = driver.findElement(By.name("pass"));
	  password.sendKeys("12345");
	  
	WebElement login = driver.findElement(By.name("login"));
	    login.click();
	  
	//WebElement forgotpasswordlink =  driver.findElement(By.linkText("Forgotten account?"));
	 //   forgotpasswordlink.click();
	  
	//    driver.findElement(By.partialLinkText("Forgotten ac")).click();
	    
	 
	}
}