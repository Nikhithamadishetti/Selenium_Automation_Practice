package Selenium_Java_Automation.Selenium_Java_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		/*
		WebElement ele=driver.findElement(By.name("DateOfBirthDay"));;
        Select sc=new Select(ele);
        //1
        sc.selectByVisibleText("1");
            
        WebElement ele1=driver.findElement(By.name("DateOfBirthMonth"));
        Select sc1=new Select(ele1);
        //2
        sc1.selectByIndex(4);
        
        WebElement ele2=driver.findElement(By.name("DateOfBirthYear"));
        Select sc2=new Select(ele2);
        //3
        sc2.selectByValue("1914");
        
        //4
        WebElement ele3=driver.findElement(By.name("DateOfBirthDay"));
        Select sc3=new Select(ele3);
        List<WebElement> alloptions=sc3.getOptions();
        System.out.println(alloptions.size());
        for(WebElement x:alloptions) 
        {
        	if(x.getText().equals("1")) 
        	{
        		x.click();
        		break;
        	}
        }*/
        
        //5
        WebElement DateOfBirthDay=driver.findElement(By.name("DateOfBirthDay"));
        selectOptionsFromDropDown(DateOfBirthDay,"30");
        
        WebElement DateOfBirthMonth=driver.findElement(By.name("DateOfBirthMonth"));
        selectOptionsFromDropDown(DateOfBirthMonth,"August");
        
        WebElement DateOfBirthYear=driver.findElement(By.name("DateOfBirthYear"));
        selectOptionsFromDropDown(DateOfBirthYear,"2000");
        
        
        driver.quit();
	}
	
	public static void selectOptionsFromDropDown(WebElement ele,String value)
	{
		Select se=new Select(ele);
		List<WebElement> list=se.getOptions();
	    for(WebElement x:list)
	    {
	    	if(x.getText().equals(value))
	    		{
	    	      x.click();
	    	      break;
	    		}
	    }
	}

}
