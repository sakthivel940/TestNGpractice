package com.PuthuMavan.test;

import java.io.IOException;

public class Others_singleton_class {
	
	public static Others_singleton_class objec;
	public Get_sign_ton_class obje;
	private Others_singleton_class() {
		
		
	}
	
	
	public static Others_singleton_class get_sing_obj(){
		if(objec==null) {
		 objec = new Others_singleton_class();
		}
		return objec;
	}
	
	public Get_sign_ton_class get_property_obj() throws IOException {
		if(obje==null) {
			 obje = new Get_sign_ton_class();
			}
		
		return obje;
	}
	
	
	

}
