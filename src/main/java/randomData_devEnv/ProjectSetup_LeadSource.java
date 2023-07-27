package randomData_devEnv;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utility.UtilityClass;

public class ProjectSetup_LeadSource 
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	public ProjectSetup_LeadSource(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j = (JavascriptExecutor)driver;
	}
	//=================================================================================================================================
	// edit button of lead source is direct start with 104
	@FindBy (xpath="//td[contains(text(), 'Automation_Direct 104')]/parent :: tr //td//button") private WebElement edit_lead_Source_Button_Direct;
	//=================================================================================================================================

	@FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
	@FindBy (xpath="//a[@href='/master/lead_source']") private WebElement lead_Source_Icon ;
	@FindBy (xpath="//button[@routerlink='add-user']/parent :: div") private WebElement lead_Source_Button ;
	@FindBy (xpath="//input[@formcontrolname='name']") private WebElement add_Lead_Source_Name ;
	@FindBy (xpath="//input[@formcontrolname='description']") private WebElement add_Lead_Source_Discription ;
	@FindBy (xpath="//button[@type='submit']") private WebElement add_Lead_Source_Submitt_Button ;
	
	@FindBy (xpath = "//mat-icon[text()='close']") private WebElement closeIcon;
	
	public void projectSetup()
	{
		projectSetupIcon.click();
	}
	public void lead_Source_Icon() 
	{
		lead_Source_Icon.click();
	}
	public void lead_Source_Button() throws InterruptedException
	{
		j.executeScript("window.scrollBy(1000,-1000)", "");
		Thread.sleep(2000);
		lead_Source_Button.click();
	}
	public void addLeadSource_Direct() throws InterruptedException
	{
		add_Lead_Source_Name.sendKeys("Automation_Direct "+UtilityClass.getRandomIntegers(2));
		add_Lead_Source_Discription.sendKeys("A lead source is the channel through which a lead initially .");
		add_Lead_Source_Submitt_Button.click();
	
	}
	public void addLeadSource_SocialMedia() throws InterruptedException
	{
		add_Lead_Source_Name.sendKeys("Automation_Social Media "+UtilityClass.getRandomIntegers(2));
		add_Lead_Source_Discription.sendKeys("A lead source is the channel through which a lead initially .");
		add_Lead_Source_Submitt_Button.click();
		
	}
	public void addLeadSource_NewsPaper() throws InterruptedException
	{
		add_Lead_Source_Name.sendKeys("Automation_News Paper "+UtilityClass.getRandomIntegers(2));
		add_Lead_Source_Discription.sendKeys("A lead source is the channel through which a lead initially .");
		add_Lead_Source_Submitt_Button.click();
		
	
	}
	public void addLeadSource_Reference() throws InterruptedException
	{
		add_Lead_Source_Name.sendKeys("Automation_Reference "+UtilityClass.getRandomIntegers(2));
		add_Lead_Source_Discription.sendKeys("A lead source is the channel through which a lead initially .");
		add_Lead_Source_Submitt_Button.click();
			
	}
	public void add_Lead_Source_Submitt_Button() throws InterruptedException 
	{
		add_Lead_Source_Submitt_Button.click();
	}
	//Edit lead source
	public void edit_lead_Source_Button_Direct() 
	{
		j.executeScript("arguments[0].click()", edit_lead_Source_Button_Direct);
	}

	public void submit_Button() 
	{
		add_Lead_Source_Submitt_Button.click();
	}
	public void edit_leadSource()
	{
			
		String name=add_Lead_Source_Name.getAttribute("value");
		String Discription = add_Lead_Source_Discription.getAttribute("value");
		
		add_Lead_Source_Name.clear();
		add_Lead_Source_Discription.clear();
		
		add_Lead_Source_Name.sendKeys(name);
		add_Lead_Source_Discription.sendKeys(Discription);	
	}
}
