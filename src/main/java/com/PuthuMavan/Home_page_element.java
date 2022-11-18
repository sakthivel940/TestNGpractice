package com.PuthuMavan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page_element {

	public static WebDriver driver;

	private @FindBy(xpath = "//div[@id='nav-tools']//descendant::span[@id='nav-link-accountList-nav-line-1']") WebElement hello_sign_btn;
	private @FindBy(xpath = "//div[@id='nav-al-signin']//descendant::span") WebElement sign_btn;
	private @FindBy(xpath = "//input[@id='twotabsearchtextbox']") WebElement search_box;
	private @FindBy(xpath = "//input[@id='nav-search-submit-button']") WebElement search_icon;
	private @FindBy(xpath = "//div[@id='nav-xshop']//child::a[.='Mobiles']") WebElement mobiles_select_link;

	public WebElement getHello_sign_btn() {
		return hello_sign_btn;
	}

	public WebElement getSign_btn() {
		return sign_btn;
	}

	public WebElement getSearch_box() {
		return search_box;
	}

	public WebElement getSearch_icon() {
		return search_icon;
	}

	public WebElement getMobiles_select_link() {
		return mobiles_select_link;
	}

	public Home_page_element(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
