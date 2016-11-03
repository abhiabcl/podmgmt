package com.av.podmgmt.controller.handler.factory;

import java.util.HashMap;

import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.exception.PodMgmException;

public abstract class AbstractFactory {
	public abstract Object getEntity( @SuppressWarnings("rawtypes") HashMap pUserData, EEntityType pEntityType) throws PodMgmException;
	public abstract Object getHandler( EEntityType pEntityType ) throws PodMgmException;
	
}
