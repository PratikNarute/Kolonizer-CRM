package practice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Practice 
{
	WebDriver driver;
	@Test
	void unitMeasuement()
	{
//		System.out.println("ft to mm: "+utility.Unit_Conversion.convertUnits("ft", "mm", 1.0));
//		System.out.println("m to mm: "+utility.Unit_Conversion.convertUnits("m", "mm", 1.0));
//		System.out.println("cm to mm: "+utility.Unit_Conversion.convertUnits("cm", "mm", 1.0));
//		System.out.println("inch to mm: "+utility.Unit_Conversion.convertUnits("inch", "mm", 1.0));
//		System.out.println("km to mm: "+utility.Unit_Conversion.convertUnits("km", "mm", 1.0));
//		System.out.println("mile to mm: "+utility.Unit_Conversion.convertUnits("mile", "mm", 1.0));
//		System.out.println("yard to mm: "+utility.Unit_Conversion.convertUnits("yard", "mm", 1.0));
		
		System.out.println("m to ft: "+utility.Unit_Conversion.convertUnits("mile", "ft", 1.0));
		
	}

}
