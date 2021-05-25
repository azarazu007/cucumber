package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement passWord;
	
	@FindBy(id = "login")
	private WebElement login;

	public POM_LoginPage(WebDriver driver1) {
		this.driver =driver1;
		PageFactory.initElements(driver1, this);
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(WebElement userName) {
		this.userName = userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}	
	
	

}

