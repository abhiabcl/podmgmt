package com.av.podmgmt.controller.handler;

import java.util.HashMap;

import com.av.podmgmt.common.constant.EPodmgmtuser;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.entity.PodmgmtUser;

public class PodmgmtuserEntity {

	public static PodmgmtUser getPodmgmtUserEntity(HashMap<?, ?> pUserData) throws PodMgmException {

		if (pUserData == null) {
			throw new PodMgmException("no valid user action found!");
		}

		PodmgmtUser poduser = new PodmgmtUser();

		if (pUserData.get(EPodmgmtuser.USERID) != null)
			poduser.setmUserid(pUserData.get(EPodmgmtuser.USERID).toString());

		if (pUserData.get(EPodmgmtuser.PASSWORD) != null)
			poduser.setmPassword(pUserData.get(EPodmgmtuser.PASSWORD).toString());

		if (pUserData.get(EPodmgmtuser.MOBILE) != null)
			poduser.setmMobileNo(pUserData.get(EPodmgmtuser.MOBILE).toString());

		if (pUserData.get(EPodmgmtuser.CITY) != null)
			poduser.setmCity(pUserData.get(EPodmgmtuser.CITY).toString());

		if (pUserData.get(EPodmgmtuser.ROLE) != null)
			poduser.setmRole(pUserData.get(EPodmgmtuser.ROLE).toString());

		if (pUserData.get(EPodmgmtuser.EMAIL) != null)
			poduser.setmEmail(pUserData.get(EPodmgmtuser.EMAIL).toString());

		return poduser;

	}

}
