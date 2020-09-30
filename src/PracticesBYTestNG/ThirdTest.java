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
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest {
	
	
	
	@BeforeMethod
	public void stafgfdgrt(){
		System.out.println("Starting");
	}
	
	@Test(priority=2)
	public void tesgdfgting(){
		System.out.println("Testing");
		int n=9/0;
	}
	
	@Test(priority=4,groups="testdsfdsfing",dependsOnMethods="tesgdfgting")
	@Parameters({"url","browser"})
	public void Dehggfhe(String url,String browser){
		System.out.println("Developing");
	}
	
	@Test(priority=1,enabled=true,invocationCount=10)
	public void qeewrtp(){
		System.out.println("QTPTEsting");
	}
	
	@Test(priority=3)
	public void rctjhghjest(){
		System.out.println("RCTesting");
		
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void launfghgjchBrowser22(){
		System.out.println("browse2222r launch");
		
	}
	
	
}
