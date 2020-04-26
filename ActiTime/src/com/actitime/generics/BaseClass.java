package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.pom.HomePage;

public class BaseClass {	
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");

System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe" );
}
public WebDriver driver;
@BeforeClass
	public void openBrowser(String browser) {
	if(browser.equals("chrome")) {
		driver=new ChromeDriver();
		
	}
	else if(browser.equals("firefox")){
		{
			driver=new FirefoxDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
@AfterClass
	public void closeBrowser() {
	driver.close();	
	}
@BeforeMethod
public void login() {
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
}
@AfterMethod
public void loout() throws InterruptedException {
	Thread.sleep(8000);
	HomePage h=new HomePage(driver);
	h.clickOnLogout();
	//driver.findElement(By.linkText("Logout")).click();
	
}
}
