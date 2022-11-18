package com.PuthuMavan.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Get_sign_ton_class {

	public Properties p;

	public Get_sign_ton_class() throws IOException {

		File fie = new File("D:\\new project in java\\PuthuMavan\\Data.properties");
		FileInputStream finput = new FileInputStream(fie);
		p = new Properties();
		p.load(finput);

	}

	public String get_username() {

		String value = p.getProperty("username");

		return value;
	}

	public String get_password() {

		String value = p.getProperty("password");

		return value;
	}

	
	
	
}
