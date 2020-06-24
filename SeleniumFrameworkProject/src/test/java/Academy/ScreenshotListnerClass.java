package Academy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListnerClass implements ITestListener {
	
	MainClassFile m = new MainClassFile();

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		//take a screenshot when testcase1 is pass
		result.getName();
		//m.getScreenshots();
		
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		//Here we can write a code to capture the screenshot for test failure
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
