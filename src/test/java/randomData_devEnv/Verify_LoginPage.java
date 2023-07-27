package randomData_devEnv;

import org.testng.annotations.Test;

public class Verify_LoginPage extends randomData_devEnv.BaseClass
{

		
	
	@Test (groups={"Role permissions"})
	void loginPage() throws InterruptedException
	{
		test = report.createTest("loginPage").assignAuthor("Pratik").assignCategory("Verify loginPage").assignDevice("Window");
		randomData_devEnv.LoginPage L = new randomData_devEnv.LoginPage(driver);
		
	
		
	
	    L.username();
		L.password();
		L.loginbutton();	
	}

	


}
