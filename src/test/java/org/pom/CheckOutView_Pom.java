package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutView_Pom {
	public static WebDriver driver;
	
	@FindBy(xpath="//button[text()='Finish']")
	private WebElement finishBtn;
	
	@FindBy(xpath="//div[text()='Your order has been dispatched, and will arrive just as fast as the pony can get there!']")
	private WebElement orderSuccess;

	public CheckOutView_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFinishBtn() {
		return finishBtn;
	}

	public WebElement getOrderSuccess() {
		return orderSuccess;
	}
	

}
