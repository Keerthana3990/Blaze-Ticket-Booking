package utils;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public abstract class Reporting {

	
	public static ExtentReports report;
	
	public ExtentTest test;
	
	
	public String testcaseName;
	
	public String testcaseDescription;
	
	public String Author;
	
	public String Category;
	
	
	public void startReport() {
		
		 report=new ExtentReports("./Reports/result.html");
		
	}
	public void startTestcase(String testName,String description ) {
		
		 test=report.startTest(testName, description);
		 test.assignAuthor(Author);
		 test.assignCategory(Category);
	
	}
	public void  reportStep(String details,String status ) {
		
		long number = takeSnap();
		
		if(status.equalsIgnoreCase("Pass")){
			test.log(LogStatus.PASS, details+test.addScreenCapture("../screesnshots/snap"+number+".png"));
		}else if(status.equalsIgnoreCase("Fail")){
			test.log(LogStatus.FAIL, details);
			
		}else if(status.equalsIgnoreCase("Info")){
			test.log(LogStatus.INFO, details);
		
		}else if(status.equalsIgnoreCase("Warning")){
			test.log(LogStatus.WARNING, details);
			
		}
		
		
		}
	
	
	public void reportStep(String details, String status, boolean flag){
		
		
		if(flag){
			
			if(status.equalsIgnoreCase("pass")){
				test.log(LogStatus.PASS, details);
			}else if(status.equalsIgnoreCase("fail")){
				test.log(LogStatus.FAIL, details);
			}
			
		}
		
		
		
	}
	
	public abstract long takeSnap();
	
	
	public void endTest() {
		report.endTest(test);
		
	}
	public void endReport() {
		report.flush();
		
	}
	
}
