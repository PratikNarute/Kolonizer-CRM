package randomData_devEnv;

import java.io.IOException;
import java.time.Duration;

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

import utility.UtilityClass;


public class ProjectSetup_Projects 
{

	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public ProjectSetup_Projects(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
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
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Civil 104')]")private WebElement departmentDropdown_Civil;
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Sale 104')]")private WebElement departmentDropdown_Sale;
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Lead 104')]")private WebElement departmentDropdown_Lead;
	@FindBy (xpath = "//mat-option//span[contains(text(),' Automation Department Production 104')]")private WebElement departmentDropdown_Production;
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
	@FindBy (xpath = "//td[contains(text(), 'Automation Project-One 104')] / parent :: tr// td //button")private WebElement editIcon_AutomationProject1;
//=============================================================================================================================================


	
	
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
	@FindBy (xpath = "//div[text()=' Edit Project '] /parent :: div /parent :: div / following-sibling :: div // button[text()=' Submit ']")private WebElement submitButtonOfEditProject;
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
		nameOfDepartment.sendKeys("Automation Department Civil "+utility.UtilityClass.getRandomIntegers(2));
		descriptionOfDepartment.sendKeys("The Mechanical Engineer will ");
		submitBottonOfDepartment.click();
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000);addProjectsButton.click();
		Thread.sleep(1000);addDepartmentIcon.click();
		nameOfDepartment.sendKeys("Automation Department Sale "+utility.UtilityClass.getRandomIntegers(2));
		descriptionOfDepartment.sendKeys("The Mechanical Engineer will ");
		submitBottonOfDepartment.click();
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000);addProjectsButton.click();
		addDepartmentIcon.click();
		nameOfDepartment.sendKeys("Automation Department Lead "+utility.UtilityClass.getRandomIntegers(2));
		descriptionOfDepartment.sendKeys("The Engineer will");
		submitBottonOfDepartment.click();
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000);addProjectsButton.click();
		addDepartmentIcon.click();
		nameOfDepartment.sendKeys("Automation Department Production "+utility.UtilityClass.getRandomIntegers(2));
		descriptionOfDepartment.sendKeys("The Engineer will ");
		submitBottonOfDepartment.click();
		Thread.sleep(2000);driver.navigate().refresh();
		
	}

	public void addProjects_AutomationProject_1() throws InterruptedException
	{
		projectName.sendKeys("Automation Project-One "+utility.UtilityClass.getRandomIntegers(2));
		saleable.sendKeys("1000000000000000");
		nonsaleable.sendKeys("10000000");
		
//		String TotalArea=totalArea.getAttribute("value");
//		a.assertEquals(TotalArea, "101000'0");
		
		sectorType.click();
		Thread.sleep(1000);
		sectorType_Land.click();
		address.sendKeys("Pune, maharashtra");		
		Thread.sleep(1000);
		departmentDropdown.click();
		Thread.sleep(1000);departmentDropdown_Civil.click();
		departmentDropdown_Sale.click();
		departmentDropdown_Lead.click();
		departmentDropdown_Production.click();
		departmentSubmitCheckBox.click();
	
		projectDescripiton.sendKeys(UtilityClass.getRandomString(30));
		a.assertAll();
		
	}
	public void addProjects_AutomationProject_2() throws InterruptedException
	{

		projectName.sendKeys("Automation Project-Two "+utility.UtilityClass.getRandomIntegers(2));
		saleable.sendKeys("1000000000000000");
		nonsaleable.sendKeys("10000000");
		
//		String TotalArea=totalArea.getAttribute("value");
//		a.assertEquals(TotalArea, "101000'0");
		
		sectorType.click();
		Thread.sleep(1000);
		sectorType_Land.click();
		address.sendKeys("Pune, maharashtra");		
		Thread.sleep(1000);
		departmentDropdown.click();
		Thread.sleep(1000);departmentDropdown_Civil.click();
		departmentDropdown_Sale.click();
		departmentDropdown_Lead.click();
		departmentDropdown_Production.click();
		departmentSubmitCheckBox.click();
	
		projectDescripiton.sendKeys("kjvfdkflj");
		a.assertAll();
	}
	public void assignProjectToAdmin() throws InterruptedException
	{
		userIconOfAdmin.click();
		veiwProfileOfAdmin.click();
		editIconOfAdmin.click();
		try
		{
		addIcon.click();
	
		projectDropdown2.click();
		Thread.sleep(1000);projectDropdown_AutomationProject1.click();
		assignDepartmentDropdown2.click();
		Thread.sleep(1000); assignDepartmentDropdown_Civil.click(); 
		assignDepartmentDropdown_Sale.click();
		assignDepartmentDropdown_Lead.click();
		assignDepartmentDropdown_Production.click();
		A.moveToElement(nameOfAdmin).click().build().perform();
	
		
		Thread.sleep(1000);addIcon.click();
		projectDropdown3.click();
		Thread.sleep(1000);projectDropdown_AutomationProject2.click();
		assignDepartmentDropdown3.click();
		Thread.sleep(1000);  assignDepartmentDropdown_Civil.click(); 
		assignDepartmentDropdown_Sale.click();
		assignDepartmentDropdown_Lead.click();
		assignDepartmentDropdown_Production.click();
		A.moveToElement(nameOfAdmin).click().build().perform();
		
				if(closeIconProject.isDisplayed()==true)
				{
					closeIconProject.click();
					Thread.sleep(1000);	closeIconProject.click();
					
				}
				System.out.println("ihukui");
	
	    }
		catch (ElementClickInterceptedException e)
		{
			a.assertTrue(true);
		}
		catch (NoSuchElementException e)
		{
			a.assertTrue(true);
		}
		finally
		{
			j.executeScript("arguments[0].click()", submitButtonOfAssignProjectUser);
			//submitButtonOfAssignProjectUser.click();
		}
		a.assertAll();
	}

	public void submitButtonOfAddProject()
	{
		submitButtonOfAddProject.click();
	}
	public void submitButtonOfEditProject()
	{
		submitButtonOfEditProject.click();
	}
	public void closeIcon()
	{
		closeIconProject.click();
	}

	public void clear()
	{
		 w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Project Name']")));
		
		// projectName.clear();
		 saleable.clear();
		 nonsaleable.clear();
		 

		 address.clear();
		 A.click(projectDescripiton).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
	
	}
	public void editProject() throws InterruptedException
	{
		boolean result=projectName.isEnabled();
		a.assertEquals(result, true);
		
		saleable.sendKeys("100000");
		nonsaleable.sendKeys("1000");
		
		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "101000'0");
		
		sectorType.click();
		Thread.sleep(1000);
		sectorType_Residential.click();
		
		address.sendKeys("Pune, maharashtra");
		projectDescripiton.sendKeys("kjvfdkflj");
		
		a.assertAll();
	}

	

}
