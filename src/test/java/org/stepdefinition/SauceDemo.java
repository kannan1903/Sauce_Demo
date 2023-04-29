
package org.stepdefinition;

import java.io.IOException;
import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pom.*;
import io.cucumber.java.en.*;

public class SauceDemo extends BaseClass {
	
	Login_Pom li=new Login_Pom(driver);
	HomePage_Pom ho=new HomePage_Pom(driver);
	AddToCart_Pom ca=new AddToCart_Pom(driver);
	CheckOutInfo_Pom ck=new CheckOutInfo_Pom(driver);
	CheckOutView_Pom fi=new CheckOutView_Pom(driver);
	
	@Given("The user should be in required url")
	public void the_user_should_be_in_required_url() {
		urlLaunch("https://www.saucedemo.com/");
		dynamicWait(10);
	}
	@Given("The user should login the application")
	public void the_user_should_login_the_application() {
		sendKeys(li.getUsername(), "standard_user");
		sendKeys(li.getPassword(), "secret_sauce");
		click(li.getLoginbtn());
	}
	@When("User move a product to cart")
	public void user_move_a_product_to_cart() {
	
		click(ho.getBackPack());
		click(ho.getAddToCart());
		navigate("back");
		click(ho.getBikeLight());
		click(ho.getAddToCart());
	}

	@When("User to enter cart")
	public void user_to_enter_cart() {
		click(ca.getCartLogo());
	}
	
	@When("The user proceeds to checkout")
	public void the_user_proceeds_to_checkout() {
		click(ca.getCheckOut());
	}

	@When("The user should give first name")
	public void the_user_should_give_first_name() {
		sendKeys(ck.getFirstName(), "thamarai");
	}

	@When("The user should give last name")
	public void the_user_should_give_last_name() {
	sendKeys(ck.getLastName(), "kannan");
	}

	@When("The user should give postal code")
	public void the_user_should_give_postal_code() {
	sendKeys(ck.getPostalCode(), "625001");
	}

	@When("The user click continue")
	public void the_user_click_continue() {
	click(ck.getContinuebtn());
	}

	@When("The user click the finish button")
	public void the_user_click_the_finish_button() {
		click(fi.getFinishBtn());
	}

	@Then("The user recieves the success message")
	public void the_user_recieves_the_success_message() throws IOException {
		WebElement get = driver.findElement(By.xpath("//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']"));
		String text = get.getText();
		
		Assert.assertTrue(text.contains("dispatched"));
		
		javaScriptScroll(fi.getOrderSuccess());
		takeScreenShot("SauceDemo");
		quit();
	}





}
