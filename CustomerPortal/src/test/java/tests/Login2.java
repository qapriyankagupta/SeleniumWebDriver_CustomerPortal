package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.LoginPageObjects;

public class Login2 {
	static WebDriver driver=null;

	@BeforeTest
	public void setupTest() {
		driver=new ChromeDriver();
	}

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
