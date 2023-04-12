package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList  {

	//ADD NEW Dropdown Button
@FindBy(xpath="//div[text()='Add New']")
private WebElement addNewButton;

  
    //New Customer Button
@FindBy(xpath="//div[text()='+ New Customer']")
private WebElement newCustomerButton;

 

   //Customer Name TextField
@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
private WebElement enterCustomerName;


   //Customer Description TextField
@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
private WebElement enterCustomerDescription;


    //Existing Customer Dropdown
@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
private WebElement customerDropDown;


    //Our Company Option
@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
private WebElement ourCompany;


     //Create Customer Button
@FindBy(xpath="//div[text()='Create Customer']")
private WebElement createCustomerButton;


    //Actual Customer Created
@FindBy(xpath="//div[@class='titleEditButtonContainer']")
private WebElement actualCustomerCreated;


    //New Project Button
@FindBy(xpath="//div[text()='+ New Project']")
private WebElement newProjectButton;


     //Project Name TextField
@FindBy(xpath="//div[@class='sectionDetails']/input")
private WebElement enterProjectName;


   //Select Customer Dropdown 
@FindBy(xpath="//div[text()='-- Please Select Customer to Add Project for  --' and @class='emptySelection']")
private WebElement selectCustomerDropdown;


    //Project Description TextField
@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
private WebElement addProjectDescriptionText;


     //Create Project Button
@FindBy(xpath="//div[text()='Create Project']")
private WebElement createProjectButton;

 

     
    //Actual Project Created Name
@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[@class='title']")
private WebElement actualProjectCreated;



      //New Task Button
@FindBy(xpath="//div[text()='+ New Tasks']")
private WebElement newTaskButton;


     //Select Customer Dropdown to Add Task
@FindBy(xpath="(//div[@class='comboboxButton'])[1]/div[1])")
private WebElement selectCustomerAddTask;


    //Select Project Dropdown to Add Task
@FindBy(xpath="//div[text()='- Select Project -']")
private WebElement selectProjectAddTask;



    //Select Accounting Option
@FindBy(xpath="//div[text()='Accounting' and @class='itemRow cpItemRow ']")
private WebElement optionAccounting;

    //Enter Task Name TextField
@FindBy(xpath="(//td[@class='nameCell first'])[1]")
private WebElement enterTaskName;

  
     //Create Task Button
@FindBy(xpath="//div[text()='Create Tasks']")
private WebElement createTaskButton;


     //Actual Task Created Name
@FindBy (xpath = "//div[@class='taskRowCellWrapper']/div/div/div[@class='title']")
private WebElement actualTaskCreated;



//Initializating TaskList Class
public TaskList(WebDriver driver) {
	PageFactory.initElements(driver, this);
}



public WebElement getAddNewButton() {
	return addNewButton;
}



public WebElement getNewCustomerButton() {
	return newCustomerButton;
}




public WebElement getEnterCustomerName() {
	return enterCustomerName;
}



public WebElement getEnterCustomerDescription() {
	return enterCustomerDescription;
}



public WebElement getCustomerDropDown() {
	return customerDropDown;
}



public WebElement getOurCompany() {
	return ourCompany;
}



public WebElement getCreateCustomerButton() {
	return createCustomerButton;
}



public WebElement getActualCustomerCreated() {
	return actualCustomerCreated;
}



public WebElement getNewProjectButton() {
	return newProjectButton;
}



public WebElement getEnterProjectName() {
	return enterProjectName;
}



public WebElement getSelectCustomerDropdown() {
	return selectCustomerDropdown;
}



public WebElement getAddProjectDescriptionText() {
	return addProjectDescriptionText;
}



public WebElement getCreateProjectButton() {
	return createProjectButton;
}



public WebElement getActualProjectCreated() {
	return actualProjectCreated;
}


public WebElement getNewTaskButton() {
	return newTaskButton;
}

public WebElement getSelectCustomerAddTask() {
	return selectCustomerAddTask;
}



public WebElement getSelectProjectAddTask() {
	return selectProjectAddTask;
}



public WebElement getOptionAccounting() {
	return optionAccounting;
}



public WebElement getEnterTaskName() {
	return enterTaskName;
}



public WebElement getCreateTaskButton() {
	return createTaskButton;
}



public WebElement getActualTaskCreated() {
	return actualTaskCreated;
}


}
