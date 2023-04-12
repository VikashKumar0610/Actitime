package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckHeightWidth {
static {
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com");
		WebElement user = driver.findElement(By.id("username"));
	int h1 = user.getSize().getHeight();
	int w1 = user.getSize().getWidth();
	WebElement pass = driver.findElement(By.name("pwd"));
               int h2 = pass.getSize().getHeight();
               int w2=pass.getSize().getWidth();
               if(h1==h2 && w1==w2)
               {
   System.out.println("Height And Width Of Username & Password are equal and Pass");
               }
               else {
            	   System.out.println("Height And Width Of Username & Password are not equal and FAil"); 
               }
               driver.close();
	}
	
}
