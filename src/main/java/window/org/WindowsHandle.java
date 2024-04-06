package window.org;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/window.xhtml");

		driver.manage().window().maximize();

		WebElement openBtn1 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		openBtn1.click();

		String parentWindow = driver.getWindowHandle();

	}

}
