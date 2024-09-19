//package com.elements;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.testng.annotations.Test;
//
//import com.objectrepository.GlobalOR;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class CheckBox {
//
//	public static WebDriver driver;
//
//	@Test(priority = 0)
//	public void setup() {
//		WebDriverManager.chromedriver().setup();
//
//		ChromeOptions cr = new ChromeOptions();
//		cr.addArguments("--remote-allow-origins=*");
//		cr.addArguments("--force-device-scale-factor=0.5");
//		driver = new ChromeDriver(cr);
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://demoqa.com/");
//		driver.findElement(GlobalOR.ELEMENTS).click();
//		driver.findElement(GlobalOR.ELEMENTS_CHECKBOX_OPTION).click();
//
//	}
//
//	@Test(priority = 1)
//	public void expandHome() {
//
//		driver.findElement(GlobalOR.HOME_CHECKBOX_EXPAND).click();
//
//	}
//
//	@Test(priority = 2)
//	public void desktopSelect() {
//		driver.findElement(GlobalOR.DESKTOP_EXPAND).click();
//		driver.findElement(GlobalOR.DESKTOP_CHECKBOX).click();
//
//	}
//
//	@Test(priority = 3)
//	public void DocumentSelect() {
//		driver.findElement(GlobalOR.DOCUMENT_EXPAND).click();
//		driver.findElement(GlobalOR.DOCUMENT_CHECKBOX).click();
//
//	}
//
//	@Test(priority = 4)
//	public void DownloadSelect() {
//		driver.findElement(GlobalOR.DOWNLOAD_EXPAND).click();
//		driver.findElement(GlobalOR.DOWNLOAD_CHECKBOX).click();
//
//	}
//}
