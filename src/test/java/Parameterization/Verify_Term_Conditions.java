package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Term_Conditions extends Parameterization.BaseClass
{

	@Test
	void createTermAndConditons() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Term and Conditios' create or not").assignCategory("Master");
		Parameterization.ProjectSetup_TermAndCondition term = new Parameterization.ProjectSetup_TermAndCondition (driver);
		
		term.addTag();
		term.addTermAndConditions();
	}
}
