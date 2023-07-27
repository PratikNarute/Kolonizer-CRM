package Parameterization;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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



public class ProjectSetup_Users 
{
	
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	List<WebElement> elements;
    ArrayList<WebElement> arrayProjectElements;
    ArrayList<WebElement> arrayDepartmentElements;
    ArrayList<WebElement> arrayRoleElements;
    Random random;
	
	public ProjectSetup_Users(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
		arrayProjectElements = new ArrayList<WebElement>();
		arrayDepartmentElements = new ArrayList<WebElement>();
		arrayRoleElements = new ArrayList<WebElement>();
		random = new Random();
	}
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
	
	//=========================================================================================================================================
	
	//=========================================================================================================================================
	
	//=========================================================================================================================================
	@FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
	@FindBy (xpath = "//a[@href='/master/user'] / parent :: li") private WebElement userIcon;
	@FindBy (xpath = "//button[text()='  Add User '] ") private WebElement addUserButton;
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
	@FindBy (xpath = "//mat-option//span[contains(text(),'Pratik')]")private WebElement selectParent_Dropdown_PratikNarute;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Amit')]")private WebElement selectParent_Dropdown_Admin;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation User Two ab']")private WebElement selectParent_Dropdown_AutomationUserTwoab;
	
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
	@FindBy (xpath = "//button[text()=' Submit '] ") private WebElement submitButton;

	@FindBy (xpath = "//mat-icon[text()='edit'] ") private WebElement editUserIcon;
	
	@FindBy (xpath = "//div[text()=' Message: , ']")private WebElement errorMeassage_DuplicateUser;


	public void editButton_AutomationUserOne()
	{
		j.executeScript("arguments[0].click()", editButton_AutomationUserOne);
	}
	public void CreateUsers() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(7000);
		projectSetupIcon.click();
		Wait.explicitWait(userIcon, 10, driver);
		A.moveToElement(userIcon).click(userIcon).build().perform();
		int row=1;
		int randomNumber;
		
		for (int user=1; user<=3; user++)
		{
			System.out.println("Start to create user: "+Excel.importDataFromExcel("Users", user, 0));
			j.executeScript("window.scrollBy(1000,-1000)", "");
			Thread.sleep(1000);
			addUserButton.click();
			Wait.explicitWait(nameUser, 10, driver);
			nameUser.sendKeys(Excel.importDataFromExcel("Users", user, 0)+" "+UtilityClass.getRandomString(2));
			Thread.sleep(1000);
			genderDropdown.click();
			Thread.sleep(1000);genderDropdown_Male.click();

			email.sendKeys(Excel.importDataFromExcel("Users", user, 4)+UtilityClass.getRandomString(2)+"@kolonizer.com");
			phone.sendKeys(UtilityClass.getRandomIntegers(8));
			alternatePhone.sendKeys(UtilityClass.getRandomIntegers(8));
			password.sendKeys(Excel.importDataFromExcel("Users", user, 5));
			
			Wait.explicitWait(selectProjectDropdown, 10, driver);
	    	selectProjectDropdown.click();
			Thread.sleep(1000);
		    elements=driver.findElements(By.xpath("//mat-option//span"));
		    arrayProjectElements.addAll(elements);
		    int sizeProjectList=arrayProjectElements.size();
		    arrayProjectElements.clear();
		    A.moveToElement(genderDropdown).click().build().perform();
		    
			
		    for (int index=0; index<sizeProjectList; index++)
		    {
		    	Thread.sleep(1000);
		    	driver.findElement(By.xpath("(//mat-select[@formcontrolname='id'])["+(index+1)+"]")).click();
				Thread.sleep(1000);
				elements=driver.findElements(By.xpath("//mat-option//span"));
				arrayProjectElements.addAll(elements);

		    	    WebElement Listproject=arrayProjectElements.get(index);
		    		Thread.sleep(1000);
		    	    Listproject.click();
				    
		    	    driver.findElement(By.xpath("(//mat-select[@formcontrolname='departments'])["+(index+1)+"]")).click();
				    Thread.sleep(1000);
				    elements=driver.findElements(By.xpath("//mat-option//span"));
				    arrayDepartmentElements.addAll(elements);
				    
				    for (int dept=0; dept<arrayDepartmentElements.size(); dept++)
				    {
				       WebElement selectDepts= arrayDepartmentElements.get(dept);
				       Wait.explicitWait(selectDepts, 10, driver);	       
				       selectDepts.click();
				    }  
				     
				   A.moveToElement(addIcon).click().build().perform(); 
				   WebElement ParentRole= driver.findElement(By.xpath("(//mat-select[@formcontrolname='parents']) ["+(index+1)+"]"));
				   Wait.explicitWait(ParentRole, 10, driver);
				   ParentRole.click();
				   Thread.sleep(1000);
				   selectParent_Dropdown_PratikNarute.click();
				   addIcon.click();
				   arrayProjectElements.clear();
				   arrayDepartmentElements.clear();
				   A.sendKeys(Keys.ARROW_DOWN).perform();
				   A.sendKeys(Keys.ARROW_DOWN).perform();
		    }
		    Wait.explicitWait(selectRoleDropdown, 10, driver);
		    selectRoleDropdown.click();
		    Thread.sleep(1000);
		    elements= driver.findElements(By.xpath("//mat-option//span[contains(text(),'"+Excel.importDataFromExcel("Users", user, 9)+"')]"));
		    elements.get(0).click();

		    A.sendKeys(Keys.ARROW_DOWN).perform();
			A.sendKeys(Keys.ARROW_DOWN).perform();
		    address.sendKeys(Excel.importDataFromExcel("Users", user, 10));
		    
		    pinCode.sendKeys("413411");
		    Thread.sleep(2000);
		    areaDropdown.click();
		    Thread.sleep(1000);
		    areaDropdown_KV.click();
		    Wait.explicitWait(submitButton, 10, driver);
		    j.executeScript("arguments[0].scrollIntoView();", submitButton);
		    Thread.sleep(2000);
		    submitButton.click();Thread.sleep(2000);
		    driver.navigate().refresh();
		    System.out.println("=======================================================================================");
		   
		    
		}


	
	
	
	
	
	}
}
