package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Properties_Features extends Regression.BaseClass
{
	@Test
	void create_feaure() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test = report.createTest("Verify that whether 'Feature' create or not").assignCategory("Properties");
		Regression.Properties_Features feature = new  Regression.Properties_Features(driver);
		feature.createFeatures();
	}
	@Test
	void edit_feature() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test = report.createTest("Verify that whether 'Feature' edit or not").assignCategory("Properties");
		Regression.Properties_Features feature = new  Regression.Properties_Features(driver);
		Thread.sleep(2000);driver.navigate().refresh(); Thread.sleep(2000);
		feature.editFeatures();
	}

}
