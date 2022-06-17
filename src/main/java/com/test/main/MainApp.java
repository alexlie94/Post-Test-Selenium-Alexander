package com.test.main;

import org.openqa.selenium.WebDriver;

import com.test.driver.DriverSingleton;
import com.test.page.Login;
import com.test.page.Registered;

public class MainApp {

	public static void main(String[] args) {

		@SuppressWarnings("static-access")
		WebDriver driver = DriverSingleton.getInstance().getDriver();
		driver.get("http://automationpractice.com/");
		
		Login login = new Login();
		login.fieldEmptyIsErrorCase();
		login.fieldEmailNotValidatingCase();
		login.fieldCompletedCase();
		
		Registered regis = new Registered();
		regis.regis();
		regis.fieldEmptyFormPersonalIsErrorCase();
		regis.fieldFormatFormPersonalIsNotValidCase();
		regis.fieldCompletedFormPersonalIsSuccessCase();
		regis.fieldCompletedYourAddresslIsSuccessCase();
		
	}

}
