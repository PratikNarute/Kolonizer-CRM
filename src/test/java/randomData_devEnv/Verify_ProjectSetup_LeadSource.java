package randomData_devEnv;

import org.testng.annotations.Test;

public class Verify_ProjectSetup_LeadSource extends BaseClass
{
	@Test (priority=1,enabled=true )
	void addLeadSource () throws InterruptedException
	{
		test = report.createTest("Add Lead Source").assignAuthor("Nikhil").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_LeadSource L = new randomData_devEnv.ProjectSetup_LeadSource(driver);
		
		Thread.sleep(3000);	driver.navigate().refresh();
		Thread.sleep(2000); L.projectSetup();
		Thread.sleep(2000); L.lead_Source_Icon();

//		===========================================================================================
		Thread.sleep(2000);L.lead_Source_Button(); 
		L.addLeadSource_Direct();
//		==========================================================================================		
		
	
	}
	@Test (priority=2,enabled=true )
	void editLeadSource () throws InterruptedException
	{
		test = report.createTest("Edit Lead Source").assignAuthor("Nikhil").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_LeadSource L = new randomData_devEnv.ProjectSetup_LeadSource(driver);
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000); L.projectSetup();
		Thread.sleep(2000); L.lead_Source_Icon();
		Thread.sleep(2000); L.edit_lead_Source_Button_Direct();
		Thread.sleep(1000);	L.edit_leadSource();
		L.submit_Button();
	}


}
