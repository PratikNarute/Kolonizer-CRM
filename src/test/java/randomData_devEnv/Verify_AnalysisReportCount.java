package randomData_devEnv;

import org.testng.annotations.Test;

public class Verify_AnalysisReportCount extends BaseClass
{
	@Test (priority=1,enabled=true )
	void Count_of_lead_in_case_of_analysis_report_on_dashboard () throws InterruptedException
	{
		test = report.createTest("Create Lead With Category is Hot").assignAuthor("Pratik").assignCategory("Lead").assignDevice("Window");
		randomData_devEnv.AnalysisReportCount an = new randomData_devEnv.AnalysisReportCount(driver);
		
		Thread.sleep(1000);
		an.refreash_Button();
		Thread.sleep(1000);
		an.analysisReport_Text();
	
		
	}

}
