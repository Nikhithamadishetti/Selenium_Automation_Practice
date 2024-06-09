package Selenium_Java_Automation.Selenium_Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoCompleteDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/maps/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement textbox=driver.findElement(By.id("searchboxinput"));
		textbox.sendKeys("warangal");
		Thread.sleep(3000);
		
		String text;	
		
		do {
			textbox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			text=textbox.getAttribute("value");
			Thread.sleep(3000);
			if(text.equalsIgnoreCase("Warangal Railway Station")) 
			{
				textbox.sendKeys(Keys.ENTER);
				break;
			}
			
		}
		while(!text.isEmpty());
		Thread.sleep(3000);
		driver.quit();
	}

}
