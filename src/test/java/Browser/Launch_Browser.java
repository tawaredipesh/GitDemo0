package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Dipesh\\Velocity\\software\\selenium\\chromedriver 103\\chromedriver.exe");  
		 WebDriver driver = new ChromeDriver(); 
		 driver.manage().window().maximize();
         driver.get("https://www.google.co.in/");
	}

}
