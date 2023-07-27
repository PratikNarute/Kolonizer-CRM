package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Properties_PropertyPriceAndStatus extends Regression.BaseClass
{
	
	@Test
	void create_Properties() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Property' create or not").assignCategory("Properties");
		Regression.Properties_PropertyPriceAndStatus property = new Regression.Properties_PropertyPriceAndStatus(driver);
		
		property.createPropperties();
	}
	@Test
	void edit_Properties() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Property' edit or not").assignCategory("Properties");
		Regression.Properties_PropertyPriceAndStatus property = new Regression.Properties_PropertyPriceAndStatus(driver);
		Thread.sleep(2000); driver.navigate().refresh();Thread.sleep(2000);
		property.editPropperties();
	}

}
