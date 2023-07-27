package randomData_devEnv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Verify_Lead extends BaseClass
{

				
				@Test (priority=1,enabled=true )
				void createLeadWith_Category_Is_Hot () throws InterruptedException
				{
					test = report.createTest("Create Lead With Category is Hot").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
					randomData_devEnv.Lead L = new randomData_devEnv.Lead(driver);	

					for (int i=1; i<=5; i++)
					{
						Thread.sleep(2000); driver.navigate().refresh();
						Thread.sleep(2000); L.leadsIcon();
					    Thread.sleep(1000); L.activeLeadIcon();
						Thread.sleep(1000);L.newLeadButton();	
						Thread.sleep(1000);L.createLeadWith_Category_Is_Hot();
					}
				
				}
				
				
				@Test(priority=2, enabled=true)
				void createLeadWith_Category_Is_Warm () throws InterruptedException
				{
					test = report.createTest("Create Lead With Category Is Warm").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
					randomData_devEnv.Lead L = new randomData_devEnv.Lead(driver);
					
//					for (int i=1;i<=25;i++)
//					{
						Thread.sleep(2000); driver.navigate().refresh();
						Thread.sleep(2000); L.leadsIcon();
					    Thread.sleep(1000); L.activeLeadIcon();
						Thread.sleep(1000);L.newLeadButton();
					    Thread.sleep(1000);L.createLeadWith_Category_Is_Warm();
//					}
					
				}
				
				@Test (priority=3, enabled=true)
				void createLeadWith_Category_Is_Cold () throws InterruptedException 
				{
					test = report.createTest("create Lead With Category Is Cold").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
					randomData_devEnv.Lead L = new randomData_devEnv.Lead(driver);
		
					Thread.sleep(2000); driver.navigate().refresh();
					Thread.sleep(2000); L.leadsIcon();
				    Thread.sleep(1000); L.activeLeadIcon();
					Thread.sleep(1000);L.newLeadButton();	
					Thread.sleep(1000);L.createLeadWith_Category_Is_Cold();
				}
				
				@Test (priority=4, enabled=true)
				void createLeadWith_MpdeOfIntrest_Is_NotInterested () throws InterruptedException
				{
					test = report.createTest("Create Lead With Mode Of Interest Is Not Intrested").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
					randomData_devEnv.Lead L = new randomData_devEnv.Lead(driver);
							
					Thread.sleep(2000); driver.navigate().refresh();
					Thread.sleep(2000); L.leadsIcon();
				    Thread.sleep(1000); L.activeLeadIcon();
					Thread.sleep(1000);L.newLeadButton();	
					Thread.sleep(1000); L.createLeadWith_ModeOfInterest_Is_NotIntrested();
				}
				
				@Test (priority=5, enabled=true)
				void createLeadWith_ContactabilityIsNotConnected () throws InterruptedException
				{
					test = report.createTest("Create Lead With Contactability Is Not Connected").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
					randomData_devEnv.Lead L = new randomData_devEnv.Lead(driver);
					
					Thread.sleep(2000); driver.navigate().refresh();
					Thread.sleep(2000); L.leadsIcon();
				    Thread.sleep(1000); L.activeLeadIcon();
					Thread.sleep(1000);L.newLeadButton();	
					Thread.sleep(1000); L.createLeadWith_Contactibility_Is_NotConnected();

				}
				
				@Test (priority=6, enabled=true)
				void createLeadWith_ContactabilityIsNotMatched () throws InterruptedException
				{
					test = report.createTest("Create Lead With Contactability Is Not Matched").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
					randomData_devEnv.Lead L = new randomData_devEnv.Lead(driver);
					
					Thread.sleep(2000); driver.navigate().refresh();
					Thread.sleep(2000); L.leadsIcon();
				    Thread.sleep(1000); L.activeLeadIcon();
					Thread.sleep(1000);L.newLeadButton();	
					Thread.sleep(1000); L.createLeadWith_ContactabilityIsNotMatched();

				}

				
				@Test (priority=8, enabled=true)
				void editLead () throws InterruptedException
				{
					test = report.createTest("Edit lead").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
					randomData_devEnv.Lead L = new randomData_devEnv.Lead(driver);
					
			    	Thread.sleep(2000);  driver.navigate().refresh();
					Thread.sleep(2000); L.leadsIcon();	L.activeLeadIcon();
					Thread.sleep(1000) ; L.AHot_Icon();
				    Thread.sleep(1000); L.editButton_HotLead();
				    Thread.sleep(1000); L.editLead();
					L.editCompanyDataField();
					L.editPersonalDataField();
					L.editLeadRequirementField();
					L.updateButton();
				
				}
				


}
