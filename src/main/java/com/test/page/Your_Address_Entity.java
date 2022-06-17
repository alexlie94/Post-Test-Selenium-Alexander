package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.test.driver.DriverSingleton;

public class Your_Address_Entity {

	private WebDriver driver;;
	
	public Your_Address_Entity() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="firstname")
	private WebElement firstname_form_input_your_address;
	
	@FindBy(id="lastname")
	private WebElement lastname_form_input_your_address;
	
	@FindBy(id="company")
	private WebElement company_form_input_your_address;
	
	@FindBy(id="address1")
	private WebElement address1_form_input_your_address;

	@FindBy(id="address2")
	private WebElement address2_form_input_your_address;
	
	@FindBy(id="city")
	private WebElement city_form_input_your_address;
	
	@FindBy(id="id_state")
	private WebElement id_state_form_input_your_address;
	
	@FindBy(id="postcode")
	private WebElement postcode_form_input_your_address;
	
	@FindBy(id="id_country")
	private WebElement id_country_form_input_your_address;
	
	@FindBy(id="other")
	private WebElement other_form_input_your_address;
	
	@FindBy(id="phone")
	private WebElement phone_form_input_your_address;
	
	@FindBy(id="phone_mobile")
	private WebElement phone_mobile_form_input_your_address;
	
	@FindBy(id="alias")
	private WebElement alias_form_input_your_address;
	
	@FindBy(id="submitAccount")
	private WebElement btn_submitAccount_your_address;

	public WebElement getFirstname_form_input_your_address() {
		return firstname_form_input_your_address;
	}

	public void setFirstname_form_input_your_address(WebElement firstname_form_input_your_address) {
		this.firstname_form_input_your_address = firstname_form_input_your_address;
	}

	public WebElement getLastname_form_input_your_address() {
		return lastname_form_input_your_address;
	}

	public void setLastname_form_input_your_address(WebElement lastname_form_input_your_address) {
		this.lastname_form_input_your_address = lastname_form_input_your_address;
	}

	public WebElement getCompany_form_input_your_address() {
		return company_form_input_your_address;
	}

	public void setCompany_form_input_your_address(WebElement company_form_input_your_address) {
		this.company_form_input_your_address = company_form_input_your_address;
	}

	public WebElement getAddress1_form_input_your_address() {
		return address1_form_input_your_address;
	}

	public void setAddress1_form_input_your_address(WebElement address1_form_input_your_address) {
		this.address1_form_input_your_address = address1_form_input_your_address;
	}

	public WebElement getAddress2_form_input_your_address() {
		return address2_form_input_your_address;
	}

	public void setAddress2_form_input_your_address(WebElement address2_form_input_your_address) {
		this.address2_form_input_your_address = address2_form_input_your_address;
	}

	public WebElement getCity_form_input_your_address() {
		return city_form_input_your_address;
	}

	public void setCity_form_input_your_address(WebElement city_form_input_your_address) {
		this.city_form_input_your_address = city_form_input_your_address;
	}

	public WebElement getId_state_form_input_your_address() {
		return id_state_form_input_your_address;
	}

	public void setId_state_form_input_your_address(WebElement id_state_form_input_your_address) {
		this.id_state_form_input_your_address = id_state_form_input_your_address;
	}

	public WebElement getPostcode_form_input_your_address() {
		return postcode_form_input_your_address;
	}

	public void setPostcode_form_input_your_address(WebElement postcode_form_input_your_address) {
		this.postcode_form_input_your_address = postcode_form_input_your_address;
	}

	public WebElement getId_country_form_input_your_address() {
		return id_country_form_input_your_address;
	}

	public void setId_country_form_input_your_address(WebElement id_country_form_input_your_address) {
		this.id_country_form_input_your_address = id_country_form_input_your_address;
	}

	public WebElement getOther_form_input_your_address() {
		return other_form_input_your_address;
	}

	public void setOther_form_input_your_address(WebElement other_form_input_your_address) {
		this.other_form_input_your_address = other_form_input_your_address;
	}

	public WebElement getPhone_form_input_your_address() {
		return phone_form_input_your_address;
	}

	public void setPhone_form_input_your_address(WebElement phone_form_input_your_address) {
		this.phone_form_input_your_address = phone_form_input_your_address;
	}

	public WebElement getPhone_mobile_form_input_your_address() {
		return phone_mobile_form_input_your_address;
	}

	public void setPhone_mobile_form_input_your_address(WebElement phone_mobile_form_input_your_address) {
		this.phone_mobile_form_input_your_address = phone_mobile_form_input_your_address;
	}

	public WebElement getAlias_form_input_your_address() {
		return alias_form_input_your_address;
	}

	public void setAlias_form_input_your_address(WebElement alias_form_input_your_address) {
		this.alias_form_input_your_address = alias_form_input_your_address;
	}

	public WebElement getBtn_submitAccount_your_address() {
		return btn_submitAccount_your_address;
	}

	public void setBtn_submitAccount_your_address(WebElement btn_submitAccount_your_address) {
		this.btn_submitAccount_your_address = btn_submitAccount_your_address;
	}
	
	
	
}
