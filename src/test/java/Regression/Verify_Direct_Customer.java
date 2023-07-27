package Regression;

import org.testng.annotations.Test;

public class Verify_Direct_Customer extends Regression.BaseClass {
	
	@Test
	void create_Customer_with_payment_type_is_one_time() throws InterruptedException
	{	for(int i=0;i<5;i++){
		Regression.Direct_Customer dc = new Regression.Direct_Customer(driver);
	
		dc.customer_Icon();
		dc.add_Customer_Button();
		dc.create_customer_Fill_Mandatory_Field();
		dc.check_sale_generated_or_not();
		dc.check_folloe_Up_Payment();
		dc.check_collection_detail();
		dc.check_receiving_Detail();
		}
	}
	
	

}
