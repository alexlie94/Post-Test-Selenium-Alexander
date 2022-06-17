package com.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.test.driver.DriverSingleton;

public class Registered {

	private WebDriver driver;
	Personal_Information_Entity form1 = new Personal_Information_Entity();
	Your_Address_Entity form2 = new Your_Address_Entity();
	
	public Registered() {
		this.driver=DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#header > div.nav > div > div > nav > div.header_user_info > a")
	private WebElement btn_sign_in;
	
	@FindBy(id="SubmitCreate")
	private WebElement btn_submit_register;
	
	@FindBy(id="email_create")
	private WebElement email_create;
		
	
	public void regis() {
		btn_sign_in.click();
		email_create.sendKeys("createEmail@gmail.com");
		btn_submit_register.click();
	}
	
	public static Select select(WebElement param) {
		Select var = new Select(param);
		return var;
	}
	
	public void fieldEmptyFormPersonalIsErrorCase() {
		form1.getTitle().click();
		form1.getFirstName_form_input_personal().sendKeys("");
		form1.getLastName_form_input_personal().sendKeys("");
		form1.getEmail_form_input_personal().clear();
		form1.getEmail_form_input_personal().sendKeys("");
		form1.getPassword_form_input_personal().sendKeys("");;
		select(form1.getDays_form_input_personal()).selectByValue("");
		select(form1.getMonths_form_input_personal()).selectByValue("");
		select(form1.getYears_form_input_personal()).selectByValue("");
		form1.getNewsletter_form_input_personal().click();
		form1.getOptin_form_input_personal().click();
	}
	
	public void fieldFormatFormPersonalIsNotValidCase() {
		form1.getTitle().click();
		form1.getFirstName_form_input_personal().sendKeys("Juara");
		form1.getLastName_form_input_personal().sendKeys("Coding");
		form1.getEmail_form_input_personal().clear();
		form1.getEmail_form_input_personal().sendKeys("emailFormatValid");
		form1.getPassword_form_input_personal().sendKeys("123456");;
		select(form1.getDays_form_input_personal()).selectByValue("27");
		select(form1.getMonths_form_input_personal()).selectByValue("8");
		select(form1.getYears_form_input_personal()).selectByValue("1996");
		form1.getNewsletter_form_input_personal().click();
		form1.getOptin_form_input_personal().click();
	}
	
	public void fieldCompletedFormPersonalIsSuccessCase() {
		form1.getTitle().click();
		form1.getFirstName_form_input_personal().sendKeys("Juara");
		form1.getLastName_form_input_personal().sendKeys("Coding");
		form1.getEmail_form_input_personal().clear();
		form1.getEmail_form_input_personal().sendKeys("alexSeleniumTest@gmail.com");
		form1.getPassword_form_input_personal().sendKeys("123456");
		select(form1.getDays_form_input_personal()).selectByValue("27");
		select(form1.getMonths_form_input_personal()).selectByValue("8");
		select(form1.getYears_form_input_personal()).selectByValue("1996");
		form1.getNewsletter_form_input_personal().click();
		form1.getOptin_form_input_personal().click();
	}
	
	
	
	public void fieldCompletedYourAddresslIsSuccessCase() {
	
		form2.getFirstname_form_input_your_address().sendKeys("Selenium");
		form2.getLastname_form_input_your_address().sendKeys("Automation");
		form2.getCompany_form_input_your_address().sendKeys("PT.Selenium Bersama Automation");
		form2.getAddress1_form_input_your_address().sendKeys("Jl.Selenium No 109");
		form2.getAddress2_form_input_your_address().sendKeys("Jl.Automation No 110");
		form2.getCity_form_input_your_address().sendKeys("Cirebon");
		select(form2.getId_state_form_input_your_address()).selectByVisibleText("Hawaii");
		form2.getPostcode_form_input_your_address().sendKeys("20220");
		form2.getOther_form_input_your_address().sendKeys("Informasi Lain lain");
		form2.getPhone_form_input_your_address().sendKeys("0321-021545");
		form2.getPhone_mobile_form_input_your_address().sendKeys("085212349657");
		form2.getAlias_form_input_your_address().clear();
		form2.getAlias_form_input_your_address().sendKeys("Masukkan Alias");
		form2.getBtn_submitAccount_your_address().click();
	}
	
	
}
