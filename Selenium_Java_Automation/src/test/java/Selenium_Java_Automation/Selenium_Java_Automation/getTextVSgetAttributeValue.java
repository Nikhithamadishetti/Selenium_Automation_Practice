package Selenium_Java_Automation.Selenium_Java_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextVSgetAttributeValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		//1
		WebElement ele=driver.findElement(By.id("Email"));
		System.out.println(ele.getAttribute("value"));
		
		//2
		ele.clear();
		
		//3
        ele.sendKeys("admin123@test.com");
        System.out.println(ele.getAttribute("class"));
        System.out.println(ele.getAttribute("value"));
        
        //4
        System.out.println(ele.getText()); //no output becoz not innetr text
		driver.quit();
	}

}
