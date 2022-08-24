package PageObject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WindowsPage extends commonDriver {
WebDriver dr;
	
	public WindowsPage(WebDriver dr) 
	{
		this.dr = dr;
		}
	@Test
	public void locateXpath(String path) {
		dr.findElement(By.xpath(path));   
	}
	
	@Test
	public void Windows() {
		
		//firstWindow
		dr.findElement(By.xpath("//a[@href='#Tabbed']")).click();
		dr.findElement(By.xpath(prop.getProperty("firstWindowbtn"))).click();
		String name1 = dr.getWindowHandle();
		System.out.println("FirstWindow:"+name1);
	
	    //secondWindow
		dr.findElement(By.linkText("Open New Seperate Windows")).click();
		dr.findElement(By.xpath(prop.getProperty("secondWindowbtn"))).click();
	    String name2 = dr.getWindowHandle();
	    System.out.println("SecondWindow:"+name2);
	
        //thirdWindow
		dr.findElement(By.linkText("Open Seperate Multiple Windows")).click();
		dr.findElement(By.xpath(prop.getProperty("thirdwindowbtn"))).click();
		
		String parent = dr.getWindowHandle();
		System.out.println(parent);
		
		Set<String> windows = dr.getWindowHandles();
		System.out.println(windows);
		
		Iterator<String> it = windows.iterator();
		System.out.println(dr.getTitle());
		while(it.hasNext()) {
		  
			String child= it.next();
			if(!parent.equals(child)) {
			  dr.switchTo().window(child);
			  System.out.println(dr.getTitle());
			  dr.close();
			}
		}
	}
}
