package Regression;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility.Excel;
import utility.UtilityClass;
import utility.Wait;

public class ProjectSetup_TermAndCondition {
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	List<WebElement> listOfElements;
	
	
	public ProjectSetup_TermAndCondition(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
			this.driver = driver;
			w = new WebDriverWait(driver, Duration.ofSeconds(30));
			a = new SoftAssert();
			A = new Actions(driver);
			j = (JavascriptExecutor)driver;
	}
	
	//Term And Condition
	//=========================================================================================================================================
	
	// Automation term and conditions start with 104
	@FindBy (xpath = "//mat-panel-title[contains(text(), 'Automation_Term and Conditions 104')] / parent :: span / parent :: mat-expansion-panel-header") private WebElement automationTermAndCondition_ButtonBox ;
	
	//=========================================================================================================================================
	
	//update button of Automation term and condition start with 104
	@FindBy (xpath ="//mat-panel-title[contains(text(),'Automation_Term and Conditions 104')] / parent :: span / parent :: mat-expansion-panel-header // following-sibling :: div // button[text()=' Update ']") private WebElement update ;

	//=========================================================================================================================================
	
    @FindBy (xpath = "//mat-panel-title[contains(text(), 'Automation_Term and Conditions 104')] / parent :: span / parent :: mat-expansion-panel-header/following-sibling :: div // p") private WebElement getText_Description;

	  
    @FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
	@FindBy (xpath = "//a[@href='/master/term_and_condition']") private WebElement termAndCondition_Icon ;
	@FindBy (xpath = "//mat-icon[text()='business_center']") private WebElement  addTermAndCondition_Button ;
	@FindBy (xpath ="//input[@formcontrolname='name']") private WebElement name ;

	@FindBy (xpath = "//ckeditor//div[@role='textbox']") private WebElement description ;
	@FindBy (xpath = "//button[text()=' Submit ']") private WebElement submit_Button ;
	@FindBy (xpath = "//mat-panel-title[contains(text(), 'Automation_Term and Conditions 104')] / parent :: span / parent :: mat-expansion-panel-header / parent :: mat-expansion-panel //ckeditor//div[@role='textbox']")private WebElement editDescription_AutomationTermAndConditions;
	@FindBy (xpath = "//mat-icon[text()='expand_more']")private  WebElement userIconOfAdmin;
	@FindBy (xpath = "//button[text()='Logout']")private WebElement logoutButton;
	 @FindBy (xpath= "//input [@formcontrolname='username']") private WebElement username;
	 @FindBy (xpath= "//input [@formcontrolname='password']") private WebElement loginPassword;
	 @FindBy (xpath= "//span[text()='login'] /parent :: button") private WebElement loginbutton;
	
	 @FindBy (xpath = "//mat-icon[text()='style']")private WebElement tagIcon;
	 @FindBy (xpath = "//input[@Placeholder='Search or Create New']")private WebElement searchOrCreateTag;
	 @FindBy (xpath = "//p[contains(text(), 'Automation tag: Bank 104')] / parent :: label")private WebElement selectTag_Bank;
	 @FindBy (xpath = "//p[contains(text(), 'Automation tag: Organization 104')] / parent :: label")private WebElement selectTag_Organization;
	 @FindBy (xpath = "//div[contains(text(), 'Automation tag: Bank 104')]")private WebElement selectData_Bank;
	 @FindBy (xpath = "//div[contains(text(), 'Automation tag: Organization 104')]")private WebElement selectData_Organization;   
	 
	 @FindBy (xpath = "//mat-panel-title[contains(text(), ' Automation_Term and Conditions 104')] / parent :: span")private WebElement drag;
	 @FindBy (xpath = "(//mat-expansion-panel)[2]")private WebElement drop;
	 @FindBy (xpath = "//div[text()='Update Sorting']")private WebElement updateSorting;
	 @FindBy (xpath = "//mat-panel-title")WebElement editTermCondition_div;
	 @FindBy (xpath = "//input[@placeholder='Enter Title']")WebElement editName;
	 @FindBy (xpath = "//button[contains(text(), 'Update')]")WebElement updateButton;
    
    public void projectSetup()
	{
	projectSetupIcon.click();
	}
	
	
	public void termAndCondition_Icon()
	{	
		termAndCondition_Icon.click();
	}
	
	public void addTermAndCondition_Button () throws InterruptedException
	{
		j.executeScript("window.scrollBy(1000,-1000)", "");
		Thread.sleep(2000);
		addTermAndCondition_Button.click();
	}
   
	public void submit_Button()
	{
		submit_Button.click();
	}
	public void addTag() throws InterruptedException, EncryptedDocumentException, IOException
	{
		
		projectSetupIcon.click();
		Wait.explicitWait(termAndCondition_Icon, 10, driver);
		termAndCondition_Icon.click();
		Wait.explicitWait(addTermAndCondition_Button, 10, driver);
		addTermAndCondition_Button.click();	
		for (int termConditons=1; termConditons<=1; termConditons++)
		{
			System.out.println("Start to create tag: "+Excel.Regression_importDataFromExcel("Term and Conditions", termConditons, 0));
			Thread.sleep(2000);
			tagIcon.click();
			Thread.sleep(1000); searchOrCreateTag.sendKeys(Excel.Regression_importDataFromExcel("Term and Conditions", termConditons, 0)+" "+utility.UtilityClass.getRandomString(1));
			Thread.sleep(1000); String Bank= searchOrCreateTag.getAttribute("value");
			Thread.sleep(1000); searchOrCreateTag.sendKeys(Keys.ENTER);	
			driver.navigate().refresh();
			System.out.println("==========================================================================");
		}
			
	}
	
	public void addTermAndConditions() throws InterruptedException, EncryptedDocumentException, IOException
	{
		for (int termConditons=1; termConditons<=1; termConditons++)
		{
			System.out.println("Start to create term and condition: "+Excel.Regression_importDataFromExcel("Term and Conditions", termConditons, 1));
			projectSetupIcon.click();
			Wait.explicitWait(termAndCondition_Icon, 10, driver);
			termAndCondition_Icon.click();
			Wait.explicitWait(addTermAndCondition_Button, 10, driver);
			addTermAndCondition_Button.click();	
			Wait.explicitWait(name, 10, driver);
			A.moveToElement(name).click().build().perform();
		    name.sendKeys(Excel.Regression_importDataFromExcel("Term and Conditions", termConditons, 1)+" "+utility.UtilityClass.getRandomString(2));
		    Wait.explicitWait(description, 10, driver);
		    description.sendKeys(Excel.Regression_importDataFromExcel("Term and Conditions", termConditons, 2)+" "+UtilityClass.getRandomString(2));
		    Wait.explicitWait(tagIcon, 10, driver);
		    tagIcon.click();
		    Wait.explicitWait(searchOrCreateTag, 10, driver);
			searchOrCreateTag.sendKeys(Excel.Regression_importDataFromExcel("Term and Conditions", termConditons, 0));
			listOfElements = driver.findElements(By.xpath("//p[contains(text(), '"+Excel.Regression_importDataFromExcel("Term and Conditions", termConditons, 0)+"')] / parent :: label"));
			listOfElements.get(0).click();
			listOfElements.clear();		
			j.executeScript("window.scrollBy(1000,1000)", "");
			Thread.sleep(2000);
			j.executeScript("arguments[0].click();",submit_Button );
			Thread.sleep(2000);
			System.out.println("===================================================================================");
			
		}
	}
		public void editTermAndConditions() throws InterruptedException, EncryptedDocumentException, IOException
		{
			
				System.out.println("Start to create term and condition: "+Excel.Regression_importDataFromExcel("Term and Conditions", 1, 1));
				projectSetupIcon.click();
				Wait.explicitWait(termAndCondition_Icon, 10, driver);
				termAndCondition_Icon.click();
				editTermCondition_div.click();
				Thread.sleep(2000);
				Wait.explicitWait(editName, 10, driver);
				editName.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
				editName.sendKeys(Excel.Regression_importDataFromExcel("Term and Conditions", 1, 1)+" "+utility.UtilityClass.getRandomString(2));
			    Wait.explicitWait(description, 10, driver);
			    description.sendKeys(Keys.CONTROL, "a", Keys.DELETE);
			    description.sendKeys(Excel.Regression_importDataFromExcel("Term and Conditions", 1, 2)+" "+UtilityClass.getRandomString(2));
			    Wait.explicitWait(updateButton, 10, driver);
				j.executeScript("arguments[0].click();",updateButton );
				Thread.sleep(2000);			
		
	}
}
