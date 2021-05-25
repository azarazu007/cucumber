package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Continue {
	
	public static WebDriver driver;
	
	@FindBy(id = "continue")
	private WebElement conTinue;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radioButton;

	public POM_Continue(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getConTinue() {
		return conTinue;
	}

	public void setConTinue(WebElement conTinue) {
		this.conTinue = conTinue;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public void setRadioButton(WebElement radioButton) {
		this.radioButton = radioButton;
	}
	
	
	

}
