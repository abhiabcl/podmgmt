package com.av.podmgmt.controller.handler.impl;

import com.av.podmgmt.catlog.handler.api.ICatalogHandler;
import com.av.podmgmt.common.constant.ECataog;
import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.constant.EFactoryChoice;
import com.av.podmgmt.common.constant.EPodmgmtuser;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.controller.handler.api.IBLController;
import com.av.podmgmt.controller.handler.factory.AbstractFactory;
import com.av.podmgmt.controller.handler.factory.FactoryProducer;
import com.av.podmgmt.dao.entity.Catalog;
import com.av.podmgmt.dao.entity.PodmgmtUser;
import com.av.podmgmt.user.handler.api.IPodmgmtUserHandler;
import com.av.podmgmt.user.handler.impl.PodmgmtUserHandler;

public class BLController implements IBLController {

	@Override
	public void doLoginLogic(Object pObject, EEntityType pEntityType, Object pActionType) throws PodMgmException {
		System.out.println("inside doLoginLogic..");
		
		AbstractFactory handlerFactory = FactoryProducer.getFactory(EFactoryChoice.HANDLER);
		IPodmgmtUserHandler podmgmtUserHandler = (PodmgmtUserHandler) handlerFactory.getHandler(pEntityType);

		System.out.println("perform Action: " +  pActionType);
		
		if (pActionType.equals(EPodmgmtuser.EAction.LOGIN)) {
			
			if (podmgmtUserHandler.doLogin(((PodmgmtUser) pObject)))
				System.out.println("success");
			else
				System.out.println("fail");
		}
		
		else 
		{
			throw new PodMgmException("no valid user action found!");
		}
		
	}

	@Override
	public void doCatalogLogic(Object pObject, EEntityType pEntityType, Object pActionType) throws PodMgmException {
		System.out.println("inside doCatalogLogic..");
		
		AbstractFactory handlerFactory = FactoryProducer.getFactory(EFactoryChoice.HANDLER);
		ICatalogHandler cataloghandler = (ICatalogHandler)handlerFactory.getHandler(pEntityType);
		
		System.out.println("perform Action: " +  pActionType);
		
		if (pActionType.equals(ECataog.EAction.ADD)) {
			
			if (cataloghandler.doAddCatalog((Catalog)pObject))
				System.out.println("success");
			else
				System.out.println("fail");
		}
		
		else 
		{
			throw new PodMgmException("no valid catalog action found!");
		}
		
		
	}

}
