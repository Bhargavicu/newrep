package webelements;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getsize{
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		    Dimension s     =  ele.getSize();
		    int  height =s.getHeight();
		    		
		   System.out.println(height);
		    
		   int width =s.getWidth();
		   System.out.println(width);
		   driver.close();
	 
	}

}

