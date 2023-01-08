package excersises;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.MethodHelper;

public class Excersises {

	@Test
	public void beforesuite() {
		System.out.println("beforesuite");
		}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
		}
	@BeforeClass
	public void beforeclass() {
		System.out.println("beforeclass");
		}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
		}
	@Test
	public void testcase() {
		System.out.println("vtestcase");
		}
	@AfterMethod
	public void aftermethod1() {
		System.out.println("aftermethod1");
		}
	@AfterClass
	public void afterclass() {
		System.out.println("afterclass");
		}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
		}
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite");
		}
		
	
	
		/*
		 * @Test(description = "this is the first method",groups="method1")
		 * 
		 * public void method1() { System.out.println("method1"); }
		 * 
		 * @Test(priority=2,enabled=false,groups="method2") public void method2() {
		 * System.out.println("method2");
		 * 
		 * }
		 * 
		 * @Test(dependsOnMethods = "zebra",groups="apple") public void apple() {
		 * System.out.println("apple");
		 * 
		 * }
		 * 
		 * @Test(priority=0,enabled=false,expectedExceptions = {MethodHelper.class})
		 * public void zebra() { System.out.println("zebra");
		 * 
		 * }
		 * 
		 * @Test(priority=4) public void cat() { System.out.println("cat");
		 * 
		 * }
		 */	
	
}

