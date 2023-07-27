package Regression;


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Verify_ProjectSetup_Users extends Regression.BaseClass
{

	
	@Test(priority=1, enabled=true)
	void createUser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		test = report.createTest("Verify that whether 'User' create or not").assignCategory("Master");
		Regression.ProjectSetup_Users user = new Regression.ProjectSetup_Users(driver);
			
//		for (int i=1;i<=19;i++)
//		{
		 user.CreateUsers();
//		}

  
       
	}
	
	@Test (priority=2, enabled=true)
	void editUser() throws InterruptedException, EncryptedDocumentException, IOException
	{
		test = report.createTest("Verify that whether 'User' edit or not").assignAuthor("Pratik").assignCategory("Master");
		Regression.ProjectSetup_Users P = new Regression.ProjectSetup_Users(driver);
	
		Thread.sleep(8000);	driver.navigate().refresh();Thread.sleep(3000);
		P.editUser();
	

	}

	


}
