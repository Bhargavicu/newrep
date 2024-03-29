package handlingwebelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(dropdown);
		Thread.sleep(3000);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=industrial-intl-ship");
		Thread.sleep(3000); 
		s.selectByVisibleText("Pet Supplies");
		
		
		List<WebElement> alloptions = s.getOptions();
		System.out.println(alloptions.size());
		for(WebElement b:alloptions)
		{
			System.out.println(b.getText());
		}
	}

}
