$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Automation/Feature1/Automation1.feature");
formatter.feature({
  "line": 1,
  "name": "Purchase Dress In Automation Practice",
  "description": "",
  "id": "purchase-dress-in-automation-practice",
  "keyword": "Feature"
});
formatter.background({
  "line": 2,
  "name": "user logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click SignIn Button And It Navigates To Login MyStore",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter Email Address In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Enter Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On Login Button And It Navigates To MyAccount Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step2.user_Launch_The_Application()"
});
formatter.result({
  "duration": 718613100,
  "status": "passed"
});
formatter.match({
  "location": "Step2.click_SignIn_Button_And_It_Navigates_To_Login_MyStore()"
});
formatter.result({
  "duration": 6875258200,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Enter_Email_Address_In_Address_Field()"
});
formatter.result({
  "duration": 688827900,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Enter_Password_In_Password_Field()"
});
formatter.result({
  "duration": 349374100,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_On_Login_Button_And_It_Navigates_To_MyAccount_Page()"
});
formatter.result({
  "duration": 3406170800,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Purchase In Women Page",
  "description": "",
  "id": "purchase-dress-in-automation-practice;purchase-in-women-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Ad1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user Click On Women Button And It Navigates To Woman Page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "user Click On Image And It Navigates To FaddedShortSleeve Page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user Click Add To Cart Button And It Shows Product Successfully Added To Cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user Click Proceed To CheckOutButton1 And It Navigates To OrderMyStore",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user Click Proceed To CheckOutButton2 And It Navigate OrderMyStore",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user Click On Proceed To CheckOutButton3 And It Navigate To OrderMyStore",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user Click CheckBoxButton In CheckBox Field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user Click Proceed To CheckOutButton4 And It Navigates OrderMyStore",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Click PayByCheck And It Navigate MyStore",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Click I Confirm My Order Button And It Navigate To Order Confirmation",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click SignOutButton And It Navigate LoginMyStore",
  "keyword": "Then "
});
formatter.match({
  "location": "Step2.user_Click_On_Women_Button_And_It_Navigates_To_Woman_Page()"
});
formatter.result({
  "duration": 4761588900,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_On_Image_And_It_Navigates_To_FaddedShortSleeve_Page()"
});
formatter.result({
  "duration": 4740390500,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_Add_To_Cart_Button_And_It_Shows_Product_Successfully_Added_To_Cart()"
});
formatter.result({
  "duration": 185070100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 36
    }
  ],
  "location": "Step2.user_Click_Proceed_To_CheckOutButton_And_It_Navigates_To_OrderMyStore(int)"
});
formatter.result({
  "duration": 2880624200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 36
    }
  ],
  "location": "Step2.user_Click_Proceed_To_CheckOutButton_And_It_Navigate_OrderMyStore(int)"
});
formatter.result({
  "duration": 2821950100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 39
    }
  ],
  "location": "Step2.user_Click_On_Proceed_To_CheckOutButton_And_It_Navigate_To_OrderMyStore(int)"
});
formatter.result({
  "duration": 1965835700,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_CheckBoxButton_In_CheckBox_Field()"
});
formatter.result({
  "duration": 225070800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 36
    }
  ],
  "location": "Step2.user_Click_Proceed_To_CheckOutButton_And_It_Navigates_OrderMyStore(int)"
});
formatter.result({
  "duration": 3341530500,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_PayByCheck_And_It_Navigate_MyStore()"
});
formatter.result({
  "duration": 1480089400,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_I_Confirm_My_Order_Button_And_It_Navigate_To_Order_Confirmation()"
});
formatter.result({
  "duration": 1459580000,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_SignOutButton_And_It_Navigate_LoginMyStore()"
});
formatter.result({
  "duration": 1990501700,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "user logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click SignIn Button And It Navigates To Login MyStore",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter Email Address In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Enter Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On Login Button And It Navigates To MyAccount Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step2.user_Launch_The_Application()"
});
formatter.result({
  "duration": 143500,
  "status": "passed"
});
formatter.match({
  "location": "Step2.click_SignIn_Button_And_It_Navigates_To_Login_MyStore()"
});
formatter.result({
  "duration": 1605091100,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Enter_Email_Address_In_Address_Field()"
});
formatter.result({
  "duration": 408712900,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Enter_Password_In_Password_Field()"
});
formatter.result({
  "duration": 344373200,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_On_Login_Button_And_It_Navigates_To_MyAccount_Page()"
});
formatter.result({
  "duration": 2906111800,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "Purchase In Dress Page",
  "description": "",
  "id": "purchase-dress-in-automation-practice;purchase-in-dress-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Ad2"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "user Click On Women Button2",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "user Click On Image2",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click Add To Cart Button2",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click Proceed To CheckOutButton3",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Click Proceed To CheckOutButton4",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click On Proceed To Check5",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user Click CheckBox2",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user Click Proceed To Submit",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user Click PayByCheck2",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Click I Confirm My Order Button2",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Click SignOutButton2",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 26
    }
  ],
  "location": "Step2.user_Click_On_Women_Button(int)"
});
formatter.result({
  "duration": 4588973600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "Step2.user_Click_On_Image(int)"
});
formatter.result({
  "duration": 3699268600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "Step2.user_Click_Add_To_Cart_Button(int)"
});
formatter.result({
  "duration": 191607800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 36
    }
  ],
  "location": "Step2.user_Click_Proceed_To_CheckOutButton(int)"
});
formatter.result({
  "duration": 3019208100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 36
    }
  ],
  "location": "Step2.user_Click_Proceed_To_CheckOutButton(int)"
});
formatter.result({
  "duration": 1514198600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 30
    }
  ],
  "location": "Step2.user_Click_On_Proceed_To_Check(int)"
});
formatter.result({
  "duration": 3413354400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "Step2.user_Click_CheckBox(int)"
});
formatter.result({
  "duration": 195891000,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_Proceed_To_Submit()"
});
formatter.result({
  "duration": 1482376800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "Step2.user_Click_PayByCheck2(int)"
});
formatter.result({
  "duration": 1971149800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 36
    }
  ],
  "location": "Step2.user_Click_I_Confirm_My_Order_Button(int)"
});
formatter.result({
  "duration": 1847096700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 24
    }
  ],
  "location": "Step2.user_Click_SignOutButton(int)"
});
formatter.result({
  "duration": 2914995200,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "user logged In",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "click SignIn Button And It Navigates To Login MyStore",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user Enter Email Address In Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user Enter Password In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On Login Button And It Navigates To MyAccount Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step2.user_Launch_The_Application()"
});
formatter.result({
  "duration": 229700,
  "status": "passed"
});
formatter.match({
  "location": "Step2.click_SignIn_Button_And_It_Navigates_To_Login_MyStore()"
});
formatter.result({
  "duration": 1769939100,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Enter_Email_Address_In_Address_Field()"
});
formatter.result({
  "duration": 397764100,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Enter_Password_In_Password_Field()"
});
formatter.result({
  "duration": 367269900,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_On_Login_Button_And_It_Navigates_To_MyAccount_Page()"
});
formatter.result({
  "duration": 2476077700,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "Purchase In T-Shirt Page",
  "description": "",
  "id": "purchase-dress-in-automation-practice;purchase-in-t-shirt-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "user Click On T-shirt3",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "user Click On ShirtImage3",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Click Add To Cart3",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click Proceed To ProceedButton3",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Click Proceed To SignButton3",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Click On Proceed To Summary3",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click CheckProcessoption",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "user Click Proceed To Submit3",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "user Click PayingCheq",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user Click conform",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Click LogOut",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 21
    }
  ],
  "location": "Step2.user_Click_On_T_shirt(int)"
});
formatter.result({
  "duration": 2735688800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 24
    }
  ],
  "location": "Step2.user_Click_On_ShirtImage(int)"
});
formatter.result({
  "duration": 311550200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 22
    }
  ],
  "location": "Step2.user_Click_Add_To_Cart(int)"
});
formatter.result({
  "duration": 5306162600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 35
    }
  ],
  "location": "Step2.user_Click_Proceed_To_ProceedButton(int)"
});
formatter.result({
  "duration": 1572036500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 32
    }
  ],
  "location": "Step2.user_Click_Proceed_To_SignButton(int)"
});
formatter.result({
  "duration": 2636491000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 32
    }
  ],
  "location": "Step2.user_Click_On_Proceed_To_Summary(int)"
});
formatter.result({
  "duration": 1872505400,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_CheckProcessoption()"
});
formatter.result({
  "duration": 180957700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 28
    }
  ],
  "location": "Step2.user_Click_Proceed_To_Submit(int)"
});
formatter.result({
  "duration": 2793371000,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_PayingCheq()"
});
formatter.result({
  "duration": 1442162500,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_conform()"
});
formatter.result({
  "duration": 2605722900,
  "status": "passed"
});
formatter.match({
  "location": "Step2.user_Click_LogOut()"
});
formatter.result({
  "duration": 3419406500,
  "status": "passed"
});
});