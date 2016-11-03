package com.av.podmgmt.ws;

import javax.jws.WebService;

@WebService
public class WsCustomerReference {

	
	public String doAddCustomerReference(){
		System.out.println("Inside doUserRegistration.");
		return "Success";
	}
	
	public Boolean doUpdateCustomerReference(){
		System.out.println("Inside doUserRegistration.");
		return false;
	}
	
	public Boolean doDeleteCustomerReference(){
		return false;
	}
	
	public String doFindCustomerReference(){
		return null;
	}
	
	
	
}
