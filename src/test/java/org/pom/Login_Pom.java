package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Pom {
	
	public static WebDriver driver;
	
	@FindBy(id="user-name")
	private WebElement username;

	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginbtn;

	public Login_Pom(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	

}
