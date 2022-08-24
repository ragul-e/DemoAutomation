package PageObject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AlertPage extends commonDriver{

	WebDriver dr;
	
	
	public AlertPage(WebDriver dr) {
		this.dr=dr;
	}
	
	@Test
	public void locateXpath(String xpath) {
		dr.findElement(By.xpath(xpath));   
	}
	
	
	@Test
	public void firstAlert() throws InterruptedException {

			dr.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
			Alert alert = dr.switchTo().alert();
			System.out.println(alert.getText());
			Thread.sleep(1000);
			alert.accept();
			
			dr.findElement(By.linkText("Alert with OK & Cancel")).click();
			dr.findElement(By.xpath(prop.getProperty("AlertCancel"))).click();
			Alert alert1 = dr.switchTo().alert();
			System.out.println(alert1.getText());
			Thread.sleep(1000);
			alert1.dismiss();
			
			dr.findElement(By.linkText("Alert with Textbox")).click();
			dr.findElement(By.xpath(prop.getProperty("AlertText"))).click();
			Alert alert2 = dr.switchTo().alert();
			alert2.sendKeys("buddyy");
			Thread.sleep(2000);
			alert2.accept();
			
		}
	
}
