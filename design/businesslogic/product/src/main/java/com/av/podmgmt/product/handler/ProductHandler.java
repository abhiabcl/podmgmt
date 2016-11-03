package com.av.podmgmt.product.handler;

import java.util.List;

import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.entity.Product;
import com.av.podmgmt.dao.factory.PodmgmtDML;
import com.av.podmgmt.dao.handler.PodmgmtDbHandler;

public class ProductHandler extends PodmgmtDML {

	public Boolean doPodUpdatebyId(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean doFindbyId(int pId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean doFindbyName(String pName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean doPodDeletebyName(String pName) throws PodMgmException {
		System.out.println("Inside doPodDeletebyName.");
		if (!doNullCheck(pName))
			return false;

		if (!doValidateProduct(pName))
			return false;

		List products = PodmgmtDbHandler.listEntity(Product.class, "where productName= '" + pName + "'");
		// int id = GetEntityIdFactory.getId(PodmgmtEnum.PodmgmtUser,
		// podmgmtusers);
		int id = ((Product) (products.iterator().next())).getmID();

		Product pod = (Product) PodmgmtDbHandler.getById(Product.class, id);
		return doDelete(pod) ? true : false;
	}

	public Boolean doPodDeletebyId(int pId) throws PodMgmException {
		System.out.println("Inside doPodDeletebyId.");
		if (!doNullCheck(pId))
			return false;

		List products = PodmgmtDbHandler.listEntity(Product.class, "where id= '" + pId + "'");
		// int id = GetEntityIdFactory.getId(PodmgmtEnum.PodmgmtUser,
		// podmgmtusers);
		int id = ((Product) (products.iterator().next())).getmID();

		Product pod = (Product) PodmgmtDbHandler.getById(Product.class, id);
		return doDelete(pod) ? true : false;
	}

	public Boolean doAddProduct(Product pProduct) {
		System.out.println("Inside doAddProduct.");
		if (!doNullCheck(pProduct))
			return false;

		return doAdd(pProduct);
	}

	public Boolean doValidateProduct(String pProductname) throws PodMgmException {
		System.out.println("Inside doValidateUser.");
		if (!doNullCheck(pProductname))
			return false;

		List pod = PodmgmtDbHandler.listEntity(Product.class, "where productName= '" + pProductname + "'");
		return !pod.isEmpty() ? true : false;
	}

}
