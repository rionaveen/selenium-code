package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.BaseClass.BaseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\adactin\\feature", glue = "com.adactin.stepdefinition",plugin={"pretty","html:Reports/Cucumber_Report","json:Reports/Cucumbr.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReports.html"})
public class AdactinRunner extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\PC\\Selenium\\SeleniumPractice\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize(); 
		//browserLaun("chrome");
	}

	@AfterClass
	public static void tearDown() {

		//driver.close();
		browserClose();

	} 

}
