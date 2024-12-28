package pratice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchingEmptyBrowser {

	public static void main(String[] args) {

		// Launching Empty Browser---->Chrome
		// Selenium version:-3.141.59

		// case1:-3.141.59,chromedriver.exe
//		String key="webdriver.chrome.driver";
//		String Value="C:\\Users\\Shobha\\Downloads\\chromedriver-win64 (15)\\chromedriver-win64\\chromedriver.exe";
//		System.setProperty(key, Value);
//		WebDriver driver=new ChromeDriver();

		// case2:-selenium version:-3.141.59 , webdrivermanager version:-5.9.2
//case1:-Selenium version:-3.141.59,webdrivermanager:-5.9.2

		// case3:-Selenium version:-4.25.0 ,webdrivermanager:-5.9.2

//		WebDriverManager.chromedriver().setup();
//		WebDriver driver=new ChromeDriver();

		// case4:-Selenium version:-4.25.0
		WebDriver driver = new ChromeDriver();

	}

}
