package Regression;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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

public class Properties_Offers
{
	WebDriver driver;
	SoftAssert softAssert;
	Actions mouseAction;
	JavascriptExecutor j ;
	
	public Properties_Offers(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
		softAssert = new SoftAssert();
		mouseAction = new Actions(driver);
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
			

		
		public void CreateOffters() throws InterruptedException, ParseException, EncryptedDocumentException, IOException
		{
			Thread.sleep(3000);
			mouseAction.moveToElement(propertiesIcon).click(propertiesIcon).build().perform();	
			Thread.sleep(1000);
			Wait.explicitWait(offersIcon, 10, driver);
			offersIcon.click();
			for (int offer=1; offer<=4; offer++)
			{
				Thread.sleep(2000);	driver.navigate().refresh();
				Thread.sleep(2000);j.executeScript("window.scrollBy(1000,-1000)", "");
			    Thread.sleep(2000);addOffersButton.click();
				Wait.explicitWait(offerName, 10, driver);
				offerName.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 0)+" "+utility.UtilityClass.getRandomString(1));
				Wait.explicitWait(offerType_Dropdown, 10, driver);
				offerType_Dropdown.click();
				Thread.sleep(1000); 
				
				String offerType=Excel.Regression_importDataFromExcel("Offers", offer, 1);
				System.out.println("Start to create offer: "+offerType);
				if (offer==1)
				{
					
					driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", offer, 1)+"')]")).click();
					discountPerSqFt.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 2));
				}
				else if (offer==2)
				{
					WebElement list_ProductName=driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", offer, 1)+"')]"));
					Wait.explicitWait(list_ProductName, 10, driver);
					mouseAction.moveToElement(list_ProductName).click(list_ProductName).build().perform();
					product_Name.sendKeys("Mobile");
					product_Description.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 2));
					product_Price.sendKeys("10000");		
				}
				else if (offer==3)
				{
					WebElement list_directDiscountIn_Rs=driver.findElement(By.xpath("(//mat-option//span)[3]"));
					Wait.explicitWait(list_directDiscountIn_Rs, 10, driver);
					mouseAction.moveToElement(list_directDiscountIn_Rs).click(list_directDiscountIn_Rs).build().perform();
					DirectDiscountInRS.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 2));
				}
				else
				{
					WebElement list_directDiscountIn_per=driver.findElement(By.xpath("(//mat-option//span)[4]"));
					Wait.explicitWait(list_directDiscountIn_per, 10, driver);
					mouseAction.moveToElement(list_directDiscountIn_per).click(list_directDiscountIn_per).build().perform();
					DirectDiscountInRS.sendKeys("10");
				}
				
				calenderStartdate.click();
				yearDropdown.click();
				utility.Calender.currentCalenderYear(driver);
				utility.Calender.currentCalenderMonth(driver);
				utility.Calender.currentCalenderDate(driver);
				
				calenderEnddate.click();
				yearDropdown.click();
				utility.Calender.CustomizeCalenderYear(driver, "2024");
				utility.Calender.CustomizeCalenderMonth(driver, "DEC");
				utility.Calender.CustomizeCalenderDay(driver, "10");
				
				all_Checkbox.click();
				paymentType_Dropdown.click(); 
				Thread.sleep(1000);
				driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", offer, 6)+"')]")).click();
				
				Thread.sleep(1000); propetyPriceMoreThan.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 7));
				
				WebElement applicableForSpecificProject_RadionButton=driver.findElement(By.xpath("//input[@type='radio' and @value='"+Excel.Regression_importDataFromExcel("Offers", offer, 8)+"']"));
				applicableForSpecificProject_RadionButton.click();
				
				if (Excel.Regression_importDataFromExcel("Offers", offer, 8).contains("Yes"))
				{
					Wait.explicitWait(projectDropdown, 10, driver);
					projectDropdown.click();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", offer, 9)+"')]")).click();
					Thread.sleep(1000); mouseAction.moveToElement(projectBlocks_Dropdown).click().build().perform();
				}
				
				j.executeScript("arguments[0].click()", submitButton);
			
			
			}
		}
		public void editOffters(String OfferType) throws InterruptedException, ParseException, EncryptedDocumentException, IOException
		{
			
			mouseAction.moveToElement(propertiesIcon).click(propertiesIcon).build().perform();	
			Thread.sleep(1000);
			Wait.explicitWait(offersIcon, 10, driver);
			offersIcon.click();
			Thread.sleep(2000);	driver.navigate().refresh();
			Thread.sleep(2000);j.executeScript("window.scrollBy(1000,-1000)", "");
		    Thread.sleep(2000);
	
			System.out.println("Start to edit offer: "+OfferType);
			if (OfferType.equals("Area Wise"))
			{	
				WebElement viewOffer =driver.findElement(By.xpath("//table//tr//td[text()='Area Wise']/parent::tr//span"));
				Thread.sleep(1000);j.executeScript("arguments[0].click();", viewOffer);
				Thread.sleep(2000);	driver.findElement(By.xpath("//mat-icon[text()='edit']")).click();
				Thread.sleep(1000);offerName.clear();
				Thread.sleep(1000); offerName.sendKeys(Excel.Regression_importDataFromExcel("Offers", 1, 0)+" "+utility.UtilityClass.getRandomString(1));
				Wait.explicitWait(offerType_Dropdown, 10, driver);
				String offerTypeDisable=offerType_Dropdown.getAttribute("aria-disabled");
				softAssert.assertEquals(offerTypeDisable, true);
				Thread.sleep(1000); 
//				driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", 1, 1)+"')]")).click();
//				discountPerSqFt.sendKeys(Excel.Regression_importDataFromExcel("Offers", 1, 2));
			}
//			else if (offer==2)
//			{
//				WebElement list_ProductName=driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", offer, 1)+"')]"));
//				Wait.explicitWait(list_ProductName, 10, driver);
//				mouseAction.moveToElement(list_ProductName).click(list_ProductName).build().perform();
//				product_Name.sendKeys("Mobile");
//				product_Description.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 2));
//				product_Price.sendKeys("10000");		
//			}
//			else if (offer==3)
//			{
//				WebElement list_directDiscountIn_Rs=driver.findElement(By.xpath("(//mat-option//span)[3]"));
//				Wait.explicitWait(list_directDiscountIn_Rs, 10, driver);
//				mouseAction.moveToElement(list_directDiscountIn_Rs).click(list_directDiscountIn_Rs).build().perform();
//				DirectDiscountInRS.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 2));
//			}
//			else
//			{
//				WebElement list_directDiscountIn_per=driver.findElement(By.xpath("(//mat-option//span)[4]"));
//				Wait.explicitWait(list_directDiscountIn_per, 10, driver);
//				mouseAction.moveToElement(list_directDiscountIn_per).click(list_directDiscountIn_per).build().perform();
//				DirectDiscountInRS.sendKeys("10");
//			}
//			
//			calenderStartdate.click();
//			yearDropdown.click();
//			utility.Calender.currentCalenderYear(driver);
//			utility.Calender.currentCalenderMonth(driver);
//			utility.Calender.currentCalenderDate(driver);
//			
//			calenderEnddate.click();
//			yearDropdown.click();
//			utility.Calender.CustomizeCalenderYear(driver, "2024");
//			utility.Calender.CustomizeCalenderMonth(driver, "DEC");
//			utility.Calender.CustomizeCalenderDay(driver, "10");
//			
//			all_Checkbox.click();
//			paymentType_Dropdown.click(); 
//			Thread.sleep(1000);
//			driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", offer, 6)+"')]")).click();
//			
//			Thread.sleep(1000); propetyPriceMoreThan.sendKeys(Excel.Regression_importDataFromExcel("Offers", offer, 7));
//			
//			WebElement applicableForSpecificProject_RadionButton=driver.findElement(By.xpath("//input[@type='radio' and @value='"+Excel.Regression_importDataFromExcel("Offers", offer, 8)+"']"));
//			applicableForSpecificProject_RadionButton.click();
//			
//			if (Excel.Regression_importDataFromExcel("Offers", offer, 8).contains("Yes"))
//			{
//				Wait.explicitWait(projectDropdown, 10, driver);
//				projectDropdown.click();
//				Thread.sleep(1000);
//				driver.findElement(By.xpath("//mat-option//span[contains(text(), '"+Excel.Regression_importDataFromExcel("Offers", offer, 9)+"')]")).click();
//				Thread.sleep(1000); mouseAction.moveToElement(projectBlocks_Dropdown).click().build().perform();
//			}
//			
//			j.executeScript("arguments[0].click()", submitButton);
		
		
			
			softAssert.assertAll();
		}
		
}
