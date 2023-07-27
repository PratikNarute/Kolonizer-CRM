package randomData_devEnv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verify_ProjectSetup_Roles extends BaseClass
{

	
	@Test (priority=1, enabled=true, groups={"regression"})
	void addRole() throws InterruptedException
	{
		randomData_devEnv.ProjectSetup_Roles P = new randomData_devEnv.ProjectSetup_Roles(driver);
		test = report.createTest("Add Role").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		
		Thread.sleep(3000);driver.navigate().refresh();
		Thread.sleep(2000);P.projectSetupIcon();
		Thread.sleep(1000); P.roleIcon();	
		Thread.sleep(1000); P.addNewRole_Button();
		Thread.sleep(1000); P.addNewRole_AtomationRole1();	
		P.submitButton();
		
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		P.addNewRole_Button();
		P.addNewRole_AtomationRole2();
		P.submitButton();
		
	}
	
	@Test (priority=2,enabled=true, groups="regression")
	void editRole() throws InterruptedException
	{
		test = report.createTest("Edit Role").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_Roles P = new randomData_devEnv.ProjectSetup_Roles(driver);

		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		P.projectSetupIcon();
		Thread.sleep(1000); P.roleIcon();	
		Thread.sleep(1000); P.editIcon_AtomationRole1();		
		Thread.sleep(1000); P.editNewRole();
		P.submitButton();	
	}
	



	
}
