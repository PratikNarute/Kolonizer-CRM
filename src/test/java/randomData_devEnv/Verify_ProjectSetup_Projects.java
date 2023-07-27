package randomData_devEnv;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;




public class Verify_ProjectSetup_Projects extends randomData_devEnv.BaseClass
{

	@Test (priority=1, enabled=true, groups="regression")
	void addProjects() throws InterruptedException, EncryptedDocumentException, IOException
	{
		randomData_devEnv.ProjectSetup_Projects P = new randomData_devEnv.ProjectSetup_Projects(driver);
		test = report.createTest("Add Projects").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		
		Thread.sleep(2000);
		P.projectSetupIcon();
		Thread.sleep(1000);
		P.projectsIcon();
		Thread.sleep(1000);
		P.addProjectsButton();
		
		Thread.sleep(1000);P.addDepartmentIcon();
		P.addDepartment();
		P.addProjectsButton();
		P.addProjects_AutomationProject_1();	
		P.submitButtonOfAddProject();

		Thread.sleep(3000);driver.navigate().refresh();
		Thread.sleep(2000);P.addProjectsButton();
		Thread.sleep(1000);P.addProjects_AutomationProject_2();
		P.submitButtonOfAddProject();	
		
	}
	
	@Test (priority=2, enabled=false, groups="Regression")
	void assignProjectToUser() throws InterruptedException
	{
		randomData_devEnv.ProjectSetup_Projects P = new randomData_devEnv.ProjectSetup_Projects(driver);
		test = report.createTest("Assign Project To User").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		
		Thread.sleep(3000);driver.navigate().refresh();
		Thread.sleep(2000);P.assignProjectToAdmin();
	}
	
	@Test (priority=3, enabled=true,groups="regression")
	void editProject() throws InterruptedException
	{
		randomData_devEnv.ProjectSetup_Projects P = new randomData_devEnv.ProjectSetup_Projects(driver);
		test = report.createTest("Edit Projects").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);	
		P.projectSetupIcon();
		P.projectsIcon();
		Thread.sleep(1000);
		P.editIcon_AutomationProject1();
		Thread.sleep(1000);
		P.clear();
		Thread.sleep(1000);
		P.editProject();
		P.submitButtonOfEditProject();
	}

}
