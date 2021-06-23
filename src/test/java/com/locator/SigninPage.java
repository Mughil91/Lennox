package com.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class SigninPage extends LibGlobal {

	public SigninPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "j_username")
	private WebElement txtUserName;

	@FindBy(id = "j_password")
	private WebElement txtPassword;

	@FindBy(id = "loginSubmit")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	
}
