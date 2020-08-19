package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightBooking {


WebDriver driver;
	
	public FlightBooking(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By secureTrip=By.id("secure-trip");
	By Title=By.id("Adulttitle1");
	By selectTitle=By.xpath("//*[@id='Adulttitle1']/option[3]");
	By firstname=By.id("AdultfirstName1");
	By middlename=By.id("AdultmiddleName1");
	By lastname=By.id("AdultlastName1");
	By email=By.id("email");
	By mobile=By.id("mobile");
	By proceed=By.xpath("//*[@id='travellerForm']/div[2]/button");
	By OkBtn=By.xpath("//*[@id='content']/div/div/div/div[2]/div/div[1]/div[5]/div[1]/div[2]/div/div/div[7]/button");
	By payment=By.id("//*[@id='addonCard']/button/span");
	By paymentMode=By.id("//*[@id='tab_tez']/div[1]/div[2]/span");
	
	public WebElement secureTrip()
	{
		return driver.findElement(secureTrip);
		
	}

	public WebElement Title()
	{
		return driver.findElement(Title);
		
		
	}

	public WebElement selectTitle()
	{
		return driver.findElement(selectTitle);
		
		
	}
	public WebElement FirstName()
	{
		return driver.findElement(firstname);
		
		
	}
	
	public WebElement MiddleName()
	{
		return driver.findElement(middlename);
		
		
	}
	public WebElement LastName()
	{
		return driver.findElement(lastname);
		
		
	}
	public WebElement Email()
	{
		return driver.findElement(email);
		
		
	}

	public WebElement Mobile()
	{
		return driver.findElement(mobile);
		
		
	}
	public WebElement Proceed()
	{
		return driver.findElement(proceed);
		
		
	}
	
	public WebElement Ok()
	{
		return driver.findElement(OkBtn);
		
		
	}
	public WebElement Payment()
	{
		return driver.findElement(payment);
		
		
	}
	
	public WebElement PaymentMode()
	{
		return driver.findElement(paymentMode);
		
		
	}


	
	
}