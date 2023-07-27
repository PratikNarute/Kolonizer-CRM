package Regression;

import java.io.IOException;
import java.time.Duration;

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

public class Property_Type 
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public Property_Type(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	

	
	//===========================================================================================================================================================
	
	//Automation property start with 104
	@FindBy (xpath = "//td[contains(text(),'Automation 1BHK property 104')] / parent :: tr // td // button")private WebElement editButton_Automation_1BHK_Property;
	//===========================================================================================================================================================
	
	   @FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
	@FindBy (xpath = "//div [text()='Properties']") private WebElement propertiesIcon;
	@FindBy (xpath = "//a[@href='/master/property_type'] / parent :: li") private WebElement propertyTypeIcon;
	
	@FindBy (xpath = "//button[text()=' New Product Type ']") private WebElement newPropertyTypeButton;
	@FindBy (xpath = "//input[@formcontrolname='name']") private WebElement nameOfProperty;
	@FindBy (xpath = "//textarea[@formcontrolname='description']") private WebElement description;
	@FindBy (xpath = "//button[text()=' Submit ']") private WebElement submitButton;
	@FindBy (xpath = "//button[contains(text(), 'Update')]") private WebElement updateProperty;
	
	@FindBy (xpath = "//div[text()=' Message:  ']")private WebElement errorMessage_DuplicateProperty;
	@FindBy (xpath = "//button[@class='pushable close-btn ng-star-inserted']") WebElement editProperty;

	

	public void createPropertyTypes() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Thread.sleep(3000);
		Wait.explicitWait(propertiesIcon, 10, driver);
		propertiesIcon.click();
		Wait.explicitWait(propertyTypeIcon, 10, driver);
		propertyTypeIcon.click();
		for (int propertyType=1; propertyType<=1; propertyType++)
		{
			System.out.println("Start to create prperty type: "+Excel.Regression_importDataFromExcel("Property Types", propertyType, 0)+" "+UtilityClass.getRandomString(1));
			Thread.sleep(2000);j.executeScript("window.scrollBy(1000,-1000)");Thread.sleep(2000);
			newPropertyTypeButton.click();
			Wait.explicitWait(nameOfProperty, 10, driver);
			nameOfProperty.sendKeys(Excel.Regression_importDataFromExcel("Property Types", propertyType, 0)+" "+UtilityClass.getRandomString(1));
			description.sendKeys(Excel.Regression_importDataFromExcel("Property Types", propertyType, 1)+" "+UtilityClass.getRandomString(1));
			Wait.explicitWait(submitButton, 10, driver);
			submitButton.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			System.out.println("=============================================================");
		}
	
		
	}
	public void editPropertyTypes() throws InterruptedException, EncryptedDocumentException, IOException
	{
		propertiesIcon.click();
		Wait.explicitWait(propertyTypeIcon, 10, driver);
		propertyTypeIcon.click();
		for (int propertyType=1; propertyType<=1; propertyType++)
		{
			System.out.println("Start to create prperty type: "+Excel.Regression_importDataFromExcel("Property Types", propertyType, 0)+" "+UtilityClass.getRandomString(1));
			Thread.sleep(2000);	j.executeScript("arguments[0].click();", editProperty);Thread.sleep(2000);
			Wait.explicitWait(nameOfProperty, 10, driver);
			nameOfProperty.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			description.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			
			nameOfProperty.sendKeys(Excel.Regression_importDataFromExcel("Property Types", propertyType, 0)+" "+UtilityClass.getRandomString(1));
			description.sendKeys(Excel.Regression_importDataFromExcel("Property Types", propertyType, 1)+" "+UtilityClass.getRandomString(1));
			
			Wait.explicitWait(updateProperty, 10, driver);
			updateProperty.click();
			Thread.sleep(2000);
			System.out.println("=============================================================");
		}
	
		
	}
}
