package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Pom {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement backPack;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	private  WebElement addToCart;
	
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']")
	private WebElement bikeLight;

	public HomePage_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getBackPack() {
		return backPack;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getBikeLight() {
		return bikeLight;
	}

	
	
	

}
