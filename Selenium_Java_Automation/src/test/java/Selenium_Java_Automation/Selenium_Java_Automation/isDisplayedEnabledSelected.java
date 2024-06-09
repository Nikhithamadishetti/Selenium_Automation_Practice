package Selenium_Java_Automation.Selenium_Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayedEnabledSelected {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.manage().window().maximize();
		
		//isDisplayed() isEnabled()  can verify for all types of web elemeths

		boolean displayed=driver.findElement(By.xpath("//*[@id='FirstName']")).isDisplayed();
		if(displayed)
		{
			System.out.println("Element is displayed");
		}
		

		boolean enabled=driver.findElement(By.xpath("//*[@id='FirstName']")).isEnabled();
		if(enabled)
		{
			System.out.println("Element is enabled");
		}
		
		//isSelected() is specifically used for Radio btns, checkboxes and Dropdowns
	
		WebElement Radiobtn=driver.findElement(By.xpath("//*[@id='gender-female']"));
		Radiobtn.click();
		if(Radiobtn.isSelected())
		{
			System.out.println("Element is selected");
		}
		
		driver.quit();
	}

}