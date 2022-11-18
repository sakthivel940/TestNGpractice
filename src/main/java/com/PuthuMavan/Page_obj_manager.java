package com.PuthuMavan;

import org.openqa.selenium.WebDriver;

public class Page_obj_manager {

	public static WebDriver driver;

	private Home_page_element home_page;
	private Singn_page_elemenent sign_page;

	public Home_page_element getHome_page() {

		if (home_page == null) {

			home_page = new Home_page_element(driver);

		}

		return home_page;
	}

	public Singn_page_elemenent getSign_page() {

		if (sign_page == null) {

			sign_page = new Singn_page_elemenent(driver);

		}

		return sign_page;
	}

	public Page_obj_manager(WebDriver driver) {

		this.driver = driver;

	}

}
