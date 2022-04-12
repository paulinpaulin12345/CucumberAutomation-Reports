package com.POMManager.pack;

import org.openqa.selenium.WebDriver;

import com_Pom.Pack.Automation_Cart;
import com_Pom.Pack.Automation_Image;
import com_Pom.Pack.Automation_Login;
import com_Pom.Pack.Automation_Logout;
import com_Pom.Pack.Automation_Orderconform;
import com_Pom.Pack.Automation_Process;
import com_Pom.Pack.Automation_Submit;
import com_Pom.Pack.Automation_Women;
import com_Pom.Pack.Automation_cbtn1;
import com_Pom.Pack.Automation_cbtn2;
import com_Pom.Pack.Automation_cbtn3;
import com_Pom.Pack.Automation_cheq;
import com_Pom.Pack.Home_Page;


public class Automation_Manger {
	public WebDriver driver;
	private Home_Page hp; 
	private Automation_Cart cart;
	private Automation_cbtn1 btn1;
	private Automation_cbtn2 btn2;
	private Automation_cbtn3 btn3;
	private Automation_cheq cheq;
	private Automation_Image img;
	private Automation_Login login;
	private Automation_Logout logout;
	private Automation_Orderconform order;
	private Automation_Process process;
	private Automation_Submit submit;
	private Automation_Women women;
	public Automation_Manger(WebDriver driver2) {
		this.driver=driver2;
	}
	public Home_Page get_Hp() {
		if(hp==null)
		{
			hp=new Home_Page(driver);
		}
		return hp;
	}
	public Automation_Cart get_Cart() {
		if(cart==null)
		{
			cart =new Automation_Cart(driver);
		}
			
		return cart;
	}
	public Automation_cbtn1 get_Btn1() {
		if(btn1==null)
		{
			btn1=new Automation_cbtn1(driver);
		}
		return btn1;
	}
	public Automation_cbtn2 get_Btn2() {
		if(btn2==null)
		{
			btn2=new Automation_cbtn2(driver);		}
		return btn2;
	}
	public Automation_cbtn3 get_Btn3() {
		if(btn3==null)
		{
			btn3=new Automation_cbtn3(driver);
		}
		return btn3;
	}
	public Automation_cheq get_Cheq() {
		if(cheq==null)
		{
			cheq=new Automation_cheq(driver);
		}
		return cheq;
	}
	public Automation_Image get_Img() {
		if(img==null)
		{
			img=new Automation_Image(driver);
		}
		
		return img;
	}
	public Automation_Login get_Login() {
		if(login==null)
		{
			login=new Automation_Login(driver);
		}
		return login;
	}
	public Automation_Logout get_Logout() {
		if(logout==null)
		{
			logout=new Automation_Logout(driver);
		}
		
		return logout;
	}
	public Automation_Orderconform get_Order() {
		if(order==null)
		{
			order=new Automation_Orderconform(driver);
		}
		return order;
	}
	public Automation_Process get_Process() {
		if(process==null)
		{
			process=new Automation_Process(driver);
		}
		return process;
	}
	public Automation_Submit get_Submit() {
		if(submit==null)
		{
			submit=new Automation_Submit(driver);
		}
		return submit;
	}
	public Automation_Women get_Women() {
		if(women==null)
		{
			women=new Automation_Women(driver);
		}
		return women;
	}
	
	
}
