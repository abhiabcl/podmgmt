package com.av.podmgmt.catlog.handler.api;

import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.entity.Catalog;


public interface ICatalogHandler {
	public Boolean doCatalogDeletebyName(Catalog pCatalog) throws PodMgmException ;
	public Boolean doAddCatalog(Catalog pCatalog) ;
}
