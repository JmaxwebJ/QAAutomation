package parallel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {
	
	//public static WebDriver driver;
	public static ThreadLocal<WebDriver> threadLocalDriver= new ThreadLocal<>();

	@Before 
	public void setup() {
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		cr.addArguments("--force-device-scale-factor=0.5");
		WebDriverManager.chromedriver().setup();
		threadLocalDriver.set(new ChromeDriver(cr));
//		threadLocalDriver = new ChromeDriver(cr);
		// Above line we used to setup the conenction between selenium and installed browser automatically
		
		//driver = new ChromeDriver(cr);
		threadLocalDriver.get().manage().window().maximize();
		threadLocalDriver.get().manage().deleteAllCookies();
	}

	@After
	public void tearDown(Scenario scenario) {
//		try {
//			
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			if (scenario.isFailed()) {
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
//				scenario.attach(screenshot, "image/png", screenshotName);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		if (	threadLocalDriver != null)
			threadLocalDriver.get().quit();

	}

}
