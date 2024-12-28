package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.name("field-keywords")).sendKeys("Bluetooth");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		//groupByIndex---->   (xpath)[indexValue]
		String name1 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).getText();
	    System.out.println(name1);
	
	    String name2 = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]")).getText();
	    System.out.println(name2);
	}

}
