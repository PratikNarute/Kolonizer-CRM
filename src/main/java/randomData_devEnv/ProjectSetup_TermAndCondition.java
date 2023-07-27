package randomData_devEnv;

import java.time.Duration;

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

import utility.UtilityClass;

public class ProjectSetup_TermAndCondition {
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
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
	@FindBy (xpath = "//input[@placeholder='Enter Title']")private WebElement editName;
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
	public void addTag() throws InterruptedException
	{
		tagIcon.click();
		Thread.sleep(1000); searchOrCreateTag.sendKeys("Automation tag: Bank "+UtilityClass.getRandomIntegers(3));
		Thread.sleep(1000); String Bank= searchOrCreateTag.getAttribute("value");
		Thread.sleep(1000); searchOrCreateTag.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000); searchOrCreateTag.sendKeys("Automation tag: Organization "+UtilityClass.getRandomIntegers(3));
		Thread.sleep(1000); String Organization= searchOrCreateTag.getAttribute("value");
		Thread.sleep(1000); searchOrCreateTag.sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);	searchOrCreateTag.sendKeys(Bank);
		Thread.sleep(2000); A.moveToElement(selectTag_Bank).click().perform();
		searchOrCreateTag.clear();
		Thread.sleep(1000); searchOrCreateTag.sendKeys(Organization);
		Thread.sleep(2000); A.moveToElement(selectTag_Organization).click().perform();
		searchOrCreateTag.clear();
			
	}
	public void toCheckThatSelectedTag()
	{
		boolean bank=selectData_Bank.isDisplayed(); a.assertEquals(bank, true);
		boolean organization=selectData_Organization.isDisplayed(); a.assertEquals(organization, true);
		a.assertAll();	
	}
	public void addTermAndConditions() throws InterruptedException
	{
		A.moveToElement(name).click().build().perform();
		Thread.sleep(1000);name.sendKeys("Automation_Term and Conditions "+UtilityClass.getRandomIntegers(2));
		description.sendKeys("If you're experiencing an issue on Instagram, please follow these troubleshooting steps. Keep in mind that you should always make sure you're running the latest version of the Instagram app as well as the latest version of your phone or tablet's operating system before following these steps.");
	}
	public void ckeckThatDragAndDropFunctionalityWorkingProperlyOrNot() throws InterruptedException
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//mat-panel-title[contains(text(), ' Automation_Term and Conditions 104')] / parent :: span")));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//mat-expansion-panel)[1]")));
		
//		A.dragAndDrop(drag, drop).build().perform();
		
		 A.moveToElement(drag).clickAndHold(drag).pause(Duration.ofSeconds(3)).moveToElement(drop).pause(Duration.ofSeconds(1)).release(drop).build().perform();   
		 Thread.sleep(2000); j.executeScript("window.scrollBy(1000,10000)", "");
		 Thread.sleep(2000); updateSorting.click();
	}
	
	public void automationTermAndCondition_ButtonBox() throws InterruptedException 
	    {
	        j.executeScript("arguments[0].scrollIntoView();", automationTermAndCondition_ButtonBox);
		    Thread.sleep(2000); j.executeScript("arguments[0].click()", automationTermAndCondition_ButtonBox);
		}
	public String getDescription()
	{
		System.out.println(editDescription_AutomationTermAndConditions.getAttribute("value"));
		return editDescription_AutomationTermAndConditions.getAttribute("value");

	}
	public void editTermAndCondition() throws InterruptedException
	{
		String Edit=editName.getAttribute("value");
		String description =  getText_Description.getText();
		//editDescription.sendKeys(Keys.chord(Keys.CONTROL ,"a", Keys.DELETE));	
		editName.clear();
		A.click(editDescription_AutomationTermAndConditions).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

		editName.sendKeys(Edit);
		editDescription_AutomationTermAndConditions.sendKeys("Drop");
	}
	public void logOut()
	{
		userIconOfAdmin.click();
		logoutButton.click();
	}
    public void logIn()
    {
	   	 username.sendKeys("pratik@kolonizer.com");
	   	 loginPassword.sendKeys("Pratik@123");
	   	 loginbutton.click();
    }
	
	public void update ()
	{
		update.click();
	}
}
