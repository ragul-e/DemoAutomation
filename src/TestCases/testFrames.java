package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.AlertPage;
import PageObject.FramesPage;
import PageObject.commonDriver;

public class testFrames extends commonDriver {
	
	@Test
	public void frames() throws IOException, InterruptedException {
		commonDriver c = new commonDriver();
		c.driverInt();
		WebDriver dr= c.url(prop.getProperty("frames"));
	    FramesPage f = new FramesPage(dr);
	    f.Frames();

}
}
