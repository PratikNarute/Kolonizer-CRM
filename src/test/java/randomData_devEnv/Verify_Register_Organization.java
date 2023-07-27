package randomData_devEnv;
import org.testng.annotations.Test;

import randomData_devEnv.BaseClass;

public class Verify_Register_Organization extends BaseClass
{
	@Test (priority=0, enabled=true)
	public void loginWithSuperAdmin()
	{
		test = report.createTest("To check that add organisation or not").assignAuthor("Pratik").assignCategory("Verify loginPage").assignDevice("Window");
		randomData_devEnv.LoginPage L = new randomData_devEnv.LoginPage(driver);
	}

}
