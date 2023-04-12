package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//Enter the URL
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		//click on "click the button to display the alert box" 
		driver.findElement(By.xpath("//button[(@class='btn btn-danger')]")).click();
		Thread.sleep(5000);
		//Handling the alert popup
		Alert popup = driver.switchTo().alert();
		String alertmessage = popup.getText();
		System.out.println(alertmessage);
		popup.accept();
		
		driver.close();
		
}
}