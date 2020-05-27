package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_page {
	WebDriver driver;

	public Shipping_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[class='button btn btn-default standard-checkout button-medium']")
	WebElement ProccedToCheckOutbutton;

	@FindBy(css = "div[class='checker']")
	WebElement checkbox;

	public WebElement Click_checkbox()

	{

		return checkbox;
	}

	public WebElement Click_ProccedToCheckOutbutton()

	{

		return ProccedToCheckOutbutton;
	}

}
