package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AUTHENTICATION_page

{
	WebDriver driver;

	public AUTHENTICATION_page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='col-xs-12 col-sm-6'] input[id='email']")
	WebElement UserName;

	@FindBy(css = "div[class='col-xs-12 col-sm-6'] input[id='passwd']")
	WebElement PassWord;

	@FindBy(css = "button[id='SubmitLogin']")
	WebElement Submit_button;

	public WebElement Insert_UserName() {

		return UserName;

	}

	public WebElement Insert_PassWord() {
		return PassWord;
	}

	public WebElement Submit_button() {
		return Submit_button;
	}

}
