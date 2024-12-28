package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownUsingKeysClass {

	public static void main(String[] args) throws Throwable {

		// Handling Using 1st Approach
		// Using Keys Class

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement dateList = driver.findElement(By.id("day"));
		dateList.click();

		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
		dateList.sendKeys(Keys.ARROW_DOWN);
//		dateList.sendKeys(Keys.ARROW_DOWN);
//		dateList.sendKeys(Keys.ARROW_DOWN);
//
		Thread.sleep(2000);
		dateList.sendKeys(Keys.ARROW_UP);
		dateList.sendKeys(Keys.ARROW_UP);

	}

}
