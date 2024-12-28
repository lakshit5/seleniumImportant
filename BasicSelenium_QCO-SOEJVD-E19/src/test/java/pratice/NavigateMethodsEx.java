package pratice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethodsEx {

	public static void main(String[] args) throws Throwable  {

WebDriver driver=new ChromeDriver();


driver.manage().window().maximize();

//method1:-to("url")--->lunching the application
//driver.navigate().to("https://www.amazon.in");

//method2:-to(URL url)--->lunching the application
//driver.navigate().to(new URL("https://www.flipkart.com"));
//driver.navigate().to(new URL("https://wwwmakemytrip.com"));

Thread.sleep(2000);
driver.get("https://www.flipkart.com");

Thread.sleep(2000);
driver.navigate().back();

Thread.sleep(2000);
driver.navigate().forward();

Thread.sleep(2000);
driver.navigate().refresh();
	}

}
