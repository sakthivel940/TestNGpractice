package com.PuthuMavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Singn_page_elemenent {

	public WebElement getEmail_text() {
		return email_text;
	}

	public WebElement getConti_btn() {
		return conti_btn;
	}

	public WebElement getCreat_account_btn() {
		return creat_account_btn;
	}

	public static WebDriver driver;

	private @FindBy(xpath = "//input[@type='email']") WebElement email_text;
	private @FindBy(xpath = "//input[@id='continue']") WebElement conti_btn;
	private @FindBy(xpath = "//a[@id='createAccountSubmit']") WebElement creat_account_btn;

	public Singn_page_elemenent(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}
