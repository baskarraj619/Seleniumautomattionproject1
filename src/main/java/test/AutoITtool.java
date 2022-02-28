package test;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoITtool {
	static
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baskard\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	@Test
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("rajeshr@vuram.com");
		driver.findElement(By.xpath("//input[@id='pw']")).sendKeys("vatt@123");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		driver.findElement(By.xpath("//span[text()='   Expense ']")).click();
	    driver.findElement(By.linkText("Submit Expense Reimbursement")).click();   
	    driver.findElement(By.xpath("//input[@Placeholder='Give a name for your request']")).sendKeys("Willson");
	    driver.findElement(By.xpath("//div[text()='Select an Expense Category']")).click();
	    driver.findElement(By.xpath("//div[text()='Recruitment']")).click();
	    driver.findElement(By.xpath("//div[text()='Select a Currency']")).click();
	    driver.findElement(By.xpath("//div[text()='INR']")).click();
	    driver.findElement(By.xpath("//label[text()='Have Receipts?']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='mm/dd/yyyy']")).sendKeys("02/26/2022");
	    driver.findElement(By.xpath("//div[text()='Choose Type of Expense']")).click();
	    driver.findElement(By.xpath("//div[text()='Stationery']")).click();
	    driver.findElement(By.xpath("//div[text()='Choose Payment Mode']")).click();
	    driver.findElement(By.xpath("//div[text()='Personal Card, Cash']")).click();
	    driver.findElement(By.xpath("//div[text()='Choose Expense Currency']")).click();
	    driver.findElement(By.xpath("//li/div[text()='INR']")).click();
	    //driver.findElement(By.xpath("//input[@id='ab3f91df79ce2443aef7726f40a658c7']")).sendKeys("100");
	    driver.findElement(By.xpath("//textarea[@placeholder='Give some details about this Expense']")).sendKeys("bOUGHT bLUE AND bLACK pen");
	    driver.findElement(By.xpath("//a[text()='Add new Attachment']")).click();
	    driver.findElement(By.xpath("//span[text()='Select one or more items']")).click();
	    driver.findElement(By.xpath("//div[text()='Other']")).click();	    
	    driver.findElement(By.xpath("//button[text()='Upload']")).click();
	    Thread.sleep(5000);
	    Runtime.getRuntime().exec("C:\\Users\\baskard\\AutoIT\\fileupload.exe");
	}

}
