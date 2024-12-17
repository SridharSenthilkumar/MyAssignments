package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CreateAccount {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub// Launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// load the application url
		driver.get("http://leaftaps.com/opentaps/");
		// locate the username field
		WebElement usernameField = driver.findElement(By.id("username"));
		// enter the input as demosalesmanager for usernameField
		usernameField.sendKeys("demosalesmanager");
		// locate the password field and enter the password as crmsfa
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//locate the login button and click
		driver.findElement(By.className("decorativeSubmit")).click();
		//to get the title of the webpage -> getTitle() and returnType as string
		String title = driver.getTitle();
		System.out.println("Title is "+title);
		//locate the CRM/SFA link and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Accounts")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Create Account")).click();
		System.out.println(driver.getTitle());
		
		
		driver.findElement(By.id("accountName")).sendKeys("Sridhar");
		
		WebElement Description = driver.findElement(By.name("description"));
		
		Description.sendKeys("Selenium Automation Tester.");
		
		driver.findElement(By.id("numberEmployees")).sendKeys("1");
	
		
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		
		driver.close();
		

	}

}
