package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TraversingEx2 {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://olympics.com/en/paris-2024/medals");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
		
		String GoldMedal = driver.findElement(By.xpath("(//span[text()='Japan']/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'])[1]")).getText();
        System.out.println("Total num of Gold Medals are----->"+GoldMedal);
        
        String SilverMedal = driver.findElement(By.xpath("(//span[text()='Japan']/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'])[2]")).getText();
        System.out.println("Total num of Silver Medals are----->"+SilverMedal);
        
        String BrounzeMedal = driver.findElement(By.xpath("(//span[text()='Japan']/../following-sibling::span[@class='e1oix8v91 emotion-srm-19huvme'])[3]")).getText();
        System.out.println("Total num of Brounze Medals are----->"+BrounzeMedal);
	}

}
