package dom.shadowdom.pseudo.elements.headless.execution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoSolution {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://play1.automationcamp.ir/advanced.html");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String text = js.executeScript(
				"return window.getComputedStyle(document.querySelector('.star-rating'),'::after').getPropertyValue('content')")
				.toString();
		String textTobeTyped = text.replaceAll("\"", "");
		driver.findElement(By.id("txt_rating")).sendKeys(textTobeTyped);
		driver.findElement(By.id("check_rating")).click();
		Thread.sleep(50000);
		driver.quit();
	}
}

