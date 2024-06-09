package Selenium_Java_Automation.Selenium_Java_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_WEB_Browser 
{
public static void main(String args[])
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/SignIn.html");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	driver.quit();
}
}
