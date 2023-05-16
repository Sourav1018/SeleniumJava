package webDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * void get(String URL) ==>
 * 
 * it is a method which is present inside the WebDriver interface.
 * it is a parameterize method which take String as an argument.
 * it's return type is void.
 * we pass the URL to it , which afterwards pass that URL to browser search bar.
 * and generate a request to the server , after getting respond it will stop its work.
 * 
 * that means while still loading the page from the server get() executed still.
 * while browser finish its loading of that page then get() also stops.
 * 
 * at the runtime if we having any statement after the get() , that will wait until get() method finish it's execution.
 */
public class UsageOfGet {
	public static void main(String[] args) {
		//instantiate the browser 
		WebDriver driver = new ChromeDriver();
		//passing the URL , trigger the URL
		driver.get("https://www.facebook.com/");	
	}
}
