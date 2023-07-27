package randomData_devEnv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility.UtilityClass;



public class ProjectSetup_Users 
{
	
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public ProjectSetup_Users(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
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
	@FindBy (xpath = "//mat-option//span[contains(text(),'Testing')]")private WebElement selectParent_Dropdown_Testing;
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


	
	public void projectSetupIcon()
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Project Setup']")));
		projectSetupIcon.click();
	}
	public void userIcon()
	{	
		//userIcon.click();
		A.moveToElement(userIcon).click().build().perform();
	}
	public void addUserButton() throws InterruptedException
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='  Add User '] ")));
		//j.executeScript("arguments[0].scrollIntoVeiw(true)", addUserButton);
	    j.executeScript("window.scrollBy(1000,-1000)", "");
		Thread.sleep(1000);
		addUserButton.click();
	}
	public void editButton_AutomationUserOne()
	{
		j.executeScript("arguments[0].click()", editButton_AutomationUserOne);
	}
	public void addUsers_AutomationUser1() throws InterruptedException
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='name']")));
		nameUser.sendKeys("Automation User One "+UtilityClass.getRandomString(2));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@formcontrolname='gender'] ")));
		genderDropdown.click();
		Thread.sleep(1000);genderDropdown_Male.click();
		
		email.sendKeys("automation"+UtilityClass.getRandomString(2)+"@kolonizer.com");
		phone.sendKeys(UtilityClass.getRandomIntegers(7));
		alternatePhone.sendKeys(UtilityClass.getRandomIntegers(7));
		password.sendKeys("Automation@123");

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@formcontrolname='role_id']")));
		selectRoleDropdown.click();
		Thread.sleep(1000); selectRoleDropdown_AutomationRole1.click();
		
		address.sendKeys("Address: "+UtilityClass.getRandomString(15));
		pinCode.sendKeys("413411");
		
		areaDropdown.click();
		Thread.sleep(1000);areaDropdown_KV.click();
		
		selectProjectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		addIcon.click();
	
		selectProjectDropdown2.click();
		Thread.sleep(1000);	selectProjectDropdown_AutomationProject2.click();
		
	    j.executeScript("arguments[0].click()",selectDepartment);
	    Thread.sleep(2000);
	     j.executeScript("arguments[0].click()",selectDepartment_Civil);
      
		A.moveToElement(genderDropdown).click().build().perform();
		
	    j.executeScript("arguments[0].click()",selectDepartment2);
	    Thread.sleep(2000);
	    j.executeScript("arguments[0].click()",selectDepartment_Civil);
	    
	  	A.moveToElement(genderDropdown).click().build().perform();
	  	
		selectParent_Dropdown1.click();
		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_PratikNarute).click().build().perform();	
//		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_Testing).click().build().perform();
//		Thread.sleep(2000); A.moveToElement(selectParent_Dropdown_AutomationUserTwoabUt).click().build().perform();

	  	
	 	selectParent_Dropdown2.click();
		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_PratikNarute).click().build().perform();
//		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_Testing).click().build().perform();
//		Thread.sleep(2000); A.moveToElement(selectParent_Dropdown_AutomationUserTwoabUt).click().build().perform();

        j.executeScript("arguments[0].click()",specialOffers_CheckBox);		
	}
	public void addUsers_AutomationUser2() throws InterruptedException
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='name']")));
		nameUser.sendKeys("Automation User Two "+UtilityClass.getRandomString(2));
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@formcontrolname='gender'] ")));
		genderDropdown.click();
		Thread.sleep(1000); genderDropdown_Male.click();
		
		email.sendKeys("automation"+UtilityClass.getRandomString(2)+"@kolonizer.com");
		phone.sendKeys(UtilityClass.getRandomIntegers(7));
		alternatePhone.sendKeys(UtilityClass.getRandomIntegers(7));
		password.sendKeys("Automation@123");

		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-select[@formcontrolname='role_id']")));
		selectRoleDropdown.click();
		Thread.sleep(1000); selectRoleDropdown_AutomationRole1.click();
		
		address.sendKeys("Address: "+UtilityClass.getRandomString(15));
		pinCode.sendKeys("413411");
		
		areaDropdown.click();
		Thread.sleep(1000);areaDropdown_KV.click();
		
		selectProjectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		addIcon.click();
	
		selectProjectDropdown2.click();
		Thread.sleep(1000);	selectProjectDropdown_AutomationProject2.click();
		
		
	    j.executeScript("arguments[0].click()",selectDepartment);
	    Thread.sleep(2000);
	     j.executeScript("arguments[0].click()",selectDepartment_Civil);
      
		A.moveToElement(genderDropdown).click().build().perform();
		
	    j.executeScript("arguments[0].click()",selectDepartment2);
	    Thread.sleep(2000);
	    j.executeScript("arguments[0].click()",selectDepartment_Civil);
	    
	  	A.moveToElement(genderDropdown).click().build().perform();
	  	
		selectParent_Dropdown1.click();
		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_PratikNarute).click().build().perform();
//		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_Testing).click().build().perform();
		
	  	
	 	selectParent_Dropdown2.click();
		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_PratikNarute).click().build().perform();
//		Thread.sleep(2000);	A.moveToElement(selectParent_Dropdown_Testing).click().build().perform();

        j.executeScript("arguments[0].click()",specialOffers_CheckBox);	
	}
	public void submitButton()
	{
		submitButton.click();
	}
	public void editUserIcon()
	{
		editUserIcon.click();
	}
	public String getName()
	{
	
		return nameUser.getAttribute("value");
		
	}
	public String getEmail()
	{
		
		return email.getAttribute("value");	
	}
	public String getPhone()
	{
		
		return phone.getAttribute("value");	
	}
	public String getAddress()
	{	
		return address.getAttribute("value");	
	}
	public void clear()
	{
		nameUser.clear();
		email.clear();
		phone.clear();
		address.clear();
	}

	public void editUser() throws InterruptedException
	{	
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='name']")));
		String Name = getName();
		String Email= getEmail();
		String Phone = getPhone();
		String Address = getAddress();
		
		
	
		boolean gender=genderDropdown.isEnabled();
		a.assertEquals(gender, true);
	
		nameUser.clear();
		email.clear();
		phone.clear();
		address.clear();
		
		A.moveToElement(nameUser).click().sendKeys(Name).build().perform();
		email.sendKeys(Email);
		phone.sendKeys(Phone);
	    address.sendKeys(Address);
	    
		boolean projectDropdown=selectProjectDropdown.isEnabled();
		a.assertEquals(projectDropdown, true);
	

		boolean projectDropdown2=selectProjectDropdown2.isEnabled();
		a.assertEquals(projectDropdown2, true);
		
		selectDepartment.isEnabled();
		selectDepartment2.isEnabled();
		
		A.moveToElement(genderDropdown).perform();
		   
	    j.executeScript("arguments[0].click()",generatePasscode);	
	    
	    a.assertAll();
			
	
	}


	
	
	
	
	

}
