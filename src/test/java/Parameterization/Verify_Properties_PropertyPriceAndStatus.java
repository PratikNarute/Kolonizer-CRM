package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Properties_PropertyPriceAndStatus extends Parameterization.BaseClass
{
	
	@Test
	void create_Properties() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Property' create or not").assignCategory("Master");
		Parameterization.Properties_PropertyPriceAndStatus property = new Parameterization.Properties_PropertyPriceAndStatus(driver);
		
		for (int i=1; i<=3; i++)
		{
			property.createPropperties();
		}
		
	}

}
