package com.av.podmgmt.common.exception;

public class PodMgmException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2594521832838700799L;
	
	public PodMgmException ( String pMessage, Exception pException){
		super(pMessage, pException);
	}
	
	public PodMgmException(String pMessage ){
		super(pMessage);
	}
	
	
	public String getMessage (){
		System.out.println("Raised ProdMgmException with CAUSE: \n"+ super.getClass().toString() +"\n Message : \n"+ super.getMessage());
		return "Raised ProdMgmException with CAUSE: "+ super.getClass().toString() +" Message : "+ super.getMessage();		
	}
}
