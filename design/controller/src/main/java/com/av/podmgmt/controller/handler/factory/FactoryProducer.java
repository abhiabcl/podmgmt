package com.av.podmgmt.controller.handler.factory;

import com.av.podmgmt.common.constant.EFactoryChoice;
import com.av.podmgmt.common.exception.PodMgmException;

public class FactoryProducer {
	public static AbstractFactory getFactory(EFactoryChoice pChoice) throws PodMgmException {

		if (pChoice.equals(EFactoryChoice.ENTITY)) {
			return new EntityFactory();

		} else if (pChoice.equals(EFactoryChoice.HANDLER)) {
			return new HandlerFactory();
		} else {
			throw new PodMgmException("no valid factory choice found!");
		}
	}

}
