package Selenium_Java_Automation.Selenium_Java_Automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggesionsDropDowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		Thread.sleep(1000);
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='sa_sg']//span"));
		System.out.println(list.size());
		
		ArrayList<String> list1=new ArrayList<String>();
		
		for(WebElement x:list)
		{
			list1.add(x.getText());
			if(x.getText().contains("ide"))
			{
				x.click();
				break;
			}
		}
		
		System.out.println(list1);
		driver.quit();
	}

}
