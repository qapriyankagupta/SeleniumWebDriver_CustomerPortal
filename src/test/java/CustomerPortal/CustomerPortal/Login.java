package CustomerPortal.CustomerPortal;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().browserVersion("133").setup();
		WebDriverManager.chromedriver().setup();

		WebDriver driver=new ChromeDriver();
		
		try {
		    driver.get("https://customerportal.birdzi.com/en/web/guest/home");
		    driver.manage().window().maximize();
		    Thread.sleep(2000);
		   		    
		    WebElement username=driver.findElement(By.id("_58_login"));
		    username.sendKeys("pgupta+coborns@birdzi.com");
		    
		    WebElement password=driver.findElement(By.id("_58_password"));
		    password.sendKeys("Shiv123!@#");
		    password.sendKeys(Keys.RETURN);   
		    
		    WebElement offersElement = driver.findElement(By.xpath("//span[text()='Offers']"));

		 // Check if the element is found and interact with it
		 if (offersElement != null) {
		     System.out.println("Found 'Offers' element.");
		 } else {
		     System.out.println("'Offers' element not found.");
		 }
		    
		    Thread.sleep(2000);  

		    
		} catch (InterruptedException e) {
		    System.out.println("Thread was interrupted while waiting.");
		    e.printStackTrace();
		}

		driver.close();
		driver.quit();
	}

}
