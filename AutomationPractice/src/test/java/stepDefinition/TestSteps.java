package stepDefinition;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driver;
	Properties prop=new Properties();

	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		//driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
	    
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

	@Then("^User should be able to view account creation page$")
	public void User_should_be_able_to_view_account_creation_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
	}

	@When("^User enters invalid Email address \"([^\"]*)\"$")
	public void User_enters_invalid_Email_address(String arg2) throws Throwable {
		driver.findElement(By.xpath(prop.getProperty("emailBox"))).sendKeys(arg2);
	    
	}

	@Then("^User should be able to see invalid email address message$")
	public void User_should_be_able_to_see_invalid_email_address_message() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    
	}


}
