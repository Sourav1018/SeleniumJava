package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * WebDriver is an interface in selenium library which having 11 methods.
 * WebDriver is used in selenium for control the browser.
 * 
 * here we are calling ChromeDriver class which instantiate the browser for us.
 * 
 * in selenium hierarchy =>
 * ChromeDriver extends from RemoteWebDriver class which contains all the Driver class of Browsers and it's implements the WebDriver interface.
 * 
 * ChromeDriver calls the Browser specific API (eg. for chrome browser it is chromedriver.exe).
 * its directly communicate with the Browser specific API.
 * ChromeDriver also present in selenium library.
 */
public class UsageOfWebDriver {
	public static void main(String[] args) {
		//instantiate the browser 
		WebDriver driver = new ChromeDriver();
	}
}
