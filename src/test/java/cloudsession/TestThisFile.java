package cloudsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestThisFile {
	@Test
	public void runThisOnJenkins() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		System.out.println("This is the page " + driver.getCurrentUrl());
		driver.quit();
	}

}
