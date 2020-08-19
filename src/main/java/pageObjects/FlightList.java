package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightList {

WebDriver driver;
	
	public FlightList(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By price=By.id("PRICE");
	By selectFlight=By.id("NAV42#:SG8429SG415radioBtn");
	By book=By.className("fltbook");
	
	public WebElement sortPrice()
	{
		return driver.findElement(price);
		
	}

	public WebElement SelectFlight()
	{
		return driver.findElement(selectFlight);
				
	}
	public WebElement Book()
	{
	    return driver.findElement(book);
				
	}
	
}

