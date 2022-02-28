package test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FirstExcel {
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baskard\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/Users/baskard/Documents/Common Data.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFCell url = wb.getSheetAt(0).getRow(0).getCell(1);
		XSSFCell un =  wb.getSheetAt(0).getRow(1).getCell(1);
		XSSFCell pw =  wb.getSheetAt(0).getRow(2).getCell(1);
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);		
		
	}

}
