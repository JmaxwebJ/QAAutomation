package dom.shadowdom.pseudo.elements.headless.execution;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.objectrepository.GlobalOR;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleDOM {
	
	public static WebDriver driver;

	@Test
	public void setup() {
		WebDriverManager.chromedriver().setup();

		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		driver = new ChromeDriver(cr);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/");
		driver.findElement(GlobalOR.ELEMENTS).click();
		driver.findElement(GlobalOR.ELEMENTS_TEXTBOX_OPTION).click();

		// Passing value from list
		ArrayList<String> testData = new ArrayList<>();
		testData.add(0, "Nitin Singh");
		testData.add(1, "Nitin@gmail.com");
		testData.add(2, "Homeland Apt Mohali");
		testData.add(3, "Dehradun");
		driver.findElement(GlobalOR.ELEMENTS_TEXTBOX_FULL_NAME).sendKeys(testData.get(0));
		driver.findElement(GlobalOR.ELEMENTS_TEXTBOX_EMAIL).sendKeys(testData.get(1));
		driver.findElement(GlobalOR.ELEMENTS_TEXTBOX_CURRENT_ADDRESS).sendKeys(testData.get(2));
		driver.findElement(GlobalOR.ELEMENTS_TEXTBOX_PARMANANT_ADDRESS).sendKeys(testData.get(0));
		driver.findElement(GlobalOR.ELEMENTS_TEXTBOX_SUBMIT).click();
		driver.quit();
	}

}
