package pageObjectsByElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searched_page {

	WebDriver Driver;

	public Searched_page(WebDriver Driver) {
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}

	@FindBy(css = "div[class='center_column col-xs-12 col-sm-9'] span:nth-child(2)")
	WebElement number_of_result;

	@FindBy(css = "div[class='center_column col-xs-12 col-sm-9'] span:nth-child(1)")
	WebElement serached_result;

	By image = By.xpath("//div[@id='center_column'] /ul/li/div/div[2]/h5/a");

	@FindBy(xpath = "//*[@id=\\\"add_to_cart\\\"]/button/span")
	WebElement cartbutton;

	By number_of_products = By.cssSelector("[class='product-container']");

	By limiting = By.cssSelector("[class='product_list grid row']");

	public WebElement Tocartbutton() {
		return cartbutton;

	}

	public int getlimitingDriver() {
		return Driver.findElement(limiting).findElements(number_of_products).size();

	}

	public List<WebElement> getclickonimageDriver() {
		return Driver.findElement(limiting).findElement(number_of_products).findElements(image);

	}

	public WebElement getProductsNumber() {
		return Driver.findElement(number_of_products);

	}

	public WebElement show_number_of_results() {

		return number_of_result;
	}

	public WebElement show_serached_result() {

		return serached_result;
	}

}
