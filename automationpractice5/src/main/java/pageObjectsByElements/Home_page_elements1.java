package pageObjectsByElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_elements1

{

	WebDriver driver;

	public Home_page_elements1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div/ul/li[2]")
	WebElement DRESS;

	@FindBy(css = "[id='htmlcontent_home'] li:nth-child(3)")
	WebElement html_content;

	@FindBy(xpath = "//input[@id='search_query_top']")
	WebElement searchBar;

	@FindBy(xpath = "//button[@name='submit_search']")
	WebElement Submit_Search;

	@FindBy(xpath = "//div/ul/li[2]/ul/li[3]")
	WebElement summerDressesnavBar;

	@FindBy(css = "[id='contact-link']")
	WebElement contactus;

	public WebElement DRESSNAV() {
		return DRESS;

	}

	public WebElement contactusmethod() {

		return contactus;
	}

	public WebElement getsummerDressesnavBar() {

		return summerDressesnavBar;
	}

	public WebElement searchButton() {

		return Submit_Search;
	}

	public WebElement searchBar() {

		return searchBar;

	}

}
