package frame.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/frame.xhtml");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("//*[@id=\"j_idt88\"]/div/div[1]/div[1]/iframe");
		
		
		
		
		
		
		
		
		
	}

}
