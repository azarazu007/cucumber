package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Logout {
	
	public static WebDriver driver;
	
	@FindBy(id = "logout")
	private WebElement logout;

	public POM_Logout(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogout() {
		return logout;
	}

	public void setLogout(WebElement logout) {
		this.logout = logout;
	}
	
	
	

}
