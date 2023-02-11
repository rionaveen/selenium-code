package dataDriven;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenAdactin {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

		String pass = null;
		String un = null;
		Row row;
		Cell cell;
		File f = new File("C:\\Users\\PC\\Selenium\\maven\\dataset\\new.xls");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new HSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(0);
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();

		for (int i = 1; i <= physicalNumberOfRows; i++) {

			row = sheet.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			System.out.println(physicalNumberOfCells);

			for (int j = 0; j <= physicalNumberOfCells; j++) {

				cell = row.getCell(j);
				if (j == 0) {
					un = cell.getStringCellValue();
					System.out.println(un);
				}
				if (j == 1) {
					pass = cell.getStringCellValue();
					System.out.println(pass);
				}

				
			}
			WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
			username.sendKeys(un);

			WebElement pwd = driver.findElement(By.xpath("//*[@id=\"password\"]"));
			pwd.sendKeys(pass);

			driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		}

		wb.close();

	}

}
