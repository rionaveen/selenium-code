package fb.stepdef;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fb.runner.Fb_Runner;

public class Fb_StepDef extends BaseClass  {
WebDriver  driver=Fb_Runner.driver;
	@Given("^user Launch The Url$")
	public void user_Launch_The_Url() throws Throwable {
driver.get("https://www.facebook.com/");
		
		
	}

	@When("^user Enter The First Name In The Input Box$")
	public void user_Enter_The_First_Name_In_The_Input_Box() throws Throwable {


		
	}

	@And("^user Enter The Last Name In The Input Box$")
	public void user_Enter_The_Last_Name_In_The_Input_Box() throws Throwable {


		
	}

	@And("^user Enter Mobile Number or Email In The Input Box$")
	public void user_Enter_Mobile_Number_or_Email_In_The_Input_Box() throws Throwable {


	}

	@And("^user Confirm Mobile Number or Email In The Input Box$")
	public void user_Confirm_Mobile_Number_or_Email_In_The_Input_Box() throws Throwable {


		
	}

	@And("^user Enter The Passwor In The Input Box$")
	public void user_Enter_The_Passwor_In_The_Input_Box() throws Throwable {


		
	}

	@And("^user Select Day The DropDown Box$")
	public void user_Select_Day_The_DropDown_Box() throws Throwable {


		
	}

	@And("^user Select Month The DropDown Box$")
	public void user_Select_Month_The_DropDown_Box() throws Throwable {
	  
		
		
	}

	@And("^user Select Year The DropDown Box$")
	public void user_Select_Year_The_DropDown_Box() throws Throwable {
	  
	
	}

	@And("^user Check The Gender Radio Button$")
	public void user_Check_The_Gender_Radio_Button() throws Throwable {


		
	}

	@Then("^user Clicks The Sign Up Button$")
	public void user_Clicks_The_Sign_Up_Button() throws Throwable {


		
	}

	
	
}
