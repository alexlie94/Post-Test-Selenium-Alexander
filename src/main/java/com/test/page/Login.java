package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.driver.DriverSingleton;

public class Login {

	private WebDriver driver;
	
	public Login() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btn_sign_in;
	
	@FindBy(id="email")
	private WebElement email_login;
	
	@FindBy(id="passwd")
	private WebElement password_login;
	
	@FindBy(id="SubmitLogin")
	private WebElement btn_submit_login;
	
	public void fieldEmptyIsErrorCase() {
		btn_sign_in.click();
		email_login.sendKeys("");
		password_login.sendKeys("");
		btn_submit_login.click();
	}
	
	public void fieldEmailNotValidatingCase() {
		btn_sign_in.click();
		email_login.sendKeys("emailNotvalid");
		password_login.sendKeys("123456");
		btn_submit_login.click();
	}
	
	public void fieldCompletedCase() {
		btn_sign_in.click();
		email_login.sendKeys("tugasLatihan@gmail.com");
		password_login.sendKeys("123456");
		btn_submit_login.click();
	}
	
}
