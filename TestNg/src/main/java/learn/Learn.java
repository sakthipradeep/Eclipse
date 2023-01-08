package learn;

import org.testng.annotations.Test;

public class Learn {

	@Test(priority=1)
	public void method1() {
		System.out.println(" first");
	}
	@Test(dependsOnMethods= {"method1"})
	public void athod1() {
		System.out.println("second");
	}
}
