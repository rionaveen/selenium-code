package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenWrite {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		String text = null ;
		
		File f=new File("C:\\Users\\PC\\Selenium\\maven\\dataset\\new.xls");
		FileInputStream fis=new FileInputStream(f);
		Workbook wb=new HSSFWorkbook(fis);
		int size = links.size();
		for (int i = 0; i < links.size(); i++) {
			
			text = links.get(i).getText();
			Sheet s = wb.getSheet("Sheet3");
			System.out.println(text);
			s.createRow(i).createCell(1).setCellValue(text)	;	
			
		}
		
		//int size = links.size();
		System.out.println(size);
		
		
		
		
		
	}

}
