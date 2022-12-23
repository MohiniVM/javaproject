package selenium_package;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_window {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    String parentAddress = driver.getWindowHandle();
		System.out.println(parentAddress);
		
		 Thread.sleep(2000);
	     WebElement linkedin = driver.findElement(By.xpath("//a[@href=\"https://www.linkedin.com/company/orangehrm/mycompany/\"]"));
	     linkedin.click();

	    Thread.sleep(2000);
        WebElement facebook = driver.findElement(By.xpath("//a[@href=\"https://www.facebook.com/OrangeHRM/\"]"));
        facebook.click();
        
        Thread.sleep(2000);
        WebElement twitter = driver.findElement(By.xpath("//a[@href=\"https://twitter.com/orangehrm?lang=en\"]"));
        twitter.click();
        
        Set<String> childAddress = driver.getWindowHandles();
        List<String> windowlist = new ArrayList<String>(childAddress);
        
      String FacebookTitle = "OrangeHRM - World's Most Popular Opensource HRIS | Secaucus NJ | Facebook";
      
      for(String a : windowlist)
      {
    	  String title = driver.switchTo().window(a).getTitle();
    	  System.out.println(title);
    	  
    	  if(title.equals(FacebookTitle))
    	  {
    		  System.out.println("title is correct");
    		  driver.switchTo().window(a);
    	  }
    	  System.out.println("title is incorrect");
    	  
      }
        
        
        
        
	}

}
