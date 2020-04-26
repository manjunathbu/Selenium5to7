package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	 private WebElement UNtbx;
	 @FindBy(name="pwd")
	 private WebElement PWtbx;
	 @FindBy(xpath="//div[.='Login ']")
	 private WebElement LgBtn;// 9-14 lines decleration

	 public LoginPage(WebDriver driver){
	  PageFactory.initElements(driver, this);//d initialization
	 }
	 
	 //bussiness logic method
	 public void setLogin(String un,String pw) {
	  UNtbx.sendKeys(un);
	  PWtbx.sendKeys(pw);
	  LgBtn.click();//21-23 utilization  bissenius logic method//
	 }
	 
	 
	//public WebElement getUNtbx() {
		//return UNtbx;
	//}
	//public WebElement getPWtbx() {
		//return PWtbx;
	//}
	//public WebElement getLgBtn() {
		//return LgBtn;
	}
	 
	//}


