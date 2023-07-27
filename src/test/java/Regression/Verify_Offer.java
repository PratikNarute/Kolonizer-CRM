package Regression;

import java.io.IOException;
import java.text.ParseException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class Verify_Offer extends Regression.BaseClass
{
//	@Test 
//	void create_offer() throws EncryptedDocumentException, IOException, InterruptedException, ParseException
//	{
//		Regression.Properties_Offers offer = new Regression.Properties_Offers(driver);
//		test = report.createTest("Verify that whether 'Offer' create or not").assignCategory("Properties");
//		offer.CreateOffters();
//	}
	@Test 
	void edit_offer_OfferTypIsAreaWise() throws EncryptedDocumentException, IOException, InterruptedException, ParseException
	{
		Regression.Properties_Offers offer = new Regression.Properties_Offers(driver);
		test = report.createTest("Verify that whether 'Offer' edit or not (Offer type is Area wise)").assignCategory("Properties");
		offer.editOffters("Area Wise");
	}

}
