package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Pom {
	 public static WebDriver driver;
	 
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartLogo;
	
	@FindBy(xpath="//button[text()='Continue Shopping']")
	private WebElement continueShopping;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkOut;

	public AddToCart_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCartLogo() {
		return cartLogo;
	}

	public WebElement getContinueShopping() {
		return continueShopping;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	

}
