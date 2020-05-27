package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CHOOSE_PAYMENT_METHOD_page {
	WebDriver driver;

	public CHOOSE_PAYMENT_METHOD_page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[class='cheque'] span")
	WebElement Check;

	@FindBy(css = "a[class='bankwire'] span")
	WebElement Bank_Wire;

	public WebElement Through_Check() {

		return Check;

	}

	public WebElement Through_Bank_Wire() {

		return Bank_Wire;
	}

}
