package Selenium_Java_Automation.Selenium_Java_Automation;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateMethods {

	//navigate.back()
	//navigate.farward()
	//navigate.refresh()
	//navigate.to()
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/SignIn.html");
		Thread.sleep(1000);
		URL url=new URL("https://demo.nopcommerce.com/register?returnUrl=%2F");
		driver.navigate().to(url);
		Thread.sleep(1000);
		driver.navigate().back();//navigate to automationtesting
		Thread.sleep(1000);
		driver.navigate().forward(); //navigate to nopcommerce
		Thread.sleep(1000);
		driver.navigate().to("https://mail.google.com/");
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.quit();
	}
		//	driver.get(url); -> get only takes string type parametrs 
	    //driver.navigate().to(url); -> navigate().to() -> takes both string type parameters and url instance

}
