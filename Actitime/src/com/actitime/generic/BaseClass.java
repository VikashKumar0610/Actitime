package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

//Code for Opening the Browser

public static WebDriver driver;
@BeforeClass
public void openBrowser()
{
	Reporter.log("OpenBrowser",true);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//Code for Closing the browser

@AfterClass
public void closeBrowser()
{
	Reporter.log("CloseBrowser",true);
	driver.close();
}


//Code for Login into the Software

@BeforeMethod
public void login() throws IOException
{
	Reporter.log("login",true);
	FileLib f=new FileLib();
	String url = f.getPropertyData("url");
	String un=f.getPropertyData("username");
	String pw=f.getPropertyData("password");
	driver.get(url);
	LoginPage l=new LoginPage(driver);
	l.setLogin(un, pw);
}


//Code for Logout from the software

@AfterMethod
public void logout() {
	Reporter.log("Logout",true);
	HomePage h=new HomePage(driver);
	h.setLogout();
	
}
}
