package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingBrowsers {

	public static void main(String[] args) {
		
		//case1:-Selenium version:-3.141.59,webdrivermanager:-5.9.2
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
		
		
		//case2:-Selenium version:-4.25.0 ,webdrivermanager:-5.9.2
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();
	
		
		//case3:-Selenium version:-4.25.0
		WebDriver driver=new ChromeDriver();
	}

}
