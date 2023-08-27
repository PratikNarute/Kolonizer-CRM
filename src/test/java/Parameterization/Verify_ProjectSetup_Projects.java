package Parameterization;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;




public class Verify_ProjectSetup_Projects extends Parameterization.BaseClass
{

	@Test (priority=1, enabled=true, groups="regression")
	void Create_DepartmentAndProject() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Parameterization.ProjectSetup_Projects P = new Parameterization.ProjectSetup_Projects(driver);
		test = report.createTest("Verify that whether 'Project' create or not").assignCategory("Master");
		Thread.sleep(2000);driver.navigate().refresh(); Thread.sleep(2000);
		P.addDepartment();
		P.createProjects();		
	}
	
//	@Test (priority=2, enabled=false, groups="Regression")
//	void assignProjectToUser() throws InterruptedException
//	{
//		Parameterization.ProjectSetup_Projects P = new Parameterization.ProjectSetup_Projects(driver);
//		test = report.createTest("Assign Project To User").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
//		
//		Thread.sleep(3000);driver.navigate().refresh();
//		Thread.sleep(2000);P.assignProjectToAdmin();
//	}
//	
//	@Test (priority=3, enabled=true,groups="regression")
//	void editProject() throws InterruptedException, EncryptedDocumentException, IOException
//	{
//		Parameterization.ProjectSetup_Projects P = new Parameterization.ProjectSetup_Projects(driver);
//		test = report.createTest("Edit Projects").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
//		
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);	
//		P.projectSetupIcon();
//		P.projectsIcon();
//		Thread.sleep(1000);
//		P.editIcon_AutomationProject1();
//		Thread.sleep(1000);
//		P.clear();
//		Thread.sleep(1000);
//		P.editProject();
//		P.submitButtonOfEditProject();
//	}

}
