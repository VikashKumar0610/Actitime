package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClassEx1 {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
WebDriver driver;
@BeforeClass
public void openBrowser() {
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@AfterClass
public void closeBrowser() {
	driver.close();
}
@BeforeMethod
public void login() throws IOException {
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
	p.load(fis);
	String url=p.getProperty("url");
	String un=p.getProperty("username");
	String pw=p.getProperty("password");
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);	
	driver.findElement(By.name("pwd")).sendKeys(pw);
	driver.findElement(By.xpath("//div[.='Login ']")).click();
}
@AfterMethod
public void logout() {
	driver.findElement(By.id("logoutLink")).click();
}
}
