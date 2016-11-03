package com.av.podmgmt.controller.handler;

import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.controller.handler.api.IBLController;
import com.av.podmgmt.controller.handler.impl.BLController;

public class FrontController {

	private static IBLController mIBLController = null;

	public static void init() {
		mIBLController = new BLController();

	}

	public static void performAction(Object pObject, EEntityType pEntityType, Object pActionType) {
		System.out.println("inside performAction....");
		
		try {
			
			if (pObject == null){
				throw new PodMgmException("No valid data found!");
			}
			
			else if (pEntityType.equals(EEntityType.USER)) {
				System.out.println("inside user action ");
				mIBLController.doLoginLogic(pObject, pEntityType, pActionType);
			}
			
			else if (pEntityType.equals(EEntityType.CATALOG)) {
				System.out.println("inside entity action ");
				mIBLController.doCatalogLogic(pObject, pEntityType, pActionType);
			}
			
			else
			{
				throw new PodMgmException("No valid action found!");
			}
			
			
			
		} catch (PodMgmException ex) {
			ex.getMessage();
		}

	}

}
