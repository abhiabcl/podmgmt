package com.av.podmgmt.ws;

import javax.jws.WebService;

@WebService
public class WsPurchaseOrder {

	
	public String doAddProduct(){
		System.out.println("Inside doUserRegistration.");
		return "Success";
	}
	
	public Boolean doUpdateProduct(){
		System.out.println("Inside doUserRegistration.");
		return false;
	}
	
	public Boolean doDeleteProduct(){
		return false;
	}
	
	public String doFindProduct(){
		return null;
	}
	
	
	
}
