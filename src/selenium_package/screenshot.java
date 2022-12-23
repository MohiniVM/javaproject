package selenium_package;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {

	public static void main(String[] args) throws IOException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/login/");
		
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
 File dest = new File ("C:\\Users\\lilad\\OneDrive\\Documents\\Screenshot\\doc"+".jpg");
  
        FileUtils.copyFile(file, dest);
        
        
//        
//        // for multiple screenshot 
        Random ran = new Random();
        int newint = ran.nextInt();
}

}
