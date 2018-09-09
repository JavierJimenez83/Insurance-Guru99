package insuranceGuru99Tests;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import insuranceGuru99PageObjects.InsuranceRegister;

public class InsuranceRegisterTests {

	WebDriver driver;
	private InsuranceRegister registerPageObject;
	
	
	@Before
	public void setUp() throws Exception {
		this.driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.get("http://demo.guru99.com/insurance/v1/register.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void successRegister() {
		registerPageObject = new InsuranceRegister(driver);
		registerPageObject.register("test1", "test2", "F", "1980");
	}

}
