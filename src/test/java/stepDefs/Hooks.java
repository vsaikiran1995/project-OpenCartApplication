package stepDefs;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks {
	public static WebDriver driver;
	
	@Before
	public void DriverInit() {
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("116");
	    driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	}
	
	@After
	public void TearDown() {
		driver.quit();
	}

}
