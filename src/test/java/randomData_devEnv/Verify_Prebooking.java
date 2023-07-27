package randomData_devEnv;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Verify_Prebooking extends BaseClass
{
	String searchPhoneNo;
	@Test(priority=0, enabled=true)
	void prebookingthroughlead() throws InterruptedException
	{
		test=report.createTest("Prebooking through lead").assignAuthor("Nikhil").assignCategory("Prebooking").assignDevice("window");
		randomData_devEnv.Prabooking p = new randomData_devEnv.Prabooking(driver);
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000);p.leadsIcon();
		Thread.sleep(1000);p.activeLeadIcon();    
		Thread.sleep(2000);p.newLead();                         //Create Lead With Status Is visit To Proceed For Prebooking
		Thread.sleep(2000);p.addLeadWith_statusIscall();
		Thread.sleep(1000); p.submitButton();
		
		Thread.sleep(2000);p.searchLead();
			
		Thread.sleep(2000);p.editLeadAutomationPrebookingLead();
		Thread.sleep(2000);p.statusChangeCallToMeet();	
		Thread.sleep(1000); p.update();
		
		Thread.sleep(2000);p.searchLead();
		
		Thread.sleep(2000);p.editLeadAutomationPrebookingLead();
		Thread.sleep(2000);p.statusChangeMeetToVisit();
		
		Thread.sleep(2000);p.proceedtoprebooking_Button();
		Thread.sleep(2000);p.prebookingOfProperty_1BHK_2();
		Thread.sleep(2000);p.saveprebooking();
//		Thread.sleep(2000);p.nowBooking_Button();	
		this.searchPhoneNo=p.searchPhoneNo;
	}
	@Test (priority=2, enabled=true)
	void realeasePrebookingProperty() throws InterruptedException
	{
		test=report.createTest("Prebooking through lead").assignAuthor("Nikhil").assignCategory("Prebooking").assignDevice("window");
		randomData_devEnv.Prabooking p = new randomData_devEnv.Prabooking(driver);
		
		Thread.sleep(2000);driver.navigate().refresh();
		Thread.sleep(2000);p.leadsIcon();
		Thread.sleep(1000);p.activeLeadIcon();  
		Thread.sleep(1000);p.prebookedLeads_Icon();
		
		Thread.sleep(2000);driver.findElement(By.xpath("//input[@data-placeholder='Search']")).sendKeys(this.searchPhoneNo); //Search lead
		driver.findElement(By.xpath("//input[@data-placeholder='Search']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);p.editDirect_AutomationPrebookingLead();
		Thread.sleep(2000);p.deletePrebooking_PropertyNo_2BHK_1();
		Thread.sleep(2000);p.remark_releaseProperty();
		Thread.sleep(2000);p.releaseProperty_Yes();
		
	}
	

}
