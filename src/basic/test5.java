package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test5 {
public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.close();
}
}