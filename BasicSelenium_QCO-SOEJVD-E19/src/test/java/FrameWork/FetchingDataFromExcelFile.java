package FrameWork;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchingDataFromExcelFile {

	@Test
	public void  fetchingdata() throws Throwable {

		// step1:- path connection
//		FileInputStream fis = new FileInputStream("C:\\Users\\Shobha\\Documents\\TestDataBook.xlsx");

		FileInputStream fis = new FileInputStream("./src/test/resources/TestDataBook.xlsx");

		// step2:-keep excel file in read mode
		Workbook book = WorkbookFactory.create(fis);

		// step3:-gets the control of the sheet
		Sheet sheet = book.getSheet("Sheet1");

		// step4:-gets the control into the row(row starts from 0)
		Row row = sheet.getRow(4);

		// step5:-gets the control into the cell(cell starts from 0)
		Cell cell = row.getCell(3);

		String excelData = cell.getStringCellValue();
		System.out.println(excelData);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in");

		driver.findElement(By.name("q")).sendKeys(excelData);

	}

}
