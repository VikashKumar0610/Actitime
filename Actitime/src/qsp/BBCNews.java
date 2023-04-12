package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNews {
	static {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.bbc.com/");
        List<WebElement> news = driver.findElements(By.xpath("(//h2[@class='top-list__heading']/..)[1]"));
        for(WebElement allnews:news)
        	System.out.println(allnews.getText());
        
        driver.close();
	}

}
