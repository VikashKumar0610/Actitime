package com.actitime.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplementaion.class)
public class CustomerModule extends BaseClass{
@Test
public void testCreateCustomer() throws IOException, InterruptedException {
	Reporter.log("Create Customer",true);
	FileLib f=new FileLib();
	String custName=f.getExcelData("CreateCustomer", 1, 2);
	String custDesp=f.getExcelData("CreateCustomer", 1, 3);
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskList t=new TaskList(driver);
	t.getAddNewButton().click();
	t.getNewCustomerButton().click();
	t.getEnterCustomerName().sendKeys(custName);
	t.getEnterCustomerDescription().sendKeys(custDesp);
	t.getCustomerDropDown().click();
	t.getOurCompany().click();
	t.getCreateCustomerButton().click();
	WebDriverWait wait1=new WebDriverWait(driver, 10);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
try {	
String actualText=t.getActualCustomerCreated().getText();
Assert.assertEquals(actualText, custName);
}
catch(Exception e) {
	
}
	
}



}
