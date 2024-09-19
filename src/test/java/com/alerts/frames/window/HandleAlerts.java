package com.alerts.frames.window;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HandleAlerts {
	
	public static final By SIMPLE_ALERT = By.id("alertButton");
	public static final By TIMER_ALERT = By.id("timerAlertButton");
	public static final By CONFIRM_ALERT = By.id("confirmButton");
	public static final By PROMPT_ALERT = By.id("promtButton");

	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	final static Logger logger = LogManager.getLogger(HandleAlerts.class);

	public static void simpleAlert(WebDriver driver) {
		try {
			
			
			
			driver.findElement(SIMPLE_ALERT).click();
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			logger.info("simpleAlert is not present" + e);
		}
		logger.info("simpleAlert is present on the page");
	}


	

	public static void timerAlertButton(WebDriver driver) throws InterruptedException {

		try {
			driver.findElement(CONFIRM_ALERT).click();
			Thread.sleep(6000);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}

	}

	public static void confirmAlertButton(WebDriver driver) throws InterruptedException {
		try {
			driver.findElement(CONFIRM_ALERT).click();
			driver.switchTo().alert().dismiss();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		}

	}

	public static void promptAlertButton(WebDriver driver, String str) throws InterruptedException {
		try {
			driver.findElement(PROMPT_ALERT).click();
			driver.switchTo().alert().sendKeys(str);
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {
			// TODO: handle exception
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

//		String matchText = driver.findElement(By.id("promptResult")).getText();
//		if (matchText.contains(text)) {
//			System.out.println("Test pass");
//
//		} else {
//			System.out.println("Test fail");
//		}
		
	}

}
