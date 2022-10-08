package com.AirAsia.Runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Base.Air_Asia.Base_Class_Air_Asia;
import com.Property.Air_Asia.ConfigurationHelper_AA;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\AirAsia\\feature\\AirAsia.feature", glue = "com.AirAsia.stepdefinition", plugin = {
		"html:Report/HtmlReport1.html", "junit:Report/XmlReport1.xml", "json:Report/JsonReport1.json" })

public class Runner_AA {

	public static WebDriver driver;

	@BeforeClass
	public static void setUp() throws IOException {

		String getbrowser = ConfigurationHelper_AA.getInstance().getbrowser();
		driver = Base_Class_Air_Asia.browserLaunch(getbrowser);

		Base_Class_Air_Asia.maximize();
	}

	@AfterClass
	public static void tearDown() {
		driver.close();
	}
}
