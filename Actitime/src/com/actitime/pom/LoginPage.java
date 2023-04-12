package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//Username TextBox

public class LoginPage {
@FindBy(id="username")
private WebElement untbx;

//Password TextBox

@FindBy(name="pwd")
private WebElement pwtbx;

//Login Button

@FindBy(xpath="//div[.='Login ']")
private WebElement lgBtn;


public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

//Setters method for login
public void setLogin(String un, String pw) {
	untbx.sendKeys(un);
	pwtbx.sendKeys(pw);
	lgBtn.click();
}
}
