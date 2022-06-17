package com.test.driver;

public class ChooseDriver {
	
	public static DriverStrategy chooseStrategy(String param) {
		
		switch(param) {
		case "Chrome":
			return new Chrome();
		case "Firefox":
			return new Firefox();
		default:
			return null;
		}
		
		
	}

}
