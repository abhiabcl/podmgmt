package com.av.podmgmt.catlog.handler.impl;

import java.util.List;

import com.av.podmgmt.catlog.handler.api.ICatalogHandler;
import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.entity.Catalog;
import com.av.podmgmt.dao.factory.PodmgmtDML;
import com.av.podmgmt.dao.handler.PodmgmtDbHandler;

public class CatalogHandler extends PodmgmtDML implements ICatalogHandler {

	@Override
	public Boolean doCatalogDeletebyName(Catalog pCatalog) throws PodMgmException {
		System.out.println("Inside doPodDeletebyName.");
		if (!doNullCheck(pCatalog.getmCatalogName()))
			return false;

		if (!doValidateCatalog(pCatalog.getmCatalogName()))
			return false;

		List catlogs = PodmgmtDbHandler.listEntity(Catalog.class,
				"where catalogName= '" + pCatalog.getmCatalogName() + "'");
		// int id = GetEntityIdFactory.getId(PodmgmtEnum.PodmgmtUser,
		// podmgmtusers);
		int id = ((Catalog) (catlogs.iterator().next())).getmID();

		Catalog catalog = (Catalog) PodmgmtDbHandler.getById(Catalog.class, id);
		return doDelete(catalog) ? true : false;
	}

//	@Override
//	public Boolean doCatalogDeletebyId(Catalog pCatalog) throws PodMgmException {
//		System.out.println("Inside doPodDeletebyId.");
//		if (!doNullCheck(pCatalog.getmCatalogID()))
//			return false;
//
//		List catalogs = PodmgmtDbHandler.listEntity(Catalog.class,
//				"where catalogid= '" + pCatalog.getmCatalogID() + "'");
//		// int id = GetEntityIdFactory.getId(PodmgmtEnum.PodmgmtUser,
//		// podmgmtusers);
//		int id = ((Catalog) (catalogs.iterator().next())).getmID();
//
//		Catalog catalog = (Catalog) PodmgmtDbHandler.getById(Catalog.class, id);
//		return doDelete(catalog) ? true : false;
//	}

	@Override
	public Boolean doAddCatalog(Catalog pCatalog) {
		System.out.println("Inside doAddProduct.");
		if (!doNullCheck(pCatalog))
			return false;

		return doAdd(pCatalog);
	}

	private Boolean doValidateCatalog(String pCatalogname) throws PodMgmException {
		System.out.println("Inside doValidateUser.");
		if (!doNullCheck(pCatalogname))
			return false;

		List pod = PodmgmtDbHandler.listEntity(Catalog.class, "where catalogName= '" + pCatalogname + "'");
		return !pod.isEmpty() ? true : false;
	}

}
