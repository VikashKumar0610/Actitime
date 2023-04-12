package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FontSizeType {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		//open the browser
	WebDriver driver=new ChromeDriver();
	
	//go to facebook.com
	driver.get("https://www.facebook.com");
	
//go to forgotten password link
	WebElement forgetpwd = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
	
	//printing the font size of forgotten password
	System.out.println(forgetpwd.getCssValue("font-size"));
	
	//printing the font type for forgotten password
	System.out.println(forgetpwd.getCssValue("font-family"));
	
	//close the browser
	driver.close();
	}

}
