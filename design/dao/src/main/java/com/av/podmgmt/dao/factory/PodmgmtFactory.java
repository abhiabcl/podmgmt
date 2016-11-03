package com.av.podmgmt.dao.factory;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PodmgmtFactory {

	private static SessionFactory pSessionFactory = null;

	@SuppressWarnings("deprecation")
	public static SessionFactory getPodMgmtSessionFactory() {
		if (pSessionFactory == null) {
			synchronized (PodmgmtFactory.class) {
				if (pSessionFactory == null)
					pSessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
//					.addPackage("com.av.podmgmt.dao.entity").buildSessionFactory();
					
			}
		}
		return pSessionFactory;
	}

}
