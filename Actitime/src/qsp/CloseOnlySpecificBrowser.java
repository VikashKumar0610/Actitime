package qsp;

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseOnlySpecificBrowser {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
		public static void main(String[] args) {
			 
	  	 Scanner sc=new Scanner(System.in);
	   	 System.out.println("Browser's Name are as follows");
	   	 System.out.println("Sign In | Indeed Accounts");
	   	 System.out.println("Facebook");
	   	 System.out.println("Sign in with Apple ID");
	        System.out.println("Select the browser not to be closed");
	        String browser=sc.next(); 
	        
	// Open the browser
			WebDriver driver=new ChromeDriver();
			
	//Enter the URL
			driver.get("https://secure.indeed.com/");
			
	//Click on "Continue with Apple" button	
			driver.findElement(By.id("apple-signin-button")).click();
			
	//Click on "Continue with Facebook" button	
			driver.findElement(By.id("login-facebook-button")).click();
			
	//get the address of all browser		
	         Set<String> AllWh = driver.getWindowHandles();
	        
	//   print all the browser title
	         for(String Wh:AllWh)
	         {
	        	 driver.switchTo().window(Wh);
	        	 String title = driver.getTitle();
	        	 
	        	 if(title.contains(browser))
	        	 {
	        		driver.close(); 
	        	 }
	        	 else
	        	 {
	        		
	        	 }
	         }
	        	
	         
		}




	}


