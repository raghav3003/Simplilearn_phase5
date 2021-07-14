package phase5.Testng.Day4;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityExample {

	@Test
	public void a_method() {
		System.out.println("This is method a");
	}
	
	@Test(priority = 1)
	public void b_method() {
		System.out.println("This is method b");
	}
	
	@Test(priority = 0)
	public void c_method() {
		System.out.println("This is method c");
	}
	
	@Test
	public void d_method() {
		System.out.println("This is method d");
	}
	
//	@BeforeMethod
//	public void before() {
//		System.out.println("About to run a test");
//	}
//	
//	@AfterMethod
//	public void after() {
//		System.out.println("Finished running a test");
//	}
	
}
