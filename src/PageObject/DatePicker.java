package PageObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DatePicker extends commonDriver {
WebDriver dr;
	
	public DatePicker(WebDriver dr) 
	{
		this.dr = dr;
		}

	@Test
	public  void Datepic() throws ParseException {
		System.setProperty("webdriver.edge.driver", "Driver\\edgedriver.exe");
		WebDriver dr = new EdgeDriver();
		dr.manage().window().setPosition(new Point(100, 100));
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		dr.get("http://demo.automationtesting.in/Datepicker.html");
	    
		dr.findElement(By.xpath("//img[@class='imgdp']")).click();
		String str = "04/12/2020";
		
		String[] arr = str.split("/");
		
		boolean flag = true;
		
		while(flag)
		{
		WebElement uiYr = dr.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
		if(Integer.parseInt(arr[2])==Integer.parseInt(uiYr.getText()))
		{
		 System.out.println("year matched");
		 flag = false;
		 boolean flag1=true;
		 
		 while(flag1)
		 {
		 WebElement uiMn = dr.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
		 SimpleDateFormat inputFormat = new SimpleDateFormat("MMMM");
		 Calendar cal = Calendar.getInstance();
		 cal.setTime(inputFormat.parse(uiMn.getText()));
		 SimpleDateFormat outputFormat =new SimpleDateFormat("MM");
		 String noMn = outputFormat.format(cal.getTime());
		 if(Integer.parseInt(arr[1])==Integer.parseInt(noMn))
		 {
			 System.out.println("month matched");
			 flag1=false;
			 List<WebElement> rows = dr.findElements(By.xpath("//tbody/tr"));
			 for(WebElement row: rows)
			 {
				 List<WebElement> cols = row.findElements(By.xpath("//td/a"));
				 for(WebElement cell:cols)
				 {
			     if(cell.getText().equals(""))
			     {
				 if(Integer.parseInt(cell.getText())==Integer.parseInt(arr[0]))
				 {
					cell.click(); 
					break;
				 }
				 }
				 }
			 }
		 }
		 else if(Integer.parseInt(arr[1])>Integer.parseInt(noMn))
			{
				dr.findElement(By.linkText("Next")).click();
			}
	     else if(Integer.parseInt(arr[1])<Integer.parseInt(noMn))
			{
				dr.findElement(By.linkText("Prev")).click();
			}
		 }
		}
		else if(Integer.parseInt(arr[2])>Integer.parseInt(uiYr.getText()))
		{
			dr.findElement(By.linkText("Next")).click();
		}
		else if(Integer.parseInt(arr[2])<Integer.parseInt(uiYr.getText()))
		{
			dr.findElement(By.linkText("Prev")).click();
		}
		}
		
		
       
	}


}
