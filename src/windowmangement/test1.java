package windowmangement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 {
	public static void  main(String[] args) throws InterruptedException
	
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.manage().window().minimize();
		Thread.sleep(5000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(5000);
		driver.close();
		
		
	}
	
	
}
