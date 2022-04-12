package com.Automation2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com_BaseClass_Pack.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\Automation\\Feature1\\Automation1.feature",
		glue="com.Step2",
		
		plugin= {
				//"html:Cucumber_Reports2/Automation2Report",
				//"json:Cucumber_Reports2/Automation2.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Reports/Automation2.html"
				
				
		}
		)
public class Automation2_Runner{
	public static WebDriver driver;
	@BeforeClass
	public static void set_Up() {
		driver=Base_Class.browser_Configuration("Chrome");
	}
	@AfterClass
	public static void tear_Down() {
		driver.close();
			}
	

}
