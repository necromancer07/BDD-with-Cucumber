package stepDefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driver;
	Properties prop=new Properties();

	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	}

	@When("^User navigate to SignIn Page$")
	public void User_navigate_to_SignIn_Page() throws Throwable {
	    driver.findElement(By.xpath(prop.getProperty("SignIn"))).click();
	    
	}

	@When("^User enters email address \"([^\"]*)\"$")
	public void User_enters_email_address(String arg1) throws Throwable {
	    driver.findElement(By.xpath(prop.getProperty("emailBox"))).sendKeys(arg1);
	    
	}

	@When("^User clicks on create account button$")
	public void User_clicks_on_create_account_button() throws Throwable {
	    driver.findElement(By.xpath(prop.getProperty("createAccountBtn"))).click();
	    
	}

	@Then("^The User should be able to view account creation page$")
	public void User_should_be_able_to_view_account_creation_page() throws Throwable {
	    String actualString = driver.findElement(By.xpath("successRegisterMsg")).getText();
	    assertTrue(actualString.contains("Create an Account"));
	   
	    
	}

	@When("^User enters invalid Email address \"([^\"]*)\"$")
	public void User_enters_invalid_Email_address(String arg2) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("emailBox"))).sendKeys(arg2);
	    
	}

	@Then("^User should be able to see invalid email address message$")
	public void User_should_be_able_to_see_invalid_email_address_message() throws Throwable {
	    if(driver.findElement(By.xpath(prop.getProperty("unsuccessRegMsg"))).isDisplayed())
	    {
	    	System.out.println("Error is displayed correctly");
	    }
	    else
	    	System.out.println("Error not displayed");
	    
	}
	
	@When("^User clicks on Gender Title$")
	public void Click_on_Gender() throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("GenderTitle_btn"))).click();
	}
	
	@When("^User enters \"([^\"]*)\" in Personal Account First Name$")
	public void enter_personal_firstName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Personal_Fname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in Personal Account Last name$")
	public void enter_personal_LastName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Personal_Lname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enter \"([^\"]*)\" in Email Field")
	public void enter_email(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Email_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in password field$")
	public void enter_password(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Password_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in First Name$")
	public void enter_firstName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Fname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in Last name$")
	public void enter_lastName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Lname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in Address Field$")
	public void enter_Address(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("Address_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in City Field$")
	public void enter_city(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("City_txtBox"))).sendKeys(arg);
	}
	
	@When("^User selects appropriate State$")
	public void select_state() throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("State_dropDown"))).click();
	}
	
	@When("^User enters \"([^\"]*)\" in Zip Code Field$")
	public void enter_zipCode(int zipCode) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("ZipCode_txtBox"))).sendKeys(""+zipCode);
	}
	
	@When("^User enters Phone Number \"([^\"]*)\"$")
	public void enter_phoneNumber(int Phnumber) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("mobile_txtBox"))).sendKeys(""+Phnumber);
	}
	
	@When("^User assign an address alias as \"([^\"]*)\"$")
	public void assign_alias(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("alias_txtBox"))).sendKeys(arg);
	}
	
	
	@Then("^User Clicks on Register Button$")
	public void click_registerBtn() throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("RegisterBtn"))).click();
	}
	
	@When("^User Hovers over the dresses button and select summer dress$")
	public void hover_summerDress() throws Throwable {
		Actions action = new Actions(driver);
		WebElement mainBtn = driver.findElement(By.xpath(prop.getProperty("dressMegaBtn")));
		action.moveToElement(mainBtn).moveToElement(driver.findElement(By.xpath(prop.getProperty("SummerDressBtn")))).click().build().perform();
	}
	
	@Then("^User should be navigated to summer dress section$")
	public void navigate_to_summerDress() throws Throwable {
		if(driver.findElement(By.xpath(prop.getProperty("SummerDressTxt"))).isDisplayed())
		{
			System.out.println("navigation successfull");
		}
		else
			System.out.println("navigation unsuccessfull");
	}
	
	@When("^User clicks on sort button$")
	public void click_on_sortBtn() throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("sortBtn"))).click();
	}
	
	@Then("^Dresses should be arranged in the grid accordingly$")
	public void dress_arrange() throws Throwable {
		
	}
	
	
	
	
	
}
