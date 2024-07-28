package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class AutomationExerciseWebsite
{
    WebDriver driver = new ChromeDriver();

    @Given("Navigate to url {string}")
    public void navigateToUrlHttpAutomationexerciseCom(String URL) {
        driver.manage().window().maximize();
        driver.get(URL);
    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        driver.findElement(By.xpath("//img[@alt='Website for automation practice']")).isDisplayed();
    }

    @Then("Click on {string} button")
    public void clickSignupButton(String Signup) {
        driver.findElement(By.linkText(Signup)).click();
    }

    @And("Verify {string} is visible")
    public void verifyNewUserSignupIsVisible(String text) {
        String newUserSignupText=driver.findElement(By.xpath("//div[@class='signup-form']/h2")).getText();
        Assert.assertEquals(newUserSignupText,text );
    }

    @Then("Enter name and email address")
    public void enterNameAndEmailAddress() {
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("testng121@gmail.com");
    }


    @Then("Click on Signup button")
    public void clickOnSignupButton() {
        driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();
    }

    @And("Verify that {string} is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible(String accInformation) {
        String accInfo =driver.findElement(By.xpath("//b[contains(text(), 'Enter Account Information')]")).getText();
        Assert.assertEquals(accInfo, accInformation);
    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth() {
        driver.findElement(By.xpath("//input[@value='Mr']")).click();
        driver.findElement(By.id("password")).sendKeys("Nagaraj@123");
        Select dayDropdown = new Select(driver.findElement(By.id("days")));
        dayDropdown.selectByValue("10");
        Select monthsDropdown = new Select(driver.findElement(By.id("months")));
        monthsDropdown.selectByValue("September");
        Select yearDropdown = new Select(driver.findElement(By.id("years")));
        yearDropdown.selectByValue("1992");

    }

    @When("Select checkbox Sign up for our newsletter!")
    public void selectCheckboxSignUpForOurNewsletter() {
        driver.findElement(By.id("newsletter")).click();
    }

    @Then("Select checkbox Receive special offers from our partners!")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        driver.findElement(By.id("optin")).click();
    }
}
