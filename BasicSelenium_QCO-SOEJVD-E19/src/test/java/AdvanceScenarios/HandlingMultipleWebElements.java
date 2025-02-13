package AdvanceScenarios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebElements {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));

		int count=0;
		for (WebElement link : allLinks) 
		{
		//	System.out.println(link.getText());//fetches all the visible text from links
			System.out.println(link.getAttribute("href"));//fetches all the attribute values of the href
			count++;
		}
		System.out.println("Total links present--->"+count);
	}

}
