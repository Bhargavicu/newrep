
package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.findElement(By.id("username")).clear();

		driver.findElement(By.id("password")).clear();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).submit();
		
		
	}

}
