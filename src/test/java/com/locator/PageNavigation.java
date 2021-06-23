package com.locator;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.LibGlobal;

public class PageNavigation extends LibGlobal {
	
	public PageNavigation() {
		PageFactory.initElements(driver, this);
	}

	@FindAll(@FindBy(xpath = "//ul[@class='pagination']//li[not (@class='Next')]"))
	private List<WebElement> pageNavigation;
	
	@FindAll(@FindBy(xpath = "//div[@class='sku']"))
	private List<WebElement> productId;
	
	
	public List<WebElement> getPageNavigation() {
		return pageNavigation;
	}

	public List<WebElement> getProductId() {
		return productId;
	}
	
	
	
	
	
}
