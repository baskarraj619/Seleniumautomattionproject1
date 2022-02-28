package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyFile {
	static{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\baskard\\Selenium\\chromedriver_win32\\chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:/Users/baskard/Documents/hub.property");
		Properties p = new Properties();
		p.load(fis);
		String url = p.getProperty("url");
		String un = p.getProperty("username");
		String pw = p.getProperty("password");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@id='pw']")).sendKeys(pw);
		driver.findElement(By.xpath("//input[@value='Sign In']")).click();

	}

}
