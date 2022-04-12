package com.Step2;

import org.openqa.selenium.WebDriver;

import com.Automation2.Automation2_Runner;
import com.POMManager.pack.Automation_Manger;
import com.configuration.helper.File_Reader_Manager;

import com_BaseClass_Pack.Base_Class;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step2 extends Base_Class  {
	public static WebDriver driver=Automation2_Runner.driver;
	public static Automation_Manger pom=new Automation_Manger(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		System.out.println("User Launch Application");
		
	   	}

	@When("^click SignIn Button And It Navigates To Login MyStore$")
	public void click_SignIn_Button_And_It_Navigates_To_Login_MyStore() throws Throwable {
		String url=File_Reader_Manager.get_Instance_Frm().get_Instance_CR().get_confi_url();
		getUrl(url);
	    
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

	@When("^user Click On Women Button And It Navigates To Woman Page$")
	public void user_Click_On_Women_Button_And_It_Navigates_To_Woman_Page() throws Throwable {
		clickOnElement(pom.get_Women().getWomen());
		javaScript();
	    
	}

	@When("^user Click On Image And It Navigates To FaddedShortSleeve Page$")
	public void user_Click_On_Image_And_It_Navigates_To_FaddedShortSleeve_Page() throws Throwable {
		clickOnElement(pom.get_Img().getImge());
	}

	@When("^user Click Add To Cart Button And It Shows Product Successfully Added To Cart$")
	public void user_Click_Add_To_Cart_Button_And_It_Shows_Product_Successfully_Added_To_Cart() throws Throwable {
		clickOnElement(pom.get_Cart().getCart());
	}

	@When("^user Click Proceed To CheckOutButton(\\d+) And It Navigates To OrderMyStore$")
	public void user_Click_Proceed_To_CheckOutButton_And_It_Navigates_To_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn1().getBtn1());
	}

	@When("^user Click Proceed To CheckOutButton(\\d+) And It Navigate OrderMyStore$")
	public void user_Click_Proceed_To_CheckOutButton_And_It_Navigate_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn2().getBtn2());
	}

	@When("^user Click On Proceed To CheckOutButton(\\d+) And It Navigate To OrderMyStore$")
	public void user_Click_On_Proceed_To_CheckOutButton_And_It_Navigate_To_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn3().getBtn3());
	    	}

	@When("^user Click CheckBoxButton In CheckBox Field$")
	public void user_Click_CheckBoxButton_In_CheckBox_Field() throws Throwable {
		clickOnElement(pom.get_Process().getCheckBox());		
	}

	@When("^user Click Proceed To CheckOutButton(\\d+) And It Navigates OrderMyStore$")
	public void user_Click_Proceed_To_CheckOutButton_And_It_Navigates_OrderMyStore(int arg1) throws Throwable {
		clickOnElement(pom.get_Process().getProcessbtn()); 
	}

	@When("^user Click PayByCheck And It Navigate MyStore$")
	public void user_Click_PayByCheck_And_It_Navigate_MyStore() throws Throwable {
		clickOnElement(pom.get_Cheq().getCheqq());
	    
	}

	@When("^user Click I Confirm My Order Button And It Navigate To Order Confirmation$")
	public void user_Click_I_Confirm_My_Order_Button_And_It_Navigate_To_Order_Confirmation() throws Throwable {
		clickOnElement(pom.get_Order().getConform());
	}

	@Then("^user Click SignOutButton And It Navigate LoginMyStore$")
	public void user_Click_SignOutButton_And_It_Navigate_LoginMyStore() throws Throwable {
		clickOnElement(pom.get_Logout().getLogoff());
	}
	@When("^user Click On Women Button(\\d+)$")
	public void user_Click_On_Women_Button(int arg1) throws Throwable {
		clickOnElement(pom.get_Women().getDress());
		Thread.sleep(1000);
		javaScript();
		Thread.sleep(1000);

	}

	@When("^user Click On Image(\\d+)$")
	public void user_Click_On_Image(int arg1) throws Throwable {
		clickOnElement(pom.get_Img().getImge1());
		}

	@When("^user Click Add To Cart Button(\\d+)$")
	public void user_Click_Add_To_Cart_Button(int arg1) throws Throwable {
		clickOnElement(pom.get_Cart().getCart());
	}

	@When("^user Click Proceed To CheckOutButton(\\d+)$")
	public void user_Click_Proceed_To_CheckOutButton(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn1().getBtn1());
	}

	@When("^user Click On Proceed To Check(\\d+)$")
	public void user_Click_On_Proceed_To_Check(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn2().getBtn2());
		clickOnElement(pom.get_Btn3().getBtn3());
	}

	@When("^user Click CheckBox(\\d+)$")
	public void user_Click_CheckBox(int arg1) throws Throwable {
		clickOnElement(pom.get_Process().getCheckBox());	
		
		
	}
	@When("^user Click Proceed To Submit$")
	public void user_Click_Proceed_To_Submit() throws Throwable {
		clickOnElement(pom.get_Process().getProcessbtn());
	    
	}


	@When("^user Click PayByCheck(\\d+)$")
	public void user_Click_PayByCheck2(int arg1) throws Throwable {
		
		clickOnElement(pom.get_Cheq().getCheqq());
	}

	@When("^user Click I Confirm My Order Button(\\d+)$")
	public void user_Click_I_Confirm_My_Order_Button(int arg1) throws Throwable {
		clickOnElement(pom.get_Order().getConform());
	
	}

	@Then("^user Click SignOutButton(\\d+)$")
	public void user_Click_SignOutButton(int arg1) throws Throwable {
		clickOnElement(pom.get_Logout().getLogoff());
	}
	@When("^user Click On T-shirt(\\d+)$")
	public void user_Click_On_T_shirt(int arg1) throws Throwable {
		clickOnElement(pom.get_Women().getTshirt());
		javaScript();

	}

	@When("^user Click On ShirtImage(\\d+)$")
	public void user_Click_On_ShirtImage(int arg1) throws Throwable {
		clickOnElement(pom.get_Img().getImge2());
		

	   }
	


	@When("^user Click Add To Cart(\\d+)$")
	public void user_Click_Add_To_Cart(int arg1) throws Throwable {
		driver.switchTo().frame(0);
		clickOnElement(pom.get_Cart().getCart3());
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
	
	}
	

	@When("^user Click Proceed To ProceedButton(\\d+)$")
	public void user_Click_Proceed_To_ProceedButton(int arg1) throws Throwable {
	
		
		clickOnElement(pom.get_Btn1().getBtn1_3());
		}

	@When("^user Click Proceed To SignButton(\\d+)$")
	public void user_Click_Proceed_To_SignButton(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn2().getBtn2());
	}

	@When("^user Click On Proceed To Summary(\\d+)$")
	public void user_Click_On_Proceed_To_Summary(int arg1) throws Throwable {
		clickOnElement(pom.get_Btn3().getBtn3());
	   
	}

	@When("^user Click CheckProcessoption$")
	public void user_Click_CheckProcessoption() throws Throwable {
		clickOnElement(pom.get_Process().getCheckBox());
	}

	@When("^user Click Proceed To Submit(\\d+)$")
	public void user_Click_Proceed_To_Submit(int arg1) throws Throwable {
		clickOnElement(pom.get_Process().getProcessbtn());
	}

	@When("^user Click PayingCheq$")
	public void user_Click_PayingCheq() throws Throwable {
		clickOnElement(pom.get_Cheq().getCheqq());
	}

	@When("^user Click conform$")
	public void user_Click_conform() throws Throwable {
		clickOnElement(pom.get_Order().getConform());
	}

	@Then("^user Click LogOut$")
	public void user_Click_LogOut() throws Throwable {
		clickOnElement(pom.get_Logout().getLogoff());
	}




		}
