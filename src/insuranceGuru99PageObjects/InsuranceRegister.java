package insuranceGuru99PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsuranceRegister {

	//Webdriver + Locators
	private WebDriver driver;
	By titleLocator = By.id("user_title");
	By firstNameLocator = By.name("firstname");
	By lastNameLocator = By.name("lastname");
	By phoneLocator = By.name("phone");
	By yearDOBLocator = By.id("user_dateofbirth_1i");
	By monthDOBLocator = By.id("user_dateofbirth_2i");
	By dayDOBLocator = By.id("user_dateofbirth_3i");
	By inputFullLocator = By.id("licencetype_t");
	By inputProvisionalLocator = By.id("licencetype_f");
	By occupationLocator = By.id("user_occupation_id");
	By streetLocator = By.name("street");
	By cityLocator = By.name("city");
	By countyLocator = By.name("county");
	By postcodeLocator = By.name("post_code");
	By passwordLocator = By.name("password");
	By confPasswordLocator = By.name("c_password");
	
	By createButtonLocator = By.name("submit");
	
	//Constructor
	public InsuranceRegister(WebDriver driver)
	{
		this.driver = driver;		
	}
	
	//Get, set, click	
	public void setFirstName(String firstName)
	{
		driver.findElement(firstNameLocator).clear();
		driver.findElement(firstNameLocator).sendKeys(firstName);
	}
	
	public void setLastName(String lastName)
	{
		driver.findElement(lastNameLocator).clear();
		driver.findElement(lastNameLocator).sendKeys(lastName);
	}
	
	public void setLicenceType(String licType)
	{
		if(licType == "P") { driver.findElement(inputProvisionalLocator).click(); }
		else { driver.findElement(inputFullLocator).click(); }
	}	
	
	public void setYear(String year)
	{
		WebElement mySelectElement = driver.findElement(yearDOBLocator);
		Select dropdown = new Select(mySelectElement);
		dropdown.selectByVisibleText(year);
	}
		
	public void clickRegisterButton()
	{
		driver.findElement(createButtonLocator).click();
	}
	
	
	
	//Methods
	public void register(String firstName, String lastName, String licType, String year)
	{
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setLicenceType(licType);
		this.setYear(year);
		
		//this.clickRegisterButton();
	}
	
}
