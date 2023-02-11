package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.BaseClass.BaseClass;
import com.adactin.runner.AdactinRunner;
import com.pom.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends BaseClass{
	
WebDriver driver=AdactinRunner.driver;

LoginPage login=new LoginPage(driver);


@Given("^Launch The Adactin Url$")
public void launch_The_Adactin_Url() throws Throwable {
	 // urlNavigate("https://adactinhotelapp.com/");
	 // driver.findElement(By.id("username")).sendKeys("rio");
	driver.get("https://adactinhotelapp.com/");
}

@When("^Enter The  UserName In The InputBox$")
public void enter_The_UserName_In_The_InputBox() throws Throwable {
  
	driver.findElement(By.id("username")).sendKeys("rio");
	
}

@When("^Enter The  PassWord In The InputBox$")
public void enter_The_PassWord_In_The_InputBox() throws Throwable {
   
	driver.findElement(By.id("password")).sendKeys("rjodfio");
}

@Then("^Click On The Login Btn and It Navigates To Select HotelPage$")
public void click_On_The_Login_Btn_and_It_Navigates_To_Select_HotelPage() throws Throwable {
	login.getLoginBtn().click();
	
}


}

