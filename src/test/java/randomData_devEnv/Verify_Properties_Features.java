package randomData_devEnv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Verify_Properties_Features extends BaseClass
{

	@Test (priority=1, enabled=true)
	void addFeatures() throws InterruptedException
	{
		randomData_devEnv.Properties_Features F = new randomData_devEnv.Properties_Features(driver);
		test = report.createTest("Add Features").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
	
		Thread.sleep(3000); driver.navigate().refresh();
		Thread.sleep(2000); F.propertiesIcon();
	    Thread.sleep(1000); F.propertyFeatureIcon();
	    Thread.sleep(2000); F.addFeatures();
		F.addIcon();	
	}
	
	@Test (priority=2,enabled=true)
	void editFeatures() throws InterruptedException
	{
		test = report.createTest("edit Features").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
		randomData_devEnv.Properties_Features F = new randomData_devEnv.Properties_Features(driver);
		
		Thread.sleep(3000);driver.navigate().refresh();
		Thread.sleep(2000); F.propertiesIcon();
	    Thread.sleep(1000); F.propertyFeatureIcon();
	    Thread.sleep(2000); F.editButton_AutomationFeature();
		Thread.sleep(2000);F.editFeatures();
		Thread.sleep(1000);F.updateButton();	
	}
	


}
