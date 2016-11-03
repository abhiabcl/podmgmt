package com.av.podmgmt.common.logging;

public class test {
	
	
public static void main (String [] args){
		
		System.out.println("this is for log4j testing ");
		
//		BasicConfigurator.configure();
//		Logger log = Logger.getLogger(test.class);
		AppLogger LOGGER = AppLogger.getLogger("abhisek");
		
		
		System.out.println("tLogger object :"+LOGGER );
		LOGGER.info("this is logger test from appLogger" );
	}

}
