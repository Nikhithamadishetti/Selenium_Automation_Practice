package Selenium_Java_Automation.Selenium_Java_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBootStrapDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfc.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@class='product-tabs-wrap product-category-wrap']/div")).click();
   
		List<WebElement> dropdowns=driver.findElements(By.xpath("//*[@class='product-tabs-wrap product-category-wrap']/ul/li"));
		selectDropDowns(dropdowns,"Non Housing Loans");
//		for(WebElement x:dropdowns)
//		{
//			if(x.getText().equals("Non Housing Loans"))
//			{
//				x.click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("//*[@class='dropdown-active-item product-name-active']")).click();
		List<WebElement> dropdown1=driver.findElements(By.xpath("//*[@class='product-tab-list product-name-list dropdown-active']/li[2]"));
		selectDropDowns(dropdown1,"Loan Against Property");
//		for(WebElement x1:dropdown1)
//		{
//			if(x1.getText().equals("Loan Against Property"))
//			{
//				x1.click();
//				break;
//			}
//		}
		Thread.sleep(3000);
		driver.quit();
		
	}
	
	public static void selectDropDowns(List<WebElement> ele,String value)
	{
		for(WebElement x1:ele)
		{
			if(x1.getText().equals(value))
			{
				x1.click();
				break;
			}
		}
	}

}
