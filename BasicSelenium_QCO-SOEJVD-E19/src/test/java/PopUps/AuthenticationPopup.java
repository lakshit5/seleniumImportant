package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AuthenticationPopup {

	@Test
	public void m1() {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// driver.get("https://the-internet.herokuapp.com/basic_auth");

		// driver.get("https://username:password@URL");

		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
