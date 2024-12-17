package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	

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
		driver.findElement(By.linkText("Leads")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Create Lead")).click();
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sridhar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Senthilkumar");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");
		
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();

}
}
