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

public class Properties_ProjectBlocks
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
			@FindBy (xpath = "//mat-option//span[text()='Saleable']") private WebElement typesOfArea_Dropdown_Saleable;
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
			
			public Properties_ProjectBlocks(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
				this.driver=driver;
				w = new WebDriverWait(driver, Duration.ofSeconds(30));
				A = new Actions(driver);
				j = (JavascriptExecutor)driver;
				a = new SoftAssert();
			}
			
			public void propertiesIcon()
			{
				propertiesIcon.click();
			}
			public void icon_projectBlock()
			{
				A.moveToElement(icon_projectBlock).click().build().perform();
			}
			public void addSubmitButton()
			{
				addSubmitButton.click();
			}
			public void Button_addProjectBlock()
			{
				Button_addProjectBlock.click();
			}
			public void addProjectBlock_AutomationProject1_Zone1() throws InterruptedException
			{
				projectName_Dropdown.click();
				Thread.sleep(1000);projectName_Dropdown_AutomationProject1.click();
				
				name_ProjectBlock.sendKeys("Automation P1 Block-1 "+UtilityClass.getRandomIntegers(2));
				typesOfArea_Dropdown.click();
				Thread.sleep(1000);typesOfArea_Dropdown_Saleable.click();
				length.sendKeys("100");
				breadth.sendKeys("100");
				String Area=area.getAttribute("value");a.assertEquals(Area, "10000'0");
			    a.assertAll();
			}
			public void addProjectBlock_AutomationProject1_Zone2() throws InterruptedException
			{
				projectName_Dropdown.click();
				Thread.sleep(1000);projectName_Dropdown_AutomationProject1.click();
				
				name_ProjectBlock.sendKeys("Automation P1 Block-2 "+UtilityClass.getRandomIntegers(2));
				typesOfArea_Dropdown.click();
				Thread.sleep(1000);typesOfArea_Dropdown_Saleable.click();
				length.sendKeys("100");
				breadth.sendKeys("100");
				String Area=area.getAttribute("value");a.assertEquals(Area, "10000'0");
			    a.assertAll();
			}
			public void addProjectBlock_AutomationProject2_Zone1() throws InterruptedException
			{
				projectName_Dropdown.click();
				Thread.sleep(1000);projectName_Dropdown_AutomationProject2.click();
				
				name_ProjectBlock.sendKeys("Automation P2 Block-1 "+UtilityClass.getRandomIntegers(2));
				typesOfArea_Dropdown.click();
				Thread.sleep(1000);typesOfArea_Dropdown_Saleable.click();
				length.sendKeys("100");
				breadth.sendKeys("100");
				String Area=area.getAttribute("value");a.assertEquals(Area, "10000'0");
			    a.assertAll();
			}
			public void addProjectBlock_AutomationProject2_Zone2() throws InterruptedException
			{
				projectName_Dropdown.click();
				Thread.sleep(1000);projectName_Dropdown_AutomationProject2.click();
				
				name_ProjectBlock.sendKeys("Automation P2 Block-2 "+UtilityClass.getRandomIntegers(2));
				typesOfArea_Dropdown.click();
				Thread.sleep(1000);typesOfArea_Dropdown_Saleable.click();
				length.sendKeys("100");
				breadth.sendKeys("100");
				String Area=area.getAttribute("value");a.assertEquals(Area, "10000'0");
			    a.assertAll();
			}
			public void editButton_AutomationProject1_zone1()
			{
			   j.executeScript("arguments[0].click()", editButton_AutomationProject1_Zone1);
			}
			public void edit_AutomationProject1_zone1()
			{
				String name=name_ProjectBlock.getAttribute("value");
				String Length=length.getAttribute("value");
				String Breadth=breadth.getAttribute("value");
				String Area=area.getAttribute("value");
				
				name_ProjectBlock.clear();
				length.clear();
				breadth.clear();
				area.clear();
				
				name_ProjectBlock.sendKeys(name);
				length.sendKeys(Length);
				breadth.sendKeys(Breadth);
				String Area1=area.getAttribute("value");a.assertEquals(Area1, "10000'0");
			    a.assertAll();
			}

			
			
	
	

      }
