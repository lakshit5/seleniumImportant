package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {

	public Flipkart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBys({@FindBy(name="q"),@FindBy(xpath = "//input[@title=\"Search for Products, Brands and More\"]")})
	private WebElement searchBar;
	
	@FindAll({@FindBy(css = "[type=\"submit\"]"),@FindBy(className = "_2iLD__")})
	private WebElement searchIcon;

	public WebElement getSearchBar() {
		return searchBar;
	}

	public WebElement getSearchIcon() {
		return searchIcon;
	}
	
	
	}
	

