package selenium_package;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MCLASS {

	public static void main(String[] ars) {
		
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://demo.guru99.com/test/ajax.html");
         
         List<WebElement> input = driver.findElements(By.tagName("input"));
         
         System.out.println(input.size());
         
         for(WebElement ele : input)
         {
        	 String str = ele.getAttribute("value");
        	 System.out.println(str);
        	 
         }
         
	}

}
