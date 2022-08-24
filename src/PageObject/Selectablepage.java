package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Selectablepage extends commonDriver{
	WebDriver dr;
     
	public Selectablepage(WebDriver dr) {
		this.dr=dr;
	}
	
	@Test
	public void selectable() {
		List<WebElement> selectable = dr.findElements(By.xpath("//div[@id='Default']//ul//b"));
		int size = selectable.size();
		System.out.println(size);
		Actions action = new Actions(dr);
        action.keyDown(Keys.CONTROL)
        .click(selectable.get(0))
        .click(selectable.get(1))
        .click(selectable.get(2))
        .build().perform();			
	}
	
}
