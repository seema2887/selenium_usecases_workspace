package Selenium_cases_package;


import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

		   public static void main(String[] args) throws InterruptedException {
		       WebDriver driver=new ChromeDriver();
		       System.setProperty("webdriver.chrome.driver",
		    		      "/Users/sneha/Documents/selenium-2023/chromedriver_mac64/chromedriver");
		       driver.manage().window().maximize();
		       driver.get("https://facebook.com/");
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		       //driver.quit();

	}

}





