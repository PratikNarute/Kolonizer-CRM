package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_ProjectBlocks extends Regression.BaseClass
{
	@Test(priority=0)
	void createProjectBlocks() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Regression.Project_Blocks block = new Regression.Project_Blocks(driver);
		test = report.createTest("Verify that whether 'Project Block' create or not").assignCategory("Properties");
		Thread.sleep(7000);driver.navigate().refresh();Thread.sleep(3000);
		block.createProjectBlocks();
	}
	@Test(priority=1)
	void editProjectBlocks() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Regression.Project_Blocks block = new Regression.Project_Blocks(driver);
		test = report.createTest("Verify that whether 'Project Block' edit or not").assignCategory("Properties");
		Thread.sleep(2000);driver.navigate().refresh();Thread.sleep(2000);
		block.editProjectBlocks();
	}

}
