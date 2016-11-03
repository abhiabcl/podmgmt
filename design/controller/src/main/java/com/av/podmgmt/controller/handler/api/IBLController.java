package com.av.podmgmt.controller.handler.api;

import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.exception.PodMgmException;

public interface IBLController {
	public void doLoginLogic(Object pObject, EEntityType pEntityType, Object pActionType) throws PodMgmException;
	public void doCatalogLogic(Object pObject, EEntityType pEntityType, Object pActionType) throws PodMgmException;	
	
}
