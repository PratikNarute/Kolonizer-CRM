package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_LeadSource extends Parameterization.BaseClass
{
	
	@Test
	void create_Lead_Source() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Parameterization.Lead_Source leadSource = new  Parameterization.Lead_Source(driver);
		test = report.createTest("Verify that whether 'lead source' create or not").assignCategory("Master");
		leadSource.createLeadSource();
	}
	

}
