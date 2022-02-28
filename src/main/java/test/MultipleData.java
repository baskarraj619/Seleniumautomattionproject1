package test;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\baskard\\MavenProject\\Baskar\\InputSheet\\Common Data (1).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int rowcount = wb.getSheetAt(0).getLastRowNum();
		for(int i=0;i<=rowcount;i++)
		{
			String un = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
			String pw = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+"\t"+pw);
		}
		
	}

}
