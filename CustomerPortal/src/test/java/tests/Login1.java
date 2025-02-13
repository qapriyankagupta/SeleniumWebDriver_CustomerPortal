package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;

import Pages.LoginPageObjects;

public class Login1 {
	static WebDriver driver=null;

	@BeforeSuite
	public void setupTest() {
		driver=new ChromeDriver();

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Extent.html");
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(html);

	}

	@Test
	public void loginPageTestCase() {	    
	    LoginPageObjects LoginPageObj=new LoginPageObjects(driver);
	    
	    driver.get("https://customerportal.birdzi.com/en/web/guest/home");
	    driver.manage().window().maximize();
	    
	    LoginPageObj.setEmail("pgupta+coborns@birdzi.com");
	    LoginPageObj.setPassword("Shiv123!@#");
	    LoginPageObj.ClickSignIn();
	    LoginPageObj.verifyOffers();
	 }
	
	@AfterTest
	public void tearDownTest() {
	    driver.close();
	    driver.quit();
	    System.out.println("Login completed successfully"); 
	}
}
