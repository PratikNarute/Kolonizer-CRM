package randomData_devEnv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Verify_Properties_PropertyPriceAndStatus extends BaseClass
{
	
	@Test  (priority=0, enabled=true)
	void addProperties() throws InterruptedException
	{
		randomData_devEnv.Properties_PropertyPriceAndStatus P = new randomData_devEnv.Properties_PropertyPriceAndStatus(driver);
		test = report.createTest("add Properties").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
		
		for(int i=1;i<=3;i++)
		{
		//	========================================================================================================================
			//PR0JECT 1
			Thread.sleep(2000);driver.navigate().refresh();
			Thread.sleep(2000);P.propertiesIcon();
			Thread.sleep(1000);P.propertyPriceAndStatusIcon();
			P.addPropertiesButton();
			Thread.sleep(2000); P.addPropertiesPriceAndStatus_AutomationProject1_Block1_1BHKProperty_NO_1();
			Thread.sleep(1000); P.submitButton();	

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject1_Block1_1BHKProperty_NO_2();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);P.addPropertiesPriceAndStatus_AutomationProject1_Block1_2BHKProperty_NO_1();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject1_Block1_2BHKProperty_NO_2();
			P.submitButton();
			
			Thread.sleep(2000);driver.navigate().refresh();
			Thread.sleep(2000);P.propertiesIcon();
			Thread.sleep(1000);P.propertyPriceAndStatusIcon();
			P.addPropertiesButton();
			Thread.sleep(2000); P.addPropertiesPriceAndStatus_AutomationProject1_Block2_1BHKProperty_NO_1();
			Thread.sleep(1000); P.submitButton();		

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject1_Block2_1BHKProperty_NO_2();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);P.addPropertiesPriceAndStatus_AutomationProject1_Block2_2BHKProperty_NO_1();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject1_Block2_2BHKProperty_NO_2();
			P.submitButton();
//			===================================================================================================================
//			PROJECT 2
			Thread.sleep(2000);driver.navigate().refresh();
			Thread.sleep(2000);P.propertiesIcon();
			Thread.sleep(1000);P.propertyPriceAndStatusIcon();
			P.addPropertiesButton();
			Thread.sleep(2000); P.addPropertiesPriceAndStatus_AutomationProject2_Block1_1BHKProperty_NO_1();
			Thread.sleep(1000); P.submitButton();	

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject2_Block1_1BHKProperty_NO_2();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);P.addPropertiesPriceAndStatus_AutomationProject2_Block1_2BHKProperty_NO_1();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject2_Block1_2BHKProperty_NO_2();
			P.submitButton();
			
			Thread.sleep(2000);driver.navigate().refresh();
			Thread.sleep(2000);P.propertiesIcon();
			Thread.sleep(1000);P.propertyPriceAndStatusIcon();
			P.addPropertiesButton();
			Thread.sleep(2000); P.addPropertiesPriceAndStatus_AutomationProject2_Block2_1BHKProperty_NO_1();
			Thread.sleep(1000); P.submitButton();		

			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject2_Block2_1BHKProperty_NO_2();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);P.addPropertiesPriceAndStatus_AutomationProject2_Block2_2BHKProperty_NO_1();
			P.submitButton();
			
			Thread.sleep(2000);
			driver.navigate().refresh();
			Thread.sleep(2000);
			P.addPropertiesButton();
			Thread.sleep(2000);	P.addPropertiesPriceAndStatus_AutomationProject2_Block2_2BHKProperty_NO_2();
			P.submitButton();
		}


	}
	@Test (priority=1, enabled=true)
	void editProperties() throws InterruptedException
	{
		test = report.createTest("edit Properties").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
		randomData_devEnv.Properties_PropertyPriceAndStatus P = new randomData_devEnv.Properties_PropertyPriceAndStatus(driver);	
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000);P.propertiesIcon();
		Thread.sleep(1000);P.propertyPriceAndStatusIcon();
		Thread.sleep(2000);P.editButtonOf_Automation_1BHK_propertyNO_2();
		Thread.sleep(2000);P.editIcon();
		P.editPropertiesPriceAndStatus_Automation_1BHK_propertyNO_2();
		P.submitButton();	
	}
	
	
	
	

}
