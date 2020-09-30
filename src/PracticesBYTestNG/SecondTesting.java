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

public class SecondTesting {
	

	
	@BeforeMethod
	public void start(){
		System.out.println("Starting");
	}
	
	@Test(priority=2)
	public void testidsfdng(){
		System.out.println("Testing");
		int n=9/0;
	}
	
	@Test(priority=4,groups="testdsfdsfing",dependsOnMethods="testidsfdng")
	public void Dedfdsfve(){
		System.out.println("Developing");
	}
	
	@Test(priority=1,enabled=true,invocationCount=10)
	public void qdfdsftp(){
		System.out.println("QTPTEsting");
	}
	
	@Test(priority=3)
	public void rctdfdfest(){
		System.out.println("RCTesting");
		
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void launcdfdsfhBrowser22(){
		System.out.println("browse2222r launch");
		
	}
	
	

}
