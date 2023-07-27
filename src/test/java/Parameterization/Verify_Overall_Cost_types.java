package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Overall_Cost_types extends Parameterization.BaseClass
{
	@Test 
	void createOverallCostTypes() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Overall_Cost_Types costType = new Overall_Cost_Types(driver);
		test = report.createTest("Verify that whether 'Overall cost type' create or not").assignCategory("Master");
		costType.createOverallCostTypes();
	}

}
