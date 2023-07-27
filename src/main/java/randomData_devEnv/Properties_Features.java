package randomData_devEnv;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility.UtilityClass;

public class Properties_Features
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public Properties_Features(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	
	//========================================================================================================================================================
		@FindBy (xpath = "//div[contains(text(),'Automation feature 104')] /parent :: div // div // button") private WebElement editButton_AutomationFeature;
	//========================================================================================================================================================
		
		@FindBy (xpath = "//div [text()='Properties']") private WebElement propertiesIcon;
		@FindBy (xpath = "//input[@placeholder='Add Feature ']") private WebElement addFeature;
		@FindBy (xpath = "//input[@placeholder='Add Feature Price ']") private WebElement addFeaturePrice;
		@FindBy (xpath = "//span[text()=' + '] / parent :: button") private WebElement addIcon;
		@FindBy (xpath = "(//button // i [@class='fas fa-edit edit_btn'])[1]") private WebElement updateIcon;
		@FindBy (xpath = "//input[@placeholder='Enter Feature']")private WebElement editFeature;
		@FindBy (xpath = "//input[@placeholder='Enter Feature Price']") private WebElement editFeaturePrice;
		@FindBy (xpath = "//button[text()=' Update ']") private WebElement updateButton;
		@FindBy (xpath = "//a[@href='/master/property_feature'] / parent :: li") private WebElement propertyFeatureIcon;

//		@FindBy (xpath = "") private WebElement dshkd;
//		@FindBy (xpath = "") private WebElement dshkd;
	
	
	public void propertiesIcon()
	{
		propertiesIcon.click();
	}
	
	public void propertyFeatureIcon() throws InterruptedException
	{
		A.moveToElement(propertyFeatureIcon).click().build().perform();	

	}
	public void editButton_AutomationFeature()
	{
		j.executeScript("arguments[0].click()", editButton_AutomationFeature);
	}
	public void addFeatures()
	{
		addFeature.sendKeys("Automation feature "+UtilityClass.getRandomIntegers(2));
		addFeaturePrice.sendKeys("100");	
	}
	public void addIcon()
	{
		addIcon.click();
	}

	public void updateButton()
	{
		updateButton.click();
	}
	public void editFeatures()
	{
		String feature=editFeature.getAttribute("value");
		String price=editFeaturePrice.getAttribute("value");
		
		editFeature.clear();
		editFeaturePrice.clear();
		
		editFeature.sendKeys(feature);
		editFeaturePrice.sendKeys(price);	
	}
	
	

}
