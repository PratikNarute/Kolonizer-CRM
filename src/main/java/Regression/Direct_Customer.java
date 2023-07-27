package Regression;

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

class customerDetails{
	
	String phone; double remaningAmount;String totalAmount;String TokenAmount;
	customerDetails(){};
	customerDetails(String phone, double remaningAmount, String totalAmount, String TokenAmount) {
		this.phone = phone;
		this.remaningAmount = remaningAmount;
		this.totalAmount = totalAmount;
		this.TokenAmount = TokenAmount;
	}
	
}

public class Direct_Customer {
	
	customerDetails customerObject = new customerDetails();
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	Actions mouseAction;
	
	public Direct_Customer(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
		a= new SoftAssert();
		A = new Actions(driver);
		j= (JavascriptExecutor)driver;
		w = new WebDriverWait(driver, Duration.ofSeconds(10));
		mouseAction = new Actions(driver);
		
		
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

		//Lead closure form
		@FindBy (xpath = "//div[text()=' Offer Details ']")private WebElement OfferDetails_text;
		@FindBy (xpath = "//div[text()=' Offer Details '] / parent :: div / following-sibling :: div // mat-panel-title[text()=' Area Wise '] / parent :: span")private WebElement offerDetails_AreaWise_Box;
		@FindBy (xpath = "//mat-panel-title[text()=' Area Wise '] /parent ::span /parent :: mat-expansion-panel-header / following-sibling :: div //div //input [@formcontrolname='type']") private WebElement OfferType_AreaWise;
		@FindBy (xpath = "//mat-panel-title[text()=' Area Wise '] /parent ::span /parent :: mat-expansion-panel-header / following-sibling :: div //div //input [@formcontrolname='name']") private WebElement OfferName_AutomationOffer_Areawise;
		@FindBy (xpath = "//mat-panel-title[text()=' Area Wise '] /parent ::span /parent :: mat-expansion-panel-header / following-sibling :: div //div //input [@formcontrolname='amount']") private WebElement OfferAmount_AreaWise;
	//===============================================================================================================================================================

		//customer icon
		@FindBy (xpath = "//mat-icon[text()='person_off']/ parent :: span/ parent :: button")private WebElement deactivePropertyIcon;
		@FindBy (xpath = "//td[contains(text(), 'Automation BookedLead ab')] / parent :: tr // button")private WebElement veiwIcon_PropertyNo_AutomationBooked;
		@FindBy (xpath = "//div[text()=' Project Details '] / parent :: span")private WebElement Box_ProertyDetails;
		@FindBy (xpath = "//span[contains(text(),'Automation 2BHK property NO -1 104')] / parent :: div / parent :: mat-panel-title / parent :: div / parent :: span")private WebElement Box_Automation_1BHK_PropertyNo1;
	//==========================================================================================================================================================================================================================================================================================================================================================================================
			// Primary contact information
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //input[@formcontrolname= 'lead_id']") private WebElement primaryContact_leadRefrenceName;
			@FindBy (xpath ="//li[contains(text(), 'Automation BookedLead ab')]")private WebElement primaryContact_leadRefrenceName_AtomationBookedLead; 
			@FindBy(xpath="(//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//input[@formcontrolname = 'temp_name'] ) [1]") private WebElement primaryContact_Name;
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//mat-select[@formcontrolname = 'gender']") private WebElement primaryContactGender_Dropdown;
			@FindBy(xpath="//mat-option//span[text()= 'Male'] ") private WebElement primaryContactGender_Male ;
			@FindBy(xpath="//mat-option[@value= 'Female'] ") private WebElement primaryContactGender_Female ;
			@FindBy(xpath="//span[text()= 'Others'] ") private WebElement primaryContactGender_Other ;	
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//input[@formcontrolname= 'email'] ") private WebElement primaryContact_Email;	
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//input[@formcontrolname= 'father_name'] ") private WebElement primaryContact_FatherName;	
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//input[@formcontrolname= 'phone'] ") private WebElement primarycontact_PhoneNo;
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //input[@formcontrolname= 'alternate_phone']") private WebElement primaryContact_AlternateN0 ;
			
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] /parent :: span / parent :: mat-expansion-panel-header") private WebElement primaryContact_CurrentAddress_Box ;
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div // textarea[@formcontrolname='address']") private WebElement primaryContact_CurrentAddress ;	
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div //input[@formcontrolname='postal_code']") private WebElement primaryContact_CurrentAddress_pinCode ;
			@FindBy(xpath="//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div //mat-select[@formcontrolname='area']") private WebElement primaryContact_CurrentAddress_AreaDropdown;
			@FindBy (xpath = "//mat-option")private WebElement primaryContact_CurrentAddress_AreaDropdown_KV_Nagar;
			@FindBy (xpath = "//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div // mat-icon[text()='add']/parent :: span/parent :: button")private WebElement primaryContact_AddIcon;
			@FindBy (xpath = "//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div // mat-icon[text()='clear']/parent :: span/parent :: button")private WebElement primaryContact_CloseIcon;
				
			@FindBy (xpath = "//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / parent :: mat-expansion-panel // span[text()='Same as current address '] / parent :: label / parent :: mat-checkbox") private WebElement primaryContact_checkbox_SameAsCurrentAddress;
		    @FindBy (xpath = "//mat-panel-title[text()=' Primary Contact '] / parent :: span / parent :: mat-expansion-panel-header / parent :: mat-expansion-panel // mat-panel-title[text()=' Documents '] / parent :: span")private WebElement primaryContact_PermanentAddressDocument_box;
		    @FindBy (xpath = "//mat-checkbox//span") private WebElement checkbox ;


		  //=========================================================================================================================================================================================================
		 
		    // Secondary contact information
			@FindBy(xpath="(//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//input[@formcontrolname = 'temp_name'] ) [1]") private WebElement secondaryContact_Name;
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//mat-select[@formcontrolname = 'gender']") private WebElement secondaryContactGender_Dropdown;	
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div//input[@formcontrolname= 'email'] ") private WebElement secondaryContact_Email;	
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //input[@formcontrolname= 'Secfather_name'] ") private WebElement secondaryContact_FatherName;	
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div  // input[@formcontrolname='phone']") private WebElement secondarycontact_PhoneNo;
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //input[@formcontrolname= 'alternate_phone']") private WebElement secondaryContact_AlternateN0 ;
			
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] /parent :: span / parent :: mat-expansion-panel-header") private WebElement secondaryContact_CurrentAddress_Box ;
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div // textarea[@formcontrolname='address']") private WebElement secondaryContact_CurrentAddress ;	
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div //input[@formcontrolname='postal_code']") private WebElement secondaryContact_CurrentAddress_pinCode ;
			@FindBy(xpath="//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div //mat-select[@formcontrolname='area']") private WebElement secondaryContact_CurrentAddress_AreaDropdown;
			@FindBy (xpath = "//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div // mat-icon[text()='add']/parent :: span/parent :: button")private WebElement secondaryContact_AddIcon;
			@FindBy (xpath = "//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / following-sibling :: div //mat-panel-title[text()= ' Current Address '] / parent :: span /parent :: mat-expansion-panel-header / following-sibling :: div // mat-icon[text()='clear']/parent :: span/parent :: button")private WebElement secondaryContact_CloseIcon;
				
			@FindBy (xpath = "//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / parent :: mat-expansion-panel // span[text()='Same as current address '] / parent :: label / parent :: mat-checkbox") private WebElement secondaryContact_checkbox_SameAsCurrentAddress;
		    @FindBy (xpath = "//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / parent :: mat-expansion-panel // mat-panel-title[text()=' Documents '] / parent :: span")private WebElement secondaryContact_PermanentAddress_box;
		    @FindBy (xpath= "//mat-panel-title[text()=' Secondary Contact Information '] / parent :: span / parent :: mat-expansion-panel-header / parent :: mat-expansion-panel // input[@formcontrolname='relation_with_customer']")private WebElement secondaryContact_RelationWithCustomer;
	//==========================================================================================================================================================================================================================================================================================================================================================================================

		    // Property details
		    @FindBy (xpath= "//mat-panel-title[text()=' Property Details * '] / parent :: span")private WebElement propertyDetails_Box;
		    @FindBy (xpath = "//p[text()='  Now Booking ']")private WebElement nowBooking;
            @FindBy (xpath = "//li[contains(text(),'Stock')]")private WebElement searchPropertyStock  ;
            @FindBy (xpath ="(//button[text()=' Proceed to Booking '])[2]") private WebElement proceedtoBooking ;
            
            @FindBy (xpath ="//input[@formcontrolname='created_At']") private WebElement tokenAmtCalender ;
            
            @FindBy (xpath ="//h2[text()='Term And Conditions List']/parent::div//cdk-accordion-item") private WebElement termAndConditionDrag ;
            @FindBy (xpath ="//h2[text()='Selected Term and Condition']/parent::div//cdk-accordion/parent::div") private WebElement termAndConditionDrop ;
            
            @FindBy (xpath ="//input[@formcontrolname='payment_schedule']") private WebElement oneTimePaymentCalender ;
            @FindBy (xpath ="//button[text()=' Submit ']") private WebElement submittButtonCustomer ;
            
	//===========================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================================

		    //search tab of customer
		    @FindBy (xpath = "//input[@data-placeholder='Search']")private  WebElement searchTab_Table;
	//===============================================================================================================================================================
		    //
		  	@FindBy (xpath = "//span[contains(text(), 'Automation Project-Two 104')] / parent :: li[contains(text(),'Automation 2BHK property NO -1 104')]")private WebElement automationProjectTwo_propertyNo_2BHK_1;
		  	@FindBy (xpath = "//span[contains(text(), 'Automation Project-Two 104')] / parent :: li[contains(text(),'Automation 2BHK property NO -2 104')]") private WebElement automationProjectTwo_propertyNo_2BHK_2;
		  	@FindBy (xpath = "//span[contains(text(), 'Automation Project-Two 104')] / parent :: li[contains(text(),'Automation 1BHK property NO -1 104')]") private WebElement automationProjectTwo_propertyNo_1BHK_1;
		  	@FindBy (xpath = "//span[contains(text(), 'Automation Project-Two 104')] / parent :: li[contains(text(),'Automation 1BHK property NO -2 104')]") private WebElement automationProjectTwo_propertyNo_1BHK_2;
	//===============================================================================================================================================================
			
		@FindBy (xpath = "//div[text()=' Leads ']") private WebElement leadsIcon;
		@FindBy (xpath = "//a[text()='Active Leads'] / parent :: li") private WebElement activeLeadIcon;
		@FindBy (xpath = "//a[text()=' A+(Hot) ']") private WebElement AHot_Icon;
		@FindBy (xpath = "//button[text()=' New Lead ']") private WebElement newLeadButton;
		@FindBy (xpath = "//mat-select[@formcontrolname='category']") private WebElement categoryDropdown;
		@FindBy (xpath = "//mat-option//*[text()='A+(Hot)']") private WebElement category_Hot_A;
		@FindBy (xpath = "//mat-option//*[text()='A(Warm)']") private WebElement category_warm_A;
		@FindBy (xpath = "//mat-option//*[text()='B+(Cold)']") private WebElement category_cold_B;
		
		@FindBy (xpath = "//button[text()=' Prebooking ']") private WebElement prebookingButton;
		@FindBy (xpath = "//span[text()=' Proceed to Pre-Booking '] / parent :: button") private WebElement proceedToPreBookingButton;
		@FindBy (xpath = "//span[text()='Update'] / parent :: button") private WebElement updateButton;
		@FindBy (xpath = "//mat-icon[text()='add']") private WebElement addIcon;
		

		@FindBy (xpath = "//mat-select[@formcontrolname='Payment_Type']") private WebElement paymentTypeDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Full']") private WebElement paymentTypeDropdown_Full;
		@FindBy (xpath = "//mat-option//span[text()='Installment']") private WebElement paymentTypeDropdown_Installment;
		@FindBy (xpath = "//mat-select[@formcontrolname='paymentType']") private WebElement paymentTypeDropdownOnetime;
		
		@FindBy (xpath = "//table//td[text()=' 1 BHK']") private WebElement selectedProperty;
		@FindBy (xpath = "//span[text()=' attach_file '] / preceding-sibling :: textarea") private WebElement comments;
		
		@FindBy (xpath = "//button[text()=' Show Property Details ']") private WebElement showPropertyDetailsButton;
		@FindBy (xpath = "//label[text()='Feb'] / parent :: td // preceding-sibling :: td // input") private WebElement SpecialOffer_Feb;
		
		@FindBy (xpath = "//span[text()=' View Offers '] / parent :: button") private WebElement veiwOffersButton;
		@FindBy (xpath = "//button[text()=' Add Special Offer ']") private WebElement addSpecialOfferButton;
		@FindBy (xpath = "//button[text()=' Proceed to Booking ']") private WebElement proceedToPrebooking;
		@FindBy (xpath = "//mat-icon[text()='close']") private WebElement closeIcon;
		
		@FindBy (xpath = "//input[@formcontrolname='follow_up_date']") private WebElement Calender_follow_up_date;
		@FindBy (xpath = "//input[@formcontrolname='follow_up_date']") private WebElement calender_expetedVisitDate;
		@FindBy (xpath = "//button[@aria-label='Choose month and year']") private WebElement calenderButton;
		@FindBy (xpath = "//table//div[text()=' 2023 ']") private WebElement calender_Year_2023;
		@FindBy (xpath = "//table//div[text()=' MAR ']") private WebElement calender_Month_MAR;
		@FindBy (xpath = "//table//div[text()=' 28 ']") private WebElement calender_Date_28;
		
		@FindBy (xpath = "//textarea[@formcontrolname='remark']") private WebElement remark;
		@FindBy (xpath = "//button//span[text()=' Submit ']") private WebElement submitButton;
		 
		@FindBy (xpath = "//a[@href='/lead/lead?todayfollowup=2023-01-27']") private WebElement todaysFollowUp_Icon;
		@FindBy (xpath = "//a[text()=' Other Lead ']") private WebElement otherLead_Icon;
		
		@FindBy (xpath = "//a[text()='Deactive Leads']") private WebElement deactiveLead_Icon;
		@FindBy (xpath = "//a[text()=' Deactive By Employee ']") private WebElement deactiveByEmployee_Icon;
		@FindBy (xpath = "//a[text()=' Not Interested ']") private WebElement notInterested_Icon;
		
		@FindBy (xpath = "//a[text()='Booked Leads']") private WebElement bookedLead_Icon;
		@FindBy (xpath = "//a[text()='PreBooking Pending']") private WebElement prebookingPending_Icon;
			
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

		@FindBy (xpath = "//mat-select[@formcontrolname='status']") private WebElement statusDropdown;
		@FindBy (xpath = "//mat-option//span[text()='Lead ']") private WebElement statusDropdown_Lead;
		@FindBy (xpath = "//mat-option//span[text()='Call ']") private WebElement statusDropdown_Call;
		@FindBy (xpath = "//mat-option//span[text()='Meet ']") private WebElement statusDropdown_Meet;
		@FindBy (xpath = "//mat-option//span[text()='Visit ']") private WebElement statusDropdown_Visit;
		
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

		
		@FindBy (xpath = "//button[text()=' Submit ']") private WebElement submitButton_LeadClosure;
		@FindBy (xpath = "//input[@formcontrolname='mode_of_interest'] / parent :: div // mat-checkbox // input") private WebElement modeOfInterestCheckbox;
		@FindBy (xpath = "//input[@formcontrolname='mode_of_interest'] / parent :: div // mat-checkbox // input /parent :: span / parent :: label / parent :: mat-checkbox")private WebElement selectModeOfInterestCheckbox;


		@FindBy (xpath = "//td[text()=' ₹ 25 ']") private WebElement offerDiscountPrice_25rs;
		@FindBy (xpath = "(//mat-icon[text()='delete'])[1]") private WebElement deletePrebooking_PropertyNo_2BHK_1;
		@FindBy (xpath = "(//mat-icon[text()='delete'])[2]") private WebElement deletePrebooking_PropertyNo_2BHK_2;
		@FindBy (xpath = "//span[text()=' New Prebooking '] / parent :: button") private WebElement newPrebookingButton;
		@FindBy (xpath = "//textarea[contains(@data-placeholder,' Remark is required !')]") private WebElement remark_releaseProperty;
		@FindBy (xpath = "//button[text()=' Yes ']") private WebElement releaseProperty_Yes;
		@FindBy (xpath = "//button[text()=' cancel ']") private WebElement releaseProperty_No;


	@FindBy (xpath = "//a[text()=' A(Warm) ']") private WebElement AWarm_Icon;
	@FindBy (xpath = "//a[text()=' B+(Cold) ']") private WebElement BCold_Icon;

	@FindBy (xpath = "(//td[contains(text(),'Automation BookedLead ab')] // following-sibling :: td // div //button) [1]") private WebElement editdirect_AutomationBookedLead;

	@FindBy (xpath = "//button[text()=' Property Number - I-1BHK-1 ']") private WebElement  addLeadClosureButton_I_1BHK_1;



	@FindBy (xpath = "//input[@formcontrolname='total_amount']") private WebElement totalAmount;
	@FindBy (xpath = "//div[text()=' Payment Details '] / parent :: div // following-sibling :: div //input [@formcontrolname='amount']") private WebElement tokenAmount;

	@FindBy (xpath = "//div[text()=' Payment Details '] / parent :: div // following-sibling :: div // mat-select") private WebElement paymentMode_dropdown;
	@FindBy (xpath = "//mat-option//span[text()='Bank']") private WebElement paymentMode_dropdown_Bank;
	@FindBy (xpath = "//mat-option//span[text()='Cash']") private WebElement paymentMode_dropdown_Cash;
	@FindBy (xpath = "//mat-option//span[text()=' Cheque']") private WebElement paymentMode_dropdown_Cheque;

	@FindBy (xpath = "//div[text()=' Payment Details '] / parent :: div // following-sibling :: div // input[@formcontrolname='bankTransictionId']") private WebElement bankTransactionID;
	@FindBy (xpath = "//div[text()=' Payment Details '] / parent :: div // following-sibling :: div // input[@formcontrolname='remainingAmount']") private WebElement remainingAmount;
	@FindBy (xpath = "//div[text()=' Payment Details '] / parent :: div // following-sibling :: div //mat-select[@formcontrolname='checkType']") private WebElement chequeType_Dropdown;
	@FindBy (xpath = "//mat-option//span[text()='Post ']") private WebElement chequeType_Dropdown_Post;
	@FindBy (xpath = "//mat-option//span[text()='Current ']") private WebElement chequeType_Dropdown_Current;

	@FindBy (xpath = "//div[text()=' Payment Details '] / parent :: div // following-sibling :: div // input[@formcontrolname='checkNo']") private WebElement chequeNo;

	@FindBy (xpath = "//input[@formcontrolname='checkClearDate']") private WebElement calender_SubmissionDate;

	@FindBy (xpath = "//div[text()=' Payment Details '] / parent :: div // following-sibling :: div // mat-select[@formcontrolname='paymentType']") private WebElement paymentType_Dropdown;
	@FindBy (xpath = "//mat-option//span[text()='One Time Payment']") private WebElement paymentType_Dropdown_OneTimePayment;
	@FindBy (xpath = "//mat-option//span[text()='Installment ']") private WebElement paymentType_Dropdown_Installment;
	@FindBy (xpath = "//mat-option//span[text()='Emi']") private WebElement paymentType_Dropdown_EMI;
	@FindBy (xpath = "//mat-option//span[text()='Other Ways ']") private WebElement paymentType_Dropdown_OtherWays;

	@FindBy (xpath = "(//div[text()='Installment Details'] / parent :: div / following-sibling :: div //input[@formcontrolname='installment']) [1]") private WebElement remainingInstallment_1;
	@FindBy (xpath = "(//div[text()='Installment Details'] / parent :: div / following-sibling :: div //mat-select[@formcontrolname='mode']) [1]") private WebElement remainingInstallment_ModeOfPayment_1;
	@FindBy (xpath = "(//div[text()='Installment Details'] / parent :: div / following-sibling :: div // input[@formcontrolname='payment_schedule']) [1]") private WebElement remainingInstallment_CalenderDate_1;

	@FindBy (xpath = "(//div[text()='Installment Details'] / parent :: div / following-sibling :: div //input[@formcontrolname='installment']) [2]") private WebElement remainingInstallment_2;
	@FindBy (xpath = "(//div[text()='Installment Details'] / parent :: div / following-sibling :: div //mat-select[@formcontrolname='mode']) [2]") private WebElement remainingInstallment_ModeOfPayment_2;
	@FindBy (xpath = "(//div[text()='Installment Details'] / parent :: div / following-sibling :: div // input[@formcontrolname='payment_schedule']) [2]") private WebElement remainingInstallment_CalenderDate_2;

	@FindBy (xpath = "//b[text()='EMI Type:'] / parent :: div //input[@formcontrolname='insatllmentType']") private WebElement remainingEMI_NoOfMonths;
	@FindBy (xpath = "//b[text()='Interest Rate in %:'] / parent :: div //input[@formcontrolname='rate_of_intrest']") private WebElement remainingEMI_InterestRate;
	@FindBy (xpath = "//b[text()='Payment Schedule:'] / parent :: div //input[@formcontrolname='payment_schedule']") private WebElement remainingEMI_CalenderDate;
	@FindBy (xpath = "//div[text()=' Details ']") private WebElement detailsButton;

	@FindBy (xpath = "(//input [@formcontrolname='task_name']) [1]") private WebElement remainingOtherWays_TaskName_1;
	@FindBy (xpath = "(//mat-select[@formcontrolname='paymentVia']) [1]") private WebElement remainingOtherWays_PaymentVia_Dropdown_1;
	@FindBy (xpath = "(//input [@formcontrolname='receiving_amount']) [1]") private WebElement remainingOtherWays_Amount_1;
	@FindBy (xpath = "(//input [@formcontrolname='receiving_date']) [1]") private WebElement remainingOtherWays_CalenderDate_1;

	@FindBy (xpath = "(//input [@formcontrolname='task_name']) [2]") private WebElement remainingOtherWays_TaskName_2;
	@FindBy (xpath = "(//mat-select[@formcontrolname='paymentVia']) [2]") private WebElement remainingOtherWays_PaymentVia_Dropdown_2;
	@FindBy (xpath = "(//input [@formcontrolname='receiving_amount']) [2]") private WebElement remainingOtherWays_Amount_2;
	@FindBy (xpath = "(//input [@formcontrolname='receiving_date']) [2]") private WebElement remainingOtherWays_CalenderDate_2;

	@FindBy (xpath = "//label[contains(text(),'Automation_Term and Conditions 104')]") private WebElement cheackBox_AutomationTermCondition;

	@FindBy (xpath = "//input[@id='madsfasdfasd']")private WebElement searchTab;
	@FindBy (xpath ="//div[text()=' Customers ']") private WebElement customerIcon;
	@FindBy ( xpath ="//button[@routerlink= 'add-customer']") private WebElement addCustomerButton;
	@FindBy (xpath = "//mat-panel-title[text()=' Primary Contact '] / parent :: span/ parent :: mat-expansion-panel-header")private WebElement primaryContactBox;
	@FindBy (xpath = "//p[text()=' View Prebookings ']")private WebElement veiwPrebookingsButton;
	@FindBy (xpath= "//button[text()=' click here ']")private WebElement clickHereButton;
	@FindBy (xpath = "//mat-panel-title[text()=' Lead Closure Details '] / parent :: span / parent :: mat-expansion-panel-header")private WebElement leadClosureDetailsBox;
	@FindBy (xpath = "//button[text()=' Submit ']")private WebElement submitButton_Customer;
	
	//==================sale Detail========================
	
	@FindBy (xpath ="//div[text()='Sales']") private WebElement saleIcon ;
	@FindBy (xpath ="//a[text()=' Sale Details ']") private WebElement saleDetailIcon ;
	@FindBy (xpath ="(//mat-icon[text()='close'])") private WebElement searchTab_Table_close_Icon ;
	@FindBy (xpath ="//a[text()=' Follow Up Payments ']") private WebElement follow_Up_payment_Icon;
	
	
	//=========collection ================
	
	@FindBy (xpath ="//div[text()='Collection']") private WebElement collection_Icon ;
	@FindBy (xpath ="//a[text()=' Customer Payment Status ']") private WebElement customer_Payment_Status_Icon ;
	
	@FindBy (xpath="//mat-panel-title[text()=' Primary Contact ']") private WebElement primary_Contact ;
	
	@FindBy (xpath ="//a[text()=' Receiving Transactions ']") private WebElement receiving_Transactions ;
	@FindBy (xpath ="(//tbody/ tr/td)[1]") private WebElement receiving_Transactions_table_FirstRow ;
	@FindBy (xpath ="//input[@ formcontrolname='receiving_amount']") private WebElement add_Receiving_Amt_Div ;
	@FindBy (xpath ="//input[@formcontrolname='receiving_date']") private WebElement calende_Receiving_Amt ;
	@FindBy (xpath ="//mat-select[@formcontrolname='receiving_mode']") private WebElement receiving_mode_Dropdown ;
	@FindBy (xpath ="//span[text()='Cash']") private WebElement receiving_mode_Dropdown_Cash ;
	@FindBy (xpath ="//textarea[@formcontrolname='remark']") private WebElement add_Receiving_remark ;
	@FindBy (xpath ="//span[text()=' Submit '] /parent :: button") private WebElement submitt_button_receiving_Transactions ;
	@FindBy (xpath ="//span[text()='Submit Amount']/ parent :: button") private  WebElement submitt_amt_receiving_Transactions ;
	
	
	
	

public void customer_Icon() 
{
	customerIcon.click();
}

public void add_Customer_Button() throws InterruptedException
{
	Thread.sleep(2000);j.executeScript("window.scrollBy(1000, -1000)"); Thread.sleep(2000);
	addCustomerButton.click();
}
public void create_customer_Fill_Mandatory_Field() throws InterruptedException
{
	j.executeScript("arguments[0].scrollIntoView();", primary_Contact);
	
	String phoneNumber = utility.UtilityClass.getRandomIntegers(8);
	Thread.sleep(2000);primaryContact_Name.sendKeys("nikhil chaudhari");
	Thread.sleep(2000);primaryContactGender_Dropdown.click();
	Thread.sleep(2000);primaryContact_Email.sendKeys("n@kolonizer.com");
	Thread.sleep(2000);primaryContactGender_Male.click();
	Thread.sleep(2000);primaryContact_FatherName.sendKeys("New Customer");
	Thread.sleep(2000);primarycontact_PhoneNo.sendKeys(phoneNumber);
	Thread.sleep(2000);primaryContact_AlternateN0.sendKeys("7020815207");
	
	
	
	//=======current address===========================
	
	Thread.sleep(2000);primaryContact_CurrentAddress.sendKeys("bhpal M P nagar zone One" );
	primaryContact_CurrentAddress_pinCode.sendKeys("413411");
	Thread.sleep(2000);
	primaryContact_CurrentAddress_AreaDropdown.click();
	primaryContact_CurrentAddress_AreaDropdown_KV_Nagar.click();
	
//	A.sendKeys(Keys.ARROW_DOWN).perform();
//	A.sendKeys(Keys.ARROW_DOWN).perform();
	//=========permanant address is same as current address =================
	
	j.executeScript("arguments[0].scrollIntoView();", primaryContact_CurrentAddress_AreaDropdown);
	Thread.sleep(2000);primaryContact_checkbox_SameAsCurrentAddress.click();
	
	//=========
	
	 j.executeScript("arguments[0].scrollIntoView();", submittButtonCustomer);
     Thread.sleep(2000);propertyDetails_Box.click();
     Thread.sleep(2000);nowBooking.click();
     Thread.sleep(2000);propertyNo.sendKeys("1");
     Thread.sleep(2000);searchPropertyStock.click();
     Thread.sleep(2000);paymentTypeDropdown.click();
     Thread.sleep(2000);paymentTypeDropdown_Full.click();
     j.executeScript("arguments[0].scrollIntoView();", proceedtoBooking);
	 Thread.sleep(2000);proceedtoBooking.click();
	 //=====================total Amount ========================
	
	 
	 String totalAmountProp = driver.findElement(By.xpath("//input[@formcontrolname='total_amount']")).getAttribute("value");
	
	 
	//===============lead closer token ===========
	 
	 String tokenAmountRand = utility.UtilityClass.getRandomIntegers(1);
     Thread.sleep(2000);tokenAmount.sendKeys(tokenAmountRand);
    
     
     String remainingAmountProp = driver.findElement(By.xpath("//input[@formcontrolname='remainingAmount']")).getAttribute("value");
     double remainingAmountPropDouble=Double.valueOf(remainingAmountProp);
     
 System.out.println("=====================================");
	 
	 System.out.println(totalAmountProp);
	 System.out.println( remainingAmountPropDouble);
	 
	 System.out.println("++++++++++++++++++++++++++++++++");
     
     
     
     
     
     Thread.sleep(2000);paymentMode_dropdown.click();
     Thread.sleep(2000);paymentMode_dropdown_Cash.click();
//     Thread.sleep(2000);tokenAmtCalender.click();
//     Thread.sleep(2000);calenderButton.click();
//	 utility.Calender.currentCalenderYear(driver);
//	 utility.Calender.currentCalenderMonth(driver);
//	 utility.Calender.currentCalenderDate(driver);
	  j.executeScript("arguments[0].scrollIntoView();", paymentMode_dropdown);
	
	Thread.sleep(2000);paymentTypeDropdownOnetime.click();
	Thread.sleep(2000);paymentType_Dropdown_OneTimePayment.click();
	
//	paymentType_Dropdown_EMI.click();
//	remainingEMI_NoOfMonths.sendKeys("12");
//	remainingEMI_InterestRate.sendKeys("12");
//	remainingEMI_CalenderDate.click();
	
	Thread.sleep(2000);oneTimePaymentCalender.click();
	Thread.sleep(2000);calenderButton.click();
	utility.Calender.currentCalenderYear(driver);
	utility.Calender.currentCalenderMonth(driver);
	utility.Calender.currentCalenderDate(driver);
//	Thread.sleep(2000);detailsButton.click();
	
	

	
	A.moveToElement(termAndConditionDrag).clickAndHold(termAndConditionDrag).pause(Duration.ofSeconds(3)).moveToElement(termAndConditionDrop).pause(Duration.ofSeconds(1)).release(termAndConditionDrop).build().perform();
	 j.executeScript("arguments[0].scrollIntoView();", submittButtonCustomer);
	 

	 customerObject.phone=phoneNumber;
	 customerObject.TokenAmount = tokenAmountRand;
	 customerObject.totalAmount = totalAmountProp;
	 customerObject.remaningAmount=remainingAmountPropDouble;
	 
	
 

	Thread.sleep(2000);submittButtonCustomer.click();
	Thread.sleep(2000);
	String URL=driver.getCurrentUrl();
	a.assertEquals(URL,"http://uatdreamcity.kolonizer.in/master/customer");
	a.assertAll();
	
}
	
	public void check_sale_generated_or_not() throws InterruptedException {
		
		saleIcon.click();	
		saleDetailIcon.click();
		searchTab_Table.sendKeys( customerObject.phone);
		searchTab_Table.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	    String mobileanoSaleTable=driver.findElement(By.xpath("(//table//tr//td[2])")).getText();
	    Thread.sleep(1000);
	    String finalPropertyPriceSaleTable=driver.findElement(By.xpath("(//table//tr//td[4])")).getText();
	    
	    String[] index1= finalPropertyPriceSaleTable.split(" ");

	    String finalPropertyPriceSaleTable1 =index1[1];//"26,00" price with feature
	    finalPropertyPriceSaleTable1.replace("\"", "");   //26,00
        String finalPropertyPrice_Sale_Table= finalPropertyPriceSaleTable1.replace(",", ""); //2600
     
	    
	    
	    Thread.sleep(1000);
	    String tokenMoneySaleTable=driver.findElement(By.xpath("(//table//tr//td[6])")).getText();
	    Thread.sleep(1000);
	    String remainingAmtSaleTable=driver.findElement(By.xpath("(//table//tr//td[7])")).getText();
	    String[] indexFirst= remainingAmtSaleTable.split(" ");

	    String remainingAmtSale_table =indexFirst[1];//"26,00" price with feature
	    remainingAmtSale_table.replace("\"", "");   //26,00
        String remainingAmt_Sale_table= remainingAmtSale_table.replace(",", ""); //2600
        
        double remainingAmt_Sale_tableDouble2=Double.valueOf(remainingAmt_Sale_table); 
        String temValue = String.format("%.2f", remainingAmt_Sale_tableDouble2);
        double remainingAmt_Sale_tableDouble=Double.valueOf(temValue); 
        
     
	  
	    System.out.println("=============================================");
	    
	    
	    System.out.println(customerObject.totalAmount);
	    System.out.println(customerObject.remaningAmount);
	    System.out.println(finalPropertyPrice_Sale_Table);
	    System.out.println(remainingAmt_Sale_tableDouble);
	    
	   System.out.println("==================================================="); 
	    
        a.assertEquals(mobileanoSaleTable, customerObject.phone) ;
        a.assertEquals(finalPropertyPrice_Sale_Table, customerObject.totalAmount);
        a.assertEquals(tokenMoneySaleTable, customerObject.TokenAmount);
        a.assertEquals(remainingAmt_Sale_tableDouble, customerObject.remaningAmount);
        
        a.assertAll();
        
        searchTab_Table_close_Icon.click() ;
	}
        
     public void check_folloe_Up_Payment() throws InterruptedException {
         	
    	 Thread.sleep(1000); follow_Up_payment_Icon.click(); 	
    	 Thread.sleep(1000); searchTab_Table.sendKeys(customerObject.phone);
    	 Thread.sleep(1000);searchTab_Table.sendKeys(Keys.ENTER);
    	 Thread.sleep(1000);
         String follow_up_paymentoverdue_Amount=driver.findElement(By.xpath("//div//td[2]")).getText();
         Thread.sleep(1000);
         String follow_up_payment_Upcoming_Installment= driver.findElement(By.xpath("//div//td[3]")).getText();
         
         double follow_up_payment_Upcoming_InstallmentDouble=Double.valueOf(follow_up_payment_Upcoming_Installment);
         
         Thread.sleep(1000);
         String follow_up_payment_TotalAmount = driver . findElement(By.xpath("//div//td[4]")).getText();
         double follow_up_payment_TotalAmountDouble=Double.valueOf(follow_up_payment_TotalAmount);
         
         Thread.sleep(1000);
         
         a.assertEquals(follow_up_paymentoverdue_Amount, "0");
         a.assertEquals(follow_up_payment_Upcoming_InstallmentDouble, customerObject.remaningAmount);
         a.assertEquals(follow_up_payment_TotalAmountDouble, customerObject.remaningAmount) ;
         
         a.assertAll();
         
         searchTab_Table_close_Icon.click() ;
         
     }
         
         
         public void check_collection_detail() throws InterruptedException{
        	 
        collection_Icon.click();	
        customer_Payment_Status_Icon.click();
        searchTab_Table.sendKeys(customerObject.phone);
        searchTab_Table.sendKeys(Keys.ENTER);
        
        Thread.sleep(3000);
        
        String totalOverdue_InCollection=driver.findElement(By.xpath("(//tbody//tr)[1]//td[3]")).getText();
        
        String[] index1= totalOverdue_InCollection.split(" ");
	    String total_Overdue_InCollection =index1[1];//"26,00" price with feature
	    total_Overdue_InCollection.replace("\"", "");   //26,00
        String final_total_Overdue_InCollection= total_Overdue_InCollection.replace(",", ""); //2600
        
        
        String totalOutstanding=driver.findElement(By.xpath("(//tbody//tr)[1]//td[4]")).getText();
        String[] index2= totalOutstanding.split(" ");
	    String total_Outstanding =index2[1];//"26,00" price with feature
	    total_Outstanding.replace("\"", "");   //26,00
        String final_total_Outstanding= total_Outstanding.replace(",", ""); //2600
        
        double totalOutstandingDouble=Double.valueOf(final_total_Outstanding); 
        
        String totalreceivd_InCollection=driver.findElement(By.xpath("(//tbody//tr)[1]//td[6]")).getText();
        String[] index3= totalreceivd_InCollection.split(" ");
	    String total_receivd_InCollection =index3[1];//"26,00" price with feature
	    total_receivd_InCollection.replace("\"", "");   //26,00
        String final_total_receivd_InCollection= total_receivd_InCollection.replace(",", ""); //2600
        
        String totalSale_InCollection=driver.findElement(By.xpath("(//tbody//tr)[1]//td[7]")).getText();
        String[] index4= totalSale_InCollection.split(" ");
	    String total_Sale_InCollection =index4[1];//"26,00" price with feature
	    total_Sale_InCollection.replace("\"", "");   //26,00
        String final_total_Sale_InCollection= total_Sale_InCollection.replace(",", ""); //2600
        
        
        System.out.println("+++++++++++++++++++++++++++++++++++");
        
        System.out.println(final_total_Overdue_InCollection);
        System.out.println(totalOutstandingDouble);
        System.out.println(final_total_receivd_InCollection);
        System.out.println(final_total_Sale_InCollection);
        
       System.out.println("++++++++++++++++++++++++++++++++++++++"); 
       
       a.assertEquals(final_total_Overdue_InCollection, "0");
       a.assertEquals(totalOutstandingDouble, customerObject.remaningAmount) ;
       a.assertEquals(final_total_receivd_InCollection, customerObject.TokenAmount) ;
       a.assertEquals(final_total_Sale_InCollection, customerObject.totalAmount) ;
        
       
       a.assertAll();
     }
         
        public void check_receiving_Detail() throws InterruptedException {
        	
        	receiving_Transactions.click();
            searchTab_Table.sendKeys(customerObject.phone);
            searchTab_Table.sendKeys(Keys.ENTER);
        	
            Thread.sleep(3000); receiving_Transactions_table_FirstRow.click();
        	
            Thread.sleep(3000);add_Receiving_Amt_Div.sendKeys("'"+customerObject.remaningAmount+"'");
//          Thread.sleep(3000);calende_Receiving_Amt.click();
//          Thread.sleep(2000);calenderButton.click();
//        	utility.Calender.currentCalenderYear(driver);
//        	utility.Calender.currentCalenderMonth(driver);
//        	utility.Calender.currentCalenderDate(driver);
        	receiving_mode_Dropdown.click();
        	receiving_mode_Dropdown_Cash.click();
        	add_Receiving_remark.sendKeys("one time Payment");
        	
            j.executeScript("arguments[0].scrollIntoView();", submitt_button_receiving_Transactions);
            Thread.sleep(3000);submitt_button_receiving_Transactions.click();
            Thread.sleep(3000);submitt_amt_receiving_Transactions.click();
        	
        	
        	
        	 String totalReceivingAmount=driver.findElement(By.xpath("(//div[@class='header']/div)[1]")).getText() ;
        	
        	 String[] index1= totalReceivingAmount.split(" ");
     	     String total_Receiving_Amount =index1[1];//"26,00" price with feature
     	     total_Receiving_Amount.replace("\"", "");   //26,00
             String final_total_Receiving_Amount= total_Receiving_Amount.replace(",", ""); //2600
        	
       
        	 String totalCash=driver.findElement(By.xpath("(//div[@class='header']/div)[2]")).getText() ;
        	 String[] index2= totalCash.split(" ");
     	     String total_Cash =index2[1];//"26,00" price with feature
     	     total_Cash.replace("\"", "");   //26,00
             String final_total_Cash= total_Cash.replace(",", ""); //2600
             
             
             a.assertEquals(final_total_Receiving_Amount, customerObject.totalAmount)	;
        	 a.assertEquals(final_total_Cash, customerObject.totalAmount);
        	 
        	 
        	 a.assertAll();
        	
        }
         
   
        
        
         
         
}


