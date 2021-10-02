package Testcases;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import BlazePages.HomePage;

public class TC001 extends HomePage {
	
	// TC001- Search the flights

	@Test()
	public void SearchFlight()
	{
	
		new HomePage()
		
		//select the from port
		.selectfromPort("Boston")
		
		// select the to port 
		.selecttoPort("London");
		
		// click on the find flights button
		//.findFlights();
	}

}
