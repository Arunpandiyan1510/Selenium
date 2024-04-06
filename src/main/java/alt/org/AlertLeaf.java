package alt.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.RedefinitionStrategy.ResubmissionScheduler.AtFixedRate;

public class AlertLeaf {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.leafground.com/alert.xhtml");

		driver.manage().window().maximize();

		WebElement simpleAlert = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		simpleAlert.click();

		Alert alt1 = driver.switchTo().alert();
		String altText1 = alt1.getText();
		System.out.println(altText1);
		alt1.accept();

		// ------------------------------------------------------------------------

		WebElement confirmAlert = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		confirmAlert.click();

		Alert alt2 = driver.switchTo().alert();
		String altText2 = alt2.getText();
		System.out.println(altText2);
		alt2.accept();

		// ------------------------------------------------------------------------

		WebElement sweetAlert = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]"));
		sweetAlert.click();

		String altText3 = driver.findElement(By.xpath("//*[contains(text(),'You have clicked')]")).getText();
		System.out.println(altText3);
		WebElement dismissBtn = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[4]"));
		dismissBtn.click();

		// ------------------------------------------------------------------------

		WebElement sweetModal = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]"));
		sweetModal.click();

		String altText4 = driver.findElement(By.xpath("//*[contains(text(),'Unless you close this')]")).getText();
		System.out.println(altText4);

		Thread.sleep(3000);
		WebElement closeBtn = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]"));
		closeBtn.click();

		// ------------------------------------------------------------------------

		WebElement promptAlert = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]"));
		promptAlert.click();

		Alert alt3 = driver.switchTo().alert();
		alt3.sendKeys("Arun");
		alt3.accept();

		// ----------------------------------------------------------------------

		WebElement sweetalrertDelete = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]"));
		sweetalrertDelete.click();

		String altDel = driver.findElement(By.xpath("//span[@class='ui-confirm-dialog-message']")).getText();
		System.out.println(altDel);
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt108']")).click();

		// ----------------------------------------------------------------------

		WebElement altMinMax = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]"));
		altMinMax.click();

		WebElement altMax = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-extlink']"));
		altMax.click();
		String alertText = driver.findElement(By.xpath("(//p[@class='m-0'])[2]")).getText();
		System.out.println(alertText);
		WebElement altMin = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']"));
		altMin.click();
		WebElement altPlus = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-plus']"));
		altPlus.click();

		Thread.sleep(3000);
		WebElement altClose = driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]"));
		altClose.click();

		// ---------------------------------------------------------------------

	}

}
