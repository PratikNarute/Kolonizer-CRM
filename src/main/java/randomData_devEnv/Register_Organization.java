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

public class Register_Organization 
{
	@FindBy (xpath = "//div [text()='Organization'] / parent :: div / parent :: a / parent :: li")private WebElement oganization_Icon;
	@FindBy (xpath = "//div[contains(text(), ' Add Organization ')]")private WebElement addOrganization_Button;
	@FindBy (xpath = "//input[@formcontrolname='name']")private WebElement organizationName_InputTab;
	@FindBy (xpath = "//input[@formcontrolname='phone']")private WebElement organizationPhone_InputTab;
	@FindBy (xpath = "//input[@formcontrolname='oragnizational_email']")private WebElement organizationEmail_InputTab;
	@FindBy (xpath = "//input[@formcontrolname='password']")private WebElement organizationPassword_InputTab;
	@FindBy (xpath = "//input[@formcontrolname='url']")private WebElement organizationURL_InputTab;
	@FindBy (xpath = "//input[@formcontrolname='description']")private WebElement organizationDescription_InputTab;
	@FindBy (xpath = "//div[text()='Register Address'] / following-sibling :: div // textarea[@formcontrolname='address']")private WebElement currentAddress_InputTab;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
//	@FindBy (xpath = "")private WebElement dfjdlfj;
	
	WebDriver driver;
	SoftAssert a;
	WebDriverWait w;
	JavascriptExecutor j;
	Actions A;
	public Register_Organization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		a = new SoftAssert();
		j=(JavascriptExecutor)driver;
		A = new Actions(driver);
		w = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	

}
