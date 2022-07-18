package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/user/login");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("cu.bhargav@gmail.com");
	    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("24");
	
	}
}
	