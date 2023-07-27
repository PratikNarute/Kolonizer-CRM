package randomData_devEnv;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class Properties_PropertyTypes 
{
	WebDriver driver;
	WebDriverWait w;
	SoftAssert a;
	Actions A;
	JavascriptExecutor j ;
	
	public Properties_PropertyTypes(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver = driver;
		w = new  WebDriverWait(driver, Duration.ofSeconds(30));
		a = new SoftAssert();
		A = new Actions(driver);
		j =  (JavascriptExecutor)driver;
	}
	

	
	//===========================================================================================================================================================
	
	//Automation property start with 104
	@FindBy (xpath = "//td[contains(text(),'Automation 1BHK property 104')] / parent :: tr // td // button")private WebElement editButton_Automation_1BHK_Property;
	//===========================================================================================================================================================
	
	@FindBy (xpath = "//div [text()='Properties']") private WebElement propertiesIcon;
	@FindBy (xpath = "//a[@href='/master/property_type'] / parent :: li") private WebElement propertyTypeIcon;
	
	@FindBy (xpath = "//button[text()=' New Product Type ']") private WebElement newPropertyTypeButton;
	@FindBy (xpath = "//input[@formcontrolname='name']") private WebElement nameOfProperty;
	@FindBy (xpath = "//textarea[@formcontrolname='description']") private WebElement description;
	@FindBy (xpath = "//button[text()=' Submit ']") private WebElement submitButton;
	@FindBy (xpath = "//mat-icon[text()='close']") private WebElement closeIcon;
	
	@FindBy (xpath = "//div[text()=' Message:  ']")private WebElement errorMessage_DuplicateProperty;

	
	public void  propertiesIcon()
	{
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div [text()='Properties']")));
		propertiesIcon.click();
		
	}
	public void propertyTypeIcon()
	{
		propertyTypeIcon.click();
	}
	public void editButton_Automation_1BHK_Property()
	{
	   j.executeScript("arguments[0].click()", editButton_Automation_1BHK_Property);
	}
	public void newPropertyTypeButton()
	{
		newPropertyTypeButton.click();
	}
	public void addProperty_1BHK()
	{
		nameOfProperty.sendKeys("Automation 1BHK property "+UtilityClass.getRandomIntegers(2));
		description.sendKeys("The word “property” is derived from the Latin word proprietary and the French equivalent properties, which means a thing owned. The concept of property and ownership are very similar to each other. However, there is a fine line that distinguishes the two terms. It will not be incorrect to state that humans have been aware of their rights to possess what they rightfully own for long. The term property has been widely interpreted by various jurists such as Salmond, Bentham and Austin. Close observation of the definitions given by them will help us understand the concept in a better manner.");
		
	}
	public void addProperty_2BHK()
	{
		nameOfProperty.sendKeys("Automation 2BHK property "+UtilityClass.getRandomIntegers(2));
		description.sendKeys("The word “property” is derived from the Latin word proprietary and the French equivalent properties, which means a thing owned. The concept of property and ownership are very similar to each other. However, there is a fine line that distinguishes the two terms. It will not be incorrect to state that humans have been aware of their rights to possess what they rightfully own for long. The term property has been widely interpreted by various jurists such as Salmond, Bentham and Austin. Close observation of the definitions given by them will help us understand the concept in a better manner.");		
	}
	public void submitButton()
	{
		submitButton.click();
	}
	public void closeIcon()
	{
		closeIcon.click();
	}

	public void editProperty()
	{
		String propertyName=nameOfProperty.getAttribute("value");
		String Description=description.getAttribute("value");
		
		nameOfProperty.clear();
		A.click(description).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		
		nameOfProperty.sendKeys(propertyName);
		description.sendKeys(Description);	
	}
	public void DuplicateProperty() throws InterruptedException
	{
		try
		{
			boolean error = errorMessage_DuplicateProperty.isDisplayed();
			if (error==true)
			{
				Thread.sleep(3000);
				j.executeScript("arguments[0].click()", closeIcon);
			}
		}
		catch (NoSuchElementException e)
		{
			a.assertTrue(true);

		}
		a.assertAll();
	}
	
	

}
