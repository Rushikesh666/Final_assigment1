package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_detailed_Page {
	WebDriver driver1;

	public Product_detailed_Page(WebDriver driver1) {

		this.driver1 = driver1;
		PageFactory.initElements(driver1, this);

	}

	@FindBy(css = "button[class='exclusive']")
	WebElement add_to_cart;

	@FindBy(css = "div[id='layer_cart'] div[class='layer_cart_cart col-xs-12 col-md-6'] a[class='btn btn-default button button-medium']")
	WebElement Proceed_to_checkOut_button;

	public WebElement click_add_to_cart() {

		return add_to_cart;
	}

	public WebElement click_Proceed_to_checkOut_button() {

		return Proceed_to_checkOut_button;
	}

}
