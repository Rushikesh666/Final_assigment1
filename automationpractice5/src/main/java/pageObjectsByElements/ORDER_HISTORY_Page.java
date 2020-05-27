package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ORDER_HISTORY_Page {

	WebDriver driver;

	public ORDER_HISTORY_Page(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[class='info-order box'] a[target='_blank']")
	WebElement Download_your_invoice_as_PDF_file;

	@FindBy(xpath = "//div[@id='center_column']  /div/table/tbody/tr[1]/td[7]/a[1]")
	WebElement center_column;

	@FindBy(id = "history")
	WebElement page;

	public WebElement Get_Download_your_invoice_as_PDF_file() {
		return Download_your_invoice_as_PDF_file;
	}

	public WebElement center_Column() {
		return center_column;
	}

	public WebElement page() {

		return page;
	}

}
