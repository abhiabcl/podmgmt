package com.av.podmgmt.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.av.podmgmt.common.logging.AppLogger;

@WebService
public class WsPodmgmtUser {

	AppLogger LOGGER = AppLogger.getLogger("WsPodmgmtUser");
	
	@WebMethod
	public String doUserRegistration(String pUserid, String pPassword, String pLastlogin, String pMobileNo, String pEmail, String pRole){
		System.out.println("Inside doUserRegistration.");		
		AppLogger LOGGER = AppLogger.getLogger("abhisek");
		return "Success";
	}
	
	public Boolean doValidateUser(){
		System.out.println("Inside doUserRegistration.");
		return false;
	}
	
	public Boolean doUserAvailabilityCheck(){
		return false;
	}
	
	public String doChangePassword(){
		return null;
	}
	
	public String doForgetPassword(){
		return null;
	}
	
	public Boolean doLogin(){
		return null;
	}
	
	
	public Boolean doFindUser(){
		return null;
	}
	
	public Boolean doDeleteUser(){
		return null;
	}
	
}
