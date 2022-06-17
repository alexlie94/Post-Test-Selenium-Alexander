package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.test.driver.DriverSingleton;

public class Personal_Information_Entity {

	private WebDriver driver;;
	
	public Personal_Information_Entity() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="id_gender2")
	private WebElement title;
	
	@FindBy(id="customer_firstname")
	private WebElement firstName_form_input_personal;
	
	@FindBy(id="customer_lastname")
	private WebElement lastName_form_input_personal;
	
	@FindBy(id="email")
	private WebElement email_form_input_personal;
	
	@FindBy(id="passwd")
	private WebElement password_form_input_personal;
	
	@FindBy(id="days")
	private WebElement days_form_input_personal;
	
	@FindBy(id="months")
	private WebElement months_form_input_personal;
	
	@FindBy(id="years")
	private WebElement years_form_input_personal;
	
	@FindBy(id="newsletter")
	private WebElement newsletter_form_input_personal;
	
	@FindBy(id="optin")
	private WebElement optin_form_input_personal;
	
	
	
	public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}

	public WebElement getFirstName_form_input_personal() {
		return firstName_form_input_personal;
	}

	public void setFirstName_form_input_personal(WebElement firstName_form_input_personal) {
		this.firstName_form_input_personal = firstName_form_input_personal;
	}

	public WebElement getLastName_form_input_personal() {
		return lastName_form_input_personal;
	}

	public void setLastName_form_input_personal(WebElement lastName_form_input_personal) {
		this.lastName_form_input_personal = lastName_form_input_personal;
	}

	public WebElement getEmail_form_input_personal() {
		return email_form_input_personal;
	}

	public void setEmail_form_input_personal(WebElement email_form_input_personal) {
		this.email_form_input_personal = email_form_input_personal;
	}

	public WebElement getPassword_form_input_personal() {
		return password_form_input_personal;
	}

	public void setPassword_form_input_personal(WebElement password_form_input_personal) {
		this.password_form_input_personal = password_form_input_personal;
	}

	public WebElement getDays_form_input_personal() {
		return days_form_input_personal;
	}

	public void setDays_form_input_personal(WebElement days_form_input_personal) {
		this.days_form_input_personal = days_form_input_personal;
	}

	public WebElement getMonths_form_input_personal() {
		return months_form_input_personal;
	}

	public void setMonths_form_input_personal(WebElement months_form_input_personal) {
		this.months_form_input_personal = months_form_input_personal;
	}

	public WebElement getYears_form_input_personal() {
		return years_form_input_personal;
	}

	public void setYears_form_input_personal(WebElement years_form_input_personal) {
		this.years_form_input_personal = years_form_input_personal;
	}

	public WebElement getNewsletter_form_input_personal() {
		return newsletter_form_input_personal;
	}

	public void setNewsletter_form_input_personal(WebElement newsletter_form_input_personal) {
		this.newsletter_form_input_personal = newsletter_form_input_personal;
	}

	public WebElement getOptin_form_input_personal() {
		return optin_form_input_personal;
	}

	public void setOptin_form_input_personal(WebElement optin_form_input_personal) {
		this.optin_form_input_personal = optin_form_input_personal;
	}

	
}
