package learnlisteners;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class MainListeners implements ITestListener{
	public void onTestStart(ITestResult result)
	{
		System.out.println("1");
	}
	public void onTestSucces() {System.out.println("2");
	}
	public void onTestFailure() {System.out.println("3");
		
	}

	public void onTestSkipped() {System.out.println("4");
	}
	public  void onTestFailedButWithinSuccessPercentage() {
		System.out.println("5");
	}
	public void onTestFailedWithTimeout(){System.out.println("6");
	}
	public void onStart() {System.out.println("7");
	}
	public void onFinish() {System.out.println("8");
		
	}
}
