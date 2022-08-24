package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RegisterPage extends commonDriver{
	
	WebDriver dr;
	
	public RegisterPage(WebDriver dr) 
	{
		this.dr = dr;
		}
	@Test
	public void locateCssSelector(String cssSel,String Cssvalue) {
		dr.findElement(By.cssSelector(cssSel)).sendKeys(Cssvalue);   
	}
	@Test
	public void locateXpath(String xpath,String Xvalue) {
		dr.findElement(By.xpath(xpath)).sendKeys(Xvalue);   
	}
	
	@Test
	public void locateXpath(String path) {
		dr.findElement(By.xpath(path));   
	}
	
	
	@Test
	public void login() {
		
		//name
		locateCssSelector(prop.getProperty("fnameLocator"),prop.getProperty("fnameVal"));
		locateXpath(prop.getProperty("snameLocator"),prop.getProperty("lnameVal"));
		
		//address
		locateXpath(prop.getProperty("Address"),prop.getProperty("AddressVal"));
		
		//email
		locateXpath(prop.getProperty("emaillocator"),prop.getProperty("emailVal"));
		
		//phone
		locateXpath(prop.getProperty("phoneLocator"),prop.getProperty("PhoneVal"));
		
		
		//Gender
		dr.findElement(By.xpath(prop.getProperty("genderLocator"))).click();
		
        //hobbies
		WebElement Hobbies = dr.findElement(By.id(prop.getProperty("hobbiesLocator")));
		Hobbies.click();
		
		//year
		Select yr = new Select(dr.findElement(By.id(prop.getProperty("yearlocator"))));
		yr.selectByVisibleText(prop.getProperty("yearVal"));
		
		//month
		Select mon = new Select(dr.findElement(By.xpath(prop.getProperty("monthLocator"))));
		mon.selectByVisibleText(prop.getProperty("monthVal"));
		
		//Day
		Select day = new Select(dr.findElement(By.id(prop.getProperty("DateLocator"))));
		day.selectByVisibleText(prop.getProperty("DateVal"));
		
		//Password
		WebElement pass = dr.findElement(By.id(prop.getProperty("passwordLocator")));
		pass.sendKeys(prop.getProperty("passval"));
		
		//confirmPassword
		WebElement pass2 = dr.findElement(By.id(prop.getProperty("conPasslocator")));
		pass2.sendKeys(prop.getProperty("conPassVal"));
		
		//skills
		Select skills = new Select(dr.findElement(By.id(prop.getProperty("SkillsLocator"))));
		skills.selectByVisibleText(prop.getProperty("SkillsVal"));
		
		
		//Scountry
		Select con = new Select(dr.findElement(By.id(prop.getProperty("country"))));
		con.selectByVisibleText(prop.getProperty("countryVal"));
		
	}


	
	@Test
	public void Scountry() {
		Select con = new Select(dr.findElement(By.id(prop.getProperty("country"))));
		con.selectByVisibleText(prop.getProperty("countryVal"));
	}
	
	/*public void selectLan() {
		WebElement lan = dr.findElement(By.tagName("multi-select"));
		lan.click();
		List<WebElement> Sellan =dr.findElements(By.xpath("//div[@style='display:block;']/ul/li"));
		System.out.println(Sellan.get(0).getText());
		Sellan.get(3).click();
	}*/

}
