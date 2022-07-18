package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdowm3 {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement dd = driver.findElement(By.id("cars"));
	
	
	Select s = new Select(dd);
	
	s.selectByIndex(1);
	s.selectByValue("199");
	s.selectByVisibleText("More Than INR 500 ( 55 ) ");
	
	System.out.println(s.isMultiple());
	
	if(s.isMultiple())
	{
		s.deselectAll();
		
	}
	else
	{
		System.out.println("it is not multiple select dropdown");
		
	}
	
	List<WebElement> alloptions = s.getOptions();
	System.out.println(alloptions.size());
	
	for(WebElement b:alloptions)
	{
		System.out.println(b.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
