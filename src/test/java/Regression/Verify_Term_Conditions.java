package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Term_Conditions extends Regression.BaseClass
{

	@Test
	void createTermAndConditons() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Term and Conditios' create or not").assignCategory("Master");
		Regression.ProjectSetup_TermAndCondition term = new Regression.ProjectSetup_TermAndCondition (driver);
		Thread.sleep(4000); driver.navigate().refresh(); Thread.sleep(2000);
		term.addTag();
		Thread.sleep(2000); driver.navigate().refresh(); Thread.sleep(2000);
		term.addTermAndConditions();
	}
	
	@Test
	void editTermAndConditons() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Term and Conditios' edit or not").assignCategory("Master");
		Regression.ProjectSetup_TermAndCondition term = new Regression.ProjectSetup_TermAndCondition (driver);
		Thread.sleep(4000); driver.navigate().refresh(); Thread.sleep(2000);
		term.editTermAndConditions();
	}
}
