package TestCases;

import java.io.IOException;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.DatePicker;
import PageObject.WindowsPage;
import PageObject.commonDriver;

public class testDatePick extends commonDriver {
	
	@Test
	public void Datespick() throws IOException, InterruptedException, ParseException {
		commonDriver c= new commonDriver();
		c.driverInt();
		WebDriver dr= c.url(prop.getProperty("DatepickUrl"));
		DatePicker d = new DatePicker(dr);
		d.Datepic();
	}


}
