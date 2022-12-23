package selenium_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver1\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable");

		driver.switchTo().frame(0);
		
		 WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		 
		 WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		 Actions act = new Actions(driver);
		 
		 act.dragAndDrop(drag, drop).perform();
	}

}
