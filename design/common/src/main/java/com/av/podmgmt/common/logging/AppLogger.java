package com.av.podmgmt.common.logging;

import java.io.ObjectStreamException;
import org.apache.log4j.Logger;

public class AppLogger extends Logger {

	static AppLogger LOGGER = null;

	private AppLogger(String pName) {
		super(pName);
	}

	public static AppLogger getLogger(String pName) {
		System.out.println("Inside getLogger" + LOGGER);
		if (LOGGER == null) {
			synchronized (AppLogger.class) {
				if (LOGGER == null)
					LOGGER = new AppLogger(pName);
			}
		}
		
		System.out.println("Going put from getLogger" + LOGGER);
		return LOGGER;
	}

	// This will fix the de-serialization issue
	private Object readResolve() throws ObjectStreamException {
		return LOGGER;
	}

	private Object writeReplace() throws ObjectStreamException {
		return LOGGER;
	}

	// This will fix the cloning(newIns issue
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
