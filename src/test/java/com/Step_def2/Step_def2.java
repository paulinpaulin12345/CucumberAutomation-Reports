package com.Step_def2;

import org.openqa.selenium.WebDriver;


import com.Automation_Runner.Auto_Run;
import com.POMManager.pack.Automation_Manger;
import com.configuration.helper.File_Reader_Manager;

import com_BaseClass_Pack.Base_Class;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;




public class Step_def2 extends Base_Class {
	public static WebDriver driver=Auto_Run.driver;
	public static Automation_Manger pom=new Automation_Manger(driver);
	@When("^click SignIn Button And It Navigates To Login MyStore$")
	public void click_SignIn_Button_And_It_Navigates_To_Login_MyStore() throws Throwable 
	{
		String url=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_url();
		getUrl(url);
		System.out.println("LoginMyStore");
	    }

	@When("^user Enter Email Address In Address Field$")
	public void user_Enter_Email_Address_In_Address_Field() throws Throwable {
		String userid=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_email();
		inputValueElement(pom.get_Login().getEmail(),userid );
	   
	}

	@When("^user Enter Password In Password Field$")
	public void user_Enter_Password_In_Password_Field() throws Throwable {
		String passwrd=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_passwrd();
		inputValueElement(pom.get_Login().getPassword(),passwrd );
		
	    }

	@Then("^user Click On Login Button And It Navigates To MyAccount Page$")
	public void user_Click_On_Login_Button_And_It_Navigates_To_MyAccount_Page() throws Throwable {
		clickOnElement(pom.get_Login().getSubmitbtn());
	    
	}

	@Then("^user Click On Women Button And It Navigates To Woman Page$")
	public void user_Click_On_Women_Button_And_It_Navigates_To_Woman_Page() throws Throwable {
		clickOnElement(pom.get_Women().getWomen());
		javaScript();
	    }

	@Then("^user Click On Image And It Navigates To FaddedShortSleeve Page$")
	public void user_Click_On_Image_And_It_Navigates_To_FaddedShortSleeve_Page() throws Throwable {
		clickOnElement(pom.get_Img().getImge());
	    }

	@When("^user Click Add To Cart Button And It Shows Product Successfully Added To Cart$")
	public void user_Click_Add_To_Cart_Button_And_It_Shows_Product_Successfully_Added_To_Cart() throws Throwable {
		clickOnElement(pom.get_Cart().getCart());
	   }

	@Then("^user Click Proceed To CheckOutButton(\\d+) And It Navigates To OrderMyStore$")
	public void user_Click_Proceed_To_CheckOutButton_And_It_Navigates_To_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn1().getBtn1());
	    
	}

	@Then("^user Click Proceed To CheckOutButton(\\d+) And It Navigate OrderMyStore$")
	public void user_Click_Proceed_To_CheckOutButton_And_It_Navigate_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn2().getBtn2());
	   
	}

	@Then("^user Click On Proceed To CheckOutButton(\\d+) And It Navigate To OrderMyStore$")
	public void user_Click_On_Proceed_To_CheckOutButton_And_It_Navigate_To_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn3().getBtn3());
	    
	}

	@When("^user Click CheckBoxButton In CheckBox Field$")
	public void user_Click_CheckBoxButton_In_CheckBox_Field() throws Throwable {
		clickOnElement(pom.get_Process().getCheckBox());
	    
	}

	@Then("^user Click Proceed To CheckOutButton(\\d+) And It Navigates OrderMyStore$")
	public void user_Click_Proceed_To_CheckOutButton_And_It_Navigates_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Process().getProcessbtn());
	    
	}

	@Then("^user Click PayByCheck And It Navigate MyStore$")
	public void user_Click_PayByCheck_And_It_Navigate_MyStore() throws Throwable {
		clickOnElement(pom.get_Cheq().getCheqq());
	    }

	@Then("^user Click I Confirm My Order Button And It Navigate To Order Confirmation$")
	public void user_Click_I_Confirm_My_Order_Button_And_It_Navigate_To_Order_Confirmation() throws Throwable {
		clickOnElement(pom.get_Order().getConform());
	    
	}

	@Then("^user Click SignOutButton And It Navigate LoginMyStore$")
	public void user_Click_SignOutButton_And_It_Navigate_LoginMyStore() throws Throwable {
		clickOnElement(pom.get_Logout().getLogoff());
		
	    
	}


	
	}
