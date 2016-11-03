package com.av.podmgmt.user.handler.impl;

import java.util.Iterator;
import java.util.List;

import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.entity.PodmgmtUser;
import com.av.podmgmt.dao.factory.PodmgmtDML;
import com.av.podmgmt.dao.handler.PodmgmtDbHandler;
import com.av.podmgmt.user.handler.api.IPodmgmtUserHandler;

public class PodmgmtUserHandler extends PodmgmtDML implements IPodmgmtUserHandler {

	@Override
	public Boolean doUserRegistration(PodmgmtUser pPoduser) {
		System.out.println("Inside doUserRegistration.");
		if (!doNullCheck(pPoduser))
			return false;

		return doAdd(pPoduser);
	}

	@Override
	public Boolean doDeleteUser(PodmgmtUser pUserData) throws PodMgmException {
		System.out.println("Inside doDeleteUser.");
		if (!doNullCheck(pUserData.getmUserid()))
			return false;

		if (!doValidateUser(pUserData.getmUserid()))
			return false;

		List podmgmtusers = PodmgmtDbHandler.listEntity(PodmgmtUser.class, "where userid= '" + pUserData.getmUserid() + "'");
		// int id = GetEntityIdFactory.getId(PodmgmtEnum.PodmgmtUser,
		// podmgmtusers);
		int id = ((PodmgmtUser) (podmgmtusers.iterator().next())).getmID();

		PodmgmtUser poduser = (PodmgmtUser) PodmgmtDbHandler.getById(PodmgmtUser.class, id);
		return doDelete(poduser) ? true : false;
	}

	@Override
	public Boolean doUpdatePassword(PodmgmtUser pUserData, String pNewpassword) throws PodMgmException {
		System.out.println("Inside doUpdatePassword.");
		if (!doNullCheck(pUserData.getmUserid()) && !doNullCheck(pUserData.getmPassword()) && !doNullCheck(pNewpassword))
			return false;

		PodmgmtUser podmgmtuser = null;

		if (doValidateUser(pUserData.getmUserid())) {
			List podmgmtusers = PodmgmtDbHandler.listEntity(PodmgmtUser.class,
					"where userid= '" + pUserData.getmUserid() + "' and password ='" + pUserData.getmPassword() + "'");
			for (Iterator iterator = podmgmtusers.iterator(); iterator.hasNext();)
				podmgmtuser = (PodmgmtUser) iterator.next();

			podmgmtuser.setmPassword(pNewpassword);

			return doUpdate(podmgmtuser) ? true : false;
		} else {
			return false;
		}
	}

	private Boolean doValidateUser(String pUsername) throws PodMgmException {
		System.out.println("Inside doValidateUser.");
		if (!doNullCheck(pUsername))
			return false;

		List podmgmtusers = PodmgmtDbHandler.listEntity(PodmgmtUser.class, "where userid= '" + pUsername + "'");
		return !podmgmtusers.isEmpty() ? true : false;
	}

	@Override
	public Boolean doLogin(PodmgmtUser pUserData) throws PodMgmException{
		System.out.println("Inside doLogin.");
		if (!doNullCheck(pUserData.getmUserid()) && !doNullCheck(pUserData.getmPassword()))
			return false;

		if (doValidateUser(pUserData.getmUserid())) {
			List podmgmtusers = PodmgmtDbHandler.listEntity(PodmgmtUser.class,
					"where userid= '" + pUserData.getmUserid() + "'and password ='" + pUserData.getmPassword() + "'");
			return podmgmtusers.isEmpty() ? false : true;
		} else
			return false;

	}

}
