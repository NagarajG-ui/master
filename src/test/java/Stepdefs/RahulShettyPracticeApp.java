package Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

public class RahulShettyPracticeApp {
    WebDriver driver = new ChromeDriver();
    @Given("I login to the application")
    public void iLoginToTheApplication() {
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

    }

    @When("I provide wrong username and password")
    public void iProvideWrongUsernameAndPassword() throws InterruptedException {
        driver.findElement(By.cssSelector("p.error")).getText();
        driver.findElement(By.xpath("//div[@class='forgot-pwd-container']/a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("test");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("test@test.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234");
        driver.findElement(By.className("reset-pwd-btn")).click();
    }

    @Then("I verify page is displaying correctly")
    public void iVerifyPageIsDisplayingCorrectly() throws InterruptedException {
        driver.findElement(By.cssSelector("p.infoMsg")).getText();
        String[] getPassword = (driver.findElement(By.cssSelector("p.infoMsg")).getText().split("'",3));
        String password=getPassword[1];
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("inputUsername")).sendKeys("test");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='login-container']/p")).getText().equalsIgnoreCase("You are successfully logged in");

        driver.findElement(By.cssSelector("button.logout-btn")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//form[@class='form']/h1")).isDisplayed());
        Thread.sleep(2000L);
        driver.quit();
    }

}
