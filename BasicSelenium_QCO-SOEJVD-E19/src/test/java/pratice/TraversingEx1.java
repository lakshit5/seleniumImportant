package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingEx1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/search?q=pro+kabaddi+points+table+2024");
        driver.manage().window().maximize();
        
     String won = driver.findElement(By.xpath("(//span[text()='Telugu Titans'])[2]/../../following-sibling::td[2]")).getText();
	System.out.println("Total num of matches won---->"+won);
	
	String points = driver.findElement(By.xpath("(//span[text()='Telugu Titans'])[2]/../../following-sibling::td[6]")).getText();
	System.out.println("Total point gain----->"+points);
	}

}
