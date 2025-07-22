package listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utilities.ScreenshotUtil;

public class ReportListeners implements ITestListener {
	private static Logger log = LogManager.getLogger(ReportListeners.class);

	@Override
	public void onTestStart(ITestResult result) {
		log.info("Test case '" + result.getMethod().getMethodName() + "' execution started.");
		log.info("Test description - '" + result.getMethod().getDescription() + "'.");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		log.info("Test case '" + result.getMethod().getMethodName() + "' execution Passed.");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		log.error("Test case '" + result.getMethod().getMethodName() + "' execution failed.");
		log.error("Exception occured: " + result.getThrowable());
		String screenshotPath = ScreenshotUtil.captureScreenshot(result.getMethod().getMethodName());
		log.info("Screenshot saved at: " + screenshotPath);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		log.warn("Test case '" + result.getMethod().getMethodName() + "' execution skipped.");
		log.warn("Exception occured: " + result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		log.info("Test suite execution started.");
	}

	@Override
	public void onFinish(ITestContext context) {
		log.info("Test suite execution ended.");
	}
}
