package BlazePages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.GenericWrap;

public class HomePage extends GenericWrap {
	


	public HomePage selectfromPort(String data)
	{
		
		selectVisibileTextByXPath("//select[@name='fromPort']",data);
		return this;
	}
	

	public HomePage selecttoPort(String data)
	{
		selectVisibileTextByXPath("//select[@name='toPort']", data);
		return this;
	}



	public HomePage findFlights(String data)
	{
		clickByXpath("//input[@value='Find Flights']");
		return this;
	}

	

}
