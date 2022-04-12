package com.Automation_Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com_BaseClass_Pack.Base_Class;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\Automation\\Feature\\Automation.feature",
		glue="com.Step_def2",
		monochrome=true,
		dryRun=false,
		strict=true,
		plugin= {
				"html:Cucumber_Reports/Adactin_Report",
				"pretty"
				//"json:Cucumber_Reports/Automation_Report.json",
				//"com.cucumber.listener.ExtentCucumberFormatter:Reports/Automation.html"
		}
		)


public class Auto_Run {
public static WebDriver driver;//null
	
	@BeforeClass
	public static void set_Up()
	{
		driver=Base_Class.browser_Configuration("Chrome");
		
	}
	@AfterClass
	public static void tear_Down()
	{
		
		driver.close();
	}

}
