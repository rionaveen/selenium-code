$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Hotel Booking Application",
  "description": "",
  "id": "adactin-hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login Module",
  "description": "",
  "id": "adactin-hotel-booking-application;login-module",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Enter The  UserName In The InputBox",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "Enter The  PassWord In The InputBox",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Click On The Login Btn and It Navigates To Select HotelPage",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 3403659000,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.enter_The_UserName_In_The_InputBox()"
});
formatter.result({
  "duration": 134864700,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.enter_The_PassWord_In_The_InputBox()"
});
formatter.result({
  "duration": 112753800,
  "status": "passed"
});
formatter.match({
  "location": "StepDef.click_On_The_Login_Btn_and_It_Navigates_To_Select_HotelPage()"
});
formatter.result({
  "duration": 400543100,
  "status": "passed"
});
});