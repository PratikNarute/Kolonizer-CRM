package randomData_devEnv;

import org.testng.annotations.Test;

public class Verify_ProjectSetup_TermAndCondition extends BaseClass
{
	@Test (priority=0, enabled=true)
	void addTag() throws InterruptedException
	{
		test = report.createTest("To check that create Tag or not").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_TermAndCondition T = new randomData_devEnv.ProjectSetup_TermAndCondition(driver);
		
		Thread.sleep(2000);driver.navigate().refresh() ;
		Thread.sleep(2000) ;T.projectSetup();
		Thread.sleep(2000) ;T.termAndCondition_Icon();
		Thread.sleep(2000); T.addTermAndCondition_Button();
		Thread.sleep(2000); T.addTag();
		Thread.sleep(1000); T.toCheckThatSelectedTag();
	}
	@Test (priority=1,enabled=true )
	void addTermAndCondition () throws InterruptedException	
	{
		test = report.createTest("To check that create Term and Condition or not").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_TermAndCondition T = new randomData_devEnv.ProjectSetup_TermAndCondition(driver);
			
		Thread.sleep(2000); T.addTermAndConditions();
		Thread.sleep(2000); T.submit_Button();			
   }
	@Test (priority=2, enabled=true)
	void ckeckThatDragAndDropFunctionalityWorkingProperlyOrNot() throws InterruptedException
	{
		test = report.createTest("To Check that drag and drop functionality is working properly or not").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_TermAndCondition T = new randomData_devEnv.ProjectSetup_TermAndCondition(driver);
		
		Thread.sleep(2000);driver.navigate().refresh() ;
		Thread.sleep(2000) ;T.projectSetup();
		Thread.sleep(2000) ;T.termAndCondition_Icon();	
		Thread.sleep(2000); T.ckeckThatDragAndDropFunctionalityWorkingProperlyOrNot();
	}
	
	@Test (priority=3,enabled=true )
	void editTermAndCondition () throws InterruptedException
	{
		test = report.createTest("To check that Edit Term and Condition or not").assignAuthor("Pratik").assignCategory("Project Setup").assignDevice("Window");
		randomData_devEnv.ProjectSetup_TermAndCondition T = new randomData_devEnv.ProjectSetup_TermAndCondition(driver);
		
		Thread.sleep(3000);driver.navigate().refresh();
		Thread.sleep(2000);T.projectSetup();
		Thread.sleep(1000);T.termAndCondition_Icon();
		Thread.sleep(2000); T.automationTermAndCondition_ButtonBox();
		Thread.sleep(2000); T.editTermAndCondition();
		T.update();
		Thread.sleep(2000); driver.navigate().refresh();
		Thread.sleep(2000);	T.logOut();
		T.logIn();
	
	
	}	
}