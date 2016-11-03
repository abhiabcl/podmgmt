package com.av.podmgmt.ws;

import javax.jws.WebService;

@WebService
public class WsCatalog {

	
	public String doAddCatalog(){
		System.out.println("Inside doUserRegistration.");
		return "Success";
	}
	
	public Boolean doUpdateCatalog(){
		System.out.println("Inside doUserRegistration.");
		return false;
	}
	
	public Boolean doDeleteCatalog(){
		return false;
	}
	
	public String doFindCatalog(){
		return null;
	}
	
	
	
}
