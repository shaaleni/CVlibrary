package com.datadriven;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.Excel.utility.Xlsreader;

public class DatadrivenTest1 {

	public static void main(String[] args) {
		
	Xlsreader reader = new Xlsreader("//C:\\temp\\cvlib.xlsx");
	
	
		String KeywordsJoBTitleJobRef = reader.getCellData("Testdata", 0, 3);
		System.out.println(KeywordsJoBTitleJobRef);
		
		String Location = reader.getCellData("Testdata", 1, 3);
		System.out.println(Location);

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nehru\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
	driver.get("https://www.cv-library.co.uk/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id=\"keywords\"]")).sendKeys(KeywordsJoBTitleJobRef);
	driver.findElement(By.xpath("//*[@id=\"location\"]")).sendKeys(Location);
	driver.findElement(By.xpath("//*[@id=\"location\"]")).submit();
	driver.findElement(By.xpath("//*[@id=\"hp-search-btn\"]")).click();
		
	}

	private static Options manage() {
		// TODO Auto-generated method stub
		return null;
	}

}
