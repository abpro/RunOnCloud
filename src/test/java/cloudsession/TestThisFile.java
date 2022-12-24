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
		System.out.println("Started the test On Jenkins --- BY ANKUR");
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		String title = driver.getTitle();
		System.out.println("This is the page " + driver.getCurrentUrl() + "\n");
		System.out.println("Title is " + title);
	
		driver.quit();
	}

}
