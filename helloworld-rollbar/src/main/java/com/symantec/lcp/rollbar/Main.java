package com.symantec.lcp.rollbar;

import com.rollbar.Rollbar;
import com.rollbar.payload.Payload;

/**
 * @author mahesh_babar
 * @version 1.0 18-Apr-2017
 *
 */

public class Main {

	private static String ACCESS_TOKEN = "63d402a69d954f959ad9caacfcfc25fa";
	/**
	 * @param args
	 * void
	 */
	public static void main(String[] args) {
		
		System.out.println("Starting rollbar app...");
		Rollbar rollbar = new Rollbar(ACCESS_TOKEN, "Dev");
		
		/*Payload payload = Payload.fromError(ACCESS_TOKEN, "Dev", new Exception("This is test exception"), null);
		payload.send();*/
		
		rollbar.handleUncaughtErrors();
		
		System.out.println("THis will throw exception ");
		throw new RuntimeException("THis is deliberately thrown exception");
		
		//System.out.println("Program ends here!!");
	}

}
