package com.av.podmgmt.user.factory;

public class PodmgmtUserFactory extends AbspodmgmtUserFactory {

	@Override
	public IpodmgmtUser getUser(String pUserType) {

		if (pUserType == null)
			return null;

		if (pUserType.equalsIgnoreCase("admin"))
			return new PodmgmtAdmin();

		if (pUserType.equalsIgnoreCase("supplier"))
			return new PodmgmtSupplier();

		return null;
	}

}
