package Parameterization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

import utility.Excel;
import utility.Wait;

public class Overall_Cost_Types
{
	WebDriver driver;
	SoftAssert softAssert;
	JavascriptExecutor javascriptExecutor;
	List<WebElement> listOfElements;
	ArrayList<WebElement> arrayListOfElements;
	Actions mouseAction;
	
	
	public Overall_Cost_Types(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		softAssert =new SoftAssert();
		javascriptExecutor = (JavascriptExecutor)driver;
		arrayListOfElements = new ArrayList<WebElement>();
		mouseAction = new Actions(driver);	
	}
	

    @FindBy (xpath = "//div[text()='Project Setup']") private WebElement projectSetupIcon;
	@FindBy (xpath = "(//ul[@class='mm-collapse mm-show']//li//a)[6]") public static WebElement overallCosttypeIcon;
	@FindBy (xpath = "//input[@formcontrolname='name' and @placeholder='Add Buyer Cost type']") public static WebElement buyerCost;
	 @FindBy (xpath = "(//button[@type='submit'])[1]") private WebElement addIcon;
	
	public void createOverallCostTypes() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		projectSetupIcon.click();
		Wait.explicitWait(overallCosttypeIcon, 10, driver);
		overallCosttypeIcon.click();
		for (int BuyerCost=1; BuyerCost<=2; BuyerCost++)
		{
			System.out.println("Start to create buyer cost: "+Excel.importDataFromExcel("Overall Cost Types", BuyerCost, 0));
			Thread.sleep(1000);
			buyerCost.sendKeys(	Excel.importDataFromExcel("Overall Cost Types", BuyerCost, 0));
			addIcon.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			System.out.println("==========================================================");
		}
					
	}

}
