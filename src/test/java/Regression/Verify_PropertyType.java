package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_PropertyType extends Regression.BaseClass
{

	@Test(priority=0)
	void createPropertyType () throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Property Type' create or not").assignCategory("Properties");
		Regression.Property_Type propertyType = new Regression.Property_Type(driver);	
		propertyType.createPropertyTypes();
		
	}
	@Test(priority=1)
	void editPropertyType () throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Property Type' edit or not").assignCategory("Properties");
		Regression.Property_Type propertyType = new Regression.Property_Type(driver);
		Thread.sleep(2000);driver.navigate().refresh(); Thread.sleep(2000);
		propertyType.editPropertyTypes();
		
	}
}
