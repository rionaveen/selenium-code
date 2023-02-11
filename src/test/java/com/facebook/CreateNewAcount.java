package com.facebook;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseClass.BaseClass;

public class CreateNewAcount extends BaseClass {

	public static void main(String[] args) throws IOException {

		WebElement createNewAcBtn = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		WebElement userName = driver.findElement(By.xpath("//input[@name='firstname']"));

		WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));

		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));

		WebElement reEmail = driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));

		WebElement newPassWord = driver.findElement(By.xpath("//input[@id='password_step_input']"));

		WebElement day = driver.findElement(By.xpath("//Select[@id='day']"));

		WebElement month = driver.findElement(By.xpath("//Select[@id='month']"));

		WebElement year = driver.findElement(By.xpath("//Select[@id='year']"));

		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));

		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit']"));

		browserLaun("chrome");
		urlNavigate("https://www.facebook.com/");
		
		clickOnElements(createNewAcBtn);
		sendTextOnInputBox(userName, "naveen");
		sendTextOnInputBox(lastName, "babu");
		sendTextOnInputBox(email, "naveenbelieve19@gmail.com");
		sendTextOnInputBox(reEmail, "naveenbelieve19@gmail.com");
		sendTextOnInputBox(newPassWord, "MSCssc@@1996");
		singleDropDown(day, "19", "visbleText");
		singleDropDown(month, "11", "value");
		singleDropDown(year, "1996", "visibleText");
		clickOnElements(gender);
		clickOnElements(submit);
		browserClose();

	}

}
