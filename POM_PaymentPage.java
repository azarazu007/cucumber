package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_PaymentPage {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement firstName;
	
	@FindBy(id = "last_name")
	private WebElement lastName;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement ccNUmber;
	
	@FindBy(id = "cc_type")
	private WebElement ccType;
	
	@FindBy(id = "cc_exp_month")
	private WebElement ccMonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement ccYear;
	
	@FindBy(id = "cc_cvv")
	private WebElement ccCvv;
	
	@FindBy(id = "book_now")
	private WebElement bookNow;

	public POM_PaymentPage(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCcNUmber() {
		return ccNUmber;
	}

	public void setCcNUmber(WebElement ccNUmber) {
		this.ccNUmber = ccNUmber;
	}

	public WebElement getCcType() {
		return ccType;
	}

	public void setCcType(WebElement ccType) {
		this.ccType = ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public void setCcMonth(WebElement ccMonth) {
		this.ccMonth = ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public void setCcYear(WebElement ccYear) {
		this.ccYear = ccYear;
	}

	public WebElement getCcCvv() {
		return ccCvv;
	}

	public void setCcCvv(WebElement ccCvv) {
		this.ccCvv = ccCvv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}

	public void setBookNow(WebElement bookNow) {
		this.bookNow = bookNow;
	}	

}
