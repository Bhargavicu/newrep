package chapter3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Book2.xslx");
		Workbook wb = WorkbookFactory.create(fis);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		
	}

}
