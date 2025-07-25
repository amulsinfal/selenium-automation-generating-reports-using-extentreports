package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
	public static ExtentReports extentReport;
	public static String extentReportFile;

	public static ExtentReports setupExtentReport() {
		extentReportFile = System.getProperty("user.dir")+"\\reports\\ExecutionReport.html";
		
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		sparkReporter.config().setReportName("Test Automation report");
		sparkReporter.config().setDocumentTitle("Execution report");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(sparkReporter);
		
		extentReport.setSystemInfo("Test URL", ConfigReader.getValue("QA", "url"));
		extentReport.setSystemInfo("Operating System", ConfigReader.getValue("QA", "browser") + " browser");
		extentReport.setSystemInfo("Tester",  System.getProperty("user.name"));
		extentReport.setSystemInfo("Operating System", System.getProperty("os.name"));
		
		return extentReport;
	}

}
