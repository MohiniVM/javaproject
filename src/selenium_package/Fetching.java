package selenium_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		String path = "C:\\Users\\lilad\\OneDrive\\Documents\\Excel\\sheet1.xlsx";
		FileInputStream ex = new FileInputStream(path);
		
	String data = WorkbookFactory.create(ex).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
	
	    System.out.println(data);
	    
	 WebElement FB = driver.findElement(By.xpath("//input[@id='email']"));
	 FB.sendKeys(data);
	}

	
}

