package com.av.podmgmt.ws;

import javax.jws.WebService;

@WebService
public class WsInvntroy {

	
	public String doAddInvntroy(){
		System.out.println("Inside doUserRegistration.");
		return "Success";
	}
	
	public Boolean doUpdateInvntroy(){
		System.out.println("Inside doUserRegistration.");
		return false;
	}
	
	public Boolean doDeleteInvntroy(){
		return false;
	}
	
	public String doFindInvntroy(){
		return null;
	}
	
	
	
}
