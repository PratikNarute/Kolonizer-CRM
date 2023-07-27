package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Overall_Cost_types extends Regression.BaseClass
{
	@Test (priority=0)
	void createOverallCostTypes() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Regression.Overall_Cost_Types costType = new Regression.Overall_Cost_Types(driver);
		test = report.createTest("Verify that whether 'Overall cost type' create or not").assignCategory("Master");
		Thread.sleep(5000);driver.navigate().refresh();Thread.sleep(3000);
		costType.createOverallCostTypes();
	}
	@Test (priority=1)
	void editOverallCostTypes() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Regression.Overall_Cost_Types costType = new Regression.Overall_Cost_Types(driver);
		test = report.createTest("Verify that whether 'Overall cost type' edit or not").assignCategory("Master");
		Thread.sleep(2000);driver.navigate().refresh();Thread.sleep(2000);
		costType.editOverallCostType();
	}
}
