package com.av.podmgmt.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path (value="WsTestRest")
public class WsTestRest {

	private String msg;
	
	public WsTestRest(){
		
	}
	
	@PUT
	@Consumes ("text/xml")
	public void setValue(String pMsg){
		System.out.println("inside set value rest webservice: "+pMsg);
	}
	
	@GET
	@Produces ("text/xml")
	public String getValue(){
		System.out.println("inside get value rest webservice");
		return "Got it!";
	}
}
