package utility;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait
{
	public static void explicitWait(WebElement element, int duration, WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(duration));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	

}
