package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;




public class Verify_ProjectSetup_Projects extends Regression.BaseClass
{

	@Test (priority=1, enabled=true, groups="regression")
	void Create_DepartmentAndProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Regression.ProjectSetup_Projects P = new Regression.ProjectSetup_Projects(driver);
		test = report.createTest("Verify that whether 'Project' create or not").assignCategory("Master");
		Thread.sleep(10000);
		P.addDepartment();
		P.createProjects();		
	}
	
	@Test (priority=3, enabled=true,groups="regression")
	void editProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Regression.ProjectSetup_Projects P = new Regression.ProjectSetup_Projects(driver);
		test = report.createTest("Verify that whether 'Project' edit or not").assignCategory("Master");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		P.editProject();
	}

}
