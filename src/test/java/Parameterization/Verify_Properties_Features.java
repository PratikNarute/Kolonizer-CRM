package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Properties_Features extends Parameterization.BaseClass
{
	@Test
	void create_Lead_Source() throws EncryptedDocumentException, IOException, InterruptedException
	{
		test = report.createTest("Verify that whether 'Feature' create or not").assignCategory("Master");
		Parameterization.Properties_Features feature = new  Parameterization.Properties_Features(driver);
		feature.createFeatures();
	}

}
