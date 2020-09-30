package PracticesBYTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelExecution {
	
	WebDriver driver;
	
//	@BeforeMethod
//	public void startUp(){
//		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
//			driver = new ChromeDriver();
//			
//			driver.get("http://www.google.com");
			
//	}
	
	@Test
	public void test1(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test2(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.Seleniumhq.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test3(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.w3school.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test4(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.tamilnadu.com");
		System.out.println(driver.getTitle());
	}
	
	@Test
	public void test5(){
		System.setProperty("webdriver.chrome.driver", "E:\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.fizzy.com");
		System.out.println(driver.getTitle());
	}
	
	@AfterMethod
	public void quit(){
		driver.quit();
	}
	

}
