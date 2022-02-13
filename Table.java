package week4.day1.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/table.html");
		WebElement ToyTable = driver.findElement(By.id("table_id"));
		List<WebElement> Rows = ToyTable.findElements(By.tagName("tr"));
		System.out.println("Number of rows: " + Rows.size());
		WebElement firstRow = Rows.get(1);
		int TotalColumn = firstRow.findElements(By.tagName("td")).size();
		System.out.println("Number of Columns: " + TotalColumn);
		for (int i = 0; i < Rows.size(); i++) {
			WebElement currentRow = Rows.get(i);
			List<WebElement> listColumns = currentRow.findElements(By.tagName("td"));
			for (int j = 0; j < listColumns.size(); j++) {
				if (listColumns.get(j).getText().contains("Learn to interact with Elements")) {
					System.out.println(listColumns.get(1).getText());
					break;
				}

			}
		}

	}

}
