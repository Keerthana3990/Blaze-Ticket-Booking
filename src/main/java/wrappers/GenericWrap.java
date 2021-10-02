package wrappers;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import utils.Reporting;

public class GenericWrap extends Reporting implements Wrappers {
	
	public RemoteWebDriver driver;

	
	public GenericWrap()
	
	
{
	

	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://blazedemo.com/");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
}

	
	

	
		
	public void selectVisibileTextByXPath(String Xpath, String value) {
		// TODO Auto-generated method stub
		try {
			WebElement element2=driver.findElementByXPath(Xpath);
			Select element3=new Select(element2);
			element3.selectByVisibleText(value);
			//System.out.println("The element with Xpathvalue"+Xpath+"is selecting the text"+value);
			reportStep("The element with Xpathvalue"+Xpath+"is selecting the text"+value, "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpathvalue"+Xpath+"is not available in the DOM");
			reportStep("The element with Xpathvalue"+Xpath+"is not available in the DOM", "Fail");
		}catch(ElementNotVisibleException e){
			//System.err.println("The element with Xpathvalue"+Xpath+"is not visible in the appication");
			reportStep("The element with Xpathvalue"+Xpath+"is not visible in the appication", "Fail");
		}catch(ElementNotInteractableException e){
			//System.err.println("The element with the Xpathvalue"+Xpath+"is not interactable");
			reportStep("The element with the Xpathvalue"+Xpath+"is not interactable", "Fail");
		}catch(StaleElementReferenceException e){
			//System.err.println("The element with the Xpathvalue"+Xpath+"is not stable in the application");
			reportStep("The element with the Xpathvalue"+Xpath+"is not stable in the application", "Fail");
		}catch(WebDriverException e){
			System.err.println("The element with Xpathvalue"+Xpath+ "is not selecting the text due to unknown error");
			reportStep("The element with Xpathvalue"+Xpath+ "is not selecting the text due to unknown error", "Fail");
		}
	}
	
	public void clickByXpath(String xpathVal) {
		// TODO Auto-generated method stub
		try {
			driver.findElementByXPath(xpathVal).click();
			//System.out.println("The element with Xpathvalue"+xpathVal+"is clicking the button");
		reportStep("The element with Xpathvalue"+xpathVal+"is clicking the button", "Pass");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//System.err.println("The element with Xpathvalue"+xpathVal+"is not available in the DOM");
		reportStep("The element with Xpathvalue"+xpathVal+"is not available in the DOM", "Fail");
		}catch(ElementNotVisibleException e){
			//System.err.println("The element with Xpathvalue"+xpathVal+"is not visible in the appication");
		reportStep("The element with Xpathvalue"+xpathVal+"is not visible in the appication", "Fail");
		}catch(ElementNotInteractableException e){
			//System.err.println("The element with the Xpathvalue"+xpathVal+"is not interactable");
			reportStep("The element with the Xpathvalue"+xpathVal+"is not interactable", "Fail");
		}catch(StaleElementReferenceException e){
			//System.err.println("The element with the Xpathvalue"+xpathVal+"is not stable in the application");
		reportStep("The element with the Xpathvalue"+xpathVal+"is not stable in the application", "Fail");
		}catch(WebDriverException e){
			//System.err.println("The element with Xpathvalue"+xpathVal+"is ot clicking the button due to unknown error");
		reportStep("The element with Xpathvalue"+xpathVal+"is ot clicking the button due to unknown error", "Fail");
		}
	}
	
	
	


}
