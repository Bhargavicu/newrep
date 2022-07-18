package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys("8197981070");
		driver.findElement(By.name("password")).sendKeys("karnataka15");
		
		
		driver.findElement((By.xpath("(//div[contains(@class,'qF0y9          ')])[4]     "))).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[contains(@class,'sqdOP ')])[2]")).click();
		
	    
}
}