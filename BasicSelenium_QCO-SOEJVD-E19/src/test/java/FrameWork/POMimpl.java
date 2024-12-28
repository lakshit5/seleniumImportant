package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POMRepo.LoginPage;

public class POMimpl {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis = new FileInputStream("./src/test/resources/CommonDatass.properties");
		WebDriver driver = new ChromeDriver();

		// step2:-load all the keys into properties class
		Properties pro = new Properties();
		pro.load(fis);

		// step3:- read all the keys using getProperty()
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");

		driver.get(URL);
		//Normal Approach
//		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
//		driver.findElement(By.id("password")).sendKeys(PASSWORD);
//		driver.findElement(By.id("login-button")).click();
		
		LoginPage login = new LoginPage(driver);
		
		//gettermetehods
//		login.getUserTextField().sendKeys(USERNAME);
//		login.getPasswordTextField().sendKeys(PASSWORD);
//		login.getLoginButton().click();
	
		//Business Logics
		login.loginToApp(USERNAME, PASSWORD);
		
	}

}
