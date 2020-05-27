package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORDER_SUMMARY_Page {

	WebDriver driver;

	public ORDER_SUMMARY_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='box cheque-box']")
	WebElement ORDER_SUMMARY;

	@FindBy(css = "button[class='button btn btn-default button-medium']")
	WebElement confirm_my_order;

	public WebElement Through_ORDER_SUMMARY() {

		return ORDER_SUMMARY;

	}

	public WebElement I_confirm_my_order() {

		return confirm_my_order;

	}

}
