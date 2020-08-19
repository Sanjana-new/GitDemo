package Goibibo.FlightReservation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import pageObjects.FlightAvailability;
import pageObjects.FlightBooking;
import pageObjects.FlightList;

public class Reservation {
	
	@Test
	 public void BookFlight() 
	    {
		  System.setProperty("webdriver.chrome.driver","D:\\AutomationJava\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			driver.get("https://www.goibibo.com/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			driver.manage().window().maximize();
			FlightAvailability flight=new FlightAvailability(driver);
			flight.Source().click();
			flight.Source().sendKeys("Delhi");
			flight.selectSource().click();
			flight.Destination().click();
			flight.Destination().sendKeys("Mumbai");
			flight.selectDestination().click();
			flight.Deptdate().click();		
			flight.Selectdate().click();
			flight.ReturnDate().click();
			flight.SelectRetDate().click();
			flight.Search().click();
			
			
			FlightList flist=new FlightList(driver);
			flist.sortPrice().click();
			//flist.SelectFlight().click();
			flist.Book().click();
			
			FlightBooking fbook= new FlightBooking(driver);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(1500,2300)");
			fbook.secureTrip().click();
			fbook.Title().click();
			fbook.selectTitle().click();
			fbook.FirstName().sendKeys("Sanjana");
	        fbook.MiddleName().sendKeys("Rakesh");
	        fbook.LastName().sendKeys("Dwivedi");
	        fbook.Email().sendKeys("sanjanadwivedi1051@gmail.com");
	        fbook.Mobile().sendKeys("09949885858");
	        fbook.Proceed().click();
	        fbook.Ok().click();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        fbook.Payment().click();
	        fbook.PaymentMode().click();
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			driver.close();

	    }
}
