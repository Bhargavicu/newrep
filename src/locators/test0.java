package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test0 {
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("cu.bhargavi@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("karnataka15");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.id("identify_email")).sendKeys("8197981070");
		driver.findElement(By.id("did_submit")).click();
		
		
		
	}

}
