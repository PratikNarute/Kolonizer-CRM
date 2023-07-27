package Regression;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import utility.Excel;
import utility.Wait;

public class Lead_Source
{
	WebDriver driver;
	SoftAssert softAssert;
	JavascriptExecutor javascriptExecutor;
	List<WebElement> listOfElements;
	ArrayList<WebElement> arrayListOfElements;
	Actions mouseAction;
	
	
	public Lead_Source(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		softAssert =new SoftAssert();
		javascriptExecutor = (JavascriptExecutor)driver;
		arrayListOfElements = new ArrayList<WebElement>();
		mouseAction = new Actions(driver);	
	}
	
	//=================================================================================================================================
		// edit button of lead source is direct start with 104
		@FindBy (xpath="//td[contains(text(), 'Automation_Direct 104')]/parent :: tr //td//button") private WebElement edit_lead_Source_Button_Direct;
		//=================================================================================================================================

		@FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
		@FindBy (xpath="//a[@href='/master/lead_source']") private WebElement lead_Source_Icon ;
		@FindBy (xpath="//button[@routerlink='add-user']/parent :: div") private WebElement lead_Source_Button ;
		@FindBy (xpath="//input[@formcontrolname='name']") private WebElement add_Lead_Source_Name ;
		@FindBy (xpath="//input[@formcontrolname='description']") private WebElement add_Lead_Source_Discription ;
		@FindBy (xpath="//button[@type='submit']") private WebElement add_Lead_Source_Submitt_Button ;
		@FindBy (xpath ="//button[@class='pushable close-btn ng-star-inserted']")  WebElement editLeadSource;
		@FindBy (xpath = "//button[contains(text(), 'Update')]")WebElement updateButton;
		
		
		public void createLeadSource() throws EncryptedDocumentException, IOException, InterruptedException
		{
			Thread.sleep(3000);
			projectSetupIcon.click();
			Wait.explicitWait(lead_Source_Icon, 10, driver);
			lead_Source_Icon.click();
			
			for (int leadSource=1; leadSource<=1; leadSource++)
			{
				System.out.println("Start to create lead source: "+Excel.Regression_importDataFromExcel("Lead Sources", leadSource, 0));
				Thread.sleep(2000);
				javascriptExecutor.executeScript("window.scrollBy(1000,-1000)");Thread.sleep(2000);
				Wait .explicitWait(lead_Source_Button, 10, driver);
				lead_Source_Button.click();		
				Wait .explicitWait(add_Lead_Source_Name, 5, driver);
				add_Lead_Source_Name.sendKeys(Excel.Regression_importDataFromExcel("Lead Sources", leadSource, 0)+" "+utility.UtilityClass.getRandomString(2));
				add_Lead_Source_Discription.sendKeys(Excel.Regression_importDataFromExcel("Lead Sources", leadSource, 1));
				add_Lead_Source_Submitt_Button.click();
				Thread.sleep(2000);
				driver.navigate().refresh();
				System.out.println("=======================================================");
			}
			
		}
		public void editLeadSource() throws EncryptedDocumentException, IOException, InterruptedException
		{
		
			projectSetupIcon.click();
			Wait.explicitWait(lead_Source_Icon, 10, driver);
			lead_Source_Icon.click();
			
			
				System.out.println("Start to edit lead source: "+Excel.Regression_importDataFromExcel("Lead Sources", 1, 0));
				Thread.sleep(2000);
				javascriptExecutor.executeScript("arguments[0].click();", editLeadSource);
				
				Wait .explicitWait(add_Lead_Source_Name, 5, driver);
				add_Lead_Source_Name.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
				add_Lead_Source_Discription.sendKeys(Keys.CONTROL,"a", Keys.DELETE);
				
				add_Lead_Source_Name.sendKeys(Excel.Regression_importDataFromExcel("Lead Sources", 1, 0)+" "+utility.UtilityClass.getRandomString(2));
				add_Lead_Source_Discription.sendKeys(Excel.Regression_importDataFromExcel("Lead Sources", 1, 1));
				updateButton.click();
				Thread.sleep(2000);
				System.out.println("=======================================================");
			
			
		}

}
