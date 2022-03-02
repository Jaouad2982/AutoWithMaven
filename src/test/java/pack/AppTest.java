package pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AppTest {
	static ExtentReports reports;
	static ExtentSparkReporter spark;
	static WebDriver driver;
	static String url ="https://rahulshettyacademy.com/AutomationPractice/";;
	
	
	@BeforeTest
	public static void set() {
		String path = System.getProperty("user.did")+ "\\reports\\index.html";
		spark = new ExtentSparkReporter(path);
		reports = new ExtentReports();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jd\\Desktop\\chDriver\\chromedriver.exe");		
		driver = new ChromeDriver();
		spark.config().setReportName("Random testing");
		spark.config().setDocumentTitle("random title");
	}
	
	
	@Test
	public static void testne() {
		ExtentTest test = reports.createTest("random test");
		driver.get(url);
		reports.flush();
		
	}
}
