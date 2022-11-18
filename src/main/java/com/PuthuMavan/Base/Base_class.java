package com.PuthuMavan.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;
	public static Actions action;

	/* _______________******* browser launch***********_________________ */

	public static WebDriver browse_selct(String bro_name) {

		if (bro_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\new project in java\\Selinium_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (bro_name.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.firefox.driver",
					"D:\\new project in java\\Selinium_Project\\Driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		return driver;
	}

	public static void get_url(String url) {
		driver.get(url);
	}
	
	
	
	public static void get_maximum() {
		
		driver.manage().window().maximize();
		
	}
	/* _______________*******mouse action***********_________________ */

	public static void actions(WebElement element) {// mouse action move and hower the element
		action = new Actions(driver);
		action.moveToElement(element);
	}

	public static void action_own_methods(WebElement element) {
		action = new Actions(driver);
		action.click(element).build().perform();
	}

	public static void js_excetuter(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);
	}
	/* _______________******html_drowp down ***********_________________ */

	public static void dr_down(WebElement element, String by_value) {// handle html drop down using select class

		Select select = new Select(element);
		select.selectByValue(by_value);
	}

	public static void click_meth(WebElement element) {
		element.click();
	}

	public static void clear_meth(WebElement element) {
		element.clear();
	}

	public static void send_keys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void implicit_time_wait(long millisec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(millisec));
	}

	public static void take_screen_shot(String location) throws IOException {

		TakesScreenshot shot = (TakesScreenshot) driver;
		File sho = shot.getScreenshotAs(OutputType.FILE);
		File fi = new File(location);
		FileUtils.copyFile(sho, fi);

	}

}
