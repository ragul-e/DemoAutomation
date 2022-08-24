package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FramesPage extends commonDriver{
	
	WebDriver dr;
	
	public FramesPage(WebDriver dr) {
		this.dr=dr;
	}
	
	@Test
	public void locateXpath(String xpath,String Xvalue) {
		dr.findElement(By.xpath(xpath)).sendKeys(Xvalue);   
	}
	
	 @Test
	  public void Frames() {
		    
		 //First Frame
	    	dr.switchTo().frame(dr.findElement(By.id("singleframe")));
	    	locateXpath(prop.getProperty("locateFInput1"),prop.getProperty("FInput1"));
		
		 //onclickframebtn
	    	dr.switchTo().parentFrame();
			WebElement button= dr.findElement(By.cssSelector("a[href='#Multiple']"));
			button.click();
		 
		 //switchFrameTwo
	    	dr.switchTo().frame( dr.findElement(By.cssSelector("iframe[src='MultipleFrames.html']")));
			dr.switchTo().frame(dr.findElement(By.cssSelector("iframe[src='SingleFrame.html']")));
			locateXpath(prop.getProperty("locateFInput2"),prop.getProperty("Finput2"));
	   
	 }

}
