package com.facebook;

import java.io.File;

import java.io.IOException;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.io.FileHandler;

public class FaceBookHomeScreenShot {
	
	static WebDriver driver ;
	
	public static void screenShot(String name) throws IOException {
		
		TakesScreenshot screenShot=(TakesScreenshot) driver;
		
		File src = screenShot.getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\PC\\Selenium\\maven\\screenshots\\"+name+".png");
		
		FileHandler.copy(src, des);
		
	}
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		screenShot("FB HOMEPAGE");

	}

}
