package randomData_devEnv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility.UtilityClass;

public class Properties_PropertyPriceAndStatus 
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
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
	@FindBy (xpath = "//input[@formcontrolname='rate_per_sq_ft']") private WebElement rate;
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
	public void addPropertiesPriceAndStatus_AutomationProject1_Block1_1BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();	
		
	}
	public void addPropertiesPriceAndStatus_AutomationProject1_Block1_1BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}

	public void addPropertiesPriceAndStatus_AutomationProject1_Block1_2BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}
	public void addPropertiesPriceAndStatus_AutomationProject1_Block1_2BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}

	public void addPropertiesPriceAndStatus_AutomationProject1_Block2_1BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();	
		
	}
	public void addPropertiesPriceAndStatus_AutomationProject1_Block2_1BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}

	public void addPropertiesPriceAndStatus_AutomationProject1_Block2_2BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}
	public void addPropertiesPriceAndStatus_AutomationProject1_Block2_2BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject1.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P1_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}
	
//	==========================================================================================================================================

	// Project 2
	public void addPropertiesPriceAndStatus_AutomationProject2_Block1_1BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();	
		
	}
	public void addPropertiesPriceAndStatus_AutomationProject2_Block1_1BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}

	public void addPropertiesPriceAndStatus_AutomationProject2_Block1_2BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}
	public void addPropertiesPriceAndStatus_AutomationProject2_Block1_2BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B1.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}

	public void addPropertiesPriceAndStatus_AutomationProject2_Block2_1BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();	
		
	}
	public void addPropertiesPriceAndStatus_AutomationProject2_Block2_1BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_1BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 1BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}

	public void addPropertiesPriceAndStatus_AutomationProject2_Block2_2BHKProperty_NO_1() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -1 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}
	public void addPropertiesPriceAndStatus_AutomationProject2_Block2_2BHKProperty_NO_2() throws InterruptedException
	{
		projectDropdown.click();
		Thread.sleep(1000); selectProjectDropdown_AutomationProject2.click();
		
		projectBlocks_Dropdown.click();
		Thread.sleep(1000); projectBlocks_Dropdown_P2_B2.click();
		
		propertyTypeDropdown.click();
		Thread.sleep(2000); propertyTypeDropdown_Automation_2BHK_Property.click();
	
		propertyNumber.sendKeys("Automation 2BHK property NO -2 "+UtilityClass.getRandomIntegers(2));
		
		length.sendKeys("5");
		breadth.sendKeys("5");	

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500.00");
		
		propertyFeaturesButton.click();
		Thread.sleep(1000);propertyFeatures_AutomationFeature.click();	
		
		String TotalPropertyPrice=totalPropertyPrice.getAttribute("value");
		a.assertEquals(TotalPropertyPrice, "2600");
		
		description.sendKeys(UtilityClass.getRandomString(20));
		
		a.assertAll();
	}
//================================================================================================================================
	
	public void editPropertiesPriceAndStatus_Automation_1BHK_propertyNO_2() throws InterruptedException
	{
		String propertyNo=propertyNumber.getAttribute("value");
		
		propertyNumber.clear();
		rate.clear();
		totalAmount.clear();
		description.clear();
 
		String result=projectDropdown.getAttribute("aria-disabled");
		a.assertEquals(result, "true");
		
		boolean PropertyTypeDropdown=propertyTypeDropdown.isEnabled();
		a.assertEquals(PropertyTypeDropdown, true);
		
        propertyNumber.sendKeys(propertyNo);
		
		boolean Length=length.isEnabled();
		a.assertEquals(Length, true);
		
		boolean Breadth=breadth.isEnabled();
		a.assertEquals(Breadth, true);

		String TotalArea=totalArea.getAttribute("value");
		a.assertEquals(TotalArea, "25'0");
		
		rate.sendKeys("100");
		
		String TotalAmount=totalAmount.getAttribute("value");
		a.assertEquals(TotalAmount, "2500");
		
		boolean feature=propertyFeaturesButton.isEnabled();
		a.assertEquals(feature, true);
		
		description.sendKeys("kfyhnsdfliyksdhfdfdsfdsf fdsfdsfdsnfk,dch");
		
		a.assertAll();
		
	}
	public void editIcon()
	{
		editIcon.click();
	}
	public void submitButton()
	{
		submitButton.click();		
	}
	public void closeIcon()
	{
		closeIcon.click();
	}

}
