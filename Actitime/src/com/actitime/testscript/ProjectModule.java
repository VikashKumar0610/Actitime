package com.actitime.testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;
import com.actitime.pom.TaskList;
@Listeners(com.actitime.generic.ListenerImplementaion.class)
public class ProjectModule extends BaseClass{
@Test
public void testCreateProject() throws IOException {
	Reporter.log("Create Project",true);
	FileLib f=new FileLib();
	String projectname = f.getExcelData("CreateProject", 1, 3);
	String customerName=f.getExcelData("CreateCustomer", 1, 2);
	String projectDesc=f.getExcelData("CreateProject", 1, 4);
	WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskList t=new TaskList(driver);
	t.getAddNewButton().click();
	try {
	t.getNewProjectButton().click();
}
	catch(Exception e) {
}
	t.getEnterProjectName().sendKeys(projectname);
	
t.getSelectCustomerDropdown().click();
	t.getOurCompany().click();
	t.getAddProjectDescriptionText().sendKeys(projectDesc);
	t.getCreateProjectButton().click();
	try {
		String actual = t.getActualProjectCreated().getText();
      Assert.assertEquals(actual, projectname);
	}
	catch(Exception e) {
	
	}
}
}
