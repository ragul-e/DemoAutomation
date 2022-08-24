package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageObject.AlertPage;
import PageObject.RegisterPage;
import PageObject.commonDriver;

public class testAlert extends commonDriver {


	//static ExtentTest test;
	//static ExtentReports report;
	
	@Test
	public void alert() throws IOException, InterruptedException {
		commonDriver c = new commonDriver();
		c.driverInt();
		WebDriver dr= c.url(prop.getProperty("AlertUrl"));
		AlertPage a = new AlertPage(dr);
		//report = new ExtentReports("src//AlertExtentReportResults.html");
		//test = report.startTest("Extentdemo");
		//Assert.assertTrue(dr.getTitle().equals("Register"));
		/*if(dr.getTitle().equals("Register"))
		{
			
			test.log(LogStatus.PASS,"Navigate to specifies url");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		a.firstAlert();
		
        report.endTest(test);
        report.flush();*/
		
		a.firstAlert();
	
			}



}
