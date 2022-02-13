package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Disappear {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/disapper.html");
		WebDriverWait ExWait = new WebDriverWait(driver,Duration.ofSeconds(10));
		ExWait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("btn")));
		String txtdsp = driver.findElement(By.tagName("strong")).getText();
		System.out.println(txtdsp);
		
	}
}