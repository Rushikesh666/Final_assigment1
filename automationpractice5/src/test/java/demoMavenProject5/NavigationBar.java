package demoMavenProject5;

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

public class NavigationBar extends Base_class {

	@Test(enabled = true)
	public void Test2_unOrderedListnav() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();
		
		Actions xyz = new Actions(driver);
		
		
		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();

	}

	@Test(enabled = true)
	public void Test3_OpenSearchedProductsInNewTabnav() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}
	}

	@Test(enabled = true)
	public void Test4_AddtoCartSearchedProductsFromNewTabnav() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
	
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());

			if (po.click_add_to_cart().isEnabled()) {
			
				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		po.click_Proceed_to_checkOut_button().click();

	}

	@Test(enabled = true)
	public void Test5_ShppingCartSummary_nav() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());

			if (po.click_add_to_cart().isEnabled()) {
			
				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				
				break;

			}

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
		po.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
	
		CartObject.Click_Proceed_to_checkout().click();
	}
	

	@Test(enabled = true)
	public void Test6_UserAuthtificationnav() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();
		
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());

			if (po.click_add_to_cart().isEnabled()) {
			
				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
		po.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		Thread.sleep(5000);
		
		CartObject.Click_Proceed_to_checkout().click();

		AUTHENTICATION_page AuthObj = new AUTHENTICATION_page(driver);

		String Username = prop.getProperty("Username");
		
		String password = prop.getProperty("password");
		
		AuthObj.Insert_UserName().sendKeys(Username);

		AuthObj.Insert_PassWord().sendKeys(password);

		AuthObj.Submit_button().click();

	}

	@Test(enabled = true)
	public void Test7_ADDRESSES_verificationnav() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();
		
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());

			if (po.click_add_to_cart().isEnabled()) {
				
				po.click_add_to_cart().click();
			
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

			System.out.println(driver.getCurrentUrl() + "CurrentUrl");

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		po.click_Proceed_to_checkOut_button().click();
		
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
	public void Test8_ShippingPagenav() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();
		
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (po.click_add_to_cart().isEnabled()) {
			
				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
		po.click_Proceed_to_checkOut_button().click();
		
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
	public void Test9_SelectPaymentMethodnav() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();
		
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (po.click_add_to_cart().isEnabled()) {
			
				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}
		}


		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		po.click_Proceed_to_checkOut_button().click();
		
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
	public void Test10_Order_Summury_Pagenav() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		System.out.println("TEST 2");

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (po.click_add_to_cart().isEnabled()) {

				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}
		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
		po.click_Proceed_to_checkOut_button().click();
		
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

		ORDER_SUMMARY_Page OrderSummerobject = new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page = OrderSummerobject.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);

		OrderSummerobject.I_confirm_my_order().click();
		
		Thread.sleep(10000);
	}

	@Test(enabled = true)
	public void Test11_Order_confirm_Pagenav() throws IOException, InterruptedException, AWTException {
		
		Test1_Invoke_homepage();
		
		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);

		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();

		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		}
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (po.click_add_to_cart().isEnabled()) {

				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}
		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
		po.click_Proceed_to_checkOut_button().click();
		
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

		ORDER_SUMMARY_Page OSP = new ORDER_SUMMARY_Page(driver);

		String ORDER_SUMMARY_Page = OSP.Through_ORDER_SUMMARY().getText();

		System.out.println(ORDER_SUMMARY_Page);

		Order_confirmationPage Order_confirma_object = new Order_confirmationPage(driver);

		Order_confirma_object.getbutton_Back_to_orders().click();

	}

	@Test(enabled = true)
	public void Test12_testORDER_HISTORY_Pagenav() throws IOException, InterruptedException, AWTException {
		Test1_Invoke_homepage();

		Actions xyz = new Actions(driver);

		Home_page_elements1 HPE_Object = new Home_page_elements1(driver);
		
		Thread.sleep(4000);
		
		xyz.moveToElement(HPE_Object.DRESSNAV()).build().perform();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		HPE_Object.getsummerDressesnavBar().click();
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		Searched_page SP_Object = new Searched_page(driver);
		
		System.out.println(SP_Object.show_serached_result().getText());

		System.out.println(SP_Object.show_number_of_results().getText());

		System.out.println("TEST 2");

		int count = SP_Object.getlimitingDriver();

		System.out.println("Total related product Count is-->" + count);

		for (int i = 0; i < count; i++) {

			SP_Object.getclickonimageDriver().get(i).sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		
			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
			
			System.out.println("moved Count is-->" + i);

		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		Set<String> Tabs = driver.getWindowHandles();

		Iterator It = Tabs.iterator();

		driver.switchTo().window((String) It.next());

		Product_detailed_Page po = new Product_detailed_Page(driver);

		while (It.hasNext()) {

			driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			driver.switchTo().window((String) It.next());
			if (po.click_add_to_cart().isEnabled()) {
			
				po.click_add_to_cart().click();
				
				driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

			} else {

				System.out.println("no add to  cart");
				break;

			}
		}

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	
		po.click_Proceed_to_checkOut_button().click();
		
		Cart_Page CartObject = new Cart_Page(driver);

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
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

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		ShippingObject.Click_checkbox().click();

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		ShippingObject.Click_ProccedToCheckOutbutton().click();
		
		CHOOSE_PAYMENT_METHOD_page PAY_MethodObject = new CHOOSE_PAYMENT_METHOD_page(driver);

		Thread.sleep(5000);

		PAY_MethodObject.Through_Bank_Wire().click();
		
		Thread.sleep(5000);

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
