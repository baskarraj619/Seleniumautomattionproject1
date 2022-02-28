package test;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baskard\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://vuramsolutionsdev.appiancloud.com/suite/portal/login.jsp");
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("rajeshr@vuram.com");
		driver.findElement(By.xpath("//input[@id='pw']")).sendKeys("vatt@123");
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//div[8]//span//a/span")).click();
		driver.findElement(By.xpath("//a[text()='Submit Expense Reimbursement']")).click();
		//driver.findElement(By.id("92fb9b3ebec7041432fcf2ca4888120a")).sendKeys("Test selenium Automation script 1");
		WebElement w = driver.findElement(By.xpath("//div[text()='Select an Expense Category']"));
		Actions a = new Actions(driver);
		a.moveToElement(w).perform();
		//driver.close();	
	}

}
