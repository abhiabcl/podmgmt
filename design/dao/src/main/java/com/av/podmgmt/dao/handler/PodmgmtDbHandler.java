package com.av.podmgmt.dao.handler;

import java.util.List;
import org.hibernate.*;

import com.av.podmgmt.common.exception.PodMgmException;
import com.av.podmgmt.dao.factory.PodmgmtFactory;

public class PodmgmtDbHandler {

	public static Session mSession = null;

	public static void init() {
		if (mSession == null) {
			mSession = PodmgmtFactory.getPodMgmtSessionFactory().openSession();
		}
	}

	private static void disconnectSession() {
		if (mSession.isConnected())
			mSession = null;
	}

	public static Query getQuery(String pQuery) {
		return mSession.createQuery(pQuery);
	}

	public static int executeQuery(Query pQuery) {
		return pQuery.executeUpdate();
	}

	public static List<?> getList(Query pQuery) {
		return pQuery.list();
	}

	public static boolean doInsert(Object pObject) {
		Transaction tx = null;
		boolean result = true;
		if (mSession == null)
			init();

		try {
			tx = mSession.beginTransaction();
			mSession.save(pObject);
			tx.commit();
		} catch (HibernateException e) {
			result = false;
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			disconnectSession();
		}
		return result;
	}

	public static Object getById(Class<?> pCl, Integer pId) {
		Transaction tx = null;
		Object object = null;
		if (mSession == null)
			init();
		try {
			tx = mSession.beginTransaction();
			object = mSession.get(pCl, pId);
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			disconnectSession();
		}
		return object;
	}

	public static boolean doDelete(Object pObject) {
		Transaction tx = null;
		boolean result = true;
		if (mSession == null)
			init();

		try {
			tx = mSession.beginTransaction();
			mSession.delete(pObject);
			tx.commit();
		} catch (HibernateException e) {
			result = false;
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			disconnectSession();
		}
		return result;
	}

	public static boolean doUpdate(Object pObject) {
		Transaction tx = null;
		boolean result = true;
		if (mSession == null)
			init();

		try {
			tx = mSession.beginTransaction();
			mSession.update(pObject);
			tx.commit();
		} catch (HibernateException e) {
			result = false;
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			disconnectSession();
		}
		return result;
	}

	public static List<?> listEntity(Class<?> pEntity) {
		List<?> object = null;
		Transaction tx = null;
		if (mSession == null)
			init();
		try {
			tx = mSession.beginTransaction();
			object = mSession.createQuery("FROM " + pEntity.getName()).list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			disconnectSession();
		}

		return object;
	}

	public static List<?> listEntity(Class<?> pEntity, String pClause) throws PodMgmException {
		List<?> object = null;
		Transaction tx = null;
		if (mSession == null)
			init();
		try {
			tx = mSession.beginTransaction();
			object = mSession.createQuery("FROM " + pEntity.getName() + " " + pClause).list();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
			throw new PodMgmException(e.getMessage());
		} finally {
			disconnectSession();
		}

		return object;
	}

}
