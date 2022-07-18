package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestion2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("dresses");
	 List<WebElement> autosuggestion = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
System.out.println(autosuggestion.size());


for(WebElement b:autosuggestion)
{
	System.out.println(b.getText());
}

}

}
