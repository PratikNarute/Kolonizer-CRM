package Regression;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utility.Excel;
import utility.UtilityClass;
import utility.Wait;


public class ProjectSetup_Projects 
{

	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	List<WebElement> list;
	Random random;
	ArrayList<WebElement> arrayElements;
	int randomNumber;
	
	public ProjectSetup_Projects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
		 random = new Random();
		 arrayElements=new ArrayList<WebElement>();
	}
//============================================================================================================================================
//	Add Departments series start with 104
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Civil 104')]") WebElement  automationDepartmentCivil;
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Sale 104')]") WebElement automationDepartmentSale;
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Lead 104')]") WebElement automationDepartmentLead;
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Production 104')]") WebElement automationDepartmentProduction;
//=============================================================================================================================================
	// Department dropdown start with 104
	@FindBy (xpath = "//mat-select[@formcontrolname='departments']")private WebElement departmentDropdown;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Civil 104')]")private WebElement departmentDropdown_Civil;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Sale 104')]")private WebElement departmentDropdown_Sale;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Lead 104')]")private WebElement departmentDropdown_Lead;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Production 104')]")private WebElement departmentDropdown_Production;
//=============================================================================================================================================
	// Assign Departments to user start with 104
    @FindBy (xpath = "(//mat-select[@formcontrolname='departments']) [2]")private WebElement assignDepartmentDropdown2;
	@FindBy (xpath = "(//mat-select[@formcontrolname='departments']) [3]")private WebElement assignDepartmentDropdown3;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Department Civil 104')]")private WebElement assignDepartmentDropdown_Civil;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Department Sale 104')]")private WebElement assignDepartmentDropdown_Sale;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Department Lead 104')]")private WebElement assignDepartmentDropdown_Lead;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Department Production 104')]")private WebElement assignDepartmentDropdown_Production;
//=============================================================================================================================================
	// Projects series start with 104
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Project-One 104')]")private WebElement projectDropdown_AutomationProject1;
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Project-Two 104')]")private WebElement projectDropdown_AutomationProject2;
//=============================================================================================================================================
	//edit icon for project serious start with 104
	@FindBy (xpath = "//td[contains(text(), '104')] / parent :: tr// td //button")private WebElement editIcon_AutomationProject1;
//=============================================================================================================================================


	
	@FindBy (xpath="//button[@class='pushable close-btn ng-star-inserted']") WebElement editProject_Button;
	@FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
	@FindBy (xpath = "//a[@href='/master/project']//i") private WebElement projectsIcon;
	@FindBy (xpath = "//mat-icon[text()='expand_more']")private  WebElement userIconOfAdmin;
	@FindBy (xpath = "//input[@formcontrolname='name']")private WebElement nameOfAdmin;
	@FindBy (xpath = "//button[text()=' View Profile ']")private WebElement veiwProfileOfAdmin;
	@FindBy (xpath = "//mat-icon[text()='edit']")private WebElement editIconOfAdmin;
	@FindBy (xpath = "//div[@class='d-inline-block dropdown']//button") private WebElement addProjectsButton;

	@FindBy (xpath = "//input [@data-placeholder='Project Name']") private WebElement projectName;
	@FindBy (xpath = "(//mat-select[@formcontrolname='id']) [2]")private WebElement projectDropdown2;
	@FindBy (xpath = "(//mat-select[@formcontrolname='id']) [3]")private WebElement projectDropdown3;

	@FindBy (xpath = "//input[@id='saleable']") private WebElement saleable;
	@FindBy (xpath = "//input[@id='nonsaleable']") private WebElement nonsaleable;
	@FindBy (xpath = "//input [@id='total_area']") private WebElement totalArea;
	@FindBy (xpath = "//input[@formcontrolname='address']") private WebElement address;
	
	
	@FindBy (xpath = "//mat-select") private WebElement sectorType;
	@FindBy (xpath = "//mat-option//span") private WebElement optionsList_SectorType;
	@FindBy (xpath = "//span[text()='Industrial']") private WebElement sectorType_Industrial;
	@FindBy (xpath = "//span[text()='Land']") private WebElement sectorType_Land;
	@FindBy (xpath = "//mat-option//span[text()='Residential']")private WebElement sectorType_Residential;
	@FindBy (xpath = "//mat-icon[text()='add'] / parent :: span / parent :: button")private WebElement addIcon;
	
	@FindBy (xpath = "//mat-icon[text()='add'] / parent :: span / parent :: button")private WebElement addDepartmentIcon;	
	
	@FindBy (xpath ="//span[text()=' check_circle ']") private WebElement departmentSubmitCheckBox ;
	@FindBy (xpath = "//div[text()=' Add Department '] /parent :: div /parent :: div / following-sibling :: div // input[@formcontrolname='name']")private WebElement nameOfDepartment;
	@FindBy (xpath = "//div[text()=' Add Department '] /parent :: div /parent :: div / following-sibling :: div // input[@formcontrolname='description']")private WebElement descriptionOfDepartment;
	
	@FindBy (xpath = "//ckeditor//div[@role='textbox']") private WebElement projectDescripiton;

	@FindBy (xpath = "//div[text()=' Add Department '] /parent :: div /parent :: div / following-sibling :: div//button[text()=' Submit ']") private WebElement submitBottonOfDepartment;
	@FindBy (xpath = "//div[text()=' Add Projects '] /parent :: div /parent :: div / following-sibling :: div // button[text()=' Submit ']")private WebElement submitButtonOfAddProject;
	@FindBy (xpath = "//button[contains(text(), 'Update')]")private WebElement updateButtonOfEditProject;
	@FindBy (xpath = "// button[text()=' Submit ']")private WebElement submitButtonOfAssignProjectUser;
	@FindBy(xpath = "(//mat-icon[text()='clear'])[3]") private WebElement closeIconProject;
	@FindBy (xpath = "(//mat-icon[text()='close'])[2]")private WebElement closeIconDepartment;
	
	@FindBy (xpath = "//div[text()=' Message: Error creating Department. ']")private WebElement errorMessage_DuplicateDepartment;
	@FindBy (xpath = "//div[text()=' Message: Project Name Already Taken ']")public WebElement errorMessage_DuplicateProject;
	
	
	public void projectSetupIcon()
	{	
	        projectSetupIcon.click();      
	}
	public void projectsIcon()
	{
		Wait.explicitWait(projectsIcon, 10, driver);
	    projectsIcon.click();
	}
	public void editIcon_AutomationProject1()
	{
		 j.executeScript("arguments[0].click()", editIcon_AutomationProject1);
	}
	public void addProjectsButton()
	{
		addProjectsButton.click();
	}

	public void addDepartmentIcon()
	{
		addDepartmentIcon.click();
	}
	
	public void addDepartment() throws InterruptedException, EncryptedDocumentException, IOException
	{

		Thread.sleep(2000);
		Wait.explicitWait(projectSetupIcon, 20, driver);
		projectSetupIcon.click();
		Wait.explicitWait(projectsIcon, 10, driver);
	    projectsIcon.click();
	       
	    for (int dept=1; dept<=1; dept++)
	    {
	    	System.out.println("Start to add department: "+Excel.Regression_importDataFromExcel("Departments", dept, 0));
			addProjectsButton.click();
			Wait.explicitWait(addDepartmentIcon, 5, driver);
			addDepartmentIcon.click();
			nameOfDepartment.sendKeys(utility.Excel.Regression_importDataFromExcel("Departments", dept, 0)+" "+utility.UtilityClass.getRandomString(2));
			descriptionOfDepartment.sendKeys(utility.Excel.Regression_importDataFromExcel("Departments", dept, 1));
			submitBottonOfDepartment.click();
			System.out.println("================================================");
	    }
	    	
	}

	public void createProjects() throws InterruptedException, EncryptedDocumentException, IOException
	{
		driver.navigate().refresh();

		for (int a=1; a<=1; a++)
		{
			
			System.out.println("Start to create project: "+Excel.Regression_importDataFromExcel("Projects",a,0));
			Thread.sleep(2000);
			projectSetupIcon.click();
			Wait.explicitWait(projectsIcon, 10, driver);
		    projectsIcon.click();
		    Wait.explicitWait(addProjectsButton, 5, driver);
		    addProjectsButton.click();
			 
			projectName.sendKeys(utility.Excel.Regression_importDataFromExcel("Projects",a,0)+" "+utility.UtilityClass.getRandomString(2));
			
			sectorType.click();
			Thread.sleep(1000);
			
			list =driver.findElements(By.xpath("//mat-option//span"));
			arrayElements.addAll(list);	
			System.out.println("Sector list size: "+arrayElements.size());
			// Generate a random integer between 0 and sectorTypes.size()
			randomNumber = random.nextInt(arrayElements.size());		
			arrayElements.get(randomNumber).click();
			arrayElements.clear();
			
			address.sendKeys(utility.Excel.Regression_importDataFromExcel("Projects",a,5));	
			Wait.explicitWait(departmentDropdown, 5, driver);
			departmentDropdown.click();
			Thread.sleep(1000);
		    list =driver.findElements(By.xpath("//mat-option//span"));
			arrayElements.addAll(list);	
			System.out.println("Department list Size: "+arrayElements.size());
		    	
		    for (int departments=0; departments<arrayElements.size(); departments++ )
		    {
		    	WebElement departmentsList=arrayElements.get(departments);
		    	Wait.explicitWait(departmentsList, 10, driver);
		    	A.moveToElement(departmentsList).click().build().perform();
		    }
		    departmentSubmitCheckBox.click();	
			arrayElements.clear();
		
			projectDescripiton.sendKeys(utility.Excel.Regression_importDataFromExcel("Projects",a,7));
			Wait.explicitWait(submitButtonOfAddProject, 5, driver);
			submitButtonOfAddProject.click();
	        Thread.sleep(2000);
			
			driver.navigate().refresh();
			System.out.println("=============================================================================");
			
		}
		
		
	}
	



	public void editProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Wait.explicitWait(projectSetupIcon, 10, driver);
		projectSetupIcon.click();
		Wait.explicitWait(projectsIcon, 10, driver);
	    projectsIcon.click();
	   
	    Thread.sleep(1000); j.executeScript("arguments[0].click();", editProject_Button);
	    Thread.sleep(1000); projectName.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
		address.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
		projectDescripiton.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
		
		projectName.sendKeys(utility.Excel.Regression_importDataFromExcel("Projects",1,0)+" "+utility.UtilityClass.getRandomString(2));
		sectorType.click();
		Thread.sleep(1000);		
		list =driver.findElements(By.xpath("//mat-option//span"));
		arrayElements.addAll(list);	
		System.out.println("Sector list size: "+arrayElements.size());
		// Generate a random integer between 0 and sectorTypes.size()
		randomNumber = random.nextInt(arrayElements.size());		
		arrayElements.get(randomNumber).click();
		arrayElements.clear();
		
		address.sendKeys(utility.Excel.Regression_importDataFromExcel("Projects",1,5));	
		projectDescripiton.sendKeys(utility.Excel.Regression_importDataFromExcel("Projects",1,7));	
		Wait.explicitWait(updateButtonOfEditProject, 5, driver);
		updateButtonOfEditProject.click();
        Thread.sleep(2000);
	}

	

}
