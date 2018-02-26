package BaseUtilities;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {

	public static ExtentReports getInstance() {
		ExtentReports extent;

		String Path = "./test-output/Extent Report/Sanity Test.html";

		extent = new ExtentReports (Path, false);
		
		
		return extent;

	}
	
	public static ExtentReports getInstance2() {
		ExtentReports extent;

		String Path = "./test-output/Extent Report/Regression Test.html";

		extent = new ExtentReports (Path, false);
		
		
		return extent;

	}
	
	public static ExtentReports getInstance3() {
		ExtentReports extent;

		String Path = "./test-output/Extent Report/Smoke Test.html";

		extent = new ExtentReports (Path, false);
		
		
		return extent;

	}
	
	public static ExtentReports getInstance4() {
		ExtentReports extent;

		String Path = "./test-output/Extent Report/IndexPageCrokenLinks Test.html";

		extent = new ExtentReports (Path, false);
		
		
		return extent;

	}
	
	public static ExtentReports getInstance5() {
		ExtentReports extent;

		String Path = "./test-output/Extent Report/MainNavBrokenLinks Test.html";

		extent = new ExtentReports (Path, false);
		
		
		return extent;

	}
	
	public static ExtentReports getInstance6() {
		ExtentReports extent;

		String Path = "./test-output/Extent Report/SubNavBrokenLinks Test.html";

		extent = new ExtentReports (Path, false);
		
		
		return extent;

	}


}
