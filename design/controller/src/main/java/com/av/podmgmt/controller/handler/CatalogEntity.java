package com.av.podmgmt.controller.handler;

import java.util.HashMap;

import com.av.podmgmt.common.constant.ECataog;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.entity.Catalog;

public class CatalogEntity {

	public static Catalog getCatalogEntity(HashMap<?, ?> pCatalogData) throws PodMgmException {

		if (pCatalogData == null) {
			throw new PodMgmException("no valid user action found!");
		}

		else if (pCatalogData.get(ECataog.CATALOGNAME) != null) {
			Catalog catalog = new Catalog();
			catalog.setmCatalogName(pCatalogData.get(ECataog.CATALOGNAME).toString());
			return catalog;
		} else {
			throw new PodMgmException("no valid user action found!");
		}

	}

}
