package PracticesBYTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGKeyWoards {
	
	@BeforeSuite
	public void launchBrowser(){
		System.out.println("browser launch");
	}
	
	@BeforeTest
	public void method(){
		System.out.println("signup");
	}
	
	@BeforeClass
	public void login(){
		System.out.println("loged");
	}
	
	@BeforeMethod
	public void start(){
		System.out.println("Starting");
	}
	
	@Test(priority=2)
	public void testing(){
		System.out.println("Testing");
		int n=9/0;
	}
	
	@Test(priority=4,groups="testdsfdsfing",dependsOnMethods="testing")
	public void Deve(){
		System.out.println("Developing");
	}
	
	@Test(priority=1,enabled=true,invocationCount=10)
	public void qtp(){
		System.out.println("QTPTEsting");
	}
	
	@Test(priority=3)
	public void rctest(){
		System.out.println("RCTesting");
		
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void launchBrowser22(){
		System.out.println("browse2222r launch");
		
	}
	
	@AfterClass
	public void method222(){
		System.out.println("signup222");
	}
	
	@AfterTest
	public void login2222(){
		System.out.println("loged2222");
	}
	
	@AfterSuite
	public void start22(){
		System.out.println("Starting2222");
	}

}
