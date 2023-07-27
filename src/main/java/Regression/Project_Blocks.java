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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility.Excel;
import utility.UtilityClass;
import utility.Wait;

public class Project_Blocks 
{
	WebDriver driver;
	SoftAssert a;
	JavascriptExecutor j;
	WebDriverWait w;
	Actions A;
	
	@FindBy (xpath = "//a[@href='/master/project_property_type'] / parent :: li") private WebElement icon_projectBlock;
	@FindBy (xpath = "//button[contains(text(), ' Add Project Block ')]")private WebElement Button_addProjectBlock;
	@FindBy (xpath = "//div [text()='Properties']") private WebElement propertiesIcon;
	//=================================================================================================================================================
	
	//Automation project start with 104
	@FindBy (xpath = "//mat-select[@formcontrolname='project_id']") private WebElement projectName_Dropdown;
	@FindBy (xpath ="//mat-option//span[contains(text(), 'Automation Project-One 104')]")WebElement projectName_Dropdown_AutomationProject1;
	@FindBy (xpath ="//mat-option//span[contains(text(), 'Automation Project-Two 104')]")WebElement projectName_Dropdown_AutomationProject2;
   //=================================================================================================================================================
  
   // Automation property start with 104
	@FindBy (xpath = "//mat-select[@formcontrolname='propertyType_id']")private WebElement propertyType_Dropdown;
	@FindBy (xpath = "//mat-option//span[contains(text(), 'Automation 1BHK property 104')]")private WebElement propertyType_Dropdown_Automation_1BHK_Property;
	@FindBy (xpath = "//mat-option//span[contains(text(), 'Automation 2BHK property 104')]")private WebElement propertyType_Dropdown_Automation_2BHK_Property;
   //=================================================================================================================================================
   // edit button of Automation 2BHK property start with 104
	@FindBy (xpath = "//td[contains(text(),'Automation 2BHK property 104')] / parent :: tr // td // button")private WebElement editButton_2BHK_Property;

  //=================================================================================================================================================

	//Automation property start with 104
	@FindBy (xpath = "//td[contains(text(), 'Automation Zone-1 104')]/ preceding-sibling :: td[text()='Automation Project-One 10461']/parent :: tr //button")private WebElement editButton_AutomationProject1_Zone1;  
 //=================================================================================================================================================

	
	@FindBy (xpath = "//a[@href='/master/project_property_type'] / parent :: li") private WebElement propertyAreaIcon;
	@FindBy (xpath = "//mat-select[@formcontrolname='area_type']") private WebElement typesOfArea_Dropdown;
	@FindBy (xpath = "//mat-option//span[contains(text()='Saleable')]") private WebElement typesOfArea_Dropdown_Saleable;
	@FindBy (xpath = "//mat-option//span[text()='Non-Saleable ']") private WebElement typesOfArea_Dropdown_NonSaleable;
	@FindBy (xpath = "//input[@formcontrolname='area_length']") private WebElement length;
	@FindBy (xpath = "//input[@formcontrolname='area_breadth']") private WebElement breadth;
	@FindBy (xpath = "//input[@formcontrolname='unit_area']") private WebElement area;
	@FindBy (xpath = "//input[@formcontrolname='units']") private WebElement NoOfPropery;
	@FindBy (xpath = "//input[@formcontrolname='total_area']") private WebElement totalArea;
	@FindBy (xpath = "//button[text()=' Submit ']") private WebElement addSubmitButton;
	@FindBy (xpath = "//button[text()=' Submit ']") private WebElement editSubmitButton;
	@FindBy (xpath = "//mat-icon[text()='close']") private WebElement closeIcon;
	@FindBy (xpath = "//button[text()=' Add Properties Area ']") private WebElement addPropertyAreaButton;

	@FindBy (xpath = "//input[@formcontrolname='project_blocks']")private WebElement name_ProjectBlock;
	@FindBy (xpath = "//button[@class='pushable close-btn ng-star-inserted']") private WebElement editBlock_Button;
	@FindBy (xpath = "//button[contains(text(), 'Update')]") private WebElement updateBlock;
	
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	@FindBy (xpath = "")private WebElement dksflj;
//	
	
	public Project_Blocks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		w = new WebDriverWait(driver, Duration.ofSeconds(30));
		A = new Actions(driver);
		j = (JavascriptExecutor)driver;
		a = new SoftAssert();
	}
	
	
	public void createProjectBlocks() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Wait.explicitWait(propertiesIcon, 10, driver);
		propertiesIcon.click();
		Wait.explicitWait(icon_projectBlock, 10, driver);
		A.moveToElement(icon_projectBlock).click(icon_projectBlock).build().perform();
		
		for (int block=1; block<=1 ;block++)
		{
			System.out.println("Start to create Project Block: "+Excel.Regression_importDataFromExcel("Project Blocks", block, 0));
			Thread.sleep(2000);
			Button_addProjectBlock.click();
			projectName_Dropdown.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Project Blocks", block, 1)+"')]")).click();
			
			name_ProjectBlock.sendKeys(Excel.Regression_importDataFromExcel("Project Blocks", block, 0)+" "+UtilityClass.getRandomString(2));
			typesOfArea_Dropdown.click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Project Blocks", block, 2)+"')]")).click();
			Wait.explicitWait(addSubmitButton, 10, driver);
			addSubmitButton.click();
			Thread.sleep(2000);
			driver.navigate().refresh();
			System.out.println("==================================");
		}
		
	}
	public void editProjectBlocks() throws InterruptedException, EncryptedDocumentException, IOException
	{
		propertiesIcon.click();
		Wait.explicitWait(icon_projectBlock, 10, driver);
		A.moveToElement(icon_projectBlock).click().build().perform();
		
		for (int block=1; block<=1 ;block++)
		{
			System.out.println("Start to edit Project Block: "+Excel.Regression_importDataFromExcel("Project Blocks", block, 0));
			Thread.sleep(2000);j.executeScript("arguments[0].click();", editBlock_Button);Thread.sleep(2000);
			Wait.explicitWait(name_ProjectBlock, 10, driver);
			name_ProjectBlock.sendKeys(Keys.CONTROL,"a",Keys.DELETE);
			
			name_ProjectBlock.sendKeys(Excel.Regression_importDataFromExcel("Project Blocks", block, 0)+" "+UtilityClass.getRandomString(2));
			boolean salableOrNot=typesOfArea_Dropdown.isEnabled();
			a.assertEquals(salableOrNot, true);
			
			updateBlock.click();
			Thread.sleep(2000);
			
			a.assertAll();
			System.out.println("==================================");
		}
		
	}
	
	

}
