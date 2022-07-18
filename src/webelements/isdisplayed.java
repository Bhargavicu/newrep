package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isdisplayed{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
	 
	 if(search.isDisplayed())
	 {
		 System.out.println("pass");
		 search.sendKeys("hi");
	 }
	 else
	 {
		 System.out.println("fail");
	 }
		 
	 
	 
	 	
		
	}

}
