package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	WebDriver driver;

	public Cart_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[class='button btn btn-default standard-checkout button-medium']")
	WebElement Proceedtocheckout;

	public WebElement Click_Proceed_to_checkout() {
		return Proceedtocheckout;

	}

}
