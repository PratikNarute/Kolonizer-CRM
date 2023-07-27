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
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import utility.UtilityClass;

public class Prabooking
{
	public static WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	public static String searchPhoneNo;
	
	public Prabooking(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	//===============================================================================================================================================================

		// Project dropdown
		@FindBy (xpath = "//mat-select[@formcontrolname='project_id']") private WebElement projectDropdown;
		@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Project-One 104')]") private WebElement ProjectDropdown_AutomationProject1;
		@FindBy (xpath = "//mat-option//span[contains(text(),'Automation Project-Two 104')]") private WebElement ProjectDropdown_AutomationProject2;
	//===============================================================================================================================================================

		//property 
		@FindBy (xpath = "//mat-option// span[contains(text(), 'Automation 1BHK property 104')]") private WebElement areaOfInterest_Automation_1BHK_Property;
		@FindBy (xpath = "//mat-option// span[contains(text(), 'Automation 2BHK property 104')]") private WebElement areaOfInterest_Automation_2BHK_Property;
	//===============================================================================================================================================================

		//
		@FindBy (xpath = "//mat-icon[text()='add_circle']") private WebElement addProfessionIcon;
		@FindBy (xpath = "//mat-select[@formcontrolname='profession_id']") private WebElement professionDropdown;
		@FindBy (xpath = "//div[text()=' Add Profession '] /parent :: div / parent :: div / following-sibling :: div //input[@formcontrolname='name']")private WebElement professionName;
		@FindBy (xpath = "//div[text()=' Add Profession '] /parent :: div / parent :: div / following-sibling :: div //textarea[@formcontrolname='description']")private WebElement professionDescription;
		@FindBy (xpath = "//mat-option//span [contains (text(),'AutomationProfession Doctor' )]") private WebElement professionDropdown_Doctor;
		@FindBy (xpath = "//div[text()=' Add Profession '] /parent :: div  //mat-icon[text()='close']")WebElement professionCloseIcon;
		@FindBy (xpath = "//div[text()=' Add Profession '] /parent :: div / parent :: div / following-sibling :: div //button[text()=' Submit ']")private WebElement professionSubmitButton;
	//===============================================================================================================================================================

		//
		@FindBy (xpath = "(//td[contains(text(),'Automation PrebookingLead ab')] / parent :: tr //div //button) [2]") private WebElement editButton_AutomationPrebookingLead;
		@FindBy (xpath = "(//td[contains(text(),'Automation PrebookingLead ab')] / parent :: tr //div //button) [1]") private WebElement editDirect_AutomationPrebookingLead;
		@FindBy (xpath = "(//td[contains(text(),'Automation PrebookedLead ab')] / parent :: tr // div //button) [1]") private WebElement editDirectPrebookingButton_AutomationPrebookedLead;

	//===============================================================================================================================================================

		//
		@FindBy (xpath = "//input[@formcontrolname='search']") private WebElement propertyNo;
		@FindBy (xpath = "//li[contains(text(),'Automation 2BHK property NO -1 104')]")private WebElement propertyNo_2BHK_1;
		@FindBy (xpath = "//li[contains(text(),'Automation 2BHK property NO -2 104')]") private WebElement propertyNo_2BHK_2;
		@FindBy (xpath = "//li[contains(text(),'Automation 1BHK property NO -1 104')]") private WebElement propertyNo_1BHK_1;
		@FindBy (xpath = "//li[contains(text(),'Automation 1BHK property NO -2 104')]") private WebElement propertyNo_1BHK_2;
	//===============================================================================================================================================================

		//
		@FindBy (xpath = "//label[contains(text(),'Automation Offer: Area wise 104')]") private WebElement checkBox_AutomationOffer_AreaWise;
	//===============================================================================================================================================================

	//===============================================================================================================================================================

	//===============================================================================================================================================================

		@FindBy (xpath = "//div[text()=' Leads ']") private WebElement leadsIcon;
		@FindBy (xpath = "//a[text()='Active Leads'] / parent :: li") private WebElement activeLeadIcon;
		@FindBy (xpath = "//a[text()=' A+(Hot) ']") private WebElement AHot_Icon;
		@FindBy (xpath = "//mat-select[@formcontrolname='category']") private WebElement categoryDropdown;
		@FindBy (xpath = "//mat-option//*[text()='A+(Hot)']") private WebElement category_Hot_A;
		@FindBy (xpath = "//mat-option//*[text()='A(Warm)']") private WebElement category_warm_A;
		@FindBy (xpath = "//mat-option//*[text()='B+(Cold)']") private WebElement category_cold_B;
		@FindBy (xpath = "//a[contains(@href, '/lead/lead?status=pre_booked')]")private WebElement prebookedLeads_Icon;
		
		@FindBy (xpath = "//button[text()=' Prebooking ']") private WebElement prebookingButton;
		@FindBy (xpath = "//span[text()=' Proceed to Pre-Booking ']") private WebElement proceedToPreBookingButton;
		@FindBy (xpath = "//button[text()=' Save Prebooking ']") private WebElement savePrebooking ;
		@FindBy (xpath = "//button[text()='  Now Booking ']")private WebElement nowBooking_Button;
		@FindBy (xpath = "//span[text()=' Update ']/ parent :: button") private WebElement updateButton;
		@FindBy (xpath = "//mat-icon[text()='add']") private WebElement addIcon;
		

		@FindBy (xpath = "//mat-select[@formcontrolname='Payment_Type']") private WebElement paymentTypeDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Full']") private WebElement paymentTypeDropdown_Full;
		@FindBy (xpath = "//mat-option//span[text()='Installment']") private WebElement paymentTypeDropdown_Installment;
		
		@FindBy (xpath = "//table//td[text()=' 1 BHK']") private WebElement selectedProperty;
		@FindBy (xpath = "//span[text()=' attach_file '] / preceding-sibling :: textarea") private WebElement comments;
		
		@FindBy (xpath = "//button[text()=' Show Property Details ']") private WebElement showPropertyDetailsButton;
		@FindBy (xpath = "//label[text()='Feb'] / parent :: td // preceding-sibling :: td // input") private WebElement SpecialOffer_Feb;
		
		@FindBy (xpath = "//span[text()=' View Offers '] / parent :: button") private WebElement veiwOffersButton;
		@FindBy (xpath = "//button[text()=' Add Special Offer ']") private WebElement addSpecialOfferButton;
		@FindBy (xpath = "//button[text()='  Now Booking ']") private WebElement nowBookingButton;
		@FindBy (xpath = "//mat-icon[text()='close']") private WebElement closeIcon;
		
		@FindBy (xpath = "//input[@formcontrolname='follow_up_date']") private WebElement Calender_follow_up_date;
		@FindBy (xpath = "//input[@formcontrolname='follow_up_date']") private WebElement calender_expetedVisitDate;
		@FindBy (xpath = "//span[text()='MAR 2023'] / parent :: span / parent :: button") private WebElement calenderButton;
		@FindBy (xpath = "//table//div[text()=' 2023 ']") private WebElement calender_Year_2023;
		@FindBy (xpath = "//table//div[text()=' MAR ']") private WebElement calender_Month_MAR;
		@FindBy (xpath = "//table//div[text()=' 28 ']") private WebElement calender_Date_28;
		
		@FindBy (xpath = "//textarea[@formcontrolname='remark']") private WebElement remark;
		 
		@FindBy (xpath = "//a[@href='/lead/lead?todayfollowup=2023-01-27']") private WebElement todaysFollowUp_Icon;
		@FindBy (xpath = "//a[text()=' Other Lead ']") private WebElement otherLead_Icon;
		
		@FindBy (xpath = "//a[text()='Deactive Leads']") private WebElement deactiveLead_Icon;
		@FindBy (xpath = "//a[text()=' Deactive By Employee ']") private WebElement deactiveByEmployee_Icon;
		@FindBy (xpath = "//a[text()=' Not Interested ']") private WebElement notInterested_Icon;
		
		@FindBy (xpath = "//a[text()='Booked Leads']") private WebElement bookedLead_Icon;
		@FindBy (xpath = "//a[text()='PreBooking Pending']") private WebElement prebookingPending_Icon;
		
		@FindBy (xpath = "//button[text()=' New Lead ']") private WebElement newLeadButton;
		
		@FindBy (xpath = "//input[@data-placeholder='Search']") private WebElement searchLead;

		
		@FindBy (xpath = "//input[@formcontrolname='cre_user_name']") private WebElement assignUserName;
		@FindBy (xpath = "(//mat-radio-button)[1]") private WebElement selfAssignedCheckbox;
		@FindBy (xpath = "//button[@class='mat-focus-indicator mat-button mat-button-base ng-star-inserted']") private WebElement submitButton_PopUp;
		
		@FindBy (xpath = "//input[@formcontrolname='temp_name']") private WebElement name;
		@FindBy (xpath = "//input[@formcontrolname='phone']") private  WebElement phone;
		@FindBy (xpath = "//input[@formcontrolname='alternate_contact_no']") private WebElement alternatePhone;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='contactability']") private WebElement contactabilityDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Conversation ']") private WebElement contactabilityDropdown_Conversion;
		@FindBy (xpath = "//mat-option//span[text()='Not Connected']") private WebElement contactabilityDropdown_NotConnected;
		@FindBy (xpath = "//mat-option//span[text()='Not Matched']") private WebElement contactabilityDropdown_NotMatched;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='mode_of_interest']") private WebElement modeOfInterestDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Interested']") private WebElement modeOfInterestDropdown_Interested;
		@FindBy (xpath = "//mat-option//span[text()='Not Interested']") private WebElement modeOfInterestDropdown_NotInterested;
		

		@FindBy (xpath = "//textarea[@formcontrolname='address']") private WebElement address;
		@FindBy (xpath = "//input[@formcontrolname='postal_code']") private WebElement pinCode;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='area']") private WebElement areaDropdown;
		@FindBy (xpath = "//mat-option//span[text()=' K.V.Nagar Barshi S.O ']") private WebElement areaDropdown_KV_Nagar;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='city']") private WebElement cityDropdown;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='living_mode']") private WebElement livingModeDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Own House']") private WebElement livingModeDropdown_OwnHouse;
		@FindBy (xpath = "//mat-option//span[text()='Rented']") private WebElement livingModeDropdown_Rented;
		@FindBy (xpath = "//mat-option//span[text()='Family Property']") private WebElement livingModeDropdown_FamilyProperty;
//
		@FindBy (xpath = "//mat-select[@formcontrolname='status']") private WebElement statusDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Lead ']") private WebElement statusDropdown_Lead;
		@FindBy (xpath = "//mat-option//span[text()='Call ']") private WebElement statusDropdown_Call;
		@FindBy (xpath = "//mat-option//span[text()='Meet']") private WebElement statusDropdown_Meet;
		@FindBy (xpath = "//mat-option//span[text()='Visit']") private WebElement statusDropdown_Visit;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='area_of_interest']") private WebElement areaOfInterest;
		@FindBy (xpath = "//mat-option//span[text()=' 1 BHK']") private WebElement areaOfInterest_1BHK;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='buying_purpose']") private WebElement buyingPurposeDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Personal']") private WebElement buyingPurposeDropdown_Personal;
		@FindBy (xpath = "//mat-option//span[text()='Investment']") private WebElement buyingPurposeDropdown_Investment;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='required_plot_size']") private WebElement plotSizeDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Below 600 sqft']") private WebElement plotSizeDropdown_Below_600_sqft;
		@FindBy (xpath = "//mat-option//span[text()='600-800 sqft']") private WebElement plotSizeDropdown_600_800_sqft;
		@FindBy (xpath = "//mat-option//span[text()='800-1000 sqft']") private WebElement plotSizeDropdown_800_1000_sqft;
		@FindBy (xpath = "//mat-option//span[text()='1000-1250 sqft']") private WebElement plotSizeDropdown_1000_1200_sqft;
		@FindBy (xpath = "//mat-option//span[text()='1250-1500 sqft']") private WebElement plotSizeDropdown_1250_1500_sqft;
		
		@FindBy (xpath = "//mat-select[@formcontrolname='budget']") private WebElement budgetDropdown;
		@FindBy (xpath = "//mat-option//span[text()='under 5 lakh']") private WebElement budgetDropdown_Under_5_Lakh;
		@FindBy (xpath = "//mat-option//span[text()='5-7 lakh']") private WebElement budgetDropdown_5_7_Lakh;
		@FindBy (xpath = "//mat-option//span[text()='7-10 lakh']") private WebElement budgetDropdown_7_10_Lakh;
		@FindBy (xpath = "//mat-option//span[text()='10-12 lakh']") private WebElement budgetDropdown_10_12_Lakh;
		@FindBy (xpath = "//mat-option//span[text()='12-15 lakh']") private WebElement budgetDropdown_12_15_Lakh;

		@FindBy (xpath = "//mat-select[@formcontrolname='lead_source']") private WebElement leadSource_Dropdown;
		@FindBy (xpath = "(//span [contains (text(),'Automation_Reference' )])") private WebElement leadSource_Dropdown_Automation_Reference;
		@FindBy (xpath = "//mat-option//span[text()='Website']") private WebElement leadSource_Dropdown_Website;
		@FindBy (xpath = "//mat-option//span[text()='Walkin']") private WebElement leadSource_Dropdown_Walkin;
		@FindBy (xpath = "//mat-option//span[text()='Print Media']") private WebElement leadSource_Dropdown_PrintMedia;
		@FindBy (xpath = "//mat-option//span[text()='Social Media']") private WebElement leadSource_Dropdown_SocialMedia;
		@FindBy (xpath = "//mat-option//span[text()='Others']") private WebElement leadSource_Dropdown_Others;

		
		
		@FindBy (xpath = "//button//span[text()=' Submit ']") private WebElement submitButton;
		@FindBy (xpath = "//input[@formcontrolname='mode_of_interest'] / parent :: div // mat-checkbox // input") private WebElement modeOfInterestCheckbox;
		@FindBy (xpath = "//input[@formcontrolname='mode_of_interest'] / parent :: div // mat-checkbox // input /parent :: span / parent :: label / parent :: mat-checkbox")private WebElement selectModeOfInterestCheckbox;


		@FindBy (xpath = "//td[text()=' ₹ 25 ']") private WebElement offerDiscountPrice_25rs;
		@FindBy (xpath = "(//mat-icon[text()='delete'])[1]") private WebElement deletePrebooking_PropertyNo_2BHK_1;
		@FindBy (xpath = "(//mat-icon[text()='delete'])[2]") private WebElement deletePrebooking_PropertyNo_2BHK_2;
		@FindBy (xpath = "//span[text()=' New Prebooking '] / parent :: button") private WebElement newPrebookingButton;
		@FindBy (xpath = "//textarea[contains(@data-placeholder,' Remark is required !')]") private WebElement remark_releaseProperty;
		@FindBy (xpath = "//button[text()=' Yes ']") private WebElement releaseProperty_Yes;
		@FindBy (xpath = "//button[text()=' cancel ']") private WebElement releaseProperty_No;
//		@FindBy (xpath = "") private WebElement jfdlkfj;
//		@FindBy (xpath = "") private WebElement jfdlkfj;
//		@FindBy (xpath = "") private WebElement jfdlkfj;
//		@FindBy (xpath = "") private WebElement jfdlkfj;
//		@FindBy (xpath = "") private WebElement jfdlkfj;
//		@FindBy (xpath = "") private WebElement jfdlkfj;

		
		public void leadsIcon()
		{
			A.moveToElement(leadsIcon).click().build().perform();
		}
		
		public void activeLeadIcon()
		{
			A.moveToElement(driver.findElement(By.xpath("//a[text()='Active Leads'] "))).click().build().perform();
		}
		public void prebookedLeads_Icon()
		{
			A.moveToElement(prebookedLeads_Icon).click().build().perform();
		}
		
		public void newLead()
		{
			newLeadButton.click();
		}
		public void nowBooking_Button()
		{
			nowBooking_Button.click();
		}
		
		
		public String addLeadWith_statusIscall() throws InterruptedException
		{
			addProfessionIcon.click();
			professionName.sendKeys("AutomationProfession Doctor "+UtilityClass.getRandomString(2));
			professionDescription.sendKeys("Someone who has worked hard in the same type of job for a long time and has become skilled at dealing with any problem that might happen:");
			professionSubmitButton.click();
			
			Thread.sleep(2000);projectDropdown.click(); 
			Thread.sleep(1000);	ProjectDropdown_AutomationProject1.click();
			
			selfAssignedCheckbox.click();
			submitButton_PopUp.click();
			
			name.sendKeys("Automation PrebookingLead "+UtilityClass.getRandomString(2));
			phone.sendKeys(UtilityClass.getRandomIntegers(7));
			alternatePhone.sendKeys(UtilityClass.getRandomIntegers(7));
			
			String searchPhoneNo=phone.getAttribute("value");
			this.searchPhoneNo=searchPhoneNo;
			
			Thread.sleep(2000); professionDropdown.click();
			professionDropdown_Doctor.click();
			
			pinCode.sendKeys("413411");
			
			address.sendKeys("Solapur, Maharashtra");
			
			areaDropdown.click();
			Thread.sleep(1000); areaDropdown_KV_Nagar.click();	
			
			Thread.sleep(2000); j.executeScript("window.scrollBy(1000,1000)", "");	 
			Thread.sleep(2000);livingModeDropdown.click(); 
			Thread.sleep(1000); livingModeDropdown_OwnHouse.click();
			
			areaOfInterest.click();
			Thread.sleep(1000);
			areaOfInterest_Automation_1BHK_Property.click();
			
			A.moveToElement(buyingPurposeDropdown).click().build().perform();
			
			buyingPurposeDropdown.click();
			Thread.sleep(1000);
			buyingPurposeDropdown_Personal.click();
			
			j.executeScript("arguments[0].scrollIntoView(true)", submitButton);
			
			Thread.sleep(2000);
			plotSizeDropdown.click();
			Thread.sleep(1000);
			plotSizeDropdown_Below_600_sqft.click();
			
			
			budgetDropdown.click();
			Thread.sleep(1000);
			budgetDropdown_7_10_Lakh.click();
			
			categoryDropdown.click();
			Thread.sleep(1000);
			category_Hot_A.click();
			
			Calender_follow_up_date.click();
			calenderButton.click();
			calender_Year_2023.click();
			calender_Month_MAR.click();
			calender_Date_28.click();
			
			leadSource_Dropdown.click();
			Thread.sleep(1000);
			leadSource_Dropdown_Automation_Reference.click();
			
			remark.sendKeys("status connected lead created");
			
			a.assertAll();
			return searchPhoneNo;
		
		}

		public void submitButton() throws InterruptedException
		{
			j.executeScript("arguments[0].scrollIntoView(true)", submitButton);
		   Thread.sleep(2000);
			submitButton.click();
		}
		
		
	
		
		public void searchLead() throws InterruptedException
		{	
			searchLead.sendKeys(this.searchPhoneNo);
			searchLead.sendKeys(Keys.ENTER);
		}
		
		
		public void editLeadAutomationPrebookingLead () 
		{
			j.executeScript("arguments[0].click()", editDirect_AutomationPrebookingLead);
			//editDirect_AutomationPrebookingLead.click();
		}
		
		public void statusChangeCallToMeet()
		{
			statusDropdown.click();
			statusDropdown_Meet.click();
			
			Calender_follow_up_date.click();
			calenderButton.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
			
			remark.sendKeys("status change call to meet ");
		}
		
		public void update() throws InterruptedException
		{
			j.executeScript("arguments[0].scrollIntoView(true)", updateButton);
			   Thread.sleep(2000);
			updateButton.click();
		}
		
		public void statusChangeMeetToVisit()
		{
			statusDropdown.click();
			statusDropdown_Visit.click();
			Calender_follow_up_date.click();
			calenderButton.click();
			utility.Calender.currentCalenderYear(driver);
			utility.Calender.currentCalenderMonth(driver);
			utility.Calender.currentCalenderDate(driver);
			
			remark.sendKeys("status change meet to Visit ");
			
		}
		public void proceedtoprebooking_Button() throws InterruptedException
		{
			j.executeScript("arguments[0].scrollIntoView(true)", proceedToPreBookingButton);
			   Thread.sleep(2000);
			proceedToPreBookingButton.click();
		}
		
		
		public void prebookingOfProperty_1BHK_2() throws InterruptedException
		{
			propertyNo.sendKeys("104");
			Thread.sleep(1000);propertyNo_1BHK_2.click();
			
			paymentTypeDropdown.click();
			Thread.sleep(1000);paymentTypeDropdown_Full.click();
			
			veiwOffersButton.click();
			Thread.sleep(1000);checkBox_AutomationOffer_AreaWise.click();
		}
		
		public void paymentTypeDropdown()
		{
		
		}
		
		public void saveprebooking() throws InterruptedException
		{
			j.executeScript("arguments[0].scrollIntoView(true)", savePrebooking);
			   Thread.sleep(2000);
			savePrebooking.click();
		}
		
		public void editDirect_AutomationPrebookingLead() throws InterruptedException
		{
			j.executeScript("arguments[0].scrollIntoView(true)", editDirect_AutomationPrebookingLead);
		    Thread.sleep(2000);j.executeScript("arguments[0].click()", editDirect_AutomationPrebookingLead);
		}
		
		public void deletePrebooking_PropertyNo_2BHK_1()
		{
			deletePrebooking_PropertyNo_2BHK_1.click();
		}
		
		public void remark_releaseProperty()
		{
			remark_releaseProperty.sendKeys("property relese due to customer not intrested");
		}
		
		public void releaseProperty_Yes()
		{
			releaseProperty_Yes.click();
		}
	}



