package randomData_devEnv;

import java.text.ParseException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Verify_Properties_Offers extends BaseClass
{

	@Test (priority=1, enabled=true)
    void addOffers() throws InterruptedException, ParseException
    {
        test = report.createTest("add Offers").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
        randomData_devEnv.Properties_Offers P = new randomData_devEnv.Properties_Offers(driver);
        
        Thread.sleep(2000); driver.navigate().refresh();
        Thread.sleep(2000); P.propertiesIcon();
        Thread.sleep(1000); P.offersIcon();
        Thread.sleep(2000); P.addOffersButton();
        Thread.sleep(1000); P.addOffer_AreaWise();
        Thread.sleep(2000); P.toCheckThatSelectedPropertyIsShowingCorrectlyOrNot();
        P.submitButton();
        
        Thread.sleep(2000); driver.navigate().refresh();
		Thread.sleep(2000); P.propertiesIcon();
	    Thread.sleep(1000); P.offersIcon();
		Thread.sleep(2000); P.addOffersButton();
		Thread.sleep(1000); P.addOffer_product_Givaway();
		Thread.sleep(2000); P.toCheckThatSelectedPropertyIsShowingCorrectlyOrNot();
		P.submitButton();
			
		Thread.sleep(2000); driver.navigate().refresh();
		Thread.sleep(2000); P.propertiesIcon();
	    Thread.sleep(1000); P.offersIcon();
		Thread.sleep(2000); P.addOffersButton();
		Thread.sleep(1000); P.addOffer_DirectDiscountInRS();
		Thread.sleep(2000); P.toCheckThatSelectedPropertyIsShowingCorrectlyOrNot();
		P.submitButton();
	
		Thread.sleep(2000); driver.navigate().refresh();
		Thread.sleep(2000); P.propertiesIcon();
	    Thread.sleep(1000); P.offersIcon();
		Thread.sleep(2000); P.addOffersButton();
		Thread.sleep(1000); P.addOffer_DirectDiscountInPecentage();
		Thread.sleep(2000); P.toCheckThatSelectedPropertyIsShowingCorrectlyOrNot();
		P.submitButton();	
    }
    @Test (priority=2, enabled=true)
    void editOffer() throws InterruptedException
    {
        test = report.createTest("Edit Offers").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
        randomData_devEnv.Properties_Offers P = new randomData_devEnv.Properties_Offers(driver);
        
        Thread.sleep(2000); driver.navigate().refresh();
        Thread.sleep(2000); P.propertiesIcon();
        Thread.sleep(1000); P.offersIcon();
        Thread.sleep(2000);  P.veiwIcon_AutomationOffer_AreaWise();        
        Thread.sleep(2000); P.editIcon();
        P.editOffers_AreaWise();
        P.submitButton();    
    }

}
