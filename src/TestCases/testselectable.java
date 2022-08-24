package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import PageObject.Selectablepage;
import PageObject.commonDriver;

public class testselectable extends commonDriver {
	
	@Test
   public void selectable() throws IOException {
	   commonDriver c= new commonDriver();
	   c.driverInt();
	   WebDriver dr= c.url(prop.getProperty("SelectableUrl"));
	   Selectablepage s  = new Selectablepage(dr);
	   s.selectable();
   }
}
