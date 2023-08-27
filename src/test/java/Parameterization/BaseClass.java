package Parameterization;

import java.io.IOException;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import utility.UtilityClass;


public class BaseClass 
{
	public static WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest test;
	public static ExtentSparkReporter spark;

	@BeforeSuite
	void setup_ExtendReport()
	{	    
	    report = new ExtentReports(); // To generate extent report
		ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");  //Set path in system for store the generated report
		report.attachReporter(spark); //To attach generated report into selected path
		
	}
	
	@BeforeClass (enabled=true)
	void openBrowser()
	{
		driver=utility.UtilityClass.openChromeBrowser(driver);
//		driver=utility.UtilityClass.openEgeBrowser(driver);
		
//		driver.get("http://localhost:4200/login");
		driver.get("http://devdreamcity.kolonizer.in/");
//		driver.get("http://uatdreamcity.kolonizer.in/login");
//		driver.get("https://dream.kolonizer.in/");
		
		driver.manage().window().maximize();
		
	    Parameterization.LoginPage L = new Parameterization.LoginPage(driver);
		L.username();
		L.password();
		L.loginbutton();
	}

	@AfterClass (enabled=true)
	void closeBrowser() throws InterruptedException
	{
        Thread.sleep(3000);
		driver.close();
	}
		
	
	@BeforeMethod 
	void waits()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	
	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException
	{
		
		if (result.getStatus()== ITestResult.FAILURE)
		{
			
			UtilityClass.screenshot(driver);
			String path = UtilityClass.screenshotPath(driver);
			test.fail("Test case is failed", MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			//test.log(Status.FAIL, "Test case is failed");
		}
		else
		{
			test.log(Status.PASS, "Test case is passed");
		}
		report.flush();
	}
	




	

}
