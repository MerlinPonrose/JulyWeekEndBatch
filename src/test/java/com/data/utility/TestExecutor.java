package com.data.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.data.pages.Register;
import com.data.pages.SignUpTest;




public class TestExecutor {
	
	public static WebDriver driver;
	public static Common com = new Common();
	public static Register reg = new Register();
	public static SignUpTest sign = new SignUpTest();
	public Map<String, String> map = new HashMap<String, String>();
	public DataFormatter formatter = new DataFormatter();
	public  static ExcelRead excel = new ExcelRead();
	
	
	public String url;
	@BeforeMethod
	public void launchBrowser()
	{

		System.setProperty("webdriver.chrome.driver", "e:\\Karen Amy\\Downloads\\New folder\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get(url);  // open url
	}
	
	@BeforeTest
	public void loadPrp() throws IOException
	{

		File file = new File("C:\\Users\\Karen Amy\\eclipse-workspace\\DataDriven\\src\\test\\java\\com\\data\\config\\environment.properties");
		FileInputStream input = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(input);
		
		url = prop.getProperty("URL");
	}
	
	public static String getData(String key) throws IOException
	{
		return excel.getMapValue(key);
	}
	
}
