package randomData_devEnv;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class AnalysisReportCount 
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public AnalysisReportCount(WebDriver driver)
	{

		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	
	@FindBy (xpath = "//button[text()='Refresh']") WebElement refreash_Button;
	@FindBy (xpath = "//div[text()='Analysis Report']") WebElement analysisReport_Text;
	@FindBy (xpath = "(//u[text()='New']/parent::div/parent::div/parent:: div/parent::div/parent::div/following::div//div[@Class='newCLs'])[1]") WebElement count_Call_New;
	@FindBy (xpath = "(//u[text()='New']/parent::div/parent::div/parent:: div/parent::div/parent::div/following::div//div[@Class='newCLs'])[2]") WebElement count_Meet_New;
	@FindBy (xpath = "(//u[text()='New']/parent::div/parent::div/parent:: div/parent::div/parent::div/following::div//div[@Class='newCLs'])[3]") WebElement count_Visit_New;
	@FindBy (xpath = "(//u[text()='New']/parent::div/parent::div/parent:: div/parent::div/parent::div/following::div//div[@Class='newCLs'])[4]") WebElement count_Prebooked_New;
	@FindBy (xpath = "//span[text()='Total Lead ']") WebElement TotalLeadToggle;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
//	@FindBy (xpath = "") WebElement dfjdf;
	public void refreash_Button()
	{
		refreash_Button.click();
	}
	public void analysisReport_Text() throws InterruptedException
	{
		analysisReport_Text.click();
		TotalLeadToggle.click();

	}
	



}
