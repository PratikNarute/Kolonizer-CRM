package Regression;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Verify_Lead extends Regression.BaseClass
{

				
				@Test (priority=1,enabled=true )
				void createLead () throws InterruptedException, EncryptedDocumentException, IOException
				{
					Regression.Lead lead = new Regression.Lead(driver);	
					test = report.createTest("Verify that whether 'lead' create or not").assignCategory("Lead");
					lead.createLeadProfession();
					driver.navigate().refresh(); Thread.sleep(2000);
					lead.createLeads();						
				}
				
			
				


}
