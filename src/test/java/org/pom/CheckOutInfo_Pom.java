package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutInfo_Pom {
	public static WebDriver driver;
	
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement firstName;

	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement postalCode;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebtn;

	public CheckOutInfo_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	
	
	;
}
