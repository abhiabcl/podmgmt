package com.av.podmgmt.user.factory;

import com.av.podmgmt.dao.entity.PodmgmtUser;

public class PodmgmtSupplier implements IpodmgmtUser{

	@Override
	public PodmgmtUser getUser() {
		return new PodmgmtUser();
	}

}
