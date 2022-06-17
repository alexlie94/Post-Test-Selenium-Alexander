package com.test.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox implements DriverStrategy{

	public WebDriver setStrategy() {
		 System.setProperty("webdriver.firefox.driver", "D:\\geckodriver.exe"); 
		 WebDriver driver=new ChromeDriver();  
		 return driver;
	}

}
