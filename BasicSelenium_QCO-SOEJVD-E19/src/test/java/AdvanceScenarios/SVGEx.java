package AdvanceScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SVGEx {

	@Test
	public void svgElement() throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.clinique.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@data-action=\"product#handleAddToCartClick\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[name()='svg' and @class='ufc-cart-icon-svg']")).click();

		
	}

}
