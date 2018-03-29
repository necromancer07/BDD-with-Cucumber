package cucumberTest;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import MavenProject.AutomationPractice.PropertyReader;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	public static WebDriver driver;
	PropertyReader prop=new PropertyReader();
	@Before
	public void openBrowser()
	{
		String browser = System.getProperty("BROWSER");
		if(browser==null)
		{
			browser = System.getenv("BROWSER");
			if(browser==null)
            {
                browser= "chrome";
            }
        }
        switch (browser)
        {
            case "chrome":
            	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
            	System.setProperty("webdriver.gecko.driver", "D:\\firefoxDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
                default:
                	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();	
		}
        System.out.println("Opening Browser...."+browser);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	
	}
	@Given("^User is on Home Page$")
	public void User_is_on_Home_Page() throws Throwable {
		if(driver.findElement(By.xpath(prop.readProperty("dressMegaBtn"))).isDisplayed())
		{
			System.out.println("Entered Homepage");
		}
		else
			System.out.println("Fialure");
		
	}

	@When("^User navigate to SignIn Page$")
	public void User_navigate_to_SignIn_Page() throws Throwable {
	    driver.findElement(By.xpath(prop.readProperty("SignIn"))).click();
	    
	}

	@When("^User enters email address \"([^\"]*)\"$")
	public void User_enters_email_address(String arg1) throws Throwable {
	    driver.findElement(By.xpath(prop.readProperty("emailBox"))).sendKeys(arg1);
	    
	}

	@When("^User clicks on create account button$")
	public void User_clicks_on_create_account_button() throws Throwable {
	    driver.findElement(By.xpath(prop.readProperty("createAccountBtn"))).click();
	    
	}

	@Then("^The User should be able to view account creation page$")
	public void User_should_be_able_to_view_account_creation_page() throws Throwable {
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(prop.readProperty("successRegisterMsg"))));
		if(driver.findElement(By.xpath("successRegisterMsg")).isDisplayed())
		{
			System.out.println("Success");
		}
		else
		{
			System.out.println("Failed");
		}
	   }

	@When("^User enters invalid Email address \"([^\"]*)\"$")
	public void User_enters_invalid_Email_address(String arg2) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("emailBox"))).sendKeys(arg2);
	    
	}

	@Then("^User should be able to see invalid email address message$")
	public void User_should_be_able_to_see_invalid_email_address_message() throws Throwable {
	    if(driver.findElement(By.xpath(prop.readProperty("unsuccessRegMsg"))).isDisplayed())
	    {
	    	System.out.println("Error is displayed correctly");
	    }
	    else
	    	System.out.println("Error not displayed");
	    
	}
	
	@When("^User clicks on Gender Title$")
	public void Click_on_Gender() throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("GenderTitle_btn"))).click();
	}
	@When("^User enters \"([^\"]*)\" in Personal Account First Name$")
	public void enter_personal_FirstName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("Personal_Fname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in Personal Account Last name$")
	public void enter_personal_LastName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("Personal_Lname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enter \"([^\"]*)\" in Email Field")
	public void enter_email(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("Email_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in password field$")
	public void enter_password(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("Password_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in First Name$")
	public void enter_firstName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("Fname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in Last name$")
	public void enter_lastName(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("Lname_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in Address Field$")
	public void enter_Address(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("Address_txtBox"))).sendKeys(arg);
	}
	
	@When("^User enters \"([^\"]*)\" in City Field$")
	public void enter_city(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("City_txtBox"))).sendKeys(arg);
	}
	
	@When("^User selects appropriate State$")
	public void select_state() throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("State_dropDown"))).click();
	}
	
	@When("^User enters \"([^\"]*)\" in Zip Code Field$")
	public void enter_zipCode(int zipCode) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("ZipCode_txtBox"))).sendKeys(""+zipCode);
	}
	
	@When("^User enters Phone Number \"([^\"]*)\"$")
	public void enter_phoneNumber(int Phnumber) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("mobile_txtBox"))).sendKeys(""+Phnumber);
	}
	
	@When("^User assign an address alias as \"([^\"]*)\"$")
	public void assign_alias(String arg) throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("alias_txtBox"))).sendKeys(arg);
	}
	
	
	@Then("^User Clicks on Register Button$")
	public void click_registerBtn() throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("RegisterBtn"))).click();
	}
	
	@When("^User Hovers over the dresses button and select summer dress$")
	public void hover_summerDress() throws Throwable {
		Actions action = new Actions(driver);
		WebElement mainBtn = driver.findElement(By.xpath(prop.readProperty("dressMegaBtn")));
		action.moveToElement(mainBtn).build().perform();
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(prop.readProperty("SummerDressBtn"))));
		WebElement summerBtn = driver.findElement(By.xpath(prop.readProperty("SummerDressBtn")));
		summerBtn.click();
	}
	
	@Then("^User should be navigated to summer dress section$")
	public void navigate_to_summerDress() throws Throwable {
		if(driver.findElement(By.xpath(prop.readProperty("SummerDressTxt"))).isDisplayed())
		{
			System.out.println("navigation successfull");
		}
		else
			System.out.println("navigation unsuccessfull");
	}
	
	@When("^User clicks on sort button$")
	public void click_on_sortBtn() throws Throwable {
		driver.findElement(By.xpath(prop.readProperty("sortBtn"))).click();
	}
	
	@Then("^Dresses should be arranged in the grid accordingly$")
	public void dress_arrange() throws Throwable {
		
	}
	
	
	
	
	
}
