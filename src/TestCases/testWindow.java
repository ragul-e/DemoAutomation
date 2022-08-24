package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


import PageObject.WindowsPage;
import PageObject.commonDriver;

public class testWindow  extends commonDriver{

	@Test
	public void window() throws IOException, InterruptedException {
		commonDriver c = new commonDriver();
		c.driverInt();
		WebDriver dr= c.url(prop.getProperty("windowsUrl"));
		WindowsPage w = new WindowsPage(dr);
		w.Windows();
}
}
