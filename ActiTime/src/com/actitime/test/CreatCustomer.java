package com.actitime.test;


//import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.actitime.generics.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TasksPage;

@Listeners(com.actitime.generics.ListenersImplimention.class)
public class CreatCustomer extends BaseClass  {
	@Test
	public void testCreatCustome() {
		HomePage h= new HomePage(driver);
		h.clickOnTaskTab();
		TasksPage t=new TasksPage(driver);
		t.getAddNew().click();
		t.getNewCustomerMenu().click();t.getEnterCustomerNameTbx().sendKeys("./data/testscriptdata.xlsx");
		t.getSelectCustomerDD().click();
		t.getOurcompanyoption().click();
		t.getCreatcustomerBtn().click();
		//Reporter.log("CreatCustome",true);
		
		

}
}  