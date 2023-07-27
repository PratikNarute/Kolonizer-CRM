package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Role extends Parameterization.BaseClass
{
	@Test
	void createRole() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Role' create or not").assignCategory("Master");
		Parameterization.ProjectSetup_Roles role = new Parameterization.ProjectSetup_Roles(driver);
		role.createRoles();
	}

}
