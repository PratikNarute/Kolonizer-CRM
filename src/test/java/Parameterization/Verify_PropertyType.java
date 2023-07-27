package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_PropertyType extends Parameterization.BaseClass
{

	@Test
	void createPropertyType () throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Property Type' create or not").assignCategory("Master");
		Parameterization.Property_Type propertyType = new Parameterization.Property_Type(driver);
		
		propertyType.createPropertyTypes();
		
	}
}
