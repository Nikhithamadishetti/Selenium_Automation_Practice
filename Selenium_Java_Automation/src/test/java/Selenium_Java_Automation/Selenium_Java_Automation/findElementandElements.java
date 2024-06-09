package Selenium_Java_Automation.Selenium_Java_Automation;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public final class findElementandElements {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		URL url=new URL("https://demo.nopcommerce.com");
		driver.navigate().to(url);
		driver.manage().window().maximize();
		
		//1
		driver.findElement(By.xpath("//*[@id='small-searchterms']")).sendKeys("clothes");
		
		//2
		WebElement ele=driver.findElement(By.xpath("//*[@class='header-menu']//ul//li/a"));
		System.out.println(ele.getText());
		
		/*
		//3
		WebElement ele1=driver.findElement(By.xpath("//*[@class='header-men']/ul"));
		*/
		
		//4
		List<WebElement> ele2=driver.findElements(By.xpath("//*[@class='header-menu']/ul"));
    	System.out.println(ele2.size());

    	//5
    	List<WebElement> ele3=driver.findElements(By.xpath("//*[@class='header-menu']"));
    	System.out.println(ele3.size());

    	//6
    	List<WebElement> ele4=driver.findElements(By.xpath("//*[@class='header-menu']//ul//li/a"));
    	for(WebElement x:ele4)
    	{
    	System.out.println(x.getText());
    	}
    	
    	//7
    	List<WebElement> ele5=driver.findElements(By.xpath("//*[@class='header-men']"));
    	System.out.println(ele5.size());
		driver.quit();
	}

}
