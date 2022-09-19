package Pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Dipesh\\Velocity\\software\\selenium\\chromedriver 103\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        

	}

}
