package PracticesBYTestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider {
	
	WebDriver driver;
	public FileInputStream fis = null;
	private XSSFWorkbook workbook = null;
	private XSSFSheet sheet = null;
	
	
	@BeforeMethod
	public void startUp(){
		System.setProperty("webdriver.chrome.driver","E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.t3-framework.org/joomla30/index.php/en/joomla-pages/sample-page-2/login-page");
		
	}
	
	@DataProvider(name = "testData")
	public Object[][] getTestData() throws Exception{
		
		try {
			File path = new File("E:\\EXceL Automate\\TestNGDataProvider.xlsx");
			fis = new FileInputStream(path);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheetAt(0);
		}
	 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int rowCount = sheet.getLastRowNum();
		
		int colmn = sheet.getRow(0).getLastCellNum();
		
		String [][] data = new String [rowCount][colmn];
		
		for (int i=0;i<rowCount;i++){
			XSSFRow row = sheet.getRow(i);
			
		for(int j=0;j<colmn;j++){
			XSSFCell cell = row.getCell(j);
			String value = cell.toString();
			data[i][j] = value;
			
		}
		}
		workbook.close();
		return data;
		
	}
	
	
	@Test(dataProvider="testData")
	public void loginPage(String name,String password){
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(name);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		
	}
	@AfterMethod
	public void close(){
		driver.quit();
	}

}
