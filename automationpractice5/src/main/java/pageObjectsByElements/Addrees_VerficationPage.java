package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addrees_VerficationPage {

	WebDriver driver;

	public Addrees_VerficationPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "button[class='button btn btn-default button-medium']")
	WebElement getProceedtocheckoutButton;

	public WebElement getProceedtocheckoutButton() {

		return getProceedtocheckoutButton;
	}

}
