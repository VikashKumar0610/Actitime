package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class CustomerModuleGroup {
@Test(groups= {"smokeTesting","regressionTesting"})
public void createCustomer(){
	Reporter.log("Create Customer",true);
}
@Test(groups= "regressionTesting")
public void modifyCustomer() {
	Reporter.log("Modify Customer",true);
}
@Test(groups="regressionTesting")
public void deleteCustomer() {
	Reporter.log("Delete Customer",true);
}
}
