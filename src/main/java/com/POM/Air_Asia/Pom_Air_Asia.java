package com.POM.Air_Asia;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Air_Asia {

	public static WebDriver driver;

	@FindBy(xpath = "//div[@data-testid='source-field']")
	private WebElement tripType;

	@FindBy(id = "basic-url")
	private WebElement input;

	@FindBy(xpath = "//div/button[@id='list-item']/div[1]/div[1]")
	private WebElement src;

	@FindBy(xpath = "//div[@data-testid='destination-field']/div/input")
	private WebElement toCity;

	@FindBy(xpath = "//div/div[@class='arrival-dropdown-content']/descendant::div[3]/button")
	private WebElement flight;

	@FindBy(xpath = "//div/div[@class='react-google-flight-datepicker']/descendant::div[4]")
	private WebElement dateSelector;

	@FindBy(xpath = "//div[@class='dialog-date-picker open']")
	private WebElement dateDialogue;

	@FindBy(xpath = "//div[text()='Oct 2022']/following-sibling::div/div[5]/div[6]")
	private WebElement deptDate;

	@FindBy(xpath = "//button[text()='Back']")
	private WebElement back;

	@FindBy(xpath = "//div[text()='Special Fares']/preceding-sibling::div[2]")
	private WebElement price;

	@FindBy(xpath = "//img[@id='scp'][2]")
	private WebElement person1;

	@FindBy(xpath = "//img[@alt='select']")
	private WebElement person2;

	public Pom_Air_Asia(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getPerson1() {
		return person1;
	}

	public WebElement getPerson2() {
		return person2;
	}

	public WebElement getBack() {
		return back;
	}

	public WebElement getDateSelector() {
		return dateSelector;
	}

	public WebElement getFlight() {
		return flight;
	}

	public WebElement getToCity() {
		return toCity;
	}

	public WebElement getSrc() {
		return src;
	}

	public WebElement getInput() {
		return input;
	}

	public WebElement getTripType() {
		return tripType;
	}

	public WebElement getDateDialogue() {
		return dateDialogue;
	}

	public WebElement getDeptDate() {
		return deptDate;
	}
}
