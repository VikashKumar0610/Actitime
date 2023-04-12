package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {
		
		//open the browser
		WebDriver driver=new ChromeDriver();
		
		//Enter the URL
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		//click on Alert with Ok and Cancel button
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		
		//click on confirm box button to get popup
		driver.findElement(By.xpath("//div/button[text()='click the button to display a confirm box ']")).click();
		
		//click on cancel button
		driver.switchTo().alert().dismiss();
		
		//verify the text "you pressed cancel" is displayed or not
		boolean popup = driver.findElement(By.id("demo")).isDisplayed();
		if(popup)
			System.out.println("Yes it is displaying and pass");
		else
			System.out.println("No it is not displaying and fail");
		
		driver.close();
		
	}

}
