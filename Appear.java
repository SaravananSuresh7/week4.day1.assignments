package week4.day1.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Appear {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/appear.html");
		WebDriverWait ExWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		ExWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
		String ButtonAppeared = driver.findElement(By.id("btn")).getText();
		System.out.println(ButtonAppeared);
	}

}
