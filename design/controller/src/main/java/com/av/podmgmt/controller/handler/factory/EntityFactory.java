package com.av.podmgmt.controller.handler.factory;

import java.util.HashMap;

import com.av.podmgmt.common.constant.EEntityType;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.controller.handler.CatalogEntity;
import com.av.podmgmt.controller.handler.PodmgmtuserEntity;
import com.av.podmgmt.dao.entity.Catalog;
import com.av.podmgmt.dao.entity.PodmgmtUser;

public class EntityFactory extends AbstractFactory {

	@Override
	public Object getEntity(@SuppressWarnings("rawtypes") HashMap pUserData, EEntityType pEntityType)
			throws PodMgmException {

		if (pEntityType.equals(EEntityType.USER)) {
			if (pUserData == null) {
				return new PodmgmtUser();
			} else {
				return PodmgmtuserEntity.getPodmgmtUserEntity(pUserData);
			}
		} else if (pEntityType.equals(EEntityType.CATALOG)) {
			if (pUserData == null) {
				return new Catalog();
			} else {
				return CatalogEntity.getCatalogEntity(pUserData);
			}
		} else {
			throw new PodMgmException("no valid entity type found!");
		}
	}

	@Override
	public Object getHandler(EEntityType pEntityType) {
		return null;
	}

}
