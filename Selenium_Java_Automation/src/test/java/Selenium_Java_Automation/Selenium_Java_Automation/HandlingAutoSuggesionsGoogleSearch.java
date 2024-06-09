package Selenium_Java_Automation.Selenium_Java_Automation;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAutoSuggesionsGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> elements=driver.findElements(By.xpath("//*[@class='G43f7e']/li"));
		System.out.println(elements.size());
		
		ArrayList<String> list=new ArrayList<String>();
		
		for(WebElement x:elements)
		{
			list.add(x.getText());
			if(x.getText().contains("ide"))
			{
				x.click();
				break;
			}
		}
		
		System.out.println(list);
		driver.quit();
	}

}
