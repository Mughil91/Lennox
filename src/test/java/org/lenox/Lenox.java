package org.lenox;

import java.util.List;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.base.LibGlobal;
import com.locator.HomePage;
import com.locator.PageNavigation;
import com.locator.SigninPage;

public class Lenox extends LibGlobal {

	public static void main(String[] args) throws InterruptedException {
		LibGlobal global = new LibGlobal();
		global.getDriver("chrome");
		global.launchUrl("http://liidaveqa.com/");
		HomePage homePage = new HomePage();
		Thread.sleep(5000);
		global.clickByJs(homePage.getAcceptCookies());
		// driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		global.btnClick(homePage.getBtnSignIn());

		SigninPage page = new SigninPage();
		global.typeText(page.getTxtUserName(), "lenproautomation8@lenqat.com");
		global.typeText(page.getTxtPassword(), "Community17");
		global.clickByJs(page.getBtnLogin());

		global.btnClick(homePage.getBtnNavigation());
		global.btnClick(homePage.getBtnPartsAndSupplies());
		global.btnClick(homePage.getBtnCompressor());
		global.btnClick(homePage.getBtnCompressor1());

		PageNavigation navigation = new PageNavigation();
		List<WebElement> pageNavigation = navigation.getPageNavigation();
		for (int i = 0; i < pageNavigation.size(); i++) {

			List<WebElement> navigationList = driver
					.findElements(By.xpath("//div[text()=' 10T46']//preceding-sibling::div[1]"));

			if (navigationList.size() > 0) {
				navigationList.get(0).click();
			} else {
				pageNavigation.get(i + 1).click();
			}
		}

		WebElement productDes = driver.findElement(By.xpath("//span[text()='10T46']//preceding::h1"));

		Assert.assertEquals("Bristol H22J38BABC, Reciprocating Compressor, 37,800 Btuh 208/230V, R-22, 1 Phase",
				productDes.getText());

		WebElement model = driver.findElement(By.xpath("//span[text()='10T46']//following::span[2]"));

		Assert.assertEquals("H22J38BABC", model.getText());

		WebElement price = driver.findElement(By.xpath("//span[text()='10T46']//following::span[3]"));

		Assert.assertEquals("$1173.00", price.getText());

		//WebElement listPrice = driver.findElement(By.xpath("//span[text()='10T46']//following::p[1]"));

//String l = listPrice.getText();


		
		
	//	Assert.assertEquals("List price: $2697.90", l.split("|")[1]);

		WebElement shippingAvailablity = driver.findElement(By.xpath("//span[text()='10T46']//following::span[5]"));

		Assert.assertEquals("In Stock", shippingAvailablity.getText().trim());

		WebElement zipCode = driver.findElement(By.xpath("//span[text()='10T46']//following::span[9]"));

		Assert.assertEquals("36105-6205", zipCode.getText().trim());

		WebElement productAvailablity = driver.findElement(By.xpath("//span[text()='10T46']//following::strong[2]"));

		Assert.assertEquals("This item is not available from a location in your area. Please call 1-877-570-0123",
				productAvailablity.getText().trim());

		WebElement addToCart = driver
				.findElement(By.xpath("//span[text()='10T46']//following::button[1][contains(@class,'ALLOWED')]"));

		Assert.assertTrue(addToCart.isDisplayed());

		
		global.close();

	}

}
