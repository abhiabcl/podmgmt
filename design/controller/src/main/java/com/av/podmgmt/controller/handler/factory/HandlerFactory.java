package com.av.podmgmt.controller.handler.factory;

import java.util.HashMap;

import com.av.podmgmt.catlog.handler.impl.CatalogHandler;
import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.user.handler.impl.PodmgmtUserHandler;

public class HandlerFactory extends AbstractFactory {

	@Override
	public Object getEntity(@SuppressWarnings("rawtypes") HashMap pUserData, EEntityType pEntityType) {
		return null;
	}

	@Override
	public Object getHandler(EEntityType pEntityType) throws PodMgmException {

		if (pEntityType.equals(EEntityType.USER)) {
			return new PodmgmtUserHandler();
		} else if (pEntityType.equals(EEntityType.CATALOG)) {
			return new CatalogHandler();
		} else {
			throw new PodMgmException("no valid entity handler found!");
		}
	}

}
