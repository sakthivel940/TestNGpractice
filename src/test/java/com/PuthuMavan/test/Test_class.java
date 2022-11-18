package com.PuthuMavan.test;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.PuthuMavan.Page_obj_manager;
import com.PuthuMavan.Base.Base_class;
public class Test_class extends Base_class  {
	public static WebDriver driver;
 public static Page_obj_manager obj ;
	
	@Test
	public void launch_() throws IOException {
	 
		 driver = Base_class.browse_selct("chrome");
		 obj = new Page_obj_manager(driver);
		 Base_class.get_url("https://www.amazon.in/");
		 Base_class.get_maximum();
		 actions(obj.getHome_page().getHello_sign_btn());
		action_own_methods(obj.getHome_page().getHello_sign_btn());
		String get_username = Others_singleton_class.get_sing_obj().get_property_obj().get_username();
		send_keys(obj.getSign_page().getEmail_text(), get_username);

		 
		
	}
	
	
	
    
  
}
