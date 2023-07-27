package randomData_devEnv;

import org.testng.annotations.Test;

public class Verify_Properties_ProjectBlocks extends BaseClass
{
			@Test
			void addProjectBlocks() throws InterruptedException
			{
				test = report.createTest("add Project Blocks").assignCategory("Properties").assignAuthor("Pratik").assignDevice("Window");
		    	randomData_devEnv.Properties_ProjectBlocks p = new randomData_devEnv.Properties_ProjectBlocks(driver);
		       	
		    	Thread.sleep(2000); driver.navigate().refresh();
		    	Thread.sleep(1000); p.propertiesIcon();
		    	Thread.sleep(1000); p.icon_projectBlock();
		    	p.Button_addProjectBlock();
		    	Thread.sleep(1000); p.addProjectBlock_AutomationProject1_Zone1();
				p.addSubmitButton();
				
				Thread.sleep(2000);driver.navigate().refresh();
				Thread.sleep(1000); p.propertiesIcon();
			   	Thread.sleep(1000); p.icon_projectBlock();
		    	p.Button_addProjectBlock();
		     	Thread.sleep(1000); p.addProjectBlock_AutomationProject1_Zone2();
				p.addSubmitButton();
				
				Thread.sleep(2000); driver.navigate().refresh();
		    	Thread.sleep(1000); p.propertiesIcon();
		    	Thread.sleep(1000); p.icon_projectBlock();
		    	p.Button_addProjectBlock();
		     	Thread.sleep(1000); p.addProjectBlock_AutomationProject2_Zone1();
				p.addSubmitButton();
				
				Thread.sleep(2000);driver.navigate().refresh();
				Thread.sleep(1000); p.propertiesIcon();
			   	Thread.sleep(1000); p.icon_projectBlock();
		    	p.Button_addProjectBlock();
		     	Thread.sleep(1000); p.addProjectBlock_AutomationProject2_Zone2();
				p.addSubmitButton();
			}

			@Test (priority=2, enabled=false)
			void editPropertyArea() throws InterruptedException
			{
				test = report.createTest("edit Properties area").assignAuthor("Pratik").assignCategory("Properties").assignDevice("Window");
				randomData_devEnv.Properties_ProjectBlocks p = new randomData_devEnv.Properties_ProjectBlocks(driver);
			
				Thread.sleep(2000);driver.navigate().refresh();
				Thread.sleep(2000); p.propertiesIcon(); 	
				Thread.sleep(1000); p.icon_projectBlock();		
			    Thread.sleep(1000); p.editButton_AutomationProject1_zone1();
				Thread.sleep(1000); p.edit_AutomationProject1_zone1();
			}
			

}
