package Regression;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility.Excel;
import utility.UtilityClass;
import utility.Wait;

public class Properties_Features
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions mouseAction;
	JavascriptExecutor j ;
	
	public Properties_Features(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		mouseAction = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	
	//========================================================================================================================================================
		@FindBy (xpath = "//button[@class='pushable close-btn']") private WebElement editButton_feature;
	//========================================================================================================================================================
		
		@FindBy (xpath = "//div [text()='Properties']") private WebElement propertiesIcon;
		@FindBy (xpath = "//input[@placeholder='Add Feature ']") private WebElement addFeature;
		@FindBy (xpath = "//input[@placeholder='Add Feature Price ']") private WebElement addFeaturePrice;
		@FindBy (xpath = "//span[text()=' + '] / parent :: button") private WebElement addIcon;
		@FindBy (xpath = "//button[contains(text(), 'Update')]") private WebElement updateIcon;
		@FindBy (xpath = "//input[@placeholder='Enter Feature']")private WebElement editFeature;
		@FindBy (xpath = "//input[@placeholder='Enter Feature Price']") private WebElement editFeaturePrice;
		@FindBy (xpath = "//button[text()=' Update ']") private WebElement updateButton;
		@FindBy (xpath = "//a[@href='/master/property_feature'] / parent :: li") private WebElement propertyFeatureIcon;

		
//		@FindBy (xpath = "") private WebElement dshkd;
	
	

	public void createFeatures() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		mouseAction.moveToElement(propertiesIcon).click(propertiesIcon).build().perform();
		Thread.sleep(1000); propertyFeatureIcon.click();
		for (int feature=1; feature<=1; feature++)
		{
			Thread.sleep(2000);	driver.navigate().refresh();
			Thread.sleep(2000);
			addFeature.sendKeys(Excel.Regression_importDataFromExcel("Property Features", feature, 0)+" "+utility.UtilityClass.getRandomString(1));
			Wait.explicitWait(addFeature, 10, driver);
			addFeaturePrice.sendKeys("100");	
			addIcon.click();
		}
		
	}
	public void editFeatures() throws EncryptedDocumentException, IOException, InterruptedException
	{
		mouseAction.moveToElement(propertiesIcon).click(propertiesIcon).build().perform();
		Thread.sleep(1000); propertyFeatureIcon.click();
		
		for (int feature=1; feature<=1; feature++)
		{	
			Thread.sleep(1000);
			j.executeScript("arguments[0].click();", editButton_feature);
			editButton_feature.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			addFeaturePrice.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			addFeature.sendKeys(Excel.Regression_importDataFromExcel("Property Features", feature, 0)+" "+utility.UtilityClass.getRandomString(1));
			Wait.explicitWait(addFeature, 10, driver);
			addFeaturePrice.sendKeys("100");
			Thread.sleep(600);
			updateButton.click();
			Thread.sleep(2000);	
		}
		
	}

	

}
