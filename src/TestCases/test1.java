package TestCases;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import PageObject.RegisterPage;
import PageObject.commonDriver;
import listener.listenerDemo;

@Listeners(listenerDemo.class)
public class test1 extends commonDriver{

	static ExtentTest test;
	static ExtentReports report;
	
	@Test
	public void login() throws IOException {
		commonDriver c= new commonDriver();
		c.driverInt();
		WebDriver dr= c.url(prop.getProperty("RegisterUrl"));
		RegisterPage r = new RegisterPage(dr);
		report = new ExtentReports("src//ExtentReportResults.html");
		test = report.startTest("Extentdemo");
		Assert.assertTrue(dr.getTitle().equals("Register"));
		if(dr.getTitle().equals("Register"))
		{
			
			test.log(LogStatus.PASS,"Navigate to specifies url");
		}
		else {
			test.log(LogStatus.FAIL, "Test Failed");
		}
		r.login();
        report.endTest(test);
        report.flush();
	
			}

}
