package PageObject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class commonDriver {

	private WebDriver dr;
	FileInputStream file;
	public static Properties prop;
	
	public void driverInt() throws IOException {
		prop = new Properties();
	    file = new FileInputStream("D:\\ragul\\DemoAutomation\\src\\resources\\input.properties");
        prop.load(file);
        //context.setAttribute("webdriver.edge.driver", "Driver\\edgedriver.exe");
	System.setProperty("webdriver.edge.driver", "Driver\\edgedriver.exe");
		dr = new EdgeDriver();
	}
	public WebDriver url(String url) {
		dr.get(url);
		return dr;
		
	}


}
