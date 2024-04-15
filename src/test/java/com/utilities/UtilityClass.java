package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public static WebDriver driver;

	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void url(String Url) {

		driver.get(Url);
	}

	public static void sendKeys(WebElement element, String data) {

		element.sendKeys(data);

	}

	public static void click(WebElement element) {

		element.click();

	}

	public String ReadData(String filepath, int row, int cell) throws IOException {
		// Import excel sheet.
		File src = new File("C:\\Users\\Admin\\Desktop\\TestData.xls");

		// Load the file.
		FileInputStream finput = new FileInputStream(src);

		// Load he workbook.
		XSSFWorkbook workbook = new XSSFWorkbook(finput);

		// Load the sheet in which data is stored.
		XSSFSheet sheet = workbook.getSheetAt(0);

		XSSFRow xssfRow = sheet.getRow(row);

		XSSFCell xssfCell = xssfRow.getCell(cell);

		String stringCellValue = xssfCell.getStringCellValue();

		return stringCellValue;

	}
}
