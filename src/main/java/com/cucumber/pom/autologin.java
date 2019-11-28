package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.baseclass.BaseClass1;

public class autologin extends BaseClass1 {
	public WebDriver driver;

	@FindBy(xpath = "//a[@class='login']")
	private WebElement login;
	@FindBy(id = "email")
	private WebElement mail;
	@FindBy(id = "passwd")
	private WebElement password;
	@FindBy(id = "SubmitLogin")
	private WebElement submit;

	public autologin(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
