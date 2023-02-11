package com.BaseClass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static WebDriver browserLaun(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
		} else {
			System.out.println("invalid browser" + browser);

		}
		return driver;

	}

	public static void printScreen(String name) throws IOException {

		TakesScreenshot screenShot = (TakesScreenshot) driver;
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\PC\\Selenium\\SeleniumPractice\\ScreenShots\\" + name + ".png");
		FileHandler.copy(src, des);

	}

	public static String urlNavigate(String url) {
		driver.get(url);
		return url;
	}

	public static void browserClose() {
		driver.close();
	}

	public static void windowClose() {
		driver.quit();
	}

	public static WebElement clickOnElements(WebElement element) {

		element.click();

		return element;

	}

	public static WebElement sendTextOnInputBox(WebElement element, String text) {
	   element.sendKeys(text);
		return element;

	}

	public static WebElement singleDropDown(WebElement element, String value, String type) {

		Select s = new Select(element);
		if (type.equalsIgnoreCase("index")) {
			s.selectByIndex(Integer.parseInt(value));
		} else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {
			s.selectByVisibleText("visbleText");
		} else {
			System.out.println("invalid selection");
		}
		return element;
	}

	public static String navigateTo(String url) {
		driver.navigate().to(url);

		return url;
	}

//	public static void navigateBack() {
//		driver.navigate().back();
//
//	}
//
//	public static void navigateForward() {
//		driver.navigate().forward();
//
//	}
//
//	public static void navigateRefresh() {
//		driver.navigate().refresh();
//
//	}
//	
//	
//	public static void frameSwitch(WebElement element) {
//		driver.switchTo().frame(element);
//	}
//	

}
