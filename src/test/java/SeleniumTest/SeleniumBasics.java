package SeleniumTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasics {
	
	WebDriver driver;

	@Test
	public void Starting() {
		    driver = new ChromeDriver();

	        try {
	            // Open a website
	            driver.get("https://www.google.com");

	            // Print the title of the page
	            String pageTitle = driver.getTitle();
	            System.out.println("Page Title: " + pageTitle);

	            // Verify if Selenium is working by checking the page title
	            if (pageTitle.contains("Google")) {
	                System.out.println("Selenium is working correctly!");
	            } else {
	                System.out.println("Selenium setup might have an issue.");
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
}
