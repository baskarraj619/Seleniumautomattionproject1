package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateUsingExcelData {
	
	static {
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\baskard\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis = new FileInputStream("C:\\Users\\baskard\\MavenProject\\Baskar\\InputSheet\\Common Data (1).xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String un = wb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();
		String pw = wb.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='pw']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.findElement(By.xpath("//span[text()='   Expense ']")).click();
	    driver.findElement(By.linkText("Submit Expense Reimbursement")).click();   
	    driver.findElement(By.xpath("//input[@Placeholder='Give a name for your request']")).sendKeys("Willson");
	    String expensecategory = wb.getSheetAt(0).getRow(1).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//div[text()='Select an Expense Category']")).click();
		driver.findElement(By.xpath("//div[text()='Select an Expense Category']")).sendKeys(expensecategory + Keys.ENTER);
		String reimbursementCurrency = wb.getSheetAt(0).getRow(1).getCell(3).getStringCellValue();
		driver.findElement(By.xpath("//div[text()='Select a Currency']")).click();
		driver.findElement(By.xpath("//div[text()='Select a Currency']")).sendKeys(reimbursementCurrency + Keys.ENTER);
		String date = wb.getSheetAt(0).getRow(1).getCell(4).getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).click();
		driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).sendKeys(date + Keys.ENTER);
		String expenseType = wb.getSheetAt(0).getRow(1).getCell(5).getStringCellValue();
		driver.findElement(By.xpath("//div[text()='Choose Type of Expense']")).click();
		driver.findElement(By.xpath("//div[text()='Choose Type of Expense']")).sendKeys(expenseType + Keys.ENTER);
		String paymentMode = wb.getSheetAt(0).getRow(1).getCell(6).getStringCellValue();
		driver.findElement(By.xpath("//div[text()='Choose Payment Mode']")).click();
		driver.findElement(By.xpath("//div[text()='Choose Payment Mode']")).sendKeys(paymentMode + Keys.ENTER);
		String expenseCurrency = wb.getSheetAt(0).getRow(1).getCell(7).getStringCellValue();
		driver.findElement(By.xpath("//div[text()='Choose Expense Currency']")).click();
		driver.findElement(By.xpath("//div[text()='Choose Expense Currency']")).sendKeys(expenseCurrency + Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='f9028447f5ccf8ccd51d7abdc0823890']")).sendKeys("100");
		driver.findElement(By.xpath("//textarea[@placeholder='Give some details about this Expense']")).sendKeys("Had Breakfast in Anand Bhaven hotel");
		
	}

}
