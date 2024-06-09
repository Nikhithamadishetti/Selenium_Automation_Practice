package Selenium_Java_Automation.Selenium_Java_Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJqueryDropDowns {
	static WebDriver driver;

	public static void main(String args[]) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> ele = driver.findElements(By.id("//*[@class='comboTreeItemTitle']"));

		// 1
		 SelectchoiceValues("choice 1");

		// 2
		 SelectchoiceValues("choice 2","choice 2 1","choice 2 3","choice 6 2 1");

		// 3
		SelectchoiceValues("all");

		Thread.sleep(3000);
		driver.quit();
	}

	public static void SelectchoiceValues(String... choices) {
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='comboTreeItemTitle']"));

		if (!choices[0].equalsIgnoreCase("all")) {
			for (String choice : choices) {
				for (WebElement element : elements) {
					if (element.getText().equals(choice)) {
						element.click();
						break;
					}
				}
			}
		} else {
			try {
				for (WebElement x : elements) {
					x.click();
				}
			} catch (Exception e) {

			}
		}
	}
}
