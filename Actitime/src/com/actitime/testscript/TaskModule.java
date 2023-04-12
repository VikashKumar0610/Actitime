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
import com.actitime.pom.TaskList;


@Listeners(com.actitime.generic.ListenerImplementaion.class)
public class TaskModule extends BaseClass{

	@Test
	public void testCreateTask() throws IOException, InterruptedException {
		Reporter.log("Create Task", true);
		FileLib f=new FileLib();
		String taskname = f.getExcelData("CreateTask", 1, 3);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));

//Click on Task Button		
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		
//Click on Add New Button
		TaskList t=new TaskList(driver);
		t.getAddNewButton().click();
		
		
//Click on New Task Button
		
		t.getNewTaskButton().click();
		
//Click on Select Customer to Add Task dropdown
		
		t.getSelectCustomerAddTask().click();
		
//Select Our Company From DropDown		
		
		t.getOurCompany().click();
		
		Thread.sleep(2000);
		
//Click On Select Project to Add Task dropdown
		
		t.getSelectCustomerDropdown().click();
		
		
//Select Accounting from DropDown
		
		t.getOptionAccounting().click();
		
		
//Select Task Name Textfield
		
		t.getEnterTaskName().sendKeys(taskname);
		
//Click on Create Task Button
		 
		t.getCreateTaskButton().click();
		
		WebDriverWait wait1=new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
	
//get Actual task name
		try {	
	String actualText=t.getActualCustomerCreated().getText();
	Assert.assertEquals(actualText, taskname);
	}
	catch(Exception e) {
		
	}
		
	}
}
