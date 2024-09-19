package com.practice.form.methods;

import java.awt.AWTException;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.objectrepository.PracticeFormOR;

public class PracticeFormMethods {

	public static String filePath = "TestData/userimage.jpg";

	final static Logger logger = LogManager.getLogger(PracticeFormMethods.class);

	public static void launchBrowser(ThreadLocal<WebDriver> threadLocalDriver, String url) throws InterruptedException {
		try {
			threadLocalDriver.get().get(url);

			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (TimeoutException e) {
			logger.info("URL is taking time to load", e);

		}

		logger.info("Browser is launched successfully");
	}

	public static void enterFnameLnameEmail1(ThreadLocal<WebDriver> threadLocalDriver, String fname, String lname, String email)
			throws Throwable {
		try {
			
			threadLocalDriver.get().findElement(PracticeFormOR.FIRST_NAME).sendKeys(fname);
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			threadLocalDriver.get().findElement(PracticeFormOR.LAST_NAME).sendKeys(lname);
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			threadLocalDriver.get().findElement(PracticeFormOR.EMAIL).sendKeys(email);
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		} catch (NoSuchWindowException e) {
			logger.info("Not able to locate first name , last name and email Text box", e);
		} catch (TimeoutException e) {
			logger.info("TimeoutException in first name , last name and email Text box", e);
		}
		logger.info("Values are enetered into first name , last name and email Text box");

	}

	public static void enteraddress1(ThreadLocal<WebDriver> threadLocalDriver, String address) throws InterruptedException, AWTException {
		try {
			threadLocalDriver.get().findElement(PracticeFormOR.CURRENT_ADDRESS).sendKeys(address);

		} catch (NoSuchElementException e) {
			logger.info("Unable to locate CURRENTADDRESS on registration form", e);
		} catch (TimeoutException e) {

			logger.info("TimeoutException in CURRENTADDRESS on registration form", e);
		}
		logger.info("enteraddress is executed successfully on Student form");
	}

	public static void enterPhone(ThreadLocal<WebDriver> threadLocalDriver, String Phonenumber) throws InterruptedException {
		try {
			threadLocalDriver.get().findElement(PracticeFormOR.PHONE).sendKeys(Phonenumber);

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
		logger.info("enterPhone is executed successfully on Student form");
	}

	public static void selectGender1(ThreadLocal<WebDriver> threadLocalDriver) throws AWTException {
		try {

			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (TimeoutException e) {
			logger.info("URL is taking time to load", e);

		}

		logger.info("Browser is launched successfully");
	}

	public static void enterFnameLnameEmail(ThreadLocal<WebDriver> threadLocalDriver, String fname, String lname, String email)
			throws Throwable {
		try {
//threadLocalDriver.get().findElement(RegisterOR.SIGNUP_FIRSTNAME).sendKeys("Supriya");
			threadLocalDriver.get().findElement(PracticeFormOR.FIRST_NAME).sendKeys(fname);
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			threadLocalDriver.get().findElement(PracticeFormOR.LAST_NAME).sendKeys(lname);
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			threadLocalDriver.get().findElement(PracticeFormOR.EMAIL).sendKeys(email);
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		} catch (NoSuchElementException e) {
			logger.info("Not able to locate first name , last name and email Text box", e);
		} catch (TimeoutException e) {

			logger.info("TimeoutException in first name , last name and email Text box", e);
		}

		logger.info("Values are enetered into first name , last name and email Text box");

	}

	public static void enteraddress(ThreadLocal<WebDriver> threadLocalDriver, String address) throws InterruptedException, AWTException {
		try {
			threadLocalDriver.get().findElement(PracticeFormOR.CURRENT_ADDRESS).sendKeys(address);

		} catch (NoSuchElementException e) {
			logger.info("Unable to locate CURRENTADDRESS on registration form", e);
		} catch (TimeoutException e) {

			logger.info("TimeoutException in CURRENTADDRESS on registration form", e);
		}
		logger.info("enteraddress is executed successfully on Student form");
	}

	public static void enterPhone1(ThreadLocal<WebDriver> threadLocalDriver, String Phonenumber) throws InterruptedException {
		try {
			threadLocalDriver.get().findElement(PracticeFormOR.PHONE).sendKeys(Phonenumber);

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
		logger.info("enterPhone is executed successfully on Student form");
	}

	public static void selectGender(ThreadLocal<WebDriver> threadLocalDriver) throws AWTException {
		try {

			WebElement gender = threadLocalDriver.get().findElement(PracticeFormOR.GENDER_FEMALE);
			WebDriver driver = threadLocalDriver.get();
			Actions actions = new Actions(driver);
			//Actions actions = new Actions(threadLocalDriver);
			actions.moveToElement(gender).click().build().perform();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void confirmRegister(ThreadLocal<WebDriver> threadLocalDriver) throws InterruptedException {
		try {
			WebElement element = threadLocalDriver.get().findElement(PracticeFormOR.CONFIRMATION_POPUP);
			WebDriver driver = threadLocalDriver.get();
			Actions actions = new Actions( driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();
		} catch (NoSuchElementException e) {
			// TODO: handle exception
		}

	}

	public static void enterSubject(ThreadLocal<WebDriver> threadLocalDriver, String sub) throws InterruptedException, AWTException {
		try {
			WebDriver driver = threadLocalDriver.get();
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			WebDriverWait wait = new WebDriverWait( driver, Duration.ofSeconds(10));

			// Inside DOM
			WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(PracticeFormOR.AUTOSUGGESTION));

			ele.sendKeys(sub);
			Thread.sleep(1000); // out of selenium

			threadLocalDriver.get().findElement(PracticeFormOR.AUTOSUGGESTION_OPTIONS).click();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void selectHobbies(ThreadLocal<WebDriver> threadLocalDriver, String hob) {
		try {
			System.out.println(hob);
//			JavascriptExecutor jse = (JavascriptExecutor) driver;
//			jse.executeScript("window.scrollBy(0,250)");

			// If you dont use the scroldown code , it is opening the google ad
			WebElement element = threadLocalDriver.get().findElement(PracticeFormOR.HOBBIES);
			WebDriver driver = threadLocalDriver.get();
			Actions actions = new Actions( driver);
			actions.moveToElement(element).click().build().perform();
			threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}

	public static void selectDate(ThreadLocal<WebDriver> threadLocalDriver) {
		try {
			WebElement element = threadLocalDriver.get().findElement(PracticeFormOR.DATEPICKER);
			WebDriver driver = threadLocalDriver.get();
			Actions actions = new Actions( driver);
			actions.moveToElement(element).click().build().perform();

			Select month = new Select(threadLocalDriver.get().findElement(PracticeFormOR.DATE_MONTH));
			month.selectByIndex(0);

			Select year = new Select(threadLocalDriver.get().findElement(PracticeFormOR.DATE_YEAR));
			year.selectByValue("2023");

			List<WebElement> day = threadLocalDriver.get().findElements(PracticeFormOR.DATE);

			for (WebElement myday : day) {
				System.out.println(myday);
				myday.click();
				break;
			}

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void uploadImage(ThreadLocal<WebDriver> threadLocalDriver) throws InterruptedException {
		try {
			WebElement UploadImg = threadLocalDriver.get().findElement(PracticeFormOR.UPLOAD_IMAGE);
			Thread.sleep(3000);
			UploadImg.sendKeys(new java.io.File(filePath).getAbsolutePath());

			Thread.sleep(3000);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (NoSuchWindowException e) {
			e.printStackTrace();

		}
	}

	public static void selectState(ThreadLocal<WebDriver> threadLocalDriver, String state) {
		try {

			WebElement element = threadLocalDriver.get().findElement(PracticeFormOR.STATE);
			WebDriver driver = threadLocalDriver.get();
			Actions actions = new Actions( driver);
			actions.moveToElement(element).click().build().perform();

			WebElement se = threadLocalDriver.get().findElement(PracticeFormOR.STATE_VALUE);
			se.click();
			System.out.println("Entered state as " + state);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void selectcity(ThreadLocal<WebDriver> threadLocalDriver, String city) {
		try {
			threadLocalDriver.get().findElement(PracticeFormOR.CITY).click();
			WebElement se = threadLocalDriver.get().findElement(PracticeFormOR.CITY_VALUE);
			se.click();
			System.out.println("Entered city as" + city);
		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate element" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

	public static void Submit(ThreadLocal<WebDriver> threadLocalDriver) throws InterruptedException {
		try {
			WebElement element = threadLocalDriver.get().findElement(PracticeFormOR.SUBMIT);
			WebDriver driver = threadLocalDriver.get();
			Actions actions = new Actions( driver);
			Thread.sleep(1000);
			actions.moveToElement(element).click().build().perform();

		} catch (NoSuchElementException e) {
			System.out.println("Unable to locate Submit button on the Practice form" + e);
		} catch (TimeoutException e) {
			e.printStackTrace();

		}
	}

}
