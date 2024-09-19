package com.selenium.practice.website;

import java.nio.file.NoSuchFileException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebForm {
	public static String filePath = "TestData/userimage.jpg";
	public static WebDriver driver;

	// Page Objects

	public static final By TEXT_INPUT = By.id("my-text-id");
	public static final By PASSWORD = By.name("my-password");
	public static final By TEXT_AREA = By.name("my-textarea");
	public static final By DISABLED = By.name("my-disabled");
	public static final By READ_ONLY = By.name("my-readonly");
	public static final By SELECT_DROPDOWN = By.name("my-select");
	public static final By SEARCH_DROPDOWN = By.name("my-datalist");
	public static final By UPLOAD_FILE = By.name("my-file");
	public static final By CHEKCED = By.id("my-check-1");
	public static final By DEFAULT_CHEKCED = By.id("my-check-2");
	public static final By CHEKCED_RADIO = By.id("my-radio-1");
	public static final By DEFAULT_RADIO = By.id("my-radio-1");
	public static final By COLOR_PICKER = By.name("my-colors");
	public static final By DATE_PICKER = By.name("my-date");
	public static final By SLIDER = By.name("my-range");
	public static final By SUBMIT = By.className("btn");

	@BeforeTest
	public void setup() {
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public void enterData() {
		try {
			driver.findElement(TEXT_INPUT).sendKeys("Nitin");
			driver.findElement(PASSWORD).sendKeys("Singh@123");
			driver.findElement(TEXT_AREA).sendKeys("Singh");
		} catch (NoSuchElementException e) {

		}

	}

	@Test
	public void handleDisabled() {
		try {

			boolean disabled = driver.findElement(DISABLED).isEnabled();
			if (disabled == true) {
				System.out.println("Field is disabled");
			}

		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void handleReadOnly() {
		try {
			String value = driver.findElement(READ_ONLY).getAttribute("readonly");

			System.out.println("Value of readonly" + value);
		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void selectDropdown() {

		WebElement dropdown = driver.findElement(SELECT_DROPDOWN);
		Select se = new Select(dropdown);
		se.selectByValue("1");

	}

	@Test
	public void inputDropdown() {
		try {
			driver.findElement(SEARCH_DROPDOWN).sendKeys("New York" + Keys.ENTER);
		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void checkedBox() {
		try {
			boolean checked = driver.findElement(CHEKCED).isSelected();
			if (checked == true) {
				System.out.println("CheckBox is checked");
			}
		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void defaultCheckBox() {
		try {
			boolean defaultchecked = driver.findElement(DEFAULT_CHEKCED).isSelected();
			if (defaultchecked == false) {
				System.out.println("default checked is not checked");
			}
		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void checkedRadio() {
		boolean checkedRadio = driver.findElement(CHEKCED_RADIO).isSelected();
		if (checkedRadio == true) {
			System.out.println("CHEKCED_RADIO is checked");
		}
	}

	@Test
	public void defaultRadio() {
		try {
			boolean defaultRadio = driver.findElement(DEFAULT_RADIO).isSelected();
			if (defaultRadio == false) {
				System.out.println("defaultRadio is checked");
			}

		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void uploadFile() throws NoSuchFileException, InterruptedException {
		WebElement UploadImg = driver.findElement(UPLOAD_FILE);
		Thread.sleep(2000);
		UploadImg.sendKeys(new java.io.File(filePath).getAbsolutePath());
	}

	@Test
	public void colorPicker() {
		try {
			driver.findElement(COLOR_PICKER).click();
			driver.findElement(COLOR_PICKER).sendKeys("#563d7c");
		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void datePicker() {
		try {
			driver.findElement(DATE_PICKER).click();
			driver.findElement(DATE_PICKER).sendKeys("02/05/2024");

		} catch (NoSuchElementException e) {

		}
	}

	@Test
	public void slider() {
		try {

			WebElement slider = driver.findElement(SLIDER);
			slider.sendKeys(Keys.ARROW_RIGHT);

		} catch (NoSuchElementException e) {

		}
	}

	@AfterTest
	public void submitForm() {
		try {
			driver.findElement(SUBMIT).click();
		} catch (NoSuchElementException e) {

		}
	}

}
