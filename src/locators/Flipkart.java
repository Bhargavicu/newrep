package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("cu.bhargavi@gmail.com");
	driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("usfgs");
	
	driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
String	t=driver.getTitle();
String url=driver.getCurrentUrl();
//System.out.println(url);
System.out.println(t);
}
}
