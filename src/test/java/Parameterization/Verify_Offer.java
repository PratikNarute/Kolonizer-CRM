package Parameterization;

import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Offer extends Parameterization.BaseClass
{
	@Test 
	void create_offer() throws EncryptedDocumentException, IOException, InterruptedException, ParseException
	{
		Parameterization.Properties_Offers offer = new Parameterization.Properties_Offers(driver);
		test = report.createTest("Verify that whether 'Offer' create or not").assignCategory("Master");
		offer.CreateOffters();
	}

}
