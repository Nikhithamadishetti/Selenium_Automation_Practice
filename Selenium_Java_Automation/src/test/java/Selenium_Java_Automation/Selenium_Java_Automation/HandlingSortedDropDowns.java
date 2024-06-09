package Selenium_Java_Automation.Selenium_Java_Automation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSortedDropDowns {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		WebElement element=driver.findElement(By.name("DateOfBirthMonth"));
		Select sc=new Select(element);
		List<WebElement> options=sc.getOptions();
        
		ArrayList originalList=new ArrayList();
		ArrayList tempList=new ArrayList();
		
		for(WebElement option:options)
		{
			originalList.add(option.getText());
			tempList.add(option.getText());
		}
		
		System.out.println(originalList);
		System.out.println(tempList);
		
		Collections.sort(originalList);
		
		System.out.println(originalList);
		System.out.println(tempList);
		
		if(originalList.equals(tempList))
		{
			System.out.println("sorted");
		}
		else {
			System.out.println("not sorted");
		}
		driver.quit();
	}

}
