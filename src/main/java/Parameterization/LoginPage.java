package Parameterization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class LoginPage {
	
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	 @FindBy (xpath= "//input [@formcontrolname='username']") private WebElement username;
	 @FindBy (xpath= "//input [@formcontrolname='password']") private WebElement loginPassword;
	 @FindBy (xpath= "//span[text()='login'] /parent :: button") private WebElement loginbutton;
	 
		@FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
		@FindBy (xpath = "//a[@href='/master/user'] / parent :: li") private WebElement userIcon;
		
		@FindBy (xpath ="//td[text()='Automation User One']/parent :: tr // td//button")private WebElement editButton_AutomationUserOne;
		@FindBy (xpath = "//button[text()='  Add User '] ") private WebElement addUserButton;
		@FindBy (xpath = "//input[@formcontrolname='name']") private WebElement nameUser;
		@FindBy (xpath = "//mat-select[@formcontrolname='gender'] ") private WebElement genderDropdown;
		@FindBy (xpath = "//span[text()='Male']") private WebElement genderDropdown_Male ;
		@FindBy (xpath = "//span[text()='Female']") private WebElement genderDropdown_Female;
		@FindBy (xpath = "//input[@formcontrolname='email']") private WebElement email;
		@FindBy (xpath = "//input[@formcontrolname='phone']") private WebElement phone;
		@FindBy (xpath = "//input[@formcontrolname='alternate_phone']") private WebElement alternatePhone;
		@FindBy (xpath = "//input[@formcontrolname='password']") private WebElement password;
		@FindBy (xpath = "//mat-select[@formcontrolname='id']") private WebElement selectProjectDropdown;
		@FindBy (xpath = "(//mat-select[@formcontrolname='id'])[2]") private WebElement selectProjectDropdown2;
		@FindBy (xpath = "//mat-option//span[text()=' Automation Project-1 ']") private WebElement selectProjectDropdown_AutomationProject1;
		@FindBy (xpath = "//mat-option//span[text()=' Automation Project-2 ']") private WebElement selectProjectDropdown_AutomationProject2;
		@FindBy (xpath = "(//mat-option//span)[1]") private WebElement selectProjectDropdown_Infrastructure;
		@FindBy (xpath = "//mat-select[@formcontrolname='departments']") private WebElement selectDepartment;
		@FindBy (xpath = "(//mat-select[@formcontrolname='departments'])[2]") private WebElement selectDepartment2;
		@FindBy (xpath = "//span[text()=' Lead ']") private WebElement selectDepartment_Lead;
		@FindBy (xpath = "//mat-option//span[text()=' Civil ']") private WebElement selectDepartment_Civil;
		
		@FindBy (xpath = "(//mat-select[@formcontrolname='parents']) [1]")private WebElement selectParent_Dropdown1;
		@FindBy (xpath = "(//mat-select[@formcontrolname='parents']) [2]")private WebElement selectParent_Dropdown2;
		@FindBy (xpath = "//mat-option//span[text()=' Pratik Narute ']")private WebElement selectParent_Dropdown_PratikNarute;
		
		@FindBy (xpath = "//mat-icon[text()='add']") private WebElement addIcon;
		@FindBy (xpath= "//mat-icon[text()='clear']") private WebElement closeIcon;
		@FindBy (xpath = "(//mat-icon[text()='clear'])[2]") private WebElement closeIcon2;
		@FindBy (xpath = "//mat-select[@formcontrolname='role_id']") private WebElement selectRoleDropdown;
		@FindBy (xpath = "(//mat-option//span)[2]") private WebElement selectRoleDropdown_SalesManager;
		@FindBy (xpath = "//mat-option//span[text()='Atomation Role-1 ']") private WebElement selectRoleDropdown_AutomationRole1;
		@FindBy (xpath = "//mat-option//span[text()='Atomation Role-2 ']") private WebElement selectRoleDropdown_AutomationRole2;
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

	 
	 public LoginPage (WebDriver driver)
	 {
			PageFactory.initElements(driver, this);
			this.driver = driver;
			w = new  WebDriverWait(driver, Duration.ofSeconds(30));
			a = new SoftAssert();
			A = new Actions(driver);
			j =  (JavascriptExecutor)driver;
	 }

	 public void username()
	 {
		 username.sendKeys("pratik@kolonizer.com");
//		 username.sendKeys("amit@kolonizer.com");
//		 username.sendKeys("stock@kolonizer.com");    //  7april-new 10, call 2 times to 10 lead (primary) // 9april-call 3 times to 2 lead- // 10april-10 new lead 
//		 username.sendKeys("testing@kolonizer.com");              // 7april-new 11
//		 username.sendKeys("automationabRY@kolonizer.com");   // 8april-new 10 // 9april-new 10
//		 username.sendKeys("narute@kolonizer.com");
//		 username.sendKeys("mamnoon@kolonizer.com");
//		 username.sendKeys("pratik@gmail.com");
//		 username.sendKeys("sprint9@kolonizer.com");
//		 username.sendKeys("sprint12@kolonizer.com");	 
	 }
	 public void password()
	 {
//		 loginPassword.sendKeys("Pratik@123");
		 loginPassword.sendKeys("123");
//		 loginPassword.sendKeys("Mamnoon@123");
//		 loginPassword.sendKeys("Stock@123");
//		 loginPassword.sendKeys("Payment@123");
//		 loginPassword.sendKeys("Amreen@123");

	 }
	 public void loginbutton()
	 {
		 loginbutton.click();
	 }

}
