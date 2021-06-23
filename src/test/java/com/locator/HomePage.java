package com.locator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class HomePage extends LibGlobal {

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement btnSignIn;

	@FindBy(xpath = "//a[@href='#navigation']")
	private WebElement btnNavigation;

	@FindBy(xpath = "(//a[text()='Parts and Supplies'])[2]")
	private WebElement btnPartsAndSupplies;

	@FindBy(xpath = "(//a[text()='Compressors'])[2]")
	private WebElement btnCompressor;

	@FindBy(xpath = "(//a[text()='Compressors'])[3]")
	private WebElement btnCompressor1;

	@FindBy(xpath = "//h1[text()='Compressors']")
	private WebElement assertTextCompressor;
	
	@FindBy(id="onetrust-accept-btn-handler")
	private WebElement acceptCookies;

	public WebElement getBtnSignIn() {
		return btnSignIn;
	}

	public WebElement getAcceptCookies() {
		return acceptCookies;
	}

	public WebElement getBtnNavigation() {
		return btnNavigation;
	}

	public WebElement getBtnPartsAndSupplies() {
		return btnPartsAndSupplies;
	}

	public WebElement getBtnCompressor() {
		return btnCompressor;
	}

	public WebElement getBtnCompressor1() {
		return btnCompressor1;
	}

	public WebElement getAssertTextCompressor() {
		return assertTextCompressor;
	}

	
	
}
