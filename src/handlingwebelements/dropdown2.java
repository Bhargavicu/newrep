package handlingwebelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement dd = driver.findElement(By.id("cars"));
	
	
	Select s = new Select(dd);
	
	s.selectByIndex(1);
	s.selectByValue("199");
	s.selectByVisibleText("More Than INR 500 ( 55 ) ");
	
	Thread.sleep(3000);
	s.deselectByIndex(1);

	Thread.sleep(3000);
	s.deselectByValue("199");

	Thread.sleep(3000);
	s.deselectByVisibleText("More Than INR 500 ( 55 )");

	Thread.sleep(3000);
    driver.close();	

}
}
