package demoMavenProject5;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



import pageObjectsByElements.AUTHENTICATION_page;
import pageObjectsByElements.Addrees_VerficationPage;
import pageObjectsByElements.Cart_Page;
import pageObjectsByElements.Home_page_elements1;
import pageObjectsByElements.Product_detailed_Page;
import pageObjectsByElements.Searched_page;
import pageObjectsByElements.Shipping_page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pageObjectsByElements.AUTHENTICATION_page;
import pageObjectsByElements.Addrees_VerficationPage;
import pageObjectsByElements.CHOOSE_PAYMENT_METHOD_page;
import pageObjectsByElements.Cart_Page;
import pageObjectsByElements.Home_page_elements1;
import pageObjectsByElements.ORDER_HISTORY_Page;
import pageObjectsByElements.ORDER_SUMMARY_Page;
import pageObjectsByElements.Order_confirmationPage;
import pageObjectsByElements.Product_detailed_Page;
import pageObjectsByElements.Searched_page;
import pageObjectsByElements.Shipping_page;
import pageObjectsByElements.Home_page_elements1;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Searchfunctionality extends Base_class {

	@Test(enabled = true)
	public void Test2_testSearchfunction() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		
		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);
		
		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);

		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

	}

	@Test(enabled = true)
	public void Test3_OpenSearchedProductsInNewTab() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
	
		Actions xyz = new Actions(driver);
		
		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

	

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}
	}


	@Test(enabled = true)
	public void Test4_AddtoCartSearchedProductsFromNewTab() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);
		
		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
					
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

			
		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
		
			if (PDP.click_add_to_cart().isEnabled()) {
				
				PDP.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;
			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();

	}

	@Test(enabled = true)
	public void Test5_ShppingCartSummary_() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);
		
		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			System.out.println("moved Count is-->" + i);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);


			driver.switchTo().window((String) It.next());
			
			if (PDP.click_add_to_cart().isEnabled()) {
		
				PDP.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();
	}

	@Test(enabled = true)
	public void Test6_UserAuthtification() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);
		
		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		
		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
	
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (PDP.click_add_to_cart().isEnabled()) {
				
				PDP.click_add_to_cart().click();
		
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();
		// Here User tries to get loggedin
		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
		
		String password = prop.getProperty("password");
		
		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

	}

	@Test(enabled = true)
	public void Test7_ADDRESSES_verification() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		Actions xyz = new Actions(driver);

		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");
		
		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			
			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());

			if (PDP.click_add_to_cart().isEnabled()) {
		
				PDP.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();

		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
	
		String password = prop.getProperty("password");
		
		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();

	}

	@Test(enabled = true)
	public void Test8_ShippingPage() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);

		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();
	
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (PDP.click_add_to_cart().isEnabled()) {
		
				PDP.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();
		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
		
		String password = prop.getProperty("password");
		
		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();

		Shipping_page ShippingObject = new Shipping_page(driver);

		Thread.sleep(5000);
		
		ShippingObject.Click_checkbox().click();

		ShippingObject.Click_ProccedToCheckOutbutton().click();
	}

	@Test(enabled = true)
	public void Test9_SelectPaymentMethod() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);

		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");
		
		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {
			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			
			driver.switchTo().window((String) It.next());
			
			if (PDP.click_add_to_cart().isEnabled()) {
		
				PDP.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();

		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
		
		String password = prop.getProperty("password");
		
		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();

		Shipping_page ShippingObject = new Shipping_page(driver);

		Thread.sleep(5000);
		
		ShippingObject.Click_checkbox().click();

		ShippingObject.Click_ProccedToCheckOutbutton().click();
		
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject = new CHOOSE_PAYMENT_METHOD_page(driver);

		PAY_MethodObject.Through_Check().click();
	}

	@Test(enabled = true)
	public void Test10_Order_Summury_Page() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);

		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (PDP.click_add_to_cart().isEnabled()) {
		
				PDP.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();
		// Here User tries to get loggedin
		
		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
		
		String password = prop.getProperty("password");
		
		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();

		Shipping_page ShippingObject = new Shipping_page(driver);

	
		Thread.sleep(5000);
		
		ShippingObject.Click_checkbox().click();

		ShippingObject.Click_ProccedToCheckOutbutton().click();
		
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject = new CHOOSE_PAYMENT_METHOD_page(driver);

		PAY_MethodObject.Through_Check().click();

		ORDER_SUMMARY_Page OrderSummerobject = new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page = OrderSummerobject.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);

		OrderSummerobject.I_confirm_my_order().click();
	
		Thread.sleep(10000);
	}

	@Test(enabled = true)
	public void Test11_Order_Summury_Page() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Actions xyz = new Actions(driver);

		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {


			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}

		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());

			if (PDP.click_add_to_cart().isEnabled()) {
		
				PDP.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();
		// Here User tries to get loggedin
		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
		
		String password = prop.getProperty("password");

		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();

		Shipping_page ShippingObject = new Shipping_page(driver);

		Thread.sleep(5000);
	
		ShippingObject.Click_checkbox().click();

		ShippingObject.Click_ProccedToCheckOutbutton().click();
		
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject = new CHOOSE_PAYMENT_METHOD_page(driver);

		PAY_MethodObject.Through_Check().click();

		ORDER_SUMMARY_Page OSP = new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page = OSP.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);

		Order_confirmationPage Order_confirma_object = new Order_confirmationPage(driver);

		Order_confirma_object.getbutton_Back_to_orders().click();

	}

	@Test(enabled = true)
	public void Test12_testORDER_HISTORY_Page() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();
		
		System.out.println("Testcase Test11_testORDER_HISTORY_Page is invoked -->");
		
		
		String toURL = prop.getProperty("URL");
		
		driver.get(toURL);
		
		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		String Casual_Dresses = prop.getProperty("Search_for_casual_dress");

		HPE_Object.searchBar().sendKeys("Casual_Dresses");

		HPE_Object.searchButton().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> fff = driver.getWindowHandles();

		Iterator It = fff.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page PDP = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());

			if (PDP.click_add_to_cart().isEnabled()) {
				
				PDP.click_add_to_cart().click();
		
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		PDP.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		CartObject.Click_Proceed_to_checkout().click();
		// Here User tries to get loggedin
		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
		
		String password = prop.getProperty("password");
		
		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

		Addrees_VerficationPage AddressObject = new Addrees_VerficationPage(driver);

		AddressObject.getProceedtocheckoutButton().click();

		Shipping_page ShippingObject = new Shipping_page(driver);

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		ShippingObject.Click_checkbox().click();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		ShippingObject.Click_ProccedToCheckOutbutton().click();
		
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject = new CHOOSE_PAYMENT_METHOD_page(driver);

		Thread.sleep(5000);
		
		PAY_MethodObject.Through_Check().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		ORDER_SUMMARY_Page OSP = new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page = OSP.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);
		
		OSP.I_confirm_my_order().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Order_confirmationPage Order_confirma_object = new Order_confirmationPage(driver);

		Order_confirma_object.getbutton_Back_to_orders().click();

		ORDER_HISTORY_Page Order_History_Object = new ORDER_HISTORY_Page(driver);

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Order_History_Object.center_Column().click();
		
		Thread.sleep(5000);
		
		Order_History_Object.Get_Download_your_invoice_as_PDF_file().click();
		
		Actions Act = new Actions(driver);
		
		Thread.sleep(5000);
		
		Act.moveToElement(Order_History_Object.page()).sendKeys(Keys.chord(Keys.PAGE_DOWN, Keys.DOWN))
				.sendKeys(Keys.chord(Keys.CONTROL, Keys.SUBTRACT)).build().perform();
		Thread.sleep(5000);

		Robot ROBO = new Robot();

		for (int i = 0; i < 2; i++) {
			ROBO.keyPress(KeyEvent.VK_CONTROL);
			ROBO.keyPress(KeyEvent.VK_SUBTRACT);

			ROBO.keyRelease(KeyEvent.VK_CONTROL);

			ROBO.keyRelease(KeyEvent.VK_SUBTRACT);
		}
	}

}
