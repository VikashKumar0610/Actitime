package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class TaskModuleGroup  {
@Test(groups= {"smokeTesting","regressionTesting"})
public void createTask() {
	Reporter.log("Create Task",true);
}
@Test(groups="regressionTesting")
public void modifyCustomer() {
	Reporter.log("Modify Task",true);
}
@Test(groups="regressionTesting")
public void deleteCustomer() {
	Reporter.log("Delete Task",true);
}
}
