package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_ProjectBlocks extends Parameterization.BaseClass
{
	@Test
	void createProjectBlocks() throws EncryptedDocumentException, InterruptedException, IOException
	{
		Parameterization.Project_Blocks block = new Parameterization.Project_Blocks(driver);
		test = report.createTest("Verify that whether 'Project Block' create or not").assignCategory("Master");
		block.createProjectBlocks();
	}

}
