package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (className="content tasks")
	private WebElement TaskTab;
	@FindBy (id="logoutLink")
	private WebElement LogoutLink;
	
	public  HomePage (WebDriver driver) {
		PageFactory.initElements( driver, this);
		
	}
	public void clickOnTaskTab() {
		TaskTab.click();
	}
	public void clickOnLogout() {
		LogoutLink.click();
	}
}
