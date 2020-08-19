package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightAvailability {
	
	WebDriver driver;
	
	public FlightAvailability(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By source=By.id("gosuggest_inputSrc");
	By selectSource=By.id("react-autosuggest-1-suggestion--0");
	By dest=By.id("gosuggest_inputDest");
	By selectDest=By.id("react-autosuggest-1-suggestion--0");
	By departDate=By.id("departureCalendar");
	By selectDate=By.id("fare_20200826");
	By returnDate=By.id("returnCalendar");
	By selectRetDate=By.id("fare_20200829");
	By search=By.id("gi_search_btn");
	By addtraveller=By.id("adultPaxPlus");
	
	
	public WebElement Source()
	{
		return driver.findElement(source);
		
	}

	public WebElement selectSource()
	{
		return driver.findElement(selectSource);
		
	}

	public WebElement Destination()
	{
		return driver.findElement(dest);
				
	}
	
	public WebElement selectDestination()
	{
		return driver.findElement(selectDest);
		
	}
	public WebElement Deptdate()
	{
	    return driver.findElement(departDate);
				
	}
	public WebElement Selectdate()
	{
	    return driver.findElement(selectDate);
				
	}
	
	public WebElement ReturnDate()
	{
	    return driver.findElement(returnDate);
				
	}
	
	public WebElement SelectRetDate()
	{
	    return driver.findElement(selectRetDate);
				
	}
	
	public WebElement AddTraveller()
	{
	    return driver.findElement(addtraveller);
				
	}
	
	public WebElement Search()
	{
	    return driver.findElement(search);
				
	}
	
	
}
