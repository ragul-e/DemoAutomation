package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sun.net.httpserver.Authenticator.Result;

public class listenerDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("My testcase:"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("My testcase:"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Failed:"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		System.out.println("Completed:"+context.getName());
	}

}
