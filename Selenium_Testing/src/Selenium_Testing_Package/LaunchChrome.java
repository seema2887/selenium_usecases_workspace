package Selenium_Testing_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      WebDriver driver = new ChromeDriver();
	      System.setProperty("webdriver.chrome.driver",
	      "/usr/local/bin/chromedriver");
	      String url = " https://www.tutorialspoint.com/questions/index.php";
	      driver.get(url);

	}

}
