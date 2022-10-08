package com.AirAsia.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AirAsia.Runner.Runner_AA;
import com.Air_Asia.Read_AirAsia_Xlsx;
import com.Base.Air_Asia.Base_Class_Air_Asia;

import com.POM.Air_Asia.Pom_Air_Asia;
import com.Property.Air_Asia.ConfigurationHelper_AA;

import cucumber.api.java.en.Given;

public class stepDefinition_AA extends Base_Class_Air_Asia {
	public static WebDriver driver = Runner_AA.driver;
	public static String from;
	public static String to;
	public static Pom_Air_Asia pAA = new Pom_Air_Asia(driver);

	@Given("^User Can Launch The Browser And Book Tickets$")
	public void user_Can_Launch_The_Browser_And_Book_Tickets() throws Throwable {

		String url = ConfigurationHelper_AA.getInstance().getUrl();
		getUrl(url);
		WebElement tripType = pAA.getTripType();
		clickOnElement(tripType);
		implicitWait();

		WebElement input = pAA.getInput();
		expilicitWait(input);

		userInput(pAA.getInput(), Read_AirAsia_Xlsx.particularData("AirAsia", 1, 0));

		sleep(2000);
		WebElement src = pAA.getSrc();
		clickOnElement(src);

		WebElement toCity = pAA.getToCity();

		userInput(pAA.getToCity(), Read_AirAsia_Xlsx.particularData("AirAsia", 1, 1));

		sleep(2000);
		WebElement flight = pAA.getFlight();
		clickOnElement(flight);
		WebElement dateSelector = pAA.getDateSelector();
		expilicitWait(dateSelector);

		clickOnElement(dateSelector);
		WebElement dateDialogue = pAA.getDateDialogue();
		expilicitWait(dateDialogue);
		sleep(2000);

		WebElement deptDate = pAA.getDeptDate();
		jsScrollIntoView(deptDate);
		jsClick(deptDate);
		WebElement back = pAA.getBack();
		clickOnElement(back);
		WebElement price = pAA.getPrice();
		clickOnElement(price);
		WebElement person1 = pAA.getPerson1();
		clickOnElement(person1);
		WebElement person2 = pAA.getPerson2();
		clickOnElement(person2);
	}

}
