package randomData_devEnv;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import utility.UtilityClass;

public class ProjectSetup_Roles
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public ProjectSetup_Roles(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	
//=================================================================================================================================================
	@FindBy (xpath = "//td[contains(text(),'Atomation Role-One 104')]/ parent :: tr //td // button") private WebElement editIcon_AtomationRole1;
//==================================================================================================================================================
	
	@FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
	@FindBy (xpath = "//a[@href='/master/role'] / parent ::li ") private WebElement  roleIcon ;
	@FindBy (xpath = "//a[@href='/master/user'] / parent :: li") private WebElement userIcon;
	@FindBy (xpath = "//button[text()='  Add User '] ") private WebElement addUserButton;
	
	@FindBy (xpath = " //button[text()='  New Role ']") private WebElement addNewRole_Button ;
	@FindBy (xpath = "//input[@formcontrolname='name']") private WebElement  roleName ;

	@FindBy (xpath = " //textarea") private WebElement description  ;
	
	@FindBy (xpath = "//input[@id='2']") private WebElement permissionLeadCheckbox   ;
	@FindBy (xpath = "//input[@id='1']") private WebElement  permissionMasterCheckbox ;
	@FindBy (xpath = "//input[@id='3']") private WebElement  permissionSaleCheckbox ;
	
	@FindBy (xpath = "//button[text()=' Submit ']") private WebElement submitButton  ;
	@FindBy (xpath = " //mat-icon[text()='close']") private WebElement closeButton   ;
	@FindBy (xpath = " //tr[2]") private WebElement  updateIcon ;
	@FindBy (xpath = "//div[text()=' Message: Role Already Exists. ']") private WebElement errorMessage_DuplicateRole  ;
	
//=========================================================================================================================================	
		// Role dropdown start with 104
		@FindBy (xpath = "//mat-option//span[contains(text(),'Atomation Role-One 104')]") private WebElement selectRoleDropdown_AutomationRole1;
		@FindBy (xpath = "//mat-option//span[contains(text(),'Atomation Role-Two 104')]") private WebElement selectRoleDropdown_AutomationRole2;
		//=========================================================================================================================================
		// Project dropdown start with 104
		@FindBy (xpath = "//mat-select[@formcontrolname='id']") private WebElement selectProjectDropdown;
		@FindBy (xpath = "(//mat-select[@formcontrolname='id'])[2]") private WebElement selectProjectDropdown2;
		@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Project-One 104')]") private WebElement selectProjectDropdown_AutomationProject1;
		@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Project-Two 104')]") private WebElement selectProjectDropdown_AutomationProject2;
		//=========================================================================================================================================
		// Department dropdown start with 104
		@FindBy (xpath = "//mat-select[@formcontrolname='departments']") private WebElement selectDepartment;
		@FindBy (xpath = "(//mat-select[@formcontrolname='departments'])[2]") private WebElement selectDepartment2;
		@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Department Civil 104')]") private WebElement selectDepartment_Civil;
		//=========================================================================================================================================
		//edit icon of user one start with ab
		@FindBy (xpath ="//td[contains(text(),'Automation User One ab')]/parent :: tr // td//button")private WebElement editButton_AutomationUserOne;
		//=========================================================================================================================================
		@FindBy (xpath = "//input[@formcontrolname='name']") private WebElement nameUser;
		@FindBy (xpath = "//mat-select[@formcontrolname='gender'] ") private WebElement genderDropdown;
		@FindBy (xpath = "//span[text()='Male']") private WebElement genderDropdown_Male ;
		@FindBy (xpath = "//span[text()='Female']") private WebElement genderDropdown_Female;
		@FindBy (xpath = "//input[@formcontrolname='email']") private WebElement email;
		@FindBy (xpath = "//input[@formcontrolname='phone']") private WebElement phone;
		@FindBy (xpath = "//input[@formcontrolname='alternate_phone']") private WebElement alternatePhone;
		@FindBy (xpath = "//input[@formcontrolname='password']") private WebElement password;


		@FindBy (xpath = "(//mat-option//span)[1]") private WebElement selectProjectDropdown_Infrastructure;
		
		
		@FindBy (xpath = "(//mat-select[@formcontrolname='parents']) [1]")private WebElement selectParent_Dropdown1;
		@FindBy (xpath = "(//mat-select[@formcontrolname='parents']) [2]")private WebElement selectParent_Dropdown2;
		@FindBy (xpath = "//mat-option//span[text()=' Pratik Narute ']")private WebElement selectParent_Dropdown_PratikNarute;
		
		@FindBy (xpath = "//mat-icon[text()='add']") private WebElement addIcon;
		@FindBy (xpath= "//mat-icon[text()='clear']") private WebElement closeIcon;
		@FindBy (xpath = "(//mat-icon[text()='clear'])[2]") private WebElement closeIcon2;
		@FindBy (xpath = "//mat-select[@formcontrolname='role_id']") private WebElement selectRoleDropdown;
		@FindBy (xpath = "(//mat-option//span)[2]") private WebElement selectRoleDropdown_SalesManager;

		@FindBy (xpath = "//textarea[@formcontrolname='address']") private WebElement address;
		@FindBy (xpath = "//input[@formcontrolname='postal_code']") private WebElement pinCode;
		@FindBy (xpath = "//mat-select[@formcontrolname='city']") private WebElement cityDropdown;
		@FindBy (xpath = "//mat-select[@formcontrolname='area']")private WebElement areaDropdown;
		@FindBy (xpath = "(//mat-option//span[text()=' K.V.Nagar Barshi S.O '])") private WebElement areaDropdown_KV;
		@FindBy (xpath = "(//mat-checkbox[@formcontrolname='specialOffer'] //span)[1]") private WebElement specialOffers_CheckBox;
		@FindBy (xpath = "//button[text()=' Generate Passcode ']")private  WebElement generatePasscode;
		@FindBy (xpath = "//mat-icon[text()='edit'] ") private WebElement editUserIcon;
		
		@FindBy (xpath = "//div[text()=' Message: , ']")private WebElement errorMeassage_DuplicateUser;
//	@FindBy (xpath = " ") private WebElement   ;
	
	
	public void projectSetupIcon()
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Project Setup']")));
	
		projectSetupIcon.click();
		
	}
	public void roleIcon() throws InterruptedException
	{
	
		roleIcon.click();
	
	}
	public void addNewRole_Button()
	{
		addNewRole_Button.click();
	}
    public void editIcon_AtomationRole1()
    {
    	j.executeScript("arguments[0].click()",editIcon_AtomationRole1);
    }
	public void addNewRole_AtomationRole1() throws InterruptedException
	{	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='name']")));
		roleName.sendKeys("Atomation Role-One "+UtilityClass.getRandomIntegers(2));
		
		description.sendKeys("roles and responsibilities template is used to create documents that outline the job description, duties and requirements of a specific position at your business. These documents are often used in team settings to differentiate between the roles of each team member and establish a hierarchy of roles to show supervisory relationships. They help team members understand who handles each part of the project to avoid confusion.");
			
		permissionMasterCheckbox.click();		
		permissionLeadCheckbox.click();	
		permissionSaleCheckbox.click();
		
//      ==============================================================================
		//Loop for Access permission
		for (int i=1; i<=84; i++)
		{
			boolean result= driver.findElement(By.xpath("(//mat-slide-toggle) ["+i+"]")).isEnabled();
			Assert.assertEquals(result, true);
			
			if ((i==4 || i==60 || i==80))
			{
				driver.findElement(By.xpath("(//mat-slide-toggle) ["+i+"]")).click();
			}
		}
//      ===============================================================================	
	}
	public void addNewRole_AtomationRole2()
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-placeholder='Enter Role Name']")));
		roleName.sendKeys("Atomation Role-Two "+UtilityClass.getRandomIntegers(2));
		
		description.sendKeys("roles and responsibilities template is used to create documents that outline the job description, duties and requirements of a specific position at your business. These documents are often used in team settings to differentiate between the roles of each team member and establish a hierarchy of roles to show supervisory relationships. They help team members understand who handles each part of the project to avoid confusion.");
			
		permissionMasterCheckbox.click();		
		permissionLeadCheckbox.click();	
		permissionSaleCheckbox.click();
		
//     //      ==============================================================================
		//Loop for Access permission
		for (int i=1; i<=84; i++)
		{
			boolean result= driver.findElement(By.xpath("(//mat-slide-toggle) ["+i+"]")).isEnabled();
			Assert.assertEquals(result, true);
			
			if ((i==4 || i==60 || i==80))
			{
				driver.findElement(By.xpath("(//mat-slide-toggle) ["+i+"]")).click();
			}
		}
//      ===============================================================================	=====================================================================
	}

	public void editNewRole() throws InterruptedException
	{
		String RoleName=roleName.getAttribute("value");
		roleName.clear();
		description.clear();
		
		roleName.sendKeys(RoleName);
		description.sendKeys("roles and responsibilities template is used to create documents that outline the job description, duties and requirements of a specific position at your business. These documents are often used in team settings to differentiate between the roles of each team member and establish a hierarchy of roles to show supervisory relationships. They help team members understand who handles each part of the project to avoid confusion.");
		
//      ==============================================================================
		//Loop for Access permission
		for (int i=1; i<=80; i++)
		{
			boolean result= driver.findElement(By.xpath("(//mat-slide-toggle) ["+i+"]")).isEnabled();
			Assert.assertEquals(result, true);
		}
//      ===============================================================================	
	}
	public boolean elementNotPrsent()
	{
		return true;
	}

	public void submitButton()
	{
		submitButton.click();
	}
	public void closeButton()
	{
		closeButton.click();
	}
	
	
	

	
	

}
