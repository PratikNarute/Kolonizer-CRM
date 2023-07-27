package Parameterization;

import java.io.IOException;
import java.time.Duration;
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

public class Properties_PropertyPriceAndStatus 
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	Random random;
	int randomNumber;
	
	public Properties_PropertyPriceAndStatus(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	
	@FindBy (xpath = "//mat-select[@formcontrolname='project_id']") private WebElement projectDropdown;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Project-One 104')]") private WebElement selectProjectDropdown_AutomationProject1;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Project-Two 104')]") private WebElement selectProjectDropdown_AutomationProject2;
	
	@FindBy (xpath = "//mat-select[@formcontrolname='refrence_property_name']") private WebElement propertyTypeDropdown;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation 1BHK property 104')]") private WebElement propertyTypeDropdown_Automation_1BHK_Property;
	@FindBy (xpath = "//mat-option//span[contains(text(),'Automation 2BHK property 104')]") private WebElement propertyTypeDropdown_Automation_2BHK_Property;
	
	@FindBy (xpath = "//mat-select[@formcontrolname='project_property_type_id']")private WebElement projectBlocks_Dropdown;
	@FindBy (xpath = "//mat-option//span[contains(text(), ' Automation P1 Block-1 104')]")private WebElement projectBlocks_Dropdown_P1_B1;
	@FindBy (xpath = "//mat-option//span[contains(text(), ' Automation P1 Block-2 104')]")private WebElement projectBlocks_Dropdown_P1_B2;
	@FindBy (xpath = "//mat-option//span[contains(text(), ' Automation P2 Block-1 104')]")private WebElement projectBlocks_Dropdown_P2_B1;
	@FindBy (xpath = "//mat-option//span[contains(text(), ' Automation P2 Block-2 104')]")private WebElement projectBlocks_Dropdown_P2_B2;
	
	
	@FindBy (xpath = "//input[@formcontrolname='total_amount_property_and_property_feature']") private WebElement totalPropertyPrice;
	
	@FindBy (xpath = "//div[@formarrayname='property_feature'] //div//label[contains(text(),'Automation feature 104')]") private WebElement propertyFeatures_AutomationFeature;
	
	@FindBy (xpath = "//div [text()='Properties']") private WebElement propertiesIcon;
	@FindBy (xpath = "//a[@href='/master/property'] / parent :: li") private WebElement propertyPriceAndStatusIcon ;
	@FindBy (xpath = "//button[text()=' Add Properties ']") private WebElement addPropertiesButton;
	
	@FindBy (xpath = "//td[contains(text(),'Automation 1BHK property NO -2 104')] / parent :: tr // td // button")private WebElement editButtonOf_Automation_1BHK_propertyNO_2;

	@FindBy (xpath = "//input[@formcontrolname='number']") private WebElement propertyNumber;
	@FindBy (xpath = "//input[@formcontrolname='length']") private WebElement length;
	@FindBy (xpath = "//input[@formcontrolname='breadth']") private WebElement breadth;
	@FindBy (xpath = "//input[@formcontrolname='property_size']") private WebElement totalArea;
	@FindBy (xpath = "//input[@id='rate']") private WebElement rate;
	@FindBy (xpath = "//input[@formcontrolname='price']") private WebElement totalAmount;
	@FindBy (xpath = "//mat-panel-title[text()='Property Feature ']") private WebElement propertyFeaturesButton;
	@FindBy (xpath = "//mat-select[@formcontrolname='status']") private WebElement statusDropdown;
	@FindBy (xpath = "//mat-option//span[text()='Registered']") private WebElement statusDropdown_Registered;
	@FindBy (xpath = "//mat-option//span[text()='Booked']") private WebElement statusDropdown_booked;
	@FindBy (xpath = "//mat-option//span[text()='Pre Booked']") private WebElement statusDropdown_preBooked;
	
	@FindBy (xpath = "//textarea[@formcontrolname='description']") private WebElement description;
	@FindBy (xpath = "//button[text()=' Submit ']") private WebElement submitButton;
	@FindBy (xpath = "//mat-icon[text()='edit']") private WebElement editIcon;
	

	@FindBy (xpath = "//mat-icon[text()='close']") private WebElement closeIcon;
	
	@FindBy (xpath = "//div[text()=' Message:  ']")private WebElement errorMessageDuplicatePropertyNo;
    @FindBy (xpath = "//button[text()=' Add Property Unit Details ']")private WebElement addPropertyUnit_Button;
    @FindBy (xpath= "//span[text()='Add Tag']/parent::div/parent::div") WebElement addTag_Button;
	
	
	
	public void propertiesIcon()
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div [text()='Properties']")));
		propertiesIcon.click();
	}
	public void propertyPriceAndStatusIcon()
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div [text()='Properties']")));
		propertyPriceAndStatusIcon.click();
	}
	public void editButtonOf_Automation_1BHK_propertyNO_2()
	{
		j.executeScript("arguments[0].click()", editButtonOf_Automation_1BHK_propertyNO_2);
	}
	public void addPropertiesButton()
	{
		j.executeScript("arguments[0].click()",addPropertyUnit_Button);
	}
//=======================================================================================================================================
    //	Project 1
	public void createPropperties() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		propertiesIcon.click();
		Thread.sleep(2000);
		propertyPriceAndStatusIcon.click();
		for (int properties=1; properties<=24; properties++)
		{
			System.out.println("Start to create Property no: ("+Excel.importDataFromExcel("Property Unit Details", properties, 0)+") under "+Excel.importDataFromExcel("Property Unit Details", properties, 2));
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			j.executeScript("arguments[0].click()",addPropertyUnit_Button);
			Wait.explicitWait(projectDropdown, 10, driver);
			projectDropdown.click();
			Thread.sleep(1000); 
			driver.findElement(By.xpath("//mat-option//span[contains(text(),'"+Excel.importDataFromExcel("Property Unit Details", properties, 1)+"')]")).click();
			
			Wait.explicitWait(projectBlocks_Dropdown, 10, driver);
			projectBlocks_Dropdown.click();
			Thread.sleep(1000); 
			driver.findElement(By.xpath("//mat-option//span[contains(text(),'"+Excel.importDataFromExcel("Property Unit Details", properties, 2)+"')]")).click();
		
			addTag_Button.click();
			List<WebElement> tagList=driver.findElements(By.xpath("//button[text()='Apply']"));
			Random random = new Random();
			randomNumber=random.nextInt((tagList.size()-1));
			tagList.get(randomNumber).click();
			
			propertyTypeDropdown.click();
			Thread.sleep(2000); 
			List<WebElement> elementList=driver.findElements(By.xpath("//mat-option//span"));
			randomNumber=random.nextInt((elementList.size()-1));
			elementList.get(randomNumber).click();
			
			propertyNumber.sendKeys(Excel.importDataFromExcel("Property Unit Details", properties, 0)+" "+utility.UtilityClass.getRandomString(2));
			
			length.sendKeys(Excel.importDataFromExcel("Property Unit Details", properties, 4));
			breadth.sendKeys(Excel.importDataFromExcel("Property Unit Details", properties, 5));
			Thread.sleep(2000);
			A.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(2000);
			Wait.explicitWait(rate, 10, driver);
			rate.clear();
			rate.sendKeys("100");
			
			propertyFeaturesButton.click();
			Thread.sleep(1000);	
			
			WebElement feature=driver.findElement(By.xpath("//div[@formarrayname='property_feature'] //div//label[contains(text(),'"+Excel.importDataFromExcel("Property Features", 1, 0)+"')]"));
			Wait.explicitWait(feature, 10, driver);
			feature.click();
			
			description.sendKeys(Excel.importDataFromExcel("Property Unit Details", properties, 11));
			
			submitButton.click();	
			System.out.println("=================================================================================");
		
		}
	
	}
	
}
