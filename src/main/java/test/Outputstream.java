package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Outputstream {
	static {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baskard\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		String Title = driver.getTitle();
		System.out.println(Title);
		driver.close();
		FileInputStream fis = new FileInputStream("C:\\Users\\baskard\\Desktop\\test.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet1 = wb.getSheetAt(0);
		Row row1 = sheet1.createRow(0);
		Cell cell1 = row1.createCell(0);
		cell1.setCellValue(Title);
		FileOutputStream fos = new FileOutputStream("C:\\Users\\baskard\\Desktop\\test.xlsx");
		wb.write(fos);
		wb.close();
		System.out.println("Data written into excel");
		
	}

}
