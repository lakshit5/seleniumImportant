package FrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.Flipkart;

public class PomImpEx2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		Flipkart flip = new Flipkart(driver);
		flip.getSearchBar().sendKeys("Puma");
		flip.getSearchIcon().click();
	
	}

}
