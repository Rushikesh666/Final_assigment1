package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_confirmationPage

{

	WebDriver driver;

	public Order_confirmationPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "div[class='box']")
	WebElement ORDER_CONFIRMATION;

	@FindBy(css = "a[class='button-exclusive btn btn-default']")
	WebElement Back_to_orders;

	public WebElement getText_ORDER_CONFIRMATION_block() {

		return ORDER_CONFIRMATION;
	}

	public WebElement getbutton_Back_to_orders() {

		return Back_to_orders;
	}

}
