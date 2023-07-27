package randomData_devEnv;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Verify_Booking extends BaseClass
{
	String name_bookedLead;
     @Test (priority=0, enabled=true)
     void bookingPropertyThroughLead () throws InterruptedException
     {
    	test = report.createTest("Booking Property Through Lead").assignCategory("Booking").assignAuthor("Pratik").assignDevice("Window");
    	randomData_devEnv.Booking B = new randomData_devEnv.Booking(driver);
       	
    	Thread.sleep(2000); driver.navigate().refresh();
    	Thread.sleep(2000); B.leadsIcon();
    	Thread.sleep(1000); B.activeLeadIcon();
    	Thread.sleep(1000); B.newLeadButton();
    	Thread.holdsLock(1000); B.addLeadWith_statusIsVisit();
    	this.name_bookedLead=B.name_bookedLead;
    	B.submitButton();
    	
    	Thread.sleep(2000); driver.navigate().refresh();
    	Thread.sleep(2000); B.leadsIcon();
    	Thread.sleep(1000); B.activeLeadIcon();
    	Thread.sleep(1000); B.AHot_Icon();	
    	Thread.sleep(2000); B.editButton_AutomationbookedLead();  	
    	Thread.sleep(1000); B.book_propertyNo_2BHK_1();
    	Thread.sleep(2000); B.FillLeadClosureForm_PaymentTypeIsInstallatione(); 
    	Thread.sleep(2000); B.submitButton_LeadClosure();  

    	Thread.sleep(2000); driver.navigate().refresh();
    	Thread.sleep(2000);B.customerIcon();
    	Thread.sleep(1000); B.addCustomerButton();
      	Thread.sleep(1000); B.primaryContactInformation_bookingPropertyThroughLead();
      	Thread.sleep(1000); B.secondaryContactInformation_bookingPropertyThroughLead();
		Thread.sleep(1000); B.PropertyDetails();
		B.veiwPrebookingsButton();
		Thread.sleep(1000); B.clickHereButton();
		B.leadClosureDetailsBox();
		Thread.sleep(2000); B.submitButton_Customer();
     }
     @Test (priority=1, enabled=true)
     void releaseBookedPropertyThroughLead () throws InterruptedException
     {
    	test = report.createTest("Release Booked Property Through Lead").assignCategory("Booking").assignAuthor("Pratik").assignDevice("Window");
    	randomData_devEnv.Booking B = new randomData_devEnv.Booking(driver);
   
    	Thread.sleep(2000); driver.navigate().refresh();
    	Thread.sleep(2000);B.customerIcon();	
    	Thread.sleep(1000);	driver.findElement(By.xpath("//input[@data-placeholder='Search']")).sendKeys(this.name_bookedLead);
    	driver.findElement(By.xpath("//input[@data-placeholder='Search']")).sendKeys(Keys.ENTER);
    	Thread.sleep(1000); B.veiwIcon_PropertyNo_AutomationBooked();
    	Thread.sleep(1000); B.Box_Automation_1BHK_PropertyNo1();
    	Thread.sleep(1000); B.Box_ProertyDetails();
    	Thread.sleep(1000); B.deactivePropertyIcon();	
    	Thread.sleep(1000); B.remark_releaseProperty();
     }
    @Test (priority=2, enabled=true)
    void bookingPropertyThroughCustomer() throws InterruptedException
    {
   	 	test = report.createTest("Booking Property Through Customer").assignCategory("Booking").assignAuthor("Pratik").assignDevice("Window");
       	randomData_devEnv.Booking B = new randomData_devEnv.Booking(driver);
       	
   		Thread.sleep(2000); driver.navigate().refresh();
       	Thread.sleep(2000);B.customerIcon();
       	Thread.sleep(1000); B.addCustomerButton();
       	Thread.sleep(1000); B.primaryContactInformation_bookingPropertyThroughCustomer();
       	Thread.sleep(1000); B.secondaryContactInformation_bookingPropertyThroughCustomer();
       	Thread.sleep(1000); B.PropertyDetails();
       	Thread.sleep(1000); B.nowBooking();
       	Thread.sleep(1000); B.book_AutomationProjectTwo_propertyNo_1BHK_2();	 
       	Thread.sleep(2000); B.FillLeadClosureForm_PaymentTypeIsInstallatione(); 
       	Thread.sleep(2000); B.submitButton_LeadClosure();  
    }
    @Test (priority=3, enabled=true)
    void releaseBookedPropertyThroughCustomer () throws InterruptedException
    {
   	test = report.createTest("Release Booked Property Through Customer").assignCategory("Booking").assignAuthor("Pratik").assignDevice("Window");
   	randomData_devEnv.Booking B = new randomData_devEnv.Booking(driver);
  
   	Thread.sleep(2000); driver.navigate().refresh();
   	Thread.sleep(2000);B.customerIcon();	
   	Thread.sleep(1000); B.searchTab_Customer();
   	Thread.sleep(1000); B.veiwIcon_PropertyNo_AutomationBooked();
   	Thread.sleep(1000); B.Box_Automation_1BHK_PropertyNo1();
   	Thread.sleep(1000); B.Box_ProertyDetails();
   	Thread.sleep(1000); B.deactivePropertyIcon();	
   	Thread.sleep(1000); B.remark_releaseProperty();
    }
}
