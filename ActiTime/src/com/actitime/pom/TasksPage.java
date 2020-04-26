package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TasksPage {
	@FindBy (xpath="//div[.='Add New']")
	private WebElement AddNew;
	
	@FindBy (xpath="//div[.='+ New Customer']")
	private WebElement NewCustomerMenu;
	
	
	
	
	@FindBy (xpath="//input[@placeholder='Enter Customer Name'and@class]")
	private WebElement EnterCustomerNameTbx;
	
	@FindBy (xpath="//div[text()='- Select Customer -'and@class='emptySelection']")
	private WebElement SelectCustomerDD;
	
	
	@FindBy (xpath="//div[.='Our company'and@class='itemRow cpItemRow ' ]")
	private WebElement  Ourcompanyoption;
	
	@FindBy (xpath="//div[.='Create Customer']")
    private WebElement CreatcustomerBtn;
	public TasksPage(WebDriver driver) {
		PageFactory.initElements( driver, this);
		
		
	}
	public WebElement getAddNew() {
		return AddNew;
	}
	public WebElement getNewCustomerMenu() {
		return NewCustomerMenu;
	}
	public WebElement getEnterCustomerNameTbx() {
		return EnterCustomerNameTbx;
	}
	public WebElement getSelectCustomerDD() {
		return SelectCustomerDD;
	}
	public WebElement getOurcompanyoption() {
		return Ourcompanyoption;
	}
	public WebElement getCreatcustomerBtn() {
		return CreatcustomerBtn;
	}
	
	
}
