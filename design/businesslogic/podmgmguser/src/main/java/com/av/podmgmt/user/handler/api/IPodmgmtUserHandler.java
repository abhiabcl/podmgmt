package com.av.podmgmt.user.handler.api;

import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.entity.PodmgmtUser;

public interface IPodmgmtUserHandler{
	public Boolean doUserRegistration(PodmgmtUser pPoduser);
	public Boolean doDeleteUser(PodmgmtUser pUserData) throws PodMgmException;
	public Boolean doUpdatePassword(PodmgmtUser pUserData, String pNewpassword) throws PodMgmException;
//	public Boolean doValidateUser(String pUsername) throws PodMgmException;
	public Boolean doLogin(PodmgmtUser pUserData) throws PodMgmException;
}
