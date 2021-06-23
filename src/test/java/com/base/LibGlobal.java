package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public void getDriver(String browser) {

		try {
			if (browser.equalsIgnoreCase("chrome")) {
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("disable-pop-blocking");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(chromeOptions);
			} else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void launchUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void typeText(WebElement element, String data) {
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				element.sendKeys(data);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void btnClick(WebElement element) {

		try {

			element.click();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void clickByJs(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", element);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public void close() {
		try {
			driver.quit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
