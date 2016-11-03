package com.av.podmgmt.common.constant;

public enum EPodmgmtuser {
	USERID, PASSWORD, EMAIL, CITY, MOBILE, ROLE;
	
	public enum EAction{
		LOGIN;
	}
	
//	public String toString(){
//        switch(this){
//        case USERID :
//            return "Userid";
//        case PASSWORD :
//            return "Password";    
//        }
//        return null;
//    }
//
//    public static EPodmgmtuser valueOf(Class<EEntityType> pEEntityType, String pValue){
//        if(pValue.equalsIgnoreCase(USERID.toString()))
//            return EPodmgmtuser.USERID;
//        else if(pValue.equalsIgnoreCase(PASSWORD.toString()))
//            return EPodmgmtuser.PASSWORD;
//        else
//            return null;
//    }
}
