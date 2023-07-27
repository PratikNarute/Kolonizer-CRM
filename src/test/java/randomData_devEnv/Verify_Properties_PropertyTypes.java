package randomData_devEnv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Verify_Properties_PropertyTypes extends BaseClass
{

	@Test  (priority=0, enabled=true)
	void addProperties() throws InterruptedException
	{
		randomData_devEnv.Properties_PropertyTypes P = new randomData_devEnv.Properties_PropertyTypes(driver);
		test = report.createTest("Add Properties Type").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000);P.propertiesIcon();
	    Thread.sleep(1000);P.propertyTypeIcon();
		P.newPropertyTypeButton();
		P.addProperty_1BHK();
		P.submitButton();
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000); P.propertiesIcon();
	    Thread.sleep(1000);
		P.propertyTypeIcon();
		P.newPropertyTypeButton();
		P.addProperty_2BHK();
		P.submitButton();

	}
	
	@Test (priority=1, enabled=true)
	void editProperties() throws InterruptedException
	{
		test = report.createTest("edit Properties Type").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
		randomData_devEnv.Properties_PropertyTypes P = new randomData_devEnv.Properties_PropertyTypes(driver);

		Thread.sleep(3000);driver.navigate().refresh();
		Thread.sleep(2000);  P.propertiesIcon();
	    Thread.sleep(1000);	P.propertyTypeIcon();
		P.editButton_Automation_1BHK_Property();	
		Thread.sleep(2000);P.editProperty();
		P.submitButton();	
		
	}
	

}
