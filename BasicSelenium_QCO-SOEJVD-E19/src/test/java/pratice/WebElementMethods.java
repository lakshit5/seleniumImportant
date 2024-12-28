package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws Throwable {

		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();

		// method1:-sendKeys()
		// driver.findElement(By.name("q")).sendKeys("puma");

		// method2:-click()
		// driver.findElement(By.cssSelector("[type=\"submit\"]")).click();

		// method3:-submit()
//		WebElement search = driver.findElement(By.name("q"));
//		search.sendKeys("Bluetooth");
//		search.submit();

		// method4:-clear()
//		driver.get("https://www.saucedemo.com/v1/");
//		WebElement UserName = driver.findElement(By.name("user-name"));
//		UserName.sendKeys("standard_user");
//		Thread.sleep(2000);
//		UserName.clear();
//		Thread.sleep(2000);
//		UserName.sendKeys("Shobha");

		// method5:-isDisplayed()
//		driver.get("https://www.facebook.com");
//		WebElement ele = driver.findElement(By.xpath("//img[@alt='Facebook']"));
//		if (ele.isDisplayed()) {
//			System.out.println("Element is Displayed");
//		} else {
//			System.out.println("Element not displayed");
//		}

		// method6:-isEnabled()
//		WebElement link = driver.findElement(By.xpath("//a[text()='Create new account']"));
//        if(link.isEnabled())
//        {
//        	link.click();
//        }
//        else
//        {
//        	System.out.println("Element is not Enabled");
//        }

		// method:-7:-isSelected()
    /*    WebElement radio = driver.findElement(By.xpath("//input[@value='1']"));
        radio.click();
        if(radio.isSelected())
        {
        	System.out.println("Radio button is Selected");
        }
        else
        {
        	System.out.println("Radio button is not Selected");
        }*/

		// method8:-getLocation()
//		driver.get("https://www.flipkart.com");
//		WebElement ele = driver.findElement(By.name("q"));
//
//		System.out.println(ele.getLocation().getX());
//		System.out.println(ele.getLocation().getY());

		// method9:-getSize()
//		System.out.println(ele.getSize().getHeight());
//		System.out.println(ele.getSize().getWidth());

//		WebElement ele1 = driver.findElement(By.cssSelector("[aria-label=\"Grocery\"]"));
//        System.out.println(ele1.getSize().getHeight());
//        System.out.println(ele1.getSize().getWidth());

		// method10:-getRect()
//		System.out.println(ele.getRect().getX());
//		System.out.println(ele.getRect().getY());
//		System.out.println(ele.getRect().getHeight());
//		System.out.println(ele.getRect().getWidth());

		// method11:-getTagName()
//		 driver.get("https://www.amazon.in");
//		 WebElement search = driver.findElement(By.name("field-keywords"));
//		 System.out.println(search.getTagName());

		// method12:-getAttribute()
		// System.out.println(search.getAttribute("aria-autocomplete"));

		// method13:-getDomAttribute()
		// System.out.println(search.getDomAttribute("id"));

		// method14:-getDomProperty()
//		WebElement link = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//		System.out.println(link.getDomProperty("type"));

//		System.out.println(search.getDomProperty("baseURI"));

		// method15:-getAriaRole()
		// System.out.println(search.getAriaRole());

		// WebElement ele = driver.findElement(By.xpath("//a[text()='MX Player']"));
		// System.out.println(ele.getAriaRole());

//		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//		System.out.println(ele.getAccessibleName());

		// method16:-getAccessibleName()
//		WebElement search = driver.findElement(By.name("field-keywords"));
//		System.out.println(search.getAccessibleName());

//		driver.get("https://www.flipkart.com");
//		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Flipkart\"]"));
//	    System.out.println(logo.getCssValue("color"));

		// method17:-getCssValue()
//		driver.get("https://www.amazon.in");
//		WebElement ele = driver.findElement(By.xpath("//a[text()=\"Today's Deals\"]"));
//	System.out.println(ele.getCssValue("color"));

//	System.out.println(ele.getCssValue("font-size"));

//		driver.findElement(By.name("field-keywords")).sendKeys("puma");
//		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
//		String name = driver.findElement(By.xpath("(//span[text()=\"Men's Baseball Cap\"])[1]")).getText();
//		System.out.println(name);
}

}
