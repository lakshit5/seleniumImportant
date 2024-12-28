package pratice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.prokabaddi.com/standings");
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//button[text()='Accept All Cookies']")).click();
	driver.findElement(By.xpath("(//button[@aria-label='Close'])[1]")).click();
	driver.findElement(By.cssSelector("[class=\"close-btn\"]")).click();
	
	List<WebElement> names = driver.findElements(By.xpath("//p[@class='name']"));
	List<WebElement> points = driver.findElements(By.xpath("//p[@class='name']/../../../following-sibling::div[7]"));
	
	for (int i = 0; i < names.size(); i++) 
	{
		System.out.println("team names--->"+names.get(i).getText()+"team points--->"+points.get(i).getText());
	}
	}
}
