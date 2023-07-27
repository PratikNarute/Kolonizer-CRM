package randomData_devEnv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

import utility.UtilityClass;

public class Properties_Offers
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public Properties_Offers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	
	//====================================================================================================================================================	

		//Project start with 104
		@FindBy (xpath = "//mat-select[@formcontrolname='applicable_on_project_id']") public WebElement projectDropdown;
		@FindBy (xpath = "//mat-option// span[contains(text(),'Automation Project-One 104')]") private WebElement projectDropdown_AutomationProject1;
		@FindBy (xpath = "//mat-option// span[contains(text(),'Automation Project-Two 104')]") private WebElement projectDropdown_AutomationProject2;
	//====================================================================================================================================================

		//Proprty type start with 104
		@FindBy (xpath = "//mat-select[@formcontrolname='applicable_on_blocks_type']") private WebElement projectBlocks_Dropdown;
		@FindBy (xpath = "//mat-option//span[contains(text(), 'Automation P1 Block-1 104')]") private WebElement projectBlock_Dropdown_P1_B1;
		@FindBy (xpath = "//mat-option//span[contains(text(), 'Automation P1 Block-2 104')]") private WebElement projectBlock_Dropdown_P1_B2;

	//====================================================================================================================================================

		// property Number start with 104
		@FindBy (xpath = "//input[@formcontrolname='applicable_on_property']") private WebElement propertyNo;
		@FindBy (xpath = "//b[contains(text(),'Automation 1BHK property NO -1 104')] / parent :: div") private WebElement propertyNo_1BHK_NO1;
		@FindBy (xpath = "//b[contains(text(),'Automation 1BHK property NO -2 104')] / parent :: div") private WebElement propertyNo_1BHK_NO2;
		@FindBy (xpath = "//i[@class='fas fa-check-circle btnbottom']")private WebElement submitPropertyButton;
		
		
		// close selected data start with 104
		@FindBy (xpath = "//mat-icon[text()='close']") private WebElement closeSelectedData;
		@FindBy (xpath = "//span[contains(text(),'Automation 1BHK property NO -1 104')]  // mat-icon")private WebElement closeIcon_selectedProperty_1BHK_PropertyNo1;
		@FindBy (xpath = "//span[contains(text(),'Automation 1BHK property NO -2 104')]  // mat-icon")private WebElement closeIcon_selectedProperty_1BHK_PropertyNo2;
	//====================================================================================================================================================

		//Selected data start with 104
		@FindBy (xpath = "//p[text()='Selected Data'] / parent :: mat-panel-title /parent :: span / parent :: mat-expansion-panel-header") private WebElement selectedData_Box;
		@FindBy (xpath = "//span[text()='Selected Property :'] /following-sibling :: span[contains(text(),'Automation 1BHK property NO -1 104')]") private WebElement selectedProperty_1BHK_PropertyNo1;
		@FindBy (xpath = "//span[text()='Selected Property :'] /following-sibling :: span[contains(text(),'Automation 1BHK property NO -2 104')]") private WebElement selectedProperty_1BHK_PropertyNo2;

		@FindBy (xpath = "//span[text()='Selected Project :'] /following-sibling :: span[contains(text(),'Automation Project-One 104')]") private WebElement selectedProject_Project1;
		@FindBy (xpath = "//span[text()='Selected Project :'] /following-sibling :: span[contains(text(),'Automation Project-Two 104')]") private WebElement selectedProject_Project2;
		
		@FindBy (xpath = "//span[contains(text(), 'Selected Product Type :')]/following-sibling :: span[contains(text(), 'Automation P1 Block-1 104')]") private WebElement selecteProjectBlock_P1_B1;
		@FindBy (xpath = "//span[contains(text(), 'Selected Product Type :')]/following-sibling :: span[contains(text(), 'Automation P1 Block-2 104')]") private WebElement selecteProjectBlock_P1_B2;

	//====================================================================================================================================================


	//====================================================================================================================================================

		// veiw icon of Automation offer start with 104
		@FindBy (xpath = "//td[contains(text(),'Automation Offer: Area wise 104')] / parent :: tr// td//span//img") private WebElement veiwIcon_AutomationOffer_AreaWise;
	//====================================================================================================================================================

	//====================================================================================================================================================

	//====================================================================================================================================================

	//====================================================================================================================================================

	//====================================================================================================================================================

	//====================================================================================================================================================

	//====================================================================================================================================================
		@FindBy (xpath = "//div [text()='Properties']") private WebElement propertiesIcon;	
		@FindBy (xpath = "//a[@href='/master/offer']/parent :: li") private WebElement offersIcon;
		@FindBy (xpath = "//button[text()=' Add Offers ']") private WebElement addOffersButton;
		@FindBy (xpath = "//input[@formcontrolname='name']") private WebElement offerName;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='type']") private WebElement offerType_Dropdown;
		@FindBy (xpath = "(//mat-option//span)[1]") private WebElement offerType_Dropdown_default;	
		@FindBy (xpath = "//mat-option//span[text()='Area Wise']") private WebElement offerType_Dropdown_Areawise;
		@FindBy (xpath = "//input[@formcontrolname='benefit']") private WebElement discountPerSqFt;	
		@FindBy (xpath = "//mat-option//span[text()='Product Giveaway']") private WebElement offerType_Dropdown_ProductGiveway;
		@FindBy (xpath = "//input[@formcontrolname='benefit']") private WebElement product_Name ;
		@FindBy (xpath = "//input[@formcontrolname='product_description']") private WebElement product_Description ;
		@FindBy (xpath = "//input[@formcontrolname='product_price']") private WebElement product_Price ; 
		@FindBy (xpath = "//mat-option//span[text()='Direct Discount ₹ ']") private WebElement offerType_Dropdown_DirectDiscountInRS ;
		@FindBy (xpath = "//input[@formcontrolname='benefit']") private WebElement DirectDiscountInRS ; 	 	
		@FindBy (xpath = "//mat-option//span[text()='Direct Discount(in Percentage)']") private WebElement offerType_Dropdown_DirectDiscountInPecentage ;
		@FindBy (xpath = "//mat-option//span[text()='Lucky Draw']") private WebElement offerType_Dropdown_LuckyDraw;
		
		
		@FindBy (xpath = "//input[@formcontrolname='start_date']") private WebElement calenderStartdate;
		@FindBy (xpath = "//input[@formcontrolname='end_date']") private WebElement calenderEnddate;
		@FindBy (xpath = "//button[@aria-label='Choose month and year']") private WebElement yearDropdown;
		@FindBy (xpath = "//table//div[text()=' 2023 ']") private WebElement year2023;
		@FindBy (xpath = "//table//div[text()=' MAY ']") private WebElement monthMay;
		@FindBy (xpath = "//table//div[text()=' MAR ']") private WebElement monthMar;
		@FindBy (xpath = "//table//div[text()=' 21 ']") private WebElement date_21;

		
		@FindBy (xpath = "//table//div[contains(text(),'')]")WebElement date;
		
		@FindBy (xpath = "//input[@formcontrolname='counts']") private WebElement offerCounts;
		@FindBy (xpath = "//mat-checkbox[@formcontrolname='projectData']") private WebElement all_Checkbox;
		
		@FindBy (xpath = "//input[@type='radio' and @value='Yes']") private WebElement yes_RadioButton;
        @FindBy (xpath = "//input[@type='radio' and @value='No']") private WebElement No_RadioButton;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='applicable_on_payment_type']") private WebElement paymentType_Dropdown;
		@FindBy (xpath = "//mat-option//span[text()='Full']") private WebElement paymentType_Dropdown_Full;
		@FindBy (xpath = "//mat-option//span[text()='Installment']") private WebElement paymentType_Dropdown_Installment;
		@FindBy (xpath = "//mat-option//span[text()='Both']") private WebElement paymentType_Dropdown_Both;
		
		@FindBy (xpath = "//input[@formcontrolname='applicable_for_more_than']") private WebElement propetyPriceMoreThan;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='orOffers']") private WebElement relationWithOffer_Dropdown;
		@FindBy (xpath = "//mat-option//span[text()=' Feb ']") private WebElement relationWithOffer_Dropdown_FebOffer;
		@FindBy (xpath = "//button[text()=' Submit ']") private WebElement submitButton;

		@FindBy (xpath = "//mat-icon[@class='mat-icon notranslate material-icons mat-icon-no-color ng-star-inserted']") private WebElement editIcon;
			

		
		public void propertiesIcon()
		{		
			propertiesIcon.click();
		}
		public void offersIcon()
		{	
			offersIcon.click();
		}
		public void addOffersButton() throws InterruptedException
		{
		    j.executeScript("window.scrollBy(1000,-1000)", "");
		    Thread.sleep(2000);
			addOffersButton.click();
		}
		public void veiwIcon_AutomationOffer_AreaWise()
		{
			j.executeScript("arguments[0].click()", veiwIcon_AutomationOffer_AreaWise);
		}
		public void addOffer_AreaWise() throws InterruptedException, ParseException
		{
		
			offerName.sendKeys("Automation Offer: Area wise "+UtilityClass.getRandomIntegers(2));
			offerType_Dropdown.click();
			Thread.sleep(1000); offerType_Dropdown_Areawise.click();
			discountPerSqFt.sendKeys("1");
			
			calenderStartdate.click();
			yearDropdown.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
	
			calenderEnddate.click();
			yearDropdown.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
			
			all_Checkbox.click();
			String offerCount=offerCounts.getAttribute("readonly");
			a.assertEquals(offerCount, "true");	
			
			all_Checkbox.click();
			offerCounts.sendKeys("20");
			
			paymentType_Dropdown.click(); 
			Thread.sleep(1000); paymentType_Dropdown_Full.click();
			Thread.sleep(1000); propetyPriceMoreThan.sendKeys("1000");
			
			No_RadioButton.click();
			Thread.sleep(1000);yes_RadioButton.click();
			
			j.executeScript("arguments[0].scrollIntoView(true);", submitButton);
			
			Thread.sleep(2000);projectDropdown.click();
			Thread.sleep(1000); projectDropdown_AutomationProject1.click();
			Thread.sleep(1000);projectDropdown_AutomationProject2.click(); 
		
			
			Thread.sleep(1000); A.moveToElement(projectBlocks_Dropdown).click().build().perform();
			
			projectBlocks_Dropdown.click();
//			Thread.sleep(1000); projectBlock_Dropdown_P1_B1.click();
//			Thread.sleep(1000);projectBlock_Dropdown_P1_B2.click();
//			
			Thread.sleep(1000); A.moveToElement(propertyNo).click().build().perform();
//			
			propertyNo.sendKeys("104");
//			Thread.sleep(1000); propertyNo_1BHK_NO1.click(); 
//			propertyNo_1BHK_NO2.click(); 
			submitPropertyButton.click();
//			
			boolean relationOffer=relationWithOffer_Dropdown.isEnabled();
			a.assertEquals(relationOffer, true);
		
			a.assertAll();	
		}
		public void addOffer_product_Givaway() throws InterruptedException
		{
		
			offerName.sendKeys("Automation Offer: Product Giveaway "+UtilityClass.getRandomIntegers(2));
			offerType_Dropdown.click();
			Thread.sleep(1000); offerType_Dropdown_ProductGiveway.click();
			product_Name.sendKeys("Mobile");
			product_Description.sendKeys("Vivo Mobile");
			product_Price.sendKeys("10000");
			
			calenderStartdate.click();
			yearDropdown.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
			
			calenderEnddate.click();
			yearDropdown.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
			
			all_Checkbox.click();
			String offerCount=offerCounts.getAttribute("readonly");
			a.assertEquals(offerCount, "true");	
			
			all_Checkbox.click();
			offerCounts.sendKeys("20");
			
			paymentType_Dropdown.click(); 
			Thread.sleep(1000); paymentType_Dropdown_Full.click();
			Thread.sleep(1000); propetyPriceMoreThan.sendKeys("1000");
			
			No_RadioButton.click();
			Thread.sleep(1000);yes_RadioButton.click();
j.executeScript("arguments[0].scrollIntoView(true);", submitButton);
			
			Thread.sleep(2000);projectDropdown.click();
			Thread.sleep(1000); projectDropdown_AutomationProject1.click();
			Thread.sleep(1000);projectDropdown_AutomationProject2.click(); 
		
			
			Thread.sleep(1000); A.moveToElement(projectBlocks_Dropdown).click().build().perform();
			
			projectBlocks_Dropdown.click();
//			Thread.sleep(1000); projectBlock_Dropdown_P1_B1.click();
//			Thread.sleep(1000);projectBlock_Dropdown_P1_B2.click();
//			
			Thread.sleep(1000); A.moveToElement(propertyNo).click().build().perform();
//			
			propertyNo.sendKeys("104");
//			Thread.sleep(1000); propertyNo_1BHK_NO1.click(); 
//			propertyNo_1BHK_NO2.click(); 
			submitPropertyButton.click();
//			
			boolean relationOffer=relationWithOffer_Dropdown.isEnabled();
			a.assertEquals(relationOffer, true);
		
			a.assertAll();	
		}
		
		////
		
		public void addOffer_DirectDiscountInRS() throws InterruptedException
		{
		
			offerName.sendKeys("Automation Offer:  Direct Discount In RS "+UtilityClass.getRandomIntegers(2));
			offerType_Dropdown.click();
			Thread.sleep(1000); offerType_Dropdown_DirectDiscountInRS.click();
			DirectDiscountInRS.sendKeys("20000");
			
			calenderStartdate.click();
			yearDropdown.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
			
			calenderEnddate.click();
			yearDropdown.click();
			year2023.click();
			monthMay.click();
			date_21.click();
			
			all_Checkbox.click();
			String offerCount=offerCounts.getAttribute("readonly");
			a.assertEquals(offerCount, "true");	
			
			all_Checkbox.click();
			offerCounts.sendKeys("20");
			
			paymentType_Dropdown.click(); 
			Thread.sleep(1000); paymentType_Dropdown_Full.click();
			Thread.sleep(1000); propetyPriceMoreThan.sendKeys("1000");
			
			No_RadioButton.click();
			Thread.sleep(1000);yes_RadioButton.click();
			
      j.executeScript("arguments[0].scrollIntoView(true);", submitButton);
			
			Thread.sleep(2000);projectDropdown.click();
			Thread.sleep(1000); projectDropdown_AutomationProject1.click();
			Thread.sleep(1000);projectDropdown_AutomationProject2.click(); 
		
			
			Thread.sleep(1000); A.moveToElement(projectBlocks_Dropdown).click().build().perform();
			
			projectBlocks_Dropdown.click();
//			Thread.sleep(1000); projectBlock_Dropdown_P1_B1.click();
//			Thread.sleep(1000);projectBlock_Dropdown_P1_B2.click();
//			
			Thread.sleep(1000); A.moveToElement(propertyNo).click().build().perform();
//			
			propertyNo.sendKeys("104");
//			Thread.sleep(1000); propertyNo_1BHK_NO1.click(); 
//			propertyNo_1BHK_NO2.click(); 
			submitPropertyButton.click();
//			
			boolean relationOffer=relationWithOffer_Dropdown.isEnabled();
			a.assertEquals(relationOffer, true);
		
			a.assertAll();	
		}
	
		
		
		public void addOffer_DirectDiscountInPecentage() throws InterruptedException
		{
		
			offerName.sendKeys("Automation Offer:  Direct Discount In Pecentage "+UtilityClass.getRandomIntegers(2));
			offerType_Dropdown.click();
			Thread.sleep(1000); offerType_Dropdown_DirectDiscountInPecentage.click();
			DirectDiscountInRS.sendKeys("2");
			
			calenderStartdate.click();
			yearDropdown.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
			
			calenderEnddate.click();
			yearDropdown.click();
			year2023.click();
			monthMay.click();
			date_21.click();
			
			all_Checkbox.click();
			String offerCount=offerCounts.getAttribute("readonly");
			a.assertEquals(offerCount, "true");	
			
			all_Checkbox.click();
			offerCounts.sendKeys("20");
			
			paymentType_Dropdown.click(); 
			Thread.sleep(1000); paymentType_Dropdown_Full.click();
			Thread.sleep(1000); propetyPriceMoreThan.sendKeys("1000");
			
			No_RadioButton.click();
			Thread.sleep(1000);yes_RadioButton.click();
			
			 j.executeScript("arguments[0].scrollIntoView(true);", submitButton);
				
				Thread.sleep(2000);projectDropdown.click();
				Thread.sleep(1000); projectDropdown_AutomationProject1.click();
				Thread.sleep(1000);projectDropdown_AutomationProject2.click(); 
			
				
				Thread.sleep(1000); A.moveToElement(projectBlocks_Dropdown).click().build().perform();
				
				projectBlocks_Dropdown.click();
//				Thread.sleep(1000); projectBlock_Dropdown_P1_B1.click();
//				Thread.sleep(1000);projectBlock_Dropdown_P1_B2.click();
//				
				Thread.sleep(1000); A.moveToElement(propertyNo).click().build().perform();
//				
				propertyNo.sendKeys("104");
//				Thread.sleep(1000); propertyNo_1BHK_NO1.click(); 
//				propertyNo_1BHK_NO2.click(); 
				submitPropertyButton.click();
//				
				boolean relationOffer=relationWithOffer_Dropdown.isEnabled();
				a.assertEquals(relationOffer, true);
			
				a.assertAll();	
		}

		public void toCheckThatSelectedPropertyIsShowingCorrectlyOrNot() throws InterruptedException
		{
			Thread.sleep(1000);	selectedData_Box.click();
			Thread.sleep(2000); j.executeScript("arguments[0].scrollIntoView(true);", submitButton);
			Thread.sleep(2000);
//			
//			boolean PropertyNo1=selectedProperty_1BHK_PropertyNo1.isDisplayed();a.assertEquals(PropertyNo1, true);
//			
//			boolean PropertyNo2=selectedProperty_1BHK_PropertyNo2.isDisplayed(); a.assertEquals(PropertyNo2, true);
//			
			boolean Project1=selectedProject_Project1.isDisplayed(); a.assertEquals(Project1, true);
			
			boolean Project2=selectedProject_Project2.isDisplayed(); a.assertEquals(Project2, true);
			
//			boolean PropertType_1BHK=selecteProjectBlock_P1_B1.isDisplayed(); a.assertEquals(PropertType_1BHK, true);
//			
//			boolean PropertType_2BHK=selecteProjectBlock_P1_B2.isDisplayed(); a.assertEquals(PropertType_2BHK, true);
//			
			
			A.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000); No_RadioButton.click();
		
			a.assertAll();
		}
		public void editIcon()
		{
			editIcon.click();
		}


		public void editOffers_AreaWise() throws InterruptedException
		{
			String OfferName=offerName.getAttribute("value");
			String Discount=discountPerSqFt.getAttribute("value");
			String OfferCount=offerCounts.getAttribute("value");
			String PriceMoreThan=propetyPriceMoreThan.getAttribute("value");
			
			offerName.clear();
			discountPerSqFt.clear();
			offerCounts.clear();
			propetyPriceMoreThan.clear();
			
			offerName.sendKeys(OfferName);
			discountPerSqFt.sendKeys(Discount);
			offerCounts.sendKeys(OfferCount);
			Thread.sleep(1000); propetyPriceMoreThan.sendKeys(PriceMoreThan);
			
			String result = offerType_Dropdown.getAttribute("aria-disabled"); a.assertEquals(result, "true");
			
			selectedData_Box.click();
			Thread.sleep(2000); j.executeScript("arguments[0].scrollIntoView(true);", submitButton);


			a.assertAll();
		}
		public void submitButton() throws InterruptedException
		{
			A.sendKeys(Keys.PAGE_UP).build().perform();
			Thread.sleep(1000);
			//submitButton.click();
			j.executeScript("arguments[0].click()", submitButton);
		}

}
