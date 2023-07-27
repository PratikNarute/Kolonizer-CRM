package randomData_devEnv;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Verify_ProjectSetup_Users extends BaseClass
{

	
	@Test(priority=1, enabled=true)
	void addUser() throws InterruptedException
	{
		test = report.createTest("Add User").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_Users P = new randomData_devEnv.ProjectSetup_Users(driver);
			
//		for (int i=1;i<=19;i++)
//		{
		    Thread.sleep(3000);driver.navigate().refresh();
		    Thread.sleep(3000);P.projectSetupIcon();
		    Thread.sleep(1000);P.userIcon();
			Thread.sleep(2000); P.addUserButton();
			Thread.sleep(1000);	P.addUsers_AutomationUser1();
	        Thread.sleep(1000);
	        P.submitButton();
//		}
		
           	
//		for (int i=1;i<=19;i++)
//		{
		    Thread.sleep(3000);driver.navigate().refresh();
		    Thread.sleep(3000);P.projectSetupIcon();
		    Thread.sleep(1000);P.userIcon();
			Thread.sleep(2000); P.addUserButton();
			Thread.sleep(1000);	P.addUsers_AutomationUser2();
	        Thread.sleep(1000);
	        P.submitButton();
//		}

  
        
	}
	
	@Test (priority=2, enabled=true)
	void editUser() throws InterruptedException
	{
		test = report.createTest("edit User").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_Users P = new randomData_devEnv.ProjectSetup_Users(driver);
	
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);	P.projectSetupIcon();
		Thread.sleep(1000);P.userIcon();	
		Thread.sleep(2000);P.editButton_AutomationUserOne();
		Thread.sleep(2000);P.editUserIcon();
		
	    Thread.sleep(3000); P.editUser();
		Thread.sleep(1000);P.submitButton();

	}

	


}
