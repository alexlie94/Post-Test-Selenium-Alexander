package com.test.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class DriverSingleton {
	
	private static DriverSingleton instance = null;
	private static WebDriver driver;
	
	public DriverSingleton() {
		instantiate("Chrome");
	}
	
	public static WebDriver instantiate(String param) {
		DriverStrategy driverStrategy = ChooseDriver.chooseStrategy(param);
		driver = driverStrategy.setStrategy();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
	}
	
	public static DriverSingleton getInstance() {
		if(instance == null ) {
			return new DriverSingleton();
		}
		
		return instance;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

}
