package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_LeadSource extends Regression.BaseClass
{
	
	@Test(priority=0)
	void create_Lead_Source() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Regression.Lead_Source leadSource = new  Regression.Lead_Source(driver);
		test = report.createTest("Verify that whether 'lead source' create or not").assignCategory("Master");
		leadSource.createLeadSource();
	}
	@Test(priority=1)
	void edit_Lead_Source() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Regression.Lead_Source leadSource = new  Regression.Lead_Source(driver);
		test = report.createTest("Verify that whether 'lead source' edit or not").assignCategory("Master");
		Thread.sleep(2000);driver.navigate().refresh();Thread.sleep(3000);
		leadSource.editLeadSource();
	}
	

}
