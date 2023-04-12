package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTripFlightAndDate {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.cleartrip.com/");
driver.navigate().refresh();
	}

}
