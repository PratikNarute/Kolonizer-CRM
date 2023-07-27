package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Role extends Regression.BaseClass
{
	@Test
	void createRole() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Role' create or not").assignCategory("Master");
		Regression.ProjectSetup_Roles role = new Regression.ProjectSetup_Roles(driver);
		Thread.sleep(3000);
		role.createRoles();
	}
	@Test
	void editRole() throws EncryptedDocumentException, InterruptedException, IOException
	{
		test = report.createTest("Verify that whether 'Role' edit or not").assignCategory("Master");
		Regression.ProjectSetup_Roles role = new Regression.ProjectSetup_Roles(driver);
		Thread.sleep(2000); driver.navigate().refresh();Thread.sleep(2000);
		role.editNewRole();
		
	}

}
