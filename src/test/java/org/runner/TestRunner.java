package org.runner;

import org.baseclass.BaseClass;
import org.baseclass.JVMReport;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\TaskSauceDemo_Cucumber\\src\\test\\java\\Features\\SauceDemo.feature", glue = "org.stepdefinition", plugin = {
		"html:target/sauce.html", "json:target/sauce.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },
			dryRun = false)
public class TestRunner {

	public static WebDriver driver;

	@BeforeClass

	public static void browser() {

		driver = BaseClass.launchBrowser("chrome");
	}
	
	@AfterClass
	public static void report() {
		JVMReport.generateJvmReport("target/sauce.json");
	}

}
