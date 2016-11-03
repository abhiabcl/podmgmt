package com.av.podmgmt.dao.factory;

import com.av.podmgmt.dao.handler.PodmgmtDbHandler;

public abstract class PodmgmtDML {

	@SuppressWarnings("finally")
	protected Boolean doUpdate(Object pObject) {
		Boolean result = false;
		try {
			if (PodmgmtDbHandler.doUpdate(pObject))
				result = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}
	}

	@SuppressWarnings("finally")
	protected Boolean doDelete(Object pObject) {
		Boolean result = false;
		try {
			if (PodmgmtDbHandler.doDelete(pObject))
				result = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}
	}

	@SuppressWarnings("finally")
	protected Boolean doFindbyId(Object pObject) {
		Boolean result = false;
		try {
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}
	}

	@SuppressWarnings("finally")
	protected Boolean doAdd(Object pObject) {
		Boolean result = false;
		try {
			if (PodmgmtDbHandler.doInsert(pObject))
				result = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return result;
		}
	}
	
	protected Boolean doNullCheck(Object pObject){
		return pObject != null?true:false;
	}

}
