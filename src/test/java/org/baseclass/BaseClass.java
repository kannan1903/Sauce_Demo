package org.baseclass;

import java.io.*;
import java.util.concurrent.TimeUnit;
import javax.script.ScriptEngine;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebDriver launchBrowser(String browsername) {
		switch (browsername) {
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "fireFox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			System.err.println("Browser Not Available");
		}
		return driver;
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void dynamicWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public static void StaticWait(int millis) throws InterruptedException {
		Thread.sleep(millis);
	}
	public static void sendKeys(WebElement a, String data) {
		a.sendKeys(data);
	}
	public static WebElement findElementid(String data) {
		WebElement findElement = driver.findElement(By.id(data));
		return findElement;
	}
	public static WebElement findElementXpath(String data) {
		WebElement findElement = driver.findElement(By.xpath(data));
		return findElement;
	}
	public static void click(WebElement a) {
		a.click();
	}
	public static String getCurrentUrl() {
		String url = driver.getCurrentUrl();
		return url;
	}
	public static String getAttributeValue(WebElement a) {
		String attribute = a.getAttribute("value");
		return attribute;
	}
	public static void navigate(String navigatetype) {
		switch (navigatetype) {
		case "back":
			driver.navigate().back();
			break;
		case "forward":
			driver.navigate().forward();
			break;
		case "refresh":
			driver.navigate().refresh();
			break;
		}
	}
	public static void navigateto(String url) {
		driver.navigate().to(url);
	}
	public static void javaScriptScroll(WebElement a) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", a);
	}
	public static void javaScriptSendKeys(WebElement a,String d) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','"+d+"')", a);
	}
	public static void javaScriptClick(WebElement a) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", a);
	}
	public static void simpleAlert( ) {
		Alert alert = driver.switchTo().alert();
	    alert.accept();
	} 
	public static void promptAlert(String a) {
		Alert promalert = driver.switchTo().alert();
		promalert.sendKeys(a);
		promalert.accept();
	}
	public static void takeScreenShot(String filename) throws IOException {

		TakesScreenshot ts=(TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to =new File(System.getProperty("user.dir")+"\\ScreenShot\\"+filename+".png");
		FileUtils.copyFile(from, to);
	}
	
	public static void selectTagVisibleText(WebElement refname,String visibletext) {
		Select s=new Select(refname);
		s.selectByVisibleText(visibletext);
	}
	public static void quit() {
		driver.quit();
	}
	
	public static String getTextMe(String a ) {
		WebElement get = driver.findElement(By.xpath( a ));
		String String = get.getText();
		return String;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

